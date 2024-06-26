package com.pragra.client.controller;

import com.pragra.client.entity.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    WebClient webClient;


    @GetMapping("/all")
    public List<Hospital> getAll(){
        Hospital[] hospitalData = webClient.get()
                .uri("http://localhost:8080/hospital/all")
                .retrieve()
                .bodyToMono(Hospital[].class)
                .block();
        return Arrays.asList(hospitalData);
    }
}
