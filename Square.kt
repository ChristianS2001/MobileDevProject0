class Square (name: String) : Shape(name){
    var length : Double = 0.0
    var height : Double = 0.0
    fun setDimensions(_length: Double, _height: Double){
        this.length = _length
        this.height = _height
    }
    override fun printDimensions() {
        println("The length is: $length")
        println("The height is: $height")
    }
    override fun getArea(): Double {
        var area = length * height
        return area
    }
}