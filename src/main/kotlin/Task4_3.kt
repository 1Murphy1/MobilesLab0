import kotlin.math.sqrt
class Vector {
    val x: Double
    val y: Double
    val z: Double

    constructor(_x: Double, _y: Double, _z: Double) {
        x = _x
        y = _y
        z = _z
    }

    fun length(): Double{
        return sqrt(x * x + y * y + z * z )
    }

    fun scalarProd(other: Vector): Double{
        return x * other.x + y * other.y + z * other.z
    }

    infix fun infixScalarProd(other: Vector): Double{
        return scalarProd(other)
    }

    operator fun times(other: Vector): Double {
        return scalarProd(other)
    }
}

fun scalarProd(v1: Vector, v2: Vector): Double {
    return v1 * v2
}

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Длина вектора v1: ${v1.length()}")

    println("Скалярное произведение через метод: ${v1.scalarProd(v2)}")

    println("Скалярное произведение через инфиксную запись: ${v1 infixScalarProd v2}")

    println("Скалярное произведение через оператор *: ${v1 * v2}")

    println("Скалярное произведение через внешнюю функцию: ${scalarProd(v1, v2)}")
}