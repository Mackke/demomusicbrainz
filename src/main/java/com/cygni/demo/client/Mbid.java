package com.cygni.demo.client;

import com.cygni.demo.artistInfo.musicbrainz.Relations;
import com.cygni.demo.configuration.FeignConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(
        name = "Mbid",
        url = "http://musicbrainz.org/ws/2/artist/ec2bcb77-b9a1-49e2-bfe7-419586bbef48?&fmt=json&inc=url-rels+release-groups",
        configuration = FeignConfiguration.class)
public interface Mbid {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    Relations getMbidData(@RequestParam("fmt") String format);
}
