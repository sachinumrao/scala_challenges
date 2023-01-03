@main def control_flow() = 
    var x1 : Int  = 10
    var x2 : Int  = 20

    if (x1 > x2){
        println(s"$x1 is larger than $x2.")
    } else {
        println(s"$x1 is smaller than $x2.")
    }

    var flag : Boolean = true

    if (flag){
        println(s"Value of the flag is $flag.")
    }