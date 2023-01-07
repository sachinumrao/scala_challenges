@main def strings2() = 
    var str1 : String = "Hello"
    // scala may use java for strings
    // scala strings immutable

    // get length of string
    println("String Length: " + str1.length())

    // concat
    var str2 = " World" // str1 + str2
    println(str1.concat(str2))

    // formatting
    var num1 = 75
    var num2 = 100.25

    val result = printf("(%d -- %f -- %s)", num1, num2, str1)
    
