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
public class ArtistTitle implements Serializable{
    private static final String KEY_ENTITY = "entities";
    private Entities entities;
    /**
     * Constructor
     * <p>
     * Since the API from Wikipedia does something untypical regarding json e.g. generic numbers as name for properties,
     * the Client return a Map<String, Object> which represents the raw json format. One by one, the Object are extracted by their keys
     * and mapped into the Object.
     *
     * @param objectMap
     */

    public ArtistTitle(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.entities = new Entities((Map<String, Object>) objectMap.get(KEY_ENTITY));
        }
    }

    public String getArtistTitle() {
        return entities.getEntityValue().getSiteLinks().getAngwiki().getTitle();
    }


}
