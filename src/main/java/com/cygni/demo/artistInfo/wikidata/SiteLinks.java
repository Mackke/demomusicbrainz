package com.cygni.demo.artistInfo.wikidata;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SiteLinks implements Serializable {
    private static final String KEY_ANGWIKI = "angwiki";

    private Angwiki angwiki;

    public SiteLinks(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.angwiki = new Angwiki((Map<String, Object>) objectMap.get(KEY_ANGWIKI));
        }
    }
}
