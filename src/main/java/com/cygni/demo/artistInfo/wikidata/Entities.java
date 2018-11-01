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
public class Entities implements Serializable {

   private EntityValue entityValue;

    public Entities(Map<String, Object> objectMap) {
        if (objectMap != null) {
            String siteLinksValueKey = getSiteLinksValueKey(objectMap);
        this.entityValue = new EntityValue((Map<String, Object>) objectMap.getOrDefault(siteLinksValueKey, null));
        }
    }

    private String getSiteLinksValueKey(Map<String, Object> objectMap) {
        return objectMap.keySet().stream().findFirst().orElse("");
    }
}
