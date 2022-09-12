class Circle (name: String) : Shape(name) {
    var radius = 0.0
    fun setDimensions(_radius: Double) {
        this.radius = _radius
    }
    override fun printDimensions() {
        println("The radius of the circle is: $radius")
    }
    override fun getArea(): Double {
        var area = (3.14) * (radius * radius)
        return area
    }
}