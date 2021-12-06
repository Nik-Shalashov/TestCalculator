package ru.android.testcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import ru.android.testcalculator.calculator.Calculator

class CalculatorSimpleTest {

    private val calculator = Calculator()

    @Test
    fun `WHEN multiply 2 by 2 EXPECT 4`() {
        val actual = calculator.multiply(2f, 2f)
        val expected = 4f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN divide 10 by 5 EXPECT 2`() {
        val actual = calculator.divide(10f, 5f)
        val expected = 2f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN add 3 by 7 EXPECT 10`() {
        val actual = calculator.add(3f, 7f)
        val expected = 10f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN subtract 16 by 8 EXPECT 8`() {
        val actual = calculator.subtract(16f, 8f)
        val expected = 8f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get square root from 9 EXPECT 3`() {
        val actual = calculator.squareRoot(9f)
        val expected = 3f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get square from 10 EXPECT 100`() {
        val actual = calculator.square(10f)
        val expected = 100f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get logarithm from 8 with base 2 EXPECT 3`() {
        val actual = calculator.logarithm(2f, 8f)
        val expected = 3f
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `WHEN divide by zero EXPECT illegal argument exception`() {
        calculator.divide(4f, 0f)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `WHEN get square root from -4 EXPECT illegal argument exception`() {
        calculator.squareRoot(-4f)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `WHEN get logarithm from 5 with base 1 EXPECT illegal argument exception`() {
        calculator.logarithm(1f, 5f)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `WHEN get logarithm from 2 with base -4 EXPECT illegal argument exception`() {
        calculator.logarithm(-4f, 2f)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `WHEN get logarithm from -3 with base 5 EXPECT illegal argument exception`() {
        calculator.logarithm(5f, -3f)
    }
}