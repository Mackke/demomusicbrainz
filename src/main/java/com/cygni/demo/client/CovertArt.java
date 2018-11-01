package com.cygni.demo.client;

import com.cygni.demo.artistInfo.covert.CovertImg;
import com.cygni.demo.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "coverart",
        url = "http://coverartarchive.org/release-group/0d521add-b704-4801-8b5f-31b6b8687ccc",
        configuration = FeignConfiguration.class)
public interface CovertArt {
    /**
     * Call this method to retrieve album covers for the artist
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    CovertImg getCoverAlbumImage(@RequestParam("fmt") String format);
}
