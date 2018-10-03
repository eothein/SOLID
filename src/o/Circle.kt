package o

class Circle(private var radius: Double) : Shape() {

    override fun calculateArea(): Double {
        return Math.PI * Math.pow(radius, 2.0)
    }

}