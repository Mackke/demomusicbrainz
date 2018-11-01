package com.cygni.demo.client;


import com.cygni.demo.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(
    name = "wikipedia",
    url = "https://en.wikipedia.org/w/api.php?action=query&format=json&prop=extracts&exintro=true&redirects=true&titles=BIGBANG",
    configuration = FeignConfiguration.class)
public interface Wikipedia {

    /**
     * Call this method to retrieve artistinfo data
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    Map<String, Object> getArtistInfo();

}
