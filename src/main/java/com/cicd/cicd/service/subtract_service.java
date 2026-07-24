package com.cicd.cicd.service;

import org.springframework.stereotype.Service;

@Service

public class subtract_service {
    public int subService(int a, int b){
        int result = a - b;
        return result;
    }

}
