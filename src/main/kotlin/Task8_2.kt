fun main() {
    val words: List<String?> = listOf("hello", null, "world", "kotlin", null, "programming")

    println("Используя if:")
    for (word in words) {
        if (word != null) {
            println(word.uppercase())
        } else {
            println("null")
        }
    }

    println("\nИспользуя безопасный вызов ?:")
    for (word in words) {
        println(word?.uppercase())
    }

    println("\nИспользуя let:")
    for (word in words) {
        word?.let {
            println(it.uppercase())
        }
    }

    println("\nИспользуя Элвис-оператор ?:")
    for (word in words) {
        println((word ?: "empty").uppercase())
    }
}