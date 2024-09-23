interface Figure {
    fun area(): Double

    fun perimeter(): Double
}

class Square(val side: Double) : Figure {
    override fun area(): Double {
        return side * side
    }

    override fun perimeter(): Double {
        return 4 * side
    }
}

class Circle(val radius: Double) : Figure {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Triangle(val a: Double, val b: Double, val c: Double) : Figure {
    override fun area(): Double {
        val s = perimeter() / 2
        return Math.sqrt(s * (s - a) * (s - b) * (s - c))
    }

    override fun perimeter(): Double {
        return a + b + c
    }
}

fun main() {
    val square = Square(4.0)
    val circle = Circle(3.0)
    val triangle = Triangle(3.0, 4.0, 5.0)

    println("Квадрат:")
    println("Площадь: ${square.area()}")
    println("Периметр: ${square.perimeter()}")

    println("\nОкружность:")
    println("Площадь: ${circle.area()}")
    println("Периметр: ${circle.perimeter()}")

    println("\nТреугольник:")
    println("Площадь: ${triangle.area()}")
    println("Периметр: ${triangle.perimeter()}")
}