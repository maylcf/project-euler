/*
Problem 6: Sum square difference

The sum of the squares of the first ten natural numbers is,
1^2+2^2+...+10^2 = 385
The square of the sum of the first ten natural numbers is,
(1+2+...+10)^2 = 55^2 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

Answer: 25164150
*/

fun main() {
    var sumOfNumbers = 0
    var sumOfSquares = 0

    for (i in 1..100) {
        sumOfSquares += i * i
        sumOfNumbers += i
    }

    val squareOfSum = sumOfNumbers * sumOfNumbers
    val result = squareOfSum - sumOfSquares

    println(result)
}
