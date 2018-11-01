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
public class Pages implements Serializable {

    private PageValue pageValue;

    public Pages(Map<String, Object> objectMap) {
        if (objectMap != null) {
            String pageValueKey = getFirstPageValueKey(objectMap);
            this.pageValue = new PageValue((Map<String, Object>) objectMap.getOrDefault(pageValueKey, null));
        }
    }

    private String getFirstPageValueKey(Map<String, Object> objectMap) {
        return objectMap.keySet().stream().findFirst().orElse("");
    }
}
