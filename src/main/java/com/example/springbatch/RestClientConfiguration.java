package com.example.springbatch;

import java.util.*;
import com.example.springbatch.entities.Coin;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClientConfiguration {
    @Value("${batch.urlResource}")
    private String resourceUrl;

    @Bean
    public void init() {
        String url = "assets";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-CoinAPI-Key", "86959F9E-573D-4D7F-B8A7-30E36DD24D2F");
        MultiValueMap map = new LinkedMultiValueMap<>();
        HttpEntity<MultiValueMap> entity = new HttpEntity<>(map, headers);
        ResponseEntity<Coin[]> response
                = restTemplate.exchange(resourceUrl + url, HttpMethod.GET , entity, Coin[].class);


    }

}
