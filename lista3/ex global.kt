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

fun cinco() {

    outer@ while (true) {
        var soma = 0
        var contador = 0

        println("Insira o primeiro numero")
        val n1 = readln().toInt()
        println("Insira o segundo numero")
        val n2 = readln().toInt()

        for (i in (n1 + 1) until n2) {
            soma += i
            contador += 1
        }

        if (contador > 0) {
            val media = soma.toDouble() / contador
            println("A média aritmética dos números entre $n1 e $n2 é: $media")
        } else {
            println("Não existem números inteiros entre $n1 e $n2.")
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

fun seis() {
    middle@ while (true) {
        var aprovados = 0


        outer@ while (true) {
            println("Escreva a primeira nota: ")
            val n1 = readln()!!.toInt()
            println("Escreva a segunda nota: ")
            val n2 = readln()!!.toInt()

            val soma = n1 + n2
            val media = soma.toDouble() / 2
            println("O resultado da media é: $media\n ")

            if (media >= 9.5) {
                println("Parabéns, você foi aprovado")
                aprovados++
            } else {
                println("Você foi reprovado, mais sorte na próxima querido")
            }

            while (true) {
                println("Calcular a média de outro aluno? (sim ou não)")
                val opcao = readln()!!.lowercase()
                if (opcao == "sim") {
                    println("Ok, vamos lá")
                    continue@outer
                } else if (opcao == "não" || opcao == "nao") {
                    println("Certo, até mais tarde")
                    println("O número de alunos aprovados foi: $aprovados")
                    break
                } else {
                    println("Insira um valor válido")
                }
            }
            while (true) {
                println("Quer repetir o exercicio? (sim ou não)")
                val tentativa = readln()!!.lowercase()
                if (tentativa == "sim") {
                    println("ok, vamos la")
                    break
                } else if (tentativa == "não" || tentativa == "nao") {
                    println("ok, tchau")
                    break@middle
                } else {
                    println("Insira um valor válido")
                }
            }

        }
    }
}
fun sete() {
    outer@ while (true) {
        val numbers = IntArray(6) { 0 }
        for (i in numbers.indices) {
            var nota: Int
            while (true) {
                println("Digite a ${i + 1}° nota: ")
                nota = readln()!!.toInt()
                if (nota in 1..10) {
                    numbers[i] = nota
                    break
                } else {
                    println("Número inválido, insira a nota novamente")
                }
            }
        }

        val soma = numbers.sum()
        val media = soma / numbers.size
        println("O resultado da média é: $media")

        if (media == 5) {
            println("Você passou, mas pode melhorar, parabéns")
        } else if (media < 9) {
            println("Parabéns, você passou e sua média foi satisfatória")
        } else {
            println("Sua média foi perfeita, parabéns")
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
fun oito() {
    middle@while(true) {
        outer@ while (true) {
            println("Insira o valor de ignição: ")
            val N = readln()!!.toInt()

            if (N == 0) {
                println("Não pode ser inserido o valor zero")
            } else {
                for (i in 1..N) {
                    println(i)
                }
            }

            while (true) {
                println("Quer tentar de novo? (sim ou não)")
                val opcao = readln()!!.lowercase()
                if (opcao == "sim") {
                    println("Tudo bem, vamos lá")
                    continue@outer
                } else if (opcao == "não" || opcao == "nao") {
                    println("Tudo bem, tchau")
                    break
                } else {
                    println("Insira um valor válido")
                }
            }

            while (true) {
                println("Quer repetir o exercicio? (sim ou não)")
                val tentativa = readln()!!.lowercase()
                if (tentativa == "sim") {
                    println("ok, vamos la")
                    break
                } else if (tentativa == "não" || tentativa == "nao") {
                    println("ok, tchau")
                    break@middle
                } else {
                    println("Insira um valor válido")
                }
            }
        }

    }
}

fun nove() {
    outer@ while (true) {
        for (i in 101..110) {
            println(i)
        }

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

fun dez() {

    outer@ while (true) {
        val numbers = IntArray(10) { 0 }
        val dentro = mutableListOf<Int>()
        val fora = mutableListOf<Int>()

        for (i in numbers.indices) {
            println("Insira o ${i + 1}° numero")
            numbers[i] = readln()!!.toInt()

            if (numbers[i] in 24..42) {
                dentro.add(numbers[i])
            } else {
                fora.add(numbers[i])
            }
        }

        println("Conclusão")
        println("${dentro.size} estão dentro do intervalo entre 24 e 42 $dentro")
        println("${fora.size} estão fora do intervalo entre 24 e 42 $fora")

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

fun onze() {

    middle@ while (true) {
        println("Insira o valor de ignição da tabuada")
        val num = readln()!!.toInt()

        for (i in 1..num) {
            println("Tabuada do $i")
            for (j in 1..10) {
                println("$i x $j = ${i * j}")
            }
            println("----------------------")
        }

        while (true) {
            println("Quer repetir o exercicio? (sim ou não)")
            val tentativa = readln()!!.lowercase()
            if (tentativa == "sim") {
                println("ok, vamos la")
                break
            } else if (tentativa == "não" || tentativa == "nao") {
                println("ok, tchau")
                break@middle
            } else {
                println("Insira um valor válido")
            }
        }

    }
}

