package o

class AreaCalculator {

    fun calculateArea(shapes: Collection<Shape>): Double {
        var area = 0.0
        for (shape in shapes) {
            area += shape.calculateArea()
        }
        return area
    }
}