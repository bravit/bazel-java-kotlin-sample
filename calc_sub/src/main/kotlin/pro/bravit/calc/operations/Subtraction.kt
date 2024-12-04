

package pro.bravit.calc.operations

import pro.bravit.calc.core.BinaryOperation

class Subtraction : BinaryOperation {
    override fun getName(): String {
        return "subtract"
    }

    override fun apply(a: Double, b: Double): Double {
        return a - b
    }
}
