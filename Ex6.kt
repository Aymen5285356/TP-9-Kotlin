package TP9

class UtilisateurService {
    fun info() = "Service prêt"
}

class Application {
    lateinit var service: UtilisateurService

    fun initialiser() {
        service = UtilisateurService()
    }

    fun utiliser() {
        println(service.info())
    }
}

fun main() {
    val app = Application()
    app.initialiser()
    app.utiliser()
}