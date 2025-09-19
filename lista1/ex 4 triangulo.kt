package lista1

fun main(){

    var base: Number
    var altura: Number
    var area = 0

    println("Informe o valor da Base: ")
    base = readln().toInt()

    println("Informe o valor da Altura: ")
    altura = readln().toInt()

    area = (base * altura)/2

    println("O valor equivalente a Área é: $area")
}