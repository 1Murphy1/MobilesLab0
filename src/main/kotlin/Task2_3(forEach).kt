fun main(){
    val arr = arrayOf(2, 5, 10, 6)
    var prod = 1
    arr.forEach { prod *= it }

    val arrMax = arr.max()
    val arrMin = arr.min()

    println("Произведение: $prod")
    println("Макс: $arrMax")
    println("Мин: $arrMin")
}