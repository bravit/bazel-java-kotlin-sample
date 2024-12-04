package pro.bravit.calc.operations

import pro.bravit.calc.core.BinaryOperation

class Division : BinaryOperation {
    override fun getName(): String? {
        return "divide"
    }

    override fun apply(a: Double, b: Double): Double {
        if (b == 0.0) throw ArithmeticException("Division by zero")
        return a / b
    }
}