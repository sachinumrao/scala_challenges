@main def loops() =

    // example fo while loop to print table 
    var x : Int = 5
    var i : Int = 1
    var limit : Int  = 10
    var prod : Int  = 0

    println("Using While Loop...")
    while (i <= limit){
        prod = x * i
        println(s"$x x $i = $prod")
        i = i + 1
    }

    // do while code

    println("Using Do-While Loop...")
    
    var k : Int = 1
    do {
        prod = x * k
        println(s"$x x $k = $prod")
        k = k + 1;
    } while (k <= limit)

    // for loop
    
    // define range with two methods:
    // to : start.to(end) -> inclusive range
    // until : start.until(end) -> exclusive range

    println("Using For Loop...")
    for (j <- 1.to(10)){
        prod = x * j
        println(s"$x x $j = $prod")
    }

    // nested for loop
    for (i <- 1 to 10 : k j <- 1 to 5){
        // runs like i as outer for loop and j as inner
    }

    // using for lops with arrays/lists
    var arr = List(1,2,3,4,5,6,7,8,9)

    // simple iteration over list
    for (i <- arr){
        println(i)
    }5

    // iteration with filter
    for (i <- arr ; if i < 6){
        println(i)
    }

    // iteration with filter and map
    var squares = for {i <- arr; if i < 5} yield {i*i}
    println("Squres: " + squares)
