package Lista2

fun main (){

    val numbers = IntArray(4){0}

    for(i in numbers.indices) {
        var value: Int
        while(true) {
        println("Enter the ${i + 1}° number")
        value = readln()!!.toInt()

    if (value > 0 && value <= 10) {
        numbers[i] = value
        break
    } else {
        println("Invalid value! try again.")
    }
        }
    }
    var sum = 0
    for (i in numbers){
        sum += i
    }
    val media = sum / numbers.size

    println("Average = $media")
    if(media > 5){
        println("Congratulations, you were approved")
    } else{
        println("So sorry, you were reproved, try again!.")
    }

}