package com.cygni.demo.artistInfo.wikipedia;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Map;

/**
 * used for overhead of the project requirements
 * store data from wiki
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ArtistDescription implements Serializable {

    private static final String KEY_BATCH_COMPLETE = "batchcomplete";
    private static final String KEY_QUERY = "query";

    private String batchComplete;
    private Query query;

    /**
     * Constructor
     * <p>
     * Since the API from Wikipedia does something untypical regarding json e.g. generic numbers as name for properties,
     * the Client return a Map<String, Object> which represents the raw json format. One by one, the Object are extracted by their keys
     * and mapped into the Object.
     *
     * @param objectMap
     */
    public ArtistDescription(Map<String, Object> objectMap) {
        if (objectMap != null) {
            this.batchComplete = (String) objectMap.get(KEY_BATCH_COMPLETE);
            this.query = new Query((Map<String, Object>) objectMap.get(KEY_QUERY));
        }
    }

    public String getArtistDescription() {
        return query.getPages().getPageValue().getExtract();
    }
}
