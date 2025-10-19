package Lista4

fun main(){

   val estudantes = mutableListOf<String>()

    println("Olá, seja bem-vindo ao sistema de cadastro de alunos")
    println("Digite apenas o primeiro nome do aluno")
    println("Caso queira encerrar a seção, digite 'PARE'")

    while (true){

        println("Insira o nome de um aluno")
        val nome = readln()!!.trim()

        if (nome.uppercase() == "PARE"){
            break
        }
        if (nome.isNullOrEmpty()) {
            println("Valor inválido! Tente novamente.")
            continue
        }

        estudantes.add(nome)
        println("Estudante $nome cadastrado com sucesso")
    }

        println("\n==Seção encerada==")
        println("Total de alunos cadastrados: ${estudantes.size}")

        if (estudantes.isNotEmpty()){
            for ((indice, estudantes) in estudantes.withIndex()){
                println("${indice + 1} - $estudantes")
            }
        } else{
            println("Nenhum estudante foi cadastrado.")
        }
}