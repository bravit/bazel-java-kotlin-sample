package pro.bravit.calc.cli;

import pro.bravit.calc.core.Calculator;
import pro.bravit.calc.core.OperationRegistry;
import pro.bravit.calc.operations.Addition;
import pro.bravit.calc.operations.Division;
import pro.bravit.calc.operations.Multiplication;
import pro.bravit.calc.operations.Subtraction;

public class CalcCli {
    public static void main(String[] args) {
        // Register operations
        OperationRegistry.registerOperation(new Addition());
        OperationRegistry.registerOperation(new Multiplication());
        OperationRegistry.registerOperation(new Division());
        OperationRegistry.registerOperation(new Subtraction());

        if (args.length != 1) {
            System.out.println("Usage: calc \"<expression>\"");
            System.out.println("Example: calc \"2 + 3\"");
            System.out.println("\nSupported operations:");
            System.out.println("  + : addition");
            System.out.println("  - : subtraction");
            System.out.println("  * : multiplication");
            System.out.println("  / : division");
            return;
        }

        try {
            // Split the expression into parts
            String[] parts = args[0].trim().split("\\s+");
            if (parts.length != 3) {
                throw new IllegalArgumentException("Expression must contain exactly three parts: number operator number");
            }

            // Parse numbers
            double a = Double.parseDouble(parts[0]);
            double b = Double.parseDouble(parts[2]);

            // Convert operator to operation name
            String operation = switch (parts[1]) {
                case "+" -> "add";
                case "*" -> "multiply";
                case "/" -> "divide";
                case "-" -> "subtract";
                default -> throw new IllegalArgumentException("Unknown operator: " + parts[1]);
            };

            double result = Calculator.calculate(operation, a, b);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
