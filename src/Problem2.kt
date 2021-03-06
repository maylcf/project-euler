/*
Problem 2: Even Fibonacci numbers

Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

Answer: 4613732
*/

fun main() {
    val result = getSumOfEvenFibonacciTerms(4000000)
    print("Result: " + result)
}

fun getSumOfEvenFibonacciTerms(limit: Int): Int {
    var currentValue = 2
    var previousValue = 1
    var temp: Int
    var sum = 2

    for (x in 3 .. limit) {
        temp = currentValue
        currentValue += previousValue
        previousValue = temp

        if (currentValue > limit) {
            break
        }

        if (currentValue.rem(2) == 0) {
            sum += currentValue
        }
    }

    return sum
}