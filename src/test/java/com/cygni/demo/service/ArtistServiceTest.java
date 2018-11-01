package com.cygni.demo.service;


import com.cygni.demo.artistInfo.Album;
import com.cygni.demo.artistInfo.Artist;
import com.cygni.demo.client.CovertArt;
import com.cygni.demo.client.Mbid;
import com.cygni.demo.client.Wikidata;
import com.cygni.demo.client.Wikipedia;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ArtistServiceTest {

    @Mock
    Mbid mbid;

    @Mock
    CovertArt covertArt;

    @Mock
    Wikidata wikidata;

    @Mock
    Wikipedia wikipedia;

    @InjectMocks
    ArtistService artistService;

    Album album = new Album();
    Artist artist = new Artist();

    @Before
    public void init() {

    }


    @Test
    public void getAllArtistData() throws Exception {

    }
}
