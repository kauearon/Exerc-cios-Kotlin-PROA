package Lista2

import java.security.Principal

fun main() {
    var n1: Number
    var n2: Number
    var result: Double
    outer@ while (true) {

        var option: Number

        println("Calculator")
        println("-------------------------")
        println("Select a option")
        println("-------------------------")
        println("1 - Addition")
        println("2 - Substraction")
        println("3 - Division")
        println("4 - Multiplication\n")
        option = readln()!!.toInt()

        when (option) {

            1 -> {
                println("Enter the first value")
                n1 = readln()!!.toDouble()
                println("Enter the second value")
                n2 = readln()!!.toDouble()

                result = n1 + n2

                println("The result is: $result")
                println("-------------------------")

            }

            2 -> {
                println("Enter the first value")
                n1 = readln()!!.toDouble()
                println("Enter the second value")
                n2 = readln()!!.toDouble()

                result = n1 - n2

                println("The result is: $result")
                println("-------------------------")
            }

            3 -> {
                println("Enter the first value")
                n1 = readln()!!.toDouble()

                while (true) {
                    println("Enter the second value")
                    n2 = readln()!!.toInt()

                    if (n2 == 0) {
                        println("invalid operation, it is not possible to perform divisions by zero ")

                    } else {
                        break
                    }

                }
                result  = n1/ n2
                println("The result is: $result")
                println("-------------------------")
            }
            4 -> {

                    println("Enter the first value")
                    n1 = readln()!!.toDouble()
                    println("Enter the second value")
                    n2 = readln()!!.toDouble()

                    result = n1 * n2

                    println("The result is: $result")
                println("-------------------------")

            }


            else -> {
                println("Select a valid option (1 to 5)")
                println("-------------------------")
                continue
            }


        }

        while (true) {
            var another: String

            println("Want to perfom another operation?")
            another = readln()!!.lowercase()

            if (another == "yes") {
                println("Alright\n")
                break
            } else if (another == "no") {
                println("Bye")
                break@outer
            } else {
                println("Select a valid option (Yes or No)")
                println("-------------------------")

            }

        }


    }
}