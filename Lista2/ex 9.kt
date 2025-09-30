package Lista2

fun main() {

    outer@ while (true) {
        var yearb: Number
        val yeara = 2025
        var age = 0


        println("enter your year of birth: ")
        yearb = readln()!!.toInt()

        age = yeara - yearb

        if (age < 16) {
            println("Your age is: $age")
            println("You cant vote in this year, wait more")

        } else if (age in 16..17) {
            println("Your age is: $age")
            println("You can vote, if you want")
        } else {
            println("Your age is: $age")
            println("You can vote, choose wisely")
        }

        while (true) {

            var option: String
            println("You want continue? (Yes or No)")
            option = readln()!!.lowercase()

            if (option == "yes") {
                break
            } else if (option == "no") {
                println("Ok, bye")
                break@outer
            } else{
                println("Please choose a valid option (Yes or No).")
            }
        }

    }
}