package com.cicd.cicd.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subtract_serviceTest {
    subtract_service service = new subtract_service();

    @Test
    void addService() {
        int resultP = service.subService(3,3);
        assertEquals(0,resultP);
    }
    @Test
    void addServiceN(){
        int resultN = service.subService(-2,-4);
        assertEquals(2, resultN);
    }
}