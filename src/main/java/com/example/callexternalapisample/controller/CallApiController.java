package com.example.callexternalapisample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.callexternalapisample.service.CallApiService;

@RestController
@RequestMapping("/api/call")
public class CallApiController {
    @Autowired
    CallApiService callApiService;

    @GetMapping("/zipcode/{zipcode}")
    public ResponseEntity<?> searchZipCode(@PathVariable Integer zipcode) {
        return new ResponseEntity<>(callApiService.serachZipCode(zipcode), HttpStatus.OK);
    }

}
