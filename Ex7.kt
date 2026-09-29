package TP9

class DatabaseConnection {
    fun requete() = println("Requête exécutée")
}

class DatabaseManager {
    lateinit var connexion: DatabaseConnection

    fun connecter() {
        connexion = DatabaseConnection()
    }

    fun executer() {
        if (::connexion.isInitialized) connexion.requete()
        else println("Non connecté")
    }
}

fun main() {
    val manager = DatabaseManager()
    manager.connecter()
    manager.executer()
}