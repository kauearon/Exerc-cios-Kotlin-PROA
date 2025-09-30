package Lista2

fun main() {
    println("Enter the first value: ")
    val a = readLine()!!.toInt()

    println("Enter the second value: ")
    val b = readLine()!!.toInt()

    println("Enter the third value: ")
    val c = readLine()!!.toInt()


    if (a == b || a == c || b == c) {
        println("do not enter equal values, bye.")
        return
    }


    val soma = if (a > b && a > c) {

        if (b > c) a + b else a + c
    } else if (b > a && b > c) {

        if (a > c) b + a else b + c
    } else {

        if (a > b) c + a else c + b
    }


    println("the result of the sum of the largest is: $soma ")
}
