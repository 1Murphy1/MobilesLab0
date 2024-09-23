class ArrayClass {
    var arr: Array<Int>

    constructor(_arr: Array<Int>) {
        arr = _arr
    }

    fun modifyArray(): Array<Int> {
        val resultArray = Array(arr.size) { 0 }

        for (i in arr.indices) {
            val elem = arr[i]

            if (elem % 2 == 0) {
                resultArray[i] = elem * 2
            }

            else {
                resultArray[i] = elem * 3
            }
        }

        return resultArray
    }

    fun maxArray(): Int {
        val max = arr.max()
        return max
    }

    fun minArray(): Int {
        val min = arr.min()
        return min
    }

    fun sumArray(): Int {
        var sum = 0
        var i = 0
        while (i < arr.size) {
            sum += arr[i]
            i++
        }
        return sum
    }
}
fun main() {
    val numbers = ArrayClass(arrayOf(1, 2, 3, 4, 5))

    println("Массив с удвоенными четными и утроенными нечетными элементами: ${numbers.modifyArray().joinToString(", ")}")

    println("Максимальный элемент: ${numbers.maxArray()}")

    println("Минимальный элемент: ${numbers.minArray()}")

    println("Сумма элементов массива: ${numbers.sumArray()}")
}