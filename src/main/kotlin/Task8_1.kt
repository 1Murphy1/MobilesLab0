import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Введите первое число: ")
    val num1 = scanner.nextDouble()

    print("Введите второе число: ")
    val num2 = scanner.nextDouble()

    print("Введите знак операции (+, -, *, /): ")
    val operation = scanner.next()[0]

    val result = when (operation) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            if (num2 != 0.0) num1 / num2
            else {
                println("Ошибка: Деление на ноль!")
                return
            }
        }
        else -> {
            println("Ошибка: Неверный оператор!")
            return
        }
    }

    println("Результат: $num1 $operation $num2 = $result")
}