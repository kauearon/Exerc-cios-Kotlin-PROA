package Lista4

fun main() {
    // Criando a lista de frutas
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Morango", "Uva")

    println("=== Lista de Compras ===")
    println("Frutas disponíveis: $frutas\n")

    // Loop principal até a lista ficar vazia
    while (frutas.isNotEmpty()) {
        print("Digite o nome da fruta para remover: ")
        val frutaUsuario = readLine()?.trim() ?: ""

        // Verifica se a fruta digitada está na lista (ignorando maiúsculas/minúsculas)
        val frutaEncontrada = frutas.find { it.equals(frutaUsuario, ignoreCase = true) }

        if (frutaEncontrada != null) {
            frutas.remove(frutaEncontrada)
            println("Fruta '${frutaEncontrada}' foi retirada da lista.")
            println("Frutas restantes: $frutas\n")
        } else {
            println("Fruta indisponível no nosso mercado.\n")
        }
    }

    println("Lista de compras finalizada!")
}
