// lists are immutable, linked list under the hood

def scala_lists() = 
    var list1 : List[Int] = List(1,2,3,4,5,6,7)
    for (i <- list1){
        println(i)
    }

    //prepending in the list: use of cons (::)
    // it does not changes the behavior of list1
    // we can store the cons output to another list
    println(0 :: list1)

    // use of Nil: create list with Nil value
    println(1 :: 5 :: 9 :: Nil) // (1,5,9)

    // first value
    println(list1.head)

    // tail is whatever is left after removing the first value
    println(list1.tail)

    // check if empty
    println(list1.isEmpty)

    // reverse method in list
    println(list1.reverse)

    // uniform list
    println(List.fill(5)(1000))

    // iterate, appply some function to all elements
    list1.foreach(println)

    var sum : Int = 0
    list1.foreach(sum += _)
    println("List sum : " + sum)


// sets are collections of same datatype with unique values
// there can be mutable and immutable set
def scala_sets() = 
    var set1 : Set[Int] = Set(1,2,3,4,4,5,2,3)
    println(set1)

    //add element to set
    // all sets are by deault immutable
    // sets are not ordered by default, so we cant index them

    var set2 = scala.collection.mutable.Set(1,2,3,4)
    println(set2)
    println(set2 + 10)

    // membership check
    println(set2(4)) // return boolean

    //
    println(set1.head)
    println(set1.tail)
    println(set1.isEmpty)

    // union of two sets
    println("Union Method-1: ")
    println(set1 ++ set2)
    println("Union Method-2: " + set1.++(set2))

    // intersection of two sets
    println("Intersection Method-2: " + set1.&(set2))

    // min-max
    println(set1.max)
    println(set1.min)

    // for loop
    println("For loop on set")
    set1.foreach(println)

    for (value <- set1){
        println(value)
    }

// maps are hashmaps: key:value pairs
// mutable and immutable maps

def scala_maps() = 
    var map1 : Map[Int, String] = Map(
        1 -> "Aakash",
        2 -> "Kiran",
        3 -> "Dom"
    )

    println(map1)
    println(map1(1))
    println("Keys of Map: " + map1.keys)
    println("Values in Map: " + map1.values)
    println(map1.isEmpty)

    // iterate over map
    map1.keys.foreach {key =>
        println("key: " + key)
        println("value: " + map1(key))
    }

    // check if key exists
    println(map1.contains(1))

    // concat two maps
    var map2 : Map[Int, String] = Map(
        5 -> "Shally"
    )

    println(map1 ++ map2)


// tuples contain heterogenous data types
// tuples are immutable only
// tuple can contain 1-22 items

def scala_tuples() = 
    var tup1 = (1, 2.4, "Hello", true)
    var tup2 = new Tuple4(10, 3.1416, "World", false)
    println(tup1)
    println(tup2)

    // value access
    println(tup1._1) // _1 is created after tuple init

    // iteration
    tup1.productIterator.foreach{
        i => println(i)
    }


@main def scala_collections() = 
    // scala_lists()
    // scala_sets()
    // scala_maps()
    scala_tuples()





