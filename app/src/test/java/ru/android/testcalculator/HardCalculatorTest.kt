package ru.android.testcalculator

import org.junit.Assert.*
import org.junit.Test
import ru.android.testcalculator.calculator.Calculations
import ru.android.testcalculator.calculator.HardCalculator

class TestCalculations(private val returnValue: Int) : Calculations {

    override fun getRandomNumFromRangeAndMultiplyByFour(from: Int, to: Int): Int = returnValue
    override fun functionFromCheckVerify() {
        //здесь эта функция не участвует
    }
}

class HardCalculatorTest {

    @Test
    fun `WHEN get square root and add 7 EXPECT 11`() {
        val testCalculations = TestCalculations(16)
        val hardCalculator = HardCalculator(testCalculations)
        val actual = hardCalculator.getSquareRootAndAddSeven()
        val expected = 11f
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get square root and add 7 EXPECT 0`() {
        val testCalculations = object : Calculations {
            override fun getRandomNumFromRangeAndMultiplyByFour(from: Int, to: Int): Int = -8
            override fun functionFromCheckVerify() {
                //здесь эта функция не участвует
            }
        }
        val hardCalculator = HardCalculator(testCalculations)
        val actual = hardCalculator.getSquareRootAndAddSeven()
        val expected = 0f
        assertEquals(expected, actual)
    }
}