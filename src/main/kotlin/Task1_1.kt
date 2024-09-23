fun main(){
    print("Введите число: ")
    val input = readLine()

    val firstDig = input?.first().toString().toInt()
    val lastDig = input?.last().toString().toInt()

    val sum = firstDig + lastDig

    print("Sum:  $sum")
}