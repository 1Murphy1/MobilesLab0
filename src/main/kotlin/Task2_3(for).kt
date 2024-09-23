// Через for
fun main() {
    val arr = arrayOf(2, 5, 10, 6)

    var prod = 1
    var arrMin = arr[0]
    var arrMax = arr[0]

    for(elem in arr){
        prod *= elem
        if(elem > arrMax)
            arrMax = elem
        if(elem < arrMin)
            arrMin = elem
    }

    println("Произведение: $prod")
    println("Макс: $arrMax")
    println("Мин: $arrMin")
}