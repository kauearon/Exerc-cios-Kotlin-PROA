package Lista2
// exercício 10 feito com when
fun main(){
outer@while (true) {
    var option: Number
    var height: Double
    var weight: Double

    println("Select your gender (1 = Women or 2 = Men ")
    option = readln().toInt()

    when (option) {
        1 -> {
            println("Your gender is Female!")

            println("What´s your height?")
            height = readln()!!.toDouble()

            weight = (62.1 * height) - 44.7
            println("Your ideal weight is: $weight")

        }

        2 -> {
            println("Your gender is Male")

            println("What´s your height?")
            height = readln()!!.toDouble()

            weight = (72.7 * height) - 58
            println("Your ideal weight is: $weight")
        }

        else -> {
            println("Select a valid option! (1 for Female anda 2 for Male)")
            continue
        }


    }


    while (true) {
        println("Let´s try again? (Yes or No")
        val choise = readln()!!.lowercase()

        when (choise) {
            "yes" -> {
                println("Ok, try again")
                break
            }

            "no" -> {
                println("Ok, bye")
                break@outer

            }

            else -> {
                println("Invalid option, select again!")
            }

        }

    }

    }







}