package pro.bravit.calc.core;

public class Calculator {
    public static double calculate(String operation, double a, double b) {
        BinaryOperation op = OperationRegistry.getOperation(operation);
        if (op == null) {
            throw new IllegalArgumentException("Operation not found: " + operation);
        }
        return op.apply(a, b);
    }
}