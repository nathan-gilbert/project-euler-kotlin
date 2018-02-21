/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
*/
import java.math.BigInteger

fun main(args: Array<String>) {
    val a = BigInteger("2").pow(1000)
    var sum = 0
    for (ch in a.toString()) {
        sum += ch.toString().toInt()
    }
    println("The sum: $sum")
}