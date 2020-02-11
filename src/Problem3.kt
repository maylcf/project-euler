/*
Problem 3: Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?

Answer: 6857
*/

fun main() {
    val result = getLargestPrimeFactor(600851475143)
    println("Result: " + result)
}

fun getLargestPrimeFactor(number: Long): Long {
    var result: Long = 0
    var currentNumber: Long = number

    for (i in 2 .. number) {
        if (isPrime(i)) {
            var continueIterating = true
            while (continueIterating) {
                if (currentNumber.rem(i).toInt() == 0) {
                    currentNumber = currentNumber/i
                    result = i
                    print(i.toString() + " ")
                } else {
                    continueIterating = false
                }
            }
        }
    }
    println(" ")
    return result
}

fun isPrime(number: Long): Boolean {
    for (i in 2 .. number/2) {
        if (isDivisibleByNumber(number, i)) {
            return false
        }
    }
    return true
}

fun isDivisibleByNumber(number: Long, divisor: Long): Boolean {
    return number.rem(divisor).toInt() == 0
}