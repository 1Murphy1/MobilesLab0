fun main() {
    val numbers = listOf(3, -1, 5, -9, 0, 8, -7)

    val negativeNum = numbers.filter { it < 0 }

    println("Отрицательные элементы: $negativeNum")
}