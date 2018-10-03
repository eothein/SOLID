package o

/**
 * This class represents a rectangle.
 */
open class Rectangle(private val width: Int, private val height: Int) : Shape() {

    override fun calculateArea(): Double {
        return (width * height).toDouble()
    }

}