fun imitationOne2() {
    for (i in 1..10) {
        Thread.sleep(1000)
        println("One $i")
    }
}

fun imitationTwo2() {
    for (i in 1..10) {
        Thread.sleep(1500)
        println("Two $i")
    }
}

fun main() {
    println("Начало Main")

    Thread {
        imitationTwo2()
    }.start()

    Thread {
        imitationOne2()
    }.start()

    println("Конец Main")
}