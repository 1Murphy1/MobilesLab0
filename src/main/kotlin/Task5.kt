open class Vehicle1 {
    open val speed: Int = 0
    open val name: String = "Транспортное средство"

    open fun start() {
        println("$name начал движение со скоростью $speed км/ч")
    }

    open fun stop() {
        println("$name остановился")
    }
}

class Boat : Vehicle1() {
    override val speed: Int = 20
    override val name: String = "Лодка"

    override fun start() {
        println("$name начала плавание со скоростью $speed км/ч")
    }

}
class Plane : Vehicle1() {
    override val speed: Int = 600
    override val name: String = "Самолет"

    override fun start() {
        println("$name начал взлет со скоростью $speed км/ч")
    }
}

class Tank : Vehicle1() {
    override val speed: Int = 40
    override val name: String = "Танк"

    override fun start() {
        println("$name начал движение по полю со скоростью $speed км/ч")
    }
}

fun main() {
    val boat = Boat()
    val plane = Plane()
    val tank = Tank()

    boat.start()
    boat.stop()

    plane.start()
    plane.stop()

    tank.start()
    tank.stop()
}