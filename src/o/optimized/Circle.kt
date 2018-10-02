package o.optimized

class Circle(private var radius: Double) : Shape {


    override fun area(): Double {
        return Math.PI * Math.pow(radius, 2.0)
    }

}