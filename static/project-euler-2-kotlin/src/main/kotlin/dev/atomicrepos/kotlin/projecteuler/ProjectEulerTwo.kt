package dev.atomicrepos.kotlin.projecteuler

fun fibonacciSum(upperBound: Int) =
    generateSequence(Pair(0, 1)) {
        Pair(it.second, it.first + it.second)
    }
        .map { it.first }
        .takeWhile { it < upperBound }
        .sum()
