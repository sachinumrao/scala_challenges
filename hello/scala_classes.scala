// object is sinngleton class
// cannot create instance of this object
// var arg means we can overwrite the value
// val args are immutable
// to make variable private we can do: private var age:Int
// private variables can be accessed only within class

// getter and setter are available for  private variables
// for val only getter ia available
// if var/val is not given, we can not use getters and setters

// primary constructor is defined along with class
// auxiliary constructor: alternative constructor for class
// there can be multiple auxiliary const. but they should differ in args
// any auxiliary constructor must call all previous existing constructors



class User(var name : String, private var age: Int) {

    // auxiliary constructor
    def this() = {
        this("Tom", 32) // must call prev defined constructor
    }

    def this(name: String) = {
        this(name, 32)
    }
    def printAge={println("Age: " + age)}
}


@main def scala_classes() = 
    var u1 = new User("Max", 25)


    println(u1)
    println(u1.name)
    u1.name = "Shellby"
    println(u1.name)

    u1.printAge

    var u2 = new User()
    println(u2.name)
    u2.printAge

    var u3 = new User("Max")
    println(u3.name)
    u3.printAge

    // inheritance
    // subclass inherits members of superclass
