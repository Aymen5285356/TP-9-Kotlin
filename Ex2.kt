package TP9

fun main() {
    print("Note 1 : ")
    val n1 = readLine()!!.toDouble()
    print("Note 2 : ")
    val n2 = readLine()!!.toDouble()
    print("Note 3 : ")
    val n3 = readLine()!!.toDouble()

    val moyenne = (n1 + n2 + n3) / 3
    println("Moyenne : $moyenne")

    when {
        moyenne >= 80 -> println("Réussi avec mention excellente")
        moyenne >= 50 -> println("Réussi")
        else -> println("Échoué")
    }
}