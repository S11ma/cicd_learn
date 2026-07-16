package com.cicd.cicd.service;

import org.springframework.stereotype.Service;

@Service
public class add_service {
    public int addService(int a, int b){
    int result= a+b;
    return result;
}

}
