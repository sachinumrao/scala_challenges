class Polygon{
    def area:Double = 0.0

}


class Rectangle(var width: Double, var height:Double) extends Polygon{
    override def area : Double = 
        width * height

}

class Triangle(var base: Double, var height: Double) extends Polygon{
    override def area : Double = 
        base * height * 0.5
}


// we dont want area to be set to zero on instantiating subclass object
// we want to force subclass to have an area method
// we can do this by creating Abstract Base Class
// if a class has atleast one abstract method, class must be declared as abstract base class

abstract class Shape {
    // create an abstract function by not providing function body
    def area : Double
}

class Square(var side: Double) extends Shape{
    override def area :Double = 
        side * side
}


def printArea(p: Polygon)=
    println(p.area)

def printShapeArea(p: Shape)=
    println(p.area)


@main def scala_inheritance() =
    var poly1 = new Polygon
    printArea(poly1)

    var rect1 = new Rectangle(12.3, 14.5)
    printArea(rect1)

    var tri1 = new Triangle(10, 6)
    printArea(tri1)

    //
    var sq1 = new Square(7.5)
    println("Square Area: " )
    printShapeArea(sq1)
