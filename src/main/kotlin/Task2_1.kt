fun isPrime(num: Int):Boolean {
    if (num < 2)
        return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0)
            return false
    }
    return true
}

fun main(){
    print("Введите количество простых чисел: ")
    val n = readLine().toString().toInt()

    var number = 2
    var count = 0

    while(count < n){
        if(isPrime(number)){
            print(number)
            print(" ")
            count++
        }
        number ++
    }
}