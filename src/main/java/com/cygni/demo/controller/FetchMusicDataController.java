package com.cygni.demo.controller;

import com.cygni.demo.artistInfo.Artist;
import com.cygni.demo.service.ArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FetchMusicDataController {
    @Autowired
    private ArtistService artistService;

    /**
     * Here we will just one function that will call the service and in the service we will build together our response
     * @return
     */
    @RequestMapping(value = "/getartistinfo", method = RequestMethod.POST)
    public Artist artistInfoData() {
        return this.artistService.getAllArtistData();
    }
}
