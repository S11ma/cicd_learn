package com.cicd.cicd.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class add_serviceTest {
    add_service service = new add_service();

    @Test
    void addService() {
        int resultP = service.addService(3,3);
        assertEquals(6,resultP);
    }
    @Test
    void addServiceN(){
        int resultN = service.addService(-2,-4);
        assertEquals(-6, resultN);
    }
}