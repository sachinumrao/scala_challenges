@main def string_ops() = 
    // create a string
    var s1 : String  = "San Fransisco is a good city."
    var rating : Int = 8

    println(s1 + " It has rating: " + rating)
    println(s"$s1 It has rating: $rating")
    println(f"$s1%s It has rating: $rating%d")

    // string concatenation and string length
    var first_name : String = "Sherlock"
    var last_name : String  = "Holmes"
    var full_name : String  = first_name + " " + last_name

    println("Name: " + full_name)
    println("Name Length: " + full_name.length())