package Lista4

fun main() {

        val planetas = mutableListOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter")

        println("Olá, você está no sistema Solar")
        println("Digite um planeta")
        println("Caso queira voltar para Terra, insira 'VOLTAR'")

        while (true) {
            print("Digite o nome de um planeta: ")
            val planeta = readln()?.trim() ?: ""

            // Verifica se o usuário quer sair
            if (planeta.uppercase() == "VOLTAR") {
                break
            }

            // Verifica entrada vazia
            if (planeta.isEmpty()) {
                println("Valor inválido! Tente novamente.\n")
                continue
            }

            // Verifica se já existe (ignorando maiúsculas/minúsculas)
            val planetaExistente = planetas.any { it.equals(planeta, ignoreCase = true) }
            if (planetaExistente) {
                println("Este planeta, no caso $planeta, já está no sistema solar. Insira outro.\n")
                continue
            }

            // Adiciona o planeta à lista
            planetas.add(planeta)
            println("O planeta $planeta foi inserido no sistema solar!\n")
        }

        // Exibe resultados
        println("== Sistema Solar == \n Total de planetas: ${planetas.size}")
        planetas.forEachIndexed { i, planetaAtual -> println("${i + 1} - $planetaAtual") }
    }
