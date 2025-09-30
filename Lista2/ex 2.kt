package Lista2

fun main(){

    var valor: Number

    println("Informe um valor por favor")
    valor = readln().toInt()

    if (valor > 0){
        println("O valor é Positivo!")
    }
    else if (valor < 0){
        println("O valor é Negativo!")
    }
    else {

        println("O valor é nulo ou igual a Zero!")
    }




}