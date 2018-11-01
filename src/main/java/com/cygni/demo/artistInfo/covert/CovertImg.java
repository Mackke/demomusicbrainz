package com.cygni.demo.artistInfo.covert;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CovertImg implements Serializable {
    private List<Image> images;
    private String release;
}
