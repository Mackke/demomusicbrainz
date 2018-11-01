package com.cygni.demo.artistInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album implements Serializable {

    @NotNull
    private String title;
    @NotNull
    private String id;
    @NotNull
    private String image;
}
