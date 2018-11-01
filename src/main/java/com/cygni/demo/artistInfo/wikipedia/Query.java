package com.cygni.demo.artistInfo.wikipedia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Query implements Serializable {
    private static final String KEY_PAGES = "pages";

    private Pages pages;

    public Query(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.pages = new Pages((Map<String, Object>) objectMap.get(KEY_PAGES));
        }
    }
}
