// map method: apply function on all elements of collection

@main def scala_function() = 
    var list1 = List(1,2,3,4,5)
    println(list1.map(_ * 2))
    println(list1.map(x => x*3))

    var map1 = Map(
        1 -> "Tom",
        2 -> " Jerry"
    )
    println(map1.map(x => "Hi " + x))
    println(map1.mapValues(x => "Hi " + x))

    // map on strings
    println("Hello".map(_.toUpper))

    // flatten: latten list of lists
    var list2 = List(List(1,2,3), List(4,5,6))
    println(list2.flatten)

    // flatmap: map a collection and flatten it
    println(list1.flatMap(x => List(x, x+1)))

    // filter method
    // filter accepts a method which return boolean value
    println(list1.filter(x => x%2 == 0))

    // reduce/fold/scan method
    // accept binary functions (funcs with two input args)
    println(list1.reduceLeft(_ + _))
    println(list1.reduceLeft(
        (x,y) => {
            println(x + " , " + y)
            x+y
        }
    ))

    var list3 = List("A", "B", "C")
    println(list3.reduceLeft(_+_))
    println(list3.reduceRight(_+_))

    // fold is same as reduce but we can pass initial args
    println(list1.foldLeft(10)(_ + _)) // 10 is added to sum

    // scan is same as fold but scan gives map of intermediate results
    println(list1.scanLeft(10)(_+_))
    
