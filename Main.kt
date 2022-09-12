import java.util.Scanner
fun main() {
    var Square : Shape
    var Circle : Shape
    var Triangle : Shape
    var EquilateralTriangle : Shape
    print("Enter a shape: ")
    val shapeReader = Scanner(System.`in`)
    var string:String = shapeReader.nextLine()
    if (string == "Square" || string == "square") {
        print("Enter the height: ")
        var squareHeight:Double = shapeReader.nextDouble()
        print("Enter the length: ")
        var squareLength:Double = shapeReader.nextDouble()
        println("The name of the shape is: $string") //printing out the name of the new user created object
        val s : Shape = Square(string) //creating a new Square object with string as the name
        (s as Square).setDimensions(squareLength, squareHeight) //setting the dimensions of the user created square
        s.printDimensions() //printing dimensions
        println("The area is ${s.getArea()}") //printing the area of the square
    }
    if (string == "Circle" || string == "circle") {
        print("Enter the radius: ")
        var circleRadius:Double = shapeReader.nextDouble()
        println("The name of the shape is: $string") //printing the name
        val c : Shape = Circle(string) //creating Circle object
        (c as Circle).setDimensions(circleRadius) //setting dimensions while also casting object as circle
        c.printDimensions() //printing dimensions
        println("The area is ${c.getArea()}") //printing the area
    }
    if (string == "Triangle" || string == "triangle") {
        print("Enter length of the first side: ")
        var triangleSide1:Double = shapeReader.nextDouble()
        print("Enter length of the second side: ")
        var triangleSide2:Double = shapeReader.nextDouble()
        print("Enter length of the third side: ")
        var triangleSide3:Double = shapeReader.nextDouble()
        println("The name of the shape is $string")
        val t : Shape = Triangle(string) //creating a val t (triangle) as a Shape type = to Triangle(string)
        (t as Triangle).setDimensions(triangleSide1, triangleSide2, triangleSide3) //setting the dimensions and casting as a triangle
        t.printDimensions() //printing the dimensions
        println("The area is: ${t.getArea()}") //printing the area
    }
    if (string == "EquilateralTriangle" || string == "equilateraltriangle" || string == "Equilateral Triangle" || string == "equilateral triangle") {
        print("Enter the side length for the Equilateral Triangle: ")
        var sideLength:Double = shapeReader.nextDouble()
        println("The name of the shape is: $string") //printing the name
        val et : Shape = EquilateralTriangle(string)
        (et as EquilateralTriangle).setDimensions(sideLength) //setting the dimensions
        et.printDimensions() //printing dimensions
        println("The area is ${et.getArea()}") //printing area
    }

}