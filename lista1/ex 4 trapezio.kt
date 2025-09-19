package lista1

fun main(){

    var baseMaior: Number
    var baseMenor: Number
    var altura: Number
    var area = 0

    println("Insira o valor da base maior: ")
    baseMaior = readln().toInt()
    println("Insira o valor da base menor: ")
    baseMenor = readln().toInt()
    println("Insira o valor da altura")
    altura = readln().toInt()

    area = (baseMaior+baseMenor)* altura / 2

    println("O valor da area do trapezio é de: $area")





}