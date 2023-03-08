package com.sanitas.calculator.service;

import com.sanitas.calculator.domain.Operation;


public interface CalculatorService {
    Number operate(Operation operation);
}
