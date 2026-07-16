package com.cicd.cicd.controller;

import com.cicd.cicd.dto.UserRequest;
import com.cicd.cicd.service.add_service;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class add_controller {
    private final add_service service;

    public add_controller(add_service service) {
        this.service = service;
    }

    @GetMapping("/health")
    public String healthCheck(){
        return "Health is ok";
    }
//    @PostMapping("/add")
//    public int add(int a, int b){
//        int result = service.addService(a, b);
//        return result;
//    }

    @PostMapping("/add")
    public int AddResult(@RequestBody UserRequest userRequest){
        int a = userRequest.getA();
        int b = userRequest.getB();
        int result = service.addService(a, b);

        return result;
    }
}
