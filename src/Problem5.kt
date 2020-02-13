/*
Problem 5: Smallest multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

Answer: 232792560
*/

fun main() {
    var continueSearching = true
    var currentNumber = 0
    val maxNumber = 20
    while (continueSearching) {
        currentNumber ++
        for (i in 1..maxNumber) {
            if (currentNumber % i != 0) {
                break
            }
            if (i == maxNumber) {
                continueSearching = false
            }
        }
    }
    println(currentNumber)
}
