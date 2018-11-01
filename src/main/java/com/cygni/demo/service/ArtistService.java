package com.cygni.demo.service;


import com.cygni.demo.artistInfo.Album;
import com.cygni.demo.artistInfo.Artist;
import com.cygni.demo.artistInfo.musicbrainz.ArtistGroupInfo;
import com.cygni.demo.artistInfo.musicbrainz.Relations;
import com.cygni.demo.artistInfo.wikidata.ArtistTitle;
import com.cygni.demo.artistInfo.covert.CovertImg;
import com.cygni.demo.artistInfo.covert.Image;
import com.cygni.demo.artistInfo.wikipedia.ArtistDescription;
import com.cygni.demo.client.CovertArt;
import com.cygni.demo.client.Mbid;
import com.cygni.demo.client.Wikidata;
import com.cygni.demo.client.Wikipedia;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ArtistService {

    private final Mbid mbid;
    private final CovertArt covertArt;
    private final Wikidata wikidata;
    private final Wikipedia wikipedia;


    public Artist getAllArtistData() {

        Relations artistGroupInfo = this.mbid.getMbidData("json");
        ArtistTitle artistTitle = new ArtistTitle(this.wikidata.getArtistTitle());
        CovertImg covertImg = this.covertArt.getCoverAlbumImage("json");
        ArtistDescription artistDescription = new ArtistDescription(this.wikipedia.getArtistInfo());

        List<Image> albumCover = covertImg.getImages();
        List<ArtistGroupInfo> albumNames = artistGroupInfo.getReleaseGroups();
        List<Album> albumList = new ArrayList<>();

        Artist artist = new Artist(artistGroupInfo.getId(), artistTitle.getArtistTitle(), artistDescription.getArtistDescription(), artistGroupInfo.getCountry(), albumList);
        for (ArtistGroupInfo info : albumNames) {
            for (Image image : albumCover) {
                albumList.add(createAlbum(info, image));
            }
        }
        return artist;
    }


    private Album createAlbum(ArtistGroupInfo artistGroupInfo, Image image) {
        return Album.builder()
                .title(artistGroupInfo.getTitle())
                .id(artistGroupInfo.getId())
                .image(image.getImage())
                .build();
    }

}
