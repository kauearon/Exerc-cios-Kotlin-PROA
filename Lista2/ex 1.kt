package Lista2

fun main(){

    var num1: Number
    var num2: Number

    println("Escreva o Primeiro Número: ")
    num1 = readln().toInt()
    println("Escreva o Segundo Número: ")
    num2 = readln().toInt()

    if(num1 > num2){
        println("O Primeiro número é: $num1, e ele é o maior!")
    }

    else{
        println("O Segundo número é: $num2, e ele é o maior!")
    }
}