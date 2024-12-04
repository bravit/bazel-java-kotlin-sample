package pro.bravit.calc.operations

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class DivisionTest {

    private val division = Division()

    @Test
    fun testDivisionOfTwoPositiveNumbers() {
        val result = division.apply(10.0, 2.0)
        assertEquals(5.0, result)
    }

    @Test
    fun testDivisionOfPositiveAndNegativeNumber() {
        val result = division.apply(10.0, -2.0)
        assertEquals(-5.0, result)
    }

    @Test
    fun testDivisionOfNegativeAndPositiveNumber() {
        val result = division.apply(-10.0, 2.0)
        assertEquals(-5.0, result)
    }

    @Test
    fun testDivisionOfTwoNegativeNumbers() {
        val result = division.apply(-10.0, -2.0)
        assertEquals(5.0, result)
    }

    @Test
    fun testDivisionByZero() {
        assertThrows<ArithmeticException> {
            division.apply(10.0, 0.0)
        }
    }

    @Test
    fun testZeroDividedByAnyNumber() {
        val result = division.apply(0.0, 10.0)
        assertEquals(0.0, result)
    }

    @Test
    fun testGetName() {
        val name = division.name
        assertEquals("divide", name)
    }
}