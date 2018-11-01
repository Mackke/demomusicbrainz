package com.cygni.demo.configuration;

import feign.Request;
import feign.codec.Decoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Configuration
public class FeignConfiguration {


    /**
     * Factory method for Feign Request Options.
     */
    @Bean
    public Request.Options requestOptions() {
        int ribbonConnectionTimeout = 10000;
        int ribbonReadTimeout = 180000;
        return new Request.Options(ribbonConnectionTimeout, ribbonReadTimeout);
    }

    @Bean
    public Decoder feignDecoder() {
        HttpMessageConverter jacksonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
        ObjectFactory<HttpMessageConverters> objectFactory = () -> new HttpMessageConverters(jacksonHttpMessageConverter);
        return new ResponseEntityDecoder(new SpringDecoder(objectFactory));
    }
}
