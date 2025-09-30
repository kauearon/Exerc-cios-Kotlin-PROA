package Lista2
//exercício 10 feito com if/else
fun main() {

    outer@ while (true) {

        var height: Double
        var weight: Double
        var option: String

        println("What´s your gender? (Male or Female)")
        option = readln()!!.lowercase()



        if (option != "female" && option != "male") {
            println("Select a valid option! (Male or Female")
            continue
        }


        println("Enter your Height: ")
        height = readln()!!.toDouble()


        if (option == "male") {

            weight = (72.7 * height) - 58
            println("Your ideal weight is: $weight")
        } else if (option == "female") {
            println("Enter your Height: ")

            weight = (62.1 * height) - 44.7
            println("Your ideal weight is: $weight")
        } else {
            println("Select a valid option! (Male or Female")


        }


        while (true) {

            var again: String
            println("Want to try again? (Yes or no)")
            again = readln()!!.lowercase()

            if (again == "yes") {
                println("Let´s try again!")
                break
            } else if (again == "no") {
                println("Ok, see you again")
                break@outer
            } else {
                println("Select a valid option! (Yes or No")
            }


        }

    }
}












