package pro.bravit.calc.core;

public interface BinaryOperation {
    String getName(); // The name of the operation, e.g., "add"
    double apply(double a, double b); // Perform the operation
}