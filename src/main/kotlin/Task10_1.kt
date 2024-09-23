fun imitationOne() {
    for (i in 1..10) {
        Thread.sleep(1000)
        println("One $i")
    }
}

fun imitationTwo() {
    for (i in 1..10) {
        Thread.sleep(1000)
        println("Two $i")
    }
}

fun main() {
    println("Начало Main")

    // Вызов функций поочередно
    imitationTwo()
    imitationOne()

    println("Конец Main")

}