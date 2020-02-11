/*
Problem 4: Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.

Answer: 906609
*/

fun main() {
    val result = getLargestPalindromeProduct()
    println("Result = " + result)
}

fun getLargestPalindromeProduct(): Int {
    var result = 0
    var currentNumber: Int

    for (i in 100..999) {
        for (j in 100..999) {
            currentNumber = i * j
            if (isPalindrome(currentNumber) && currentNumber > result) {
                result = currentNumber
            }
        }
    }

    return result
}

fun isPalindrome(number: Int): Boolean {
    return number.toString() == number.toString().reversed()
}
