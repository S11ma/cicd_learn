package com.cicd.cicd.controller;

import com.cicd.cicd.dto.UserRequest;
import com.cicd.cicd.service.subtract_service;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "*")
@RestController
public class sub_controller {

    private final subtract_service service;

    public sub_controller(subtract_service service) {
        this.service = service;
    }

    @PostMapping("/sub")
    public int SubResult(@RequestBody UserRequest userRequest){
        int a = userRequest.getA();
        int b = userRequest.getB();
        int result = service.subService(a, b);

        return result;
    }
}
