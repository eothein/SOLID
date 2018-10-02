package o.optimized

class Rectangle(private var width: Int, private var length: Int) : Shape {

    override fun area(): Double {
        return width.toDouble() * length.toDouble()
    }
}