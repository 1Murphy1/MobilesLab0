fun main() {
    val arr = arrayOf(65, 3, 23, 50, 45, 8, 1, -5, 4, 2)
    for(i in 1 until arr.size - 1){
        if(arr[i] > arr[i-1] && arr[i] > arr[i+1] ){
            print(arr[i])
            print(" ")
        }
    }
}