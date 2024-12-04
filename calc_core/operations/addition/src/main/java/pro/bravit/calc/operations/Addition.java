package pro.bravit.calc.operations;

import pro.bravit.calc.core.BinaryOperation;

public class Addition implements BinaryOperation {
    @Override
    public String getName() {
        return "add";
    }

    @Override
    public double apply(double a, double b) {
        return a + b;
    }
}