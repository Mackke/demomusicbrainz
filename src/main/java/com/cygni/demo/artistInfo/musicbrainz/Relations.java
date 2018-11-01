package com.cygni.demo.artistInfo.musicbrainz;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Relations implements Serializable {

    @JsonProperty("release-groups")
    private List<ArtistGroupInfo> releaseGroups = new ArrayList<>();
    private String id;
    private String country;
}
