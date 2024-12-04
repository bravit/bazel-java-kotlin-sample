package pro.bravit.calc.operations;

import pro.bravit.calc.core.BinaryOperation;

public class Multiplication implements BinaryOperation {
    @Override
    public String getName() {
        return "multiply";
    }

    @Override
    public double apply(double a, double b) {
        return a * b;
    }
}