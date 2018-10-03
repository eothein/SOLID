package o

/**
 * This class represents a rectangle.
 */
class Rectangle(private var width: Int, private var height: Int) : Shape() {

    override fun calculateArea(): Double {
        return (width * height).toDouble()
    }

}