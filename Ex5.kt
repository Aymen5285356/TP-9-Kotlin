package TP9

val resultat: Int by lazy {
    println("Calcul en cours...")
    42
}

fun main() {
    println("Avant utilisation")
    println("Résultat : $resultat")
}