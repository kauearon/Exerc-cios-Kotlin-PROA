package Lista2

fun main() {

    println("Enter the first number: ")
    var a = readln()!!.toInt()
    println("Enter the second number: ")
    var b = readln()!!.toInt()
    println("Enter the third number: ")
    var c = readln()!!.toInt()
    println("Enter the fourth number: ")
    var d = readln()!!.toInt()


        var bigger: Number

        if (a > b && a > c && a > d) {
            bigger = a
        } else if (b > a && b > c && b > d) {
            bigger = b
        } else if (c > a && c > b && c > d) {
            bigger = c
        } else if(d > a && d > b && d > c){
            bigger = d
        } else{
                println("do not enter equal values, bye.")
            return
        }


        println("The first number is: $a\n and the last is: $d\n and the largest is: $bigger")
    }
