package com.cygni.demo.client;

import com.cygni.demo.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(
        name = "wikidata",
        url = "https://www.wikidata.org/w/api.php?action=wbgetentities&ids=Q282104&format=json&props=sitelinks",
        configuration = FeignConfiguration.class)
public interface Wikidata {

    /**
     * Call this method to retrieve artist title data
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    Map<String, Object> getArtistTitle();
}
