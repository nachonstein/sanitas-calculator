package com.sanitas.calculator.controller;

import com.sanitas.calculator.domain.Operation;
import com.sanitas.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation")
public class CalculatorController {
    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/operate")
    public Number operate(@RequestBody Operation operation){
        Number result = calculatorService.operate(operation);
        return result;
    }
}
