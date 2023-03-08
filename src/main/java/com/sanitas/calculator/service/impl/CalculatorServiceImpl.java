package com.sanitas.calculator.service.impl;

import com.sanitas.calculator.domain.Operation;
import com.sanitas.calculator.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    //TODO validate arguments for type operation (in our case, ADD needs 2 arguments; no more, no less)
    @Override
    public Number operate(Operation operation){

        BigDecimal bigDecimal = new BigDecimal(0);

        List<Number> arguments = operation.getArguments();

        switch (operation.getOperationType()){
            case ADD:
                for (Number number : arguments) {
                    bigDecimal = bigDecimal.add(new BigDecimal(number.longValue()));
                }
                break;
            case SUBSTRACT:
                bigDecimal = new BigDecimal(arguments.get(0).longValue());

                for (int i = 1; i< arguments.size(); i++) {
                    bigDecimal = bigDecimal.subtract(new BigDecimal(arguments.get(i).longValue()));
                }

                break;
        }

        return bigDecimal;
    }
}
