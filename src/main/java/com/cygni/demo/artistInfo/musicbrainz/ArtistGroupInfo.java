package com.cygni.demo.artistInfo.musicbrainz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArtistGroupInfo implements Serializable {

    private String title;
    private String id;
}
