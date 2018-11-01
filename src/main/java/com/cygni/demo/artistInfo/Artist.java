package com.cygni.demo.artistInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist implements Serializable {

    @NotNull
    private String mbid;
    @NotNull
    private String title;
    @NotNull
    private String description;
    @NotNull
    private String country;
    @NotNull
    private List<Album> albums;
}
