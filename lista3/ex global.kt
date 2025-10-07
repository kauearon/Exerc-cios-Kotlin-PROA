package lista3

import kotlin.concurrent.thread

fun main() {

    val opcao: Number

    println("Lista 3 de exercícios")
    println("---------------------------------")
    println("Selecione um exemplo")
    println("---------------------------------")
    println("Exercício - 1")
    println("Exercício - 2")
    println("Exercício - 3")
    println("Exercício - 4")
    println("Exercício - 5")
    println("Exercício - 6")
    println("Exercício - 7")
    println("Exercício - 8")
    println("Exercício - 9")
    println("Exercício - 10")
    println("Exercício - 11")
    opcao = readln()!!.toInt()
    println("---------------------------------")
    println("A opção selecionada foi $opcao ")

    if (opcao == 1) {
        um()
    } else if(opcao == 2){
        dois()
    } else if(opcao == 3){
        tres()
    } else if(opcao == 4){
        quatro()
    } else if(opcao == 5){
        cinco()
    } else if(opcao == 6){
        seis()
    } else if(opcao == 7){
        sete()
    } else if(opcao == 8){
        oito()
    } else if(opcao == 9){
        nove()
    } else if(opcao == 10){
        dez()
    } else if(opcao == 11){
        onze()
    } else{
        println("Numero invalido, escolhe entre os mencionados acima")
    }


}

    fun um(){

        for(i in 30..0){
            println(i)
            Thread.sleep(1000)
            println("Cabum, explosão")
        }

    }

    fun dois(){

        outer@ while(true){
            val valor1: Int
            var valor2: Int

            println("Digite um valor: ")
            valor1 = readln()!!.toInt()
            println("Digite outro valor: ")
            valor2 = readln()!!.toInt()

            while (valor2 <= 0){
                println("Não são permitidos valores iguais a zero ou menores")
                println("Digite outro valor: ")
                valor2 = readln()!!.toInt()
            }

            var div = valor1 / valor2

            println("Valor 1: $valor1\n Valor 2: $valor2")
            println("O resultado da equação é: $div")

            while (true) {
                var tentativa: String

                println("Quer tentar de novo?")
                tentativa = readln()!!.lowercase()
                if (tentativa == "sim") {
                    println("ok, vamos la")
                    break
                } else if (tentativa == "não") {
                    println("ok, tchau")
                    break@outer
                }
            }
        }
    }

    fun tres(){

        for (i in 10..1){
            println(i)
        }
    }

    fun quatro(){

        var soma = 0
        var contador = 0
        var media: Int

        for (i in 15..100){
            println("$i\n")
            Thread.sleep(250)
            soma += i
            contador += 1
        }

        media = soma / contador
        println("O resultador da equação é: $media")
    }

    fun cinco(){

        var soma = 0
        var contador = 0

        println("Insira o primeiro numero")
        var n1 = readln().toInt()
        println("Insira o primeiro numero")
        var n2 = readln().toInt()

        for (i in (n1+1) until n2){
            soma += i
            contador += 1
        }

        if (contador > 0) {
            val media = soma.toDouble() / contador
            println("A média aritmética dos números entre $n1 e $n2 é: $media")
        } else {
            println("Não existem números inteiros entre $n1 e $n2.")
        }
    }

    fun seis(){
        var aprovados = 0
        outer@while (true) {
            var n1: Int
            var n2: Int

            println("Escreva a primeira nota: ")
            n1 = readln()!!.toInt()
            println("Escreva a segunda nota: ")
            n2 = readln()!!.toInt()

            var soma = n1 + n2
            val media = soma.toDouble()/2

            println("O resultado da media é: $media\n ")

            if(media == 9.5){
                println("Parabéns, você foi aprovado, sua média é suficiente ")
                aprovados += 1
            } else if( media > 9.5){
                println("Parabens, você foi aprovado, você esta acima da média")
                aprovados +=1
            } else if(media < 9.5){
                println("Você foi reprovado, mais sorte na proxima querido")

            }

            while(true){
                var opcao: String

                println("Calcular a media de outro aluno? (Sim ou Não")
                opcao = readln()!!.lowercase()

                if(opcao == "sim"){
                    println("Ok, vamos lá")
                    break
                } else if( opcao == "não" || opcao == "nao"){
                    println("Certo, até mais tarde")
                    println("O número de alunos aprovados foi: $aprovados")
                    break@outer
                } else{
                    println("Insira um valor valido")
                }
            }


        }
    }

    fun sete(){
        val numbers = IntArray(6){0}

        for (i in numbers.indices){
            var nota: Int
            while (true){
                println("Digite a ${i + 1}° nota: ")
                nota = readln()!!.toInt()

            if (nota > 0 && nota <= 10){
                numbers[i] = nota
                break
            } else{
                println("Numero invalido, insira a nota novamente")
            }
            }
        }
        var soma = 0
        for(i in numbers){
            soma += i
        }
        val media = soma / numbers.size

        println("O resultado da média é: $media")


        if (media == 5){
            println("Você passou, mas pode melhorar, parabens")
        } else if (media <=9){
            println("parabens, você passou e sua média foi satisfatoria")
        } else{
            println("Sua média foi perfeita, parabens")
        }
    }

    fun oito(){
        var N: Int
        var contador = 0

        outer@while (true) {
            println("Insira o valor de ignição: ")
            N = readln()!!.toInt()

            if (N == 0){
                println("Não pode ser inserido o valor zero")

            } else{
                for (i in 1..N) {
                    println("$i")
                }

            }

            while (true){
                var opcao: String

                println("Quer tentar de novo? (Sim ou Não")
                opcao = readln()!!.lowercase()

                if (opcao == "sim"){
                    println("Tudo bem, vamos la")
                    break
                } else{
                    println("Tudo bem, tchau")
                    break@outer
                }
            }

        }
    }

    fun nove(){

        for (i in 101..110){
            println(i)
        }


    }

    fun dez(){
        val numbers = IntArray(10){0}
        val dentro = mutableListOf<Int>()
        val fora = mutableListOf<Int>()

        for (i in numbers.indices) {

            println("Insira o ${i + 1}° numero")
            numbers[i]= readln()!!.toInt()


            if (numbers[i] >= 24 && numbers[i] <= 42) {
                dentro.add(numbers[i])
            } else  {
                fora.add(numbers[i])
            }

        }
        println("Conclusão")
        println("${dentro.size}  estão dentro do intervalo entre 24 e 42 $dentro")
        println("${fora.size}  estão dentro do intervalo entre 24 e 42 $fora")
    }

    fun onze(){
        var num: Int

        outer@while(true){
        println("Insira o valor de ignição da tabuada")
        Thread.sleep(500)
        num = readln()!!.toInt()

        for (i in 1..num){

            println("Tabuada do $i")

        for(j in 1..10)    {
            println("$i x $j, = , ${i * j}")
        }
        }
        while (true) {
            println("\nDeseja voltar ao menu? (sim ou não)")
            val resposta = readln()!!.lowercase()

            if (resposta == "sim") {
                println("Beleza, voltando ao menu...\n")
                break
            } else if (resposta == "não" || resposta == "nao") {
                println("Ok, encerrando o programa. Até logo!")
                break@outer
            } else {
                println("Resposta inválida, digite 'sim' ou 'não'.")
            }
        }
    }
}

