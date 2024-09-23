fun main(){
    var count = 0
    var sum = 0

    while(true){
        print("Введите числа: ")
        val input1 = readLine().toString().toInt()

        if(input1 == null){
            print("Порпобуйте еще раз")
        }

        if(input1 == 0)
            break

        count++
        sum += input1


    }

    if (count > 0) {
        val average = sum / count
        println("Количество введённых чисел: $count")
        println("Сумма чисел: $sum")
        println("Среднее арифметическое: $average")
    }
}
