package com.example.callexternalapisample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CallApiService {
    @Autowired
    private RestTemplate restTemplate;

    public Object serachZipCode(Integer zipcode) {
        String uri = "https://zipcloud.ibsnet.co.jp/api/search?zipcode={zipcode}";
        RequestEntity<?> request = RequestEntity.get(uri, zipcode).build();
        
        ResponseEntity<?> response = restTemplate.exchange(request, String.class);
        return response.getBody();
    }
    
}
