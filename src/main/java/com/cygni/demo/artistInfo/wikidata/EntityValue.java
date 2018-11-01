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
public class EntityValue implements Serializable {
    private static final String KEY_SITELINKS = "sitelinks";

    private SiteLinks siteLinks;

    public EntityValue(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.siteLinks = new SiteLinks((Map<String, Object>) objectMap.getOrDefault(KEY_SITELINKS, null));
        }
    }

}
