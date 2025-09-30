package Lista2

fun main(){

    println("Enter the first value")
    var a = readln()!!.toInt()
    println("Enter the second value")
    var b = readln()!!.toInt()
    println("Enter the third value")
    var c = readln()!!.toInt()
    println("Enter the fourth value")
    var d = readln()!!.toInt()
    println("Enter the fifth value")
    var e = readln()!!.toInt()
    println("Enter the sixth value")
    var f = readln()!!.toInt()

    var numeros = listOf(a, b, c, d, e, f)
    println(numeros)

    var media = (a + b + c + d + e + f) / 6.toDouble()

    println("the result of the average of the values is: $media")

}