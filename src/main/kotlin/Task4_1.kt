class ArrClass{
    var arr: Array<Int>
    constructor(_arr: Array<Int>){
        arr = _arr
    }

    fun sumPosNum():Int{
        var sum = 0
        for(elem in arr){
            if(elem > 0) {
                sum += elem
            }
        }
        return sum
    }

    fun prodNum():Int{
        var prod = 1
        for(elem in arr){
            prod *= elem
        }
        return prod
    }


    fun averageNum(): Double{
        val sum = arr.sum()
        return sum.toDouble() / arr.size
    }
}
fun main() {
    val arr = ArrClass(arrayOf(1, -3, 5, 7, 5, -2))

    println("Сумма положительных элементов: ${arr.sumPosNum()}")
    println("Произведение: ${arr.prodNum()}")
    println("Среднее арифметическое значение: ${arr.averageNum()}")
}