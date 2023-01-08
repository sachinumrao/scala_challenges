// container with two values, Some or None
@main def scala_optypes() = 
    var list1 = List(1,2,3,4)
    println(list1.find(_ > 6))

    var map1 = Map(
        1 -> "Tom"
    )
    println(map1.get(1))

    // extract value from Some
    println(list1.find(_ > 2).get)

    // to avoid exception in case of None
    println(list1.find(_ > 6).getOrElse("No value is larger than 6"))

    // define an option
    var opt : Option[Int] = Some(5) // or we can set to None
    println(opt.isEmpty)
