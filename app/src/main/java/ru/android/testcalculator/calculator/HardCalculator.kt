package ru.android.testcalculator.calculator

import kotlin.math.sqrt

interface Calculations {
    fun getRandomNumFromRangeAndMultiplyByFour(from: Int, to: Int): Int
    fun functionFromCheckVerify()
}

class HardCalculator(private val calculations: Calculations) {

    companion object {

        const val MIN_RANGE_NUM = -12
        const val MAX_RANGE_NUM = 12
    }

    fun getSquareRootAndAddSeven(): Float {
        val result =
            calculations.getRandomNumFromRangeAndMultiplyByFour(MIN_RANGE_NUM, MAX_RANGE_NUM + 1)
        return if (result < 0) {
            0f  //здесь возвращается 0, а не exception для проверки вызова functionFromCheckVerify()
                //правильней конечно бросать exception
        } else {
            val squareRoot = sqrt(result.toFloat())
            calculations.functionFromCheckVerify()
            squareRoot + 7f
        }
    }
}