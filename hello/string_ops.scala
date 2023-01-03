@main def string_ops() = 
    // create a string
    var s1 : String  = "San Fransisco is a good city."
    var rating : Int = 8

    println(s1 + " It has rating: " + rating)
    println(s"$s1 It has rating: $rating")
    println(f"$s1%s It has rating: $rating%d")