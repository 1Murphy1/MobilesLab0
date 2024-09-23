fun main() {
    val numbers = listOf(2, -3, 4, -1, 0)

    val squaredNumbers = numbers.map { it * it }

    println("Квадраты элементов: $squaredNumbers")
}