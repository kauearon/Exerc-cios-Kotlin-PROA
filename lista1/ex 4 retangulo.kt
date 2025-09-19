package lista1

fun main(){

    var area=0
    var base: Number
    var altura: Number

    println("Insira o valor da base: ")
    base =readln().toInt()
    println("Insira o valor da altura")
    altura =readln().toInt()

    area = base*altura
    println("O valor da area é: $area")

}