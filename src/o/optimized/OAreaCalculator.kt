package o.optimized

class OAreaCalculator {

    fun calculateArea(shapes: MutableCollection<Shape>): Unit {
        var area = 0.0
        for (shape in shapes) {
            area = shape.area()
        }
        println("The calculated area is : $area")
    }
}