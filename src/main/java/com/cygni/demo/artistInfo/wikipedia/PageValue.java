package com.cygni.demo.artistInfo.wikipedia;

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
public class PageValue implements Serializable {
    private static final String KEY_TITLE = "title";
    private static final String KEY_EXTRACT = "extract";


    private String title;
    private String extract;

    public PageValue(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.title = (String) objectMap.getOrDefault(KEY_TITLE, null);
            this.extract = (String) objectMap.getOrDefault(KEY_EXTRACT, null);
        }
    }
}
