import kotlin.math.sqrt

class EquilateralTriangle (name: String) : Triangle(name) {
    var sideCheck = 0.0
    fun setDimensions(_sideCheck: Double) {
        this.sideCheck = _sideCheck
    }
    override fun printDimensions() {
        println("All the sides are equal to: $sideCheck")
    }
    override fun getArea(): Double {
        var a = side1
        var b = side2
        var c = side3
        var s = (0.5) * (side1 + side2 + side3)
        var math: Double = (s * (s - a) * (s - b) * (s - c))
        return sqrt(math)
    }
}