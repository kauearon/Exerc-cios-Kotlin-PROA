package Lista2

fun main(){

    var val1: Number
    var val2: Number
    var val3: Number

    println("Insira o Primeiro valor aqui")
    val1 = readln().toInt()
    println("Insira o Segundo valor aqui")
    val2 = readln().toInt()
    println("Insira o Terceiro valor aqui")
    val3 = readln().toInt()

    if(val1 > val2 && val1 > val3) {

        println("O Primeiro número detem o maior valor!")
    }
    else if(val2 > val1 && val2 > val3){

            println("O Segundo número detem o maior valor!")

    }


    else if(val3 > val1 && val2 < val3){

        println("O Terceiro número detem o maior valor!")

    }

    else{

        println("Os números não podem ser iguais, reveja os valores e tente novamente ")

    }



}