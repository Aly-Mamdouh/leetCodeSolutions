class Solution {
    fun getSumOfDigits(number: Int): Int {
    var num = number
    var sum = 0
    while (num > 0) {
        val r = num % 10
        sum += r
        num /= 10
    }
    return sum
}
fun getMulOfDigits(number: Int): Int {
    var num = number
    var sum = 1
    while (num > 0) {
        val r = num % 10
        sum *= r
        num /= 10
    }
    return sum
}
    fun subtractProductAndSum(n: Int): Int {
        
        var sub=getMulOfDigits(n)-getSumOfDigits(n)

    return sub
        
        
    }
}