/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
*/
public fun main(args: Array<String>) {
    val base = 2
    val exp = 15
    val result = Math.pow(base.toDouble(), exp.toDouble())
    println("$base^$exp = $result")

    //convert result to stringa
    val resultStr = result.toInt().toString()
    println(resultStr)
    var sum = 0
    for (ch in resultStr) {
        //have to convert chars to string before going to int
        sum += ch.toString().toInt()
    }
    println("The sum: $sum")
}