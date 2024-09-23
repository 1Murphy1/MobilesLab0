fun imitationOne1() {
    for (i in 1..10) {
        Thread.sleep(1000)
        println("One $i")
    }
}

fun imitationTwo1() {
    for (i in 1..10) {
        Thread.sleep(1000)
        println("Two $i")
    }
}

fun main() {
   println("Начало Main")

    Thread {
        imitationTwo1()
        imitationOne1()
    }.start()

    println("Конец Main")
}

