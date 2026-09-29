package TP9

fun main() {
    print("Premier nombre : ")
    val a = readLine()!!.toDouble()
    print("Deuxième nombre : ")
    val b = readLine()!!.toDouble()

    println("Addition : ${a + b}")
    println("Soustraction : ${a - b}")
    println("Multiplication : ${a * b}")
    println("Division : ${if (b != 0.0) a / b else "erreur, division par zéro"}")
    println("a > b : ${a > b}")
    println("Somme paire : ${(a + b).toInt() % 2 == 0}")
}