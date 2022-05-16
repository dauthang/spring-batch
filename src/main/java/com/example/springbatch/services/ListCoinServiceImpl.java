package com.example.springbatch.services;

import com.example.springbatch.entities.Coin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import java.util.*;
@Service
public class ListCoinServiceImpl implements ListCoinService{
    @Value("${batch.urlResource}")
    private String resourceUrl;

    @Override
    public List<Coin> getListCoin() {
        String url = "assets";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("X-CoinAPI-Key", "86959F9E-573D-4D7F-B8A7-30E36DD24D2F");
        MultiValueMap map = new LinkedMultiValueMap<>();
        HttpEntity<MultiValueMap> entity = new HttpEntity<>(map, headers);
        ResponseEntity<Coin[]> response
                = restTemplate.exchange(resourceUrl + url, HttpMethod.GET , entity, Coin[].class);
        return (List<Coin>) response;
    }
}
