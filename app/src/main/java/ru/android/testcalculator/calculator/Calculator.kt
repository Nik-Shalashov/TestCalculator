package ru.android.testcalculator.calculator

import kotlin.math.log
import kotlin.math.sqrt

class Calculator {

    fun multiply(multiplicand: Float, multiplier: Float): Float =
        multiplicand * multiplier

    fun divide(dividend: Float, divisor: Float): Float =
        if (divisor != 0f) {
            dividend / divisor
        } else {
            throw IllegalArgumentException("Divisor cannot be 0")
        }

    fun add(addend: Float, adder: Float): Float =
        addend + adder

    fun subtract(minuend: Float, subtrahend: Float): Float =
        minuend - subtrahend

    fun squareRoot(num: Float) =
        if (num < 0) {
            throw IllegalArgumentException("Number $num cannot be < 0")
        } else {
            sqrt(num)
        }

    fun square(num: Float) = num * num

    fun logarithm(base: Float, argument: Float) =
        if (base <= 0 || base == 1f) {
            throw IllegalArgumentException("Base number $base cannot be <= 0 or equals 1")
        } else if (argument <= 0) {
            throw IllegalArgumentException("Argument number $base cannot be <= 0")
        } else {
            log(argument, base)
        }
}