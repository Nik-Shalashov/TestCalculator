package ru.android.testcalculator

import org.junit.Assert
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever
import ru.android.testcalculator.calculator.Calculations
import ru.android.testcalculator.calculator.HardCalculator

class HardCalculatorTestWithMock {

    @Test
    fun `WHEN get square root and add 7 EXPECT 11`() {
        val testCalculations: Calculations = mock()
        whenever(testCalculations.getRandomNumFromRangeAndMultiplyByFour(-12, 13)).thenReturn(16)
        val hardCalculator = HardCalculator(testCalculations)
        val actual = hardCalculator.getSquareRootAndAddSeven()
        val expected = 11f
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get square root and add 7 EXPECT call functionFromCheckVerify`() {
        val testCalculations: Calculations = mock()
        whenever(testCalculations.getRandomNumFromRangeAndMultiplyByFour(-12, 13)).thenReturn(16)
        val hardCalculator = HardCalculator(testCalculations)
        hardCalculator.getSquareRootAndAddSeven()
        verify(testCalculations).functionFromCheckVerify()
    }

    @Test
    fun `WHEN get square root and add 7 EXPECT do not call functionFromCheckVerify`() {
        val testCalculations: Calculations = mock()
        whenever(testCalculations.getRandomNumFromRangeAndMultiplyByFour(-12, 13)).thenReturn(-40)
        val hardCalculator = HardCalculator(testCalculations)
        hardCalculator.getSquareRootAndAddSeven()
        verify(testCalculations, never()).functionFromCheckVerify()
    }
}