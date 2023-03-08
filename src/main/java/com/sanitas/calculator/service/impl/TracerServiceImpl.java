package com.sanitas.calculator.service.impl;

import io.corp.calculator.TracerAPI;
import org.springframework.stereotype.Service;

@Service
public class TracerServiceImpl implements TracerAPI {
    @Override
    public <T> void trace(T result) {
        System.out.println( "result = " + result.toString() );
    }
}
