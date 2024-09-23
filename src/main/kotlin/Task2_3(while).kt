//While
fun main(){
    val arr = arrayOf(2, 5, 10, 6)

    var arrMax = arr[0]
    var arrMin = arr[0]
    var prod = 1
    var i = 0

    while(i < arr.size){
        prod *= arr[i]
        if(arr[i] > arrMax){
            arrMax = arr[i]
        }
        if(arr[i] < arrMin){
            arrMin = arr[i]
        }
        i++
    }

    println("Произведение: $prod")
    println("Макс: $arrMax")
    println("Мин: $arrMin")
}