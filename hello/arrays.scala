import Array._

@main def arrays() = 
    // fixed size of sequential elements of same data type
    var arr1 : Array[Int] = new Array[Int](5)

    var arr2 = new Array[Int](5)

    // assigne values to index
    arr1(0) = 10
    arr1(1) = 20
    arr1(2) = 30
    arr1(3) = 40
    arr1(4) = 50

    for (i <- arr1){
        println(i)
    }

    // we can concatenate arrays of same datatype
    val result = concat(arr1, arr2)

    for (j <- result){
        println(j)
    }
