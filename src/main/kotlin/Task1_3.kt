fun main(){
    val rand = (0..10).random()
    while(true){
        println("Попробуйте угадать число: ")
        val input = readLine().toString().toInt()

        if(input < rand){
            println("Мало")
        }
        if(input > rand){
            println("Много")
        }
        if(input == rand){
            println("Угадал!")
            break
        }
    }
}