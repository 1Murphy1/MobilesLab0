fun main() {
    val numbers = (1..7).toList()

    val result = numbers.joinToString(
        separator = "+",
        prefix = "=",
        postfix = "="
    )

    println(result)
}