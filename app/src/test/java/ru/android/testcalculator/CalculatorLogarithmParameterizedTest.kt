package ru.android.testcalculator

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import ru.android.testcalculator.calculator.Calculator

@RunWith(Parameterized::class)
class CalculatorLogarithmParameterizedTest(
    private val argument: Float,
    private val base: Float,
    private val expected: Float
) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(9f, 3f, 2f),
            arrayOf(125f, 5f, 3f),
            arrayOf(7f, 7f, 1f),
            arrayOf(1f, 10f, 0f)
        )
    }

    @Test
    fun `WHEN get logarithm EXPECT correct result`() {
        val calculator = Calculator()
        val actual = calculator.logarithm(base, argument)
        Assert.assertEquals(expected, actual)
    }
}