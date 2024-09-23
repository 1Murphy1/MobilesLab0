fun main() {
    val numbers = listOf(3, -1, 5, -9, 0, 8, -7)

    val modifiedNum = numbers.map { if (it > 0) -it else it }

    println("Список с изменёнными знаками положительных чисел: $modifiedNum")
}