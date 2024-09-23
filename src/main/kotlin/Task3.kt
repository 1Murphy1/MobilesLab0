import kotlin.math.sqrt
fun sqr(n: Double):Double{
    return n*n
}

fun discriminant(a: Double, b: Double, c: Double): Double{
    return sqr(b) - 4 * a * c
}

fun rootsNumber(a: Double, b: Double, c: Double): Double{
    val d = discriminant(a, b, c)
    return when{
        d > 0 -> 2.0
        d == 0.0 -> 1.0
        else -> 0.0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    val d = discriminant(a, b, c)
    val root = rootsNumber(a, b, c)

    if (root == 2.0){
        val x1 = (-b + sqrt(d)) / (2 * a)
        val x2 = (-b - sqrt(d)) / (2 * a)
        print("Уравнение имеет два корня: x1 = $x1 x2 = $x2")
    } else if(root == 1.0){
        val x = -b / (2*a)
        print("равнение имеет один корень x = $x")
    } else {
        print("Уравнение не имеет корней")
    }
}


fun main(){
    val a = 2.0
    val b = 4.0
    val c = -6.0

    quadraticRoot(a, b, c)
}