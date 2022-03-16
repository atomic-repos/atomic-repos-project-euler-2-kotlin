---
title: 'Project Euler #2 - Even Fibonacci Numbers - Kotlin'
icon: kotlin
icon_pack: custom
summary: 'Finds the sum of even-valued Fibonacci numbers < 4MM'
github_user: mstine
github_repo: atomic-repos/atomic-repos-project-euler-2-kotlin
date: 2022-03-16
author: Matt Stine
tags:
    - project-euler
    - kotlin
---

Today I'd like to introduce you to one of my favorite sources
of programming problems: [Project Euler](https://projecteuler.net).

Project Euler is composed of a large set 
of problems (779 as of this writing) that will challenge both your mathematical and
programming skills. The motivation is to provide a fun and
recreational learning platform for students and professionals
interested in math and/or computer science.

## What I like best about Project Euler's problems is that they stretch each programming language in very different ways.

For the polyglot programmer, Project Euler provides great
fodder for exploring the capabilities of multiple languages.
Often one programming language's features or libraries 
provide it with a competitive advantage, allowing it to solve
certain Project Euler problems more efficiently or elegantly.
This is especially true of languages with a strong functional
bent.

## Here's our problem statement for today:

>If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.

## Kotlin provides a powerful feature for attacking this problem: Lazy Sequences

What's cool about a lazy sequence? It can be infinitely long!
This allows us to describe infinite sequences like
_the set of all natural numbers_ in a single line of code, and
we never encounter a stack overflow! We can do this because lazy
sequences are not evaluated until we ask for the result of
a multi-step process.

So in today's solution, we take each factor and:

1. Multiply it by every number in our logically-infinite sequence of natural numbers. At this point we haven't evaluated anything.
2. Take all numbers from the sequence that are less than our upper bound of 1000. At this point, because we've established a concrete upper bound, Kotlin evaluates and returns a finite sequence of numbers.
3. Because we now have a sequence of sequences, we combine them into one using `flatten`.
4. We remove duplicates using `distinct`.
5. And finally we take the `sum`.

Running our program tells us the answer: `233168`.

To learn more about Kotlin Sequences, take a look at [Sequences](https://kotlinlang.org/docs/sequences.html) in the Kotlin documentation.

---

## Code

{{% code file="/static/project-euler-2-kotlin/src/main/kotlin/dev/atomicrepos/kotlin/projecteuler/ProjectEulerTwo.kt" language="kotlin" %}}

## Tests

{{% code file="/static/project-euler-2-kotlin/src/test/kotlin/dev/atomicrepos/kotlin/projecteuler/ProjectEulerTwoTest.kt" language="kotlin" %}}
