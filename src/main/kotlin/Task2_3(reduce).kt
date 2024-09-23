 //Через reduce  функции max, min
fun main(){
    val arr = arrayOf(2, 5, 10, 6)
    var prod = arr.reduce{a, b -> a * b}

    val arrMax = arr.max()
    val arrMin = arr.min()

    println("Произведение: $prod")
    println("Макс: $arrMax")
    println("Мин: $arrMin")

}