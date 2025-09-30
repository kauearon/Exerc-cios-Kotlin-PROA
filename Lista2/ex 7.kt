package Lista2

fun main (){

    val numbers = Array(6) {0}
    var sum = 0
    for (i in numbers.indices) {
        println("Enter the ${i + 1}° number:")
        numbers[i] = readln()!!.toInt()


        if (numbers[i] < 72) {
            sum += numbers[i]
        }
    }

    println("Entered numbers ${numbers.joinToString(", ")}")
    println("The sum of the entered numbers is: $sum")















}