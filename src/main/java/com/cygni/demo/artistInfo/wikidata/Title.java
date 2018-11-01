package com.cygni.demo.artistInfo.wikidata;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Title implements Serializable {
    private String title;
}
