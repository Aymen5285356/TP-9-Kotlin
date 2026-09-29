package TP9

class MaTache : Runnable {
    override fun run() {
        repeat(3) {
            println("Message de ${Thread.currentThread().name}")
            Thread.sleep(1000)
        }
    }
}

fun main() {
    Thread(MaTache()).start()
    Thread(MaTache()).start()
}