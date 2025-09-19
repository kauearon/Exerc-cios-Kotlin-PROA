package lista1

fun main(){

    var diagonalMaior: Number
    var diagonalMenor: Number
    var area = 0

    print("Insira o valor da Diagonal Maior")
    diagonalMaior = readln().toInt()
    println("Insira o valor da Diagonal Menor")
    diagonalMenor = readln().toInt()

    area = (diagonalMenor*diagonalMaior)/2

    println("O valor da Area do losango é: $area")

}