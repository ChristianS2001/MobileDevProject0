open class Triangle (name: String) : Shape(name) {
    var side1 : Double = 0.0
    var side2 : Double = 0.0
    var side3 : Double = 0.0
    fun setDimensions(_side1: Double, _side2: Double, _side3: Double) {
        this.side1 = _side1
        this.side2 = _side2
        this.side3 = _side3
    }
    override fun printDimensions() {
        println("The first side is: $side1")
        println("The second side is: $side2")
        println("The third side is: $side3")
    }
    override fun getArea(): Double {
        var a = side1
        var b = side2
        var c = side3
        var s = (0.5) * (side1 + side2 + side3)
        var math: Double = (s * (s - a) * (s - b) * (s - c))
        return kotlin.math.sqrt(math)
    }

}