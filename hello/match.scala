@main def match_code() = 
    println("Code for Match")

    var age : Int  = 22
    // default case is mandatory
    age match{
        case 20 => println(s"Age: $age")
        case 21 => println(s"Age: $age")
        case _ => println("Age is something else...")

    }

    // we can return the result of match

    var result = age match{
        case 20 => 20
        case 25 => 30
        case _ => 100
    }

    println("Result = " + result)

    // we can also evaluate multiple cases
    var num : Int  = 4

    num match{
        case 1 | 3 | 5 | 7 | 9 => println("Odd")
        case 2 | 4 | 6 | 8 | 10 => println("Even")
        case _ => println("Out of scope")
    }



