package lista1

fun main (){

    var idade = 0
    var nome: String

    println("Qual o seu nome por gentileza? ")
    nome = readln().toString()
    println("Qual a sua idade por gentileza? ")
    idade = readln().toInt()

    println("Olá $nome, tudo bem? você tem $idade anos")


}