fun main() {
    val units = arrayOf(
        "ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
        "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
        "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    )

    val tens = arrayOf(
        "", "", "двадцать", "тридцать", "сорок", "пятьдесят",
        "шестьдесят", "семьдесят", "восемьдесят", "девяносто"
    )

    print("Введите число от 0 до 100: ")
    val number = readLine()?.toInt()

    if (number != null && number in 0..100) {
        when {
            number < 20 -> println(units[number])
            number == 100 -> println("сто")
            else -> {
                val tenPart = tens[number / 10]
                val unitPart = if (number % 10 == 0) "" else units[number % 10]
                println("$tenPart $unitPart")
            }
        }
    } else {
        println("Ошибка: введите число в диапазоне от 0 до 100")
    }
}