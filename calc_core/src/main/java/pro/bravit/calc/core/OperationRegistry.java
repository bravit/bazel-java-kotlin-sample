package pro.bravit.calc.core;

import java.util.HashMap;
import java.util.Map;

public class OperationRegistry {
    private static final Map<String, BinaryOperation> operations = new HashMap<>();

    public static void registerOperation(BinaryOperation operation) {
        operations.put(operation.getName(), operation);
    }

    public static BinaryOperation getOperation(String name) {
        return operations.get(name);
    }

    public static String registeredOperationNames() {
        return String.join("/", operations.keySet());
    }
}