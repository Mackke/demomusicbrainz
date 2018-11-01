package com.cygni.demo.artistInfo.wikidata;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Angwiki implements Serializable {
    private static final String KEY_TITLE = "title";

    private String title;

    public Angwiki(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.title = (String) objectMap.getOrDefault(KEY_TITLE, null);
        }
    }

}
