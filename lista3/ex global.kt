package lista3

import kotlin.concurrent.thread

fun main() {
    outer@ while (true) {
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
        println("Digite 0 para sair")

        val opcao = readln()!!.toInt()
        println("---------------------------------")
        println("A opção selecionada foi $opcao ")

        if (opcao == 1) {
            um()
        } else if (opcao == 2) {
            dois()
        } else if (opcao == 3) {
            tres()
        } else if (opcao == 4) {
            quatro()
        } else if (opcao == 5) {
            cinco()
        } else if (opcao == 6) {
            seis()
        } else if (opcao == 7) {
            sete()
        } else if (opcao == 8) {
            oito()
        } else if (opcao == 9) {
            nove()
        } else if (opcao == 10) {
            dez()
        } else if (opcao == 11) {
            onze()
        } else if (opcao == 0) {
            println("Saindo... até mais!")
            break@outer
        } else {
            println("Número inválido, escolha entre os mencionados acima")
            continue
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



fun um() {

    outer@while(true) {
        for (i in 30 downTo 0) {
            println(i)
            Thread.sleep(250)
        }
        println("Cabum, explosão")


        while (true) {
            var opcao: String
            println("Quer repetir o exercicio? (sim ou não)")
            opcao = readln()!!.lowercase()

            if (opcao == "sim") {
                println("Repetindo")
                break
            } else {
                println("Ok, voltando ao menu")
                break@outer
            }
        }
    }
}


fun dois() {
    outer@ while (true) {
        println("Digite um valor: ")
        val valor1 = readln()!!.toInt()
        println("Digite outro valor: ")
        var valor2 = readln()!!.toInt()

        while (valor2 <= 0) {
            println("Não são permitidos valores iguais a zero ou menores")
            println("Digite outro valor: ")
            valor2 = readln()!!.toInt()
        }

        val div = valor1 / valor2
        println("Valor 1: $valor1\n Valor 2: $valor2")
        println("O resultado da equação é: $div")

        while (true) {
            println("Quer repetir o exercicio? (sim ou não)")
            val tentativa = readln()!!.lowercase()
            if (tentativa == "sim") {
                println("ok, vamos la")
                break
            } else if (tentativa == "não" || tentativa == "nao") {
                println("ok, tchau")
                break@outer
            } else {
                println("Insira um valor válido")
            }
        }
    }
}

fun tres() {
    outer@ while (true) {
    for (i in 10 downTo 1) {
            println(i)
        }
        while (true) {
            println("Quer tentar de novo? (sim ou não)")
            val tentativa = readln()!!.lowercase()
            if (tentativa == "sim") {
                println("ok, vamos la")
                break
            } else if (tentativa == "não" || tentativa == "nao") {
                println("ok, tchau")
                break@outer
            } else {
                println("Insira um valor válido")
            }
        }
    }
}
fun quatro() {
    outer@ while (true) {
        var soma = 0
        var contador = 0

        for (i in 15..100) {
            println("$i\n")
            Thread.sleep(100)
            soma += i
            contador += 1
        }

        val media = soma / contador
        println("O resultado da equação é: $media")

        while (true) {
            println("Quer tentar de novo? (sim ou não)")
            val tentativa = readln()!!.lowercase()
            if (tentativa == "sim") {
                println("ok, vamos la")
                break
            } else if (tentativa == "não" || tentativa == "nao") {
                println("ok, tchau")
                break@outer
            } else {
                println("Insira um valor válido")
            }
        }
    }
}


