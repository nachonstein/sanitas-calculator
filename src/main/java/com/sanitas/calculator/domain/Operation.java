package com.sanitas.calculator.domain;

import java.util.List;

public class Operation {
    private OperationType operationType;
    private List<Number> arguments;

    public Operation(OperationType operationType, List<Number> arguments) {
        this.operationType = operationType;
        this.arguments = arguments;
    }
    public Operation() {

    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public List<Number> getArguments() {
        return arguments;
    }

    public void setArguments(List<Number> arguments) {
        this.arguments = arguments;
    }
}
