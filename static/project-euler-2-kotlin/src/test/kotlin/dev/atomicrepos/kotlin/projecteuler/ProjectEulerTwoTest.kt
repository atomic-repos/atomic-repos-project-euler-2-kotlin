package dev.atomicrepos.kotlin.projecteuler

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class ProjectEulerTwoTest {

    @Test
    fun shouldCalculateFibonacciSum() {
       assertThat(fibonacciSum(4_000_000)).isEqualTo(9_227_464)
    }

}
