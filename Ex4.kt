package TP9

class Configuration {
    init { println("Configuration chargée") }
}

class App {
    val config: Configuration by lazy { Configuration() }
    fun utiliser() {
        println("Utilisation de la config")
        config
    }
}

fun main() {
    val app = App()
    println("App démarrée")
    app.utiliser()
}