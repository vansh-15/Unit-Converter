package com.example.unitConverterThymeleaf;

import org.springframework.stereotype.Service;

@Service
public class UnitConverterService {

    public double convertkmtom(double value) {
        return (double)value*1000;
    }

    public double convertmtokm(double value) {
        return (double)value/1000;
    }

    public double convertkgtog(double value) {
        return (double)value*1000;
    }

    public double convertgtokg(double value) {
        return (double)value/1000;
    }
}
