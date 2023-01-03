@main def data_types() = 
    /* this is a comment */
    // this is also a comment

    // we can use "var" for mutable variables
    // we can user "val" for immutable variables\

    // other types: Unit, Null, Nothing, Any, AnyVal, AnyRef

    var x1 : Int = 10
    var x2 : Long = 1000000000
    var x3 : Float = 1.5
    var x4 : Double = 3.14156789
    var flag : Boolean = true
    var x5 : Char = 'a'
    var x6 : String = "This is going to be great year."

    // lambda func init
    val x7 : Int = {
        val a : Int  = 10
        val b : Int  = 20
        a+b
    }

    println(x1)
    println(x2)
    println(x3)
    println(x4)
    println(x5)
    println(x6)
    println(x7)
    println(flag)
    