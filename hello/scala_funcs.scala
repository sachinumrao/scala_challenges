def func1(arg1: Int, arg2: Int): Int =
    println("We are inside a simulation")
    // last line value is considered to be return value
    // no explicit return required
    return 0


// if it is a class we need to create instance
// if it is an object we can directly use it
// one way to use objects is to collect functions
// Unit is return type for fucntions with no returns
// Anonymous Func: assign func to variable
// Higher Order Funcs: funcs which take funcs as arguments and return funcs
// Partially Applied Funcs: create partial funcs
// Closures: funcs which use variables defined outside func
// Changes made outside flow to closures
// Changes made in closure flow to outside
// Currying: Transform function which take multiple args to func with single arg


object Algebra{
    def add(num1:Int, num2:Int) : Int = 
        return num1 + num2

    def subtract(num1:Int, num2:Int) : Int = 
        return num1 - num2

    // provide default value for params
    def square(num:Int = 10) : Int = 
        return num * num
}


// higher order func
def math(x:Int, y:Int, f: (Int, Int)=>Int): Int = 
    f(x, y)


def add(x: Int, y:Int):Int = 
    x+y


@main def scala_funcs() = 
    var a1 : Int = 10
    var a2 : Int = 20
    var x : Int  = func1(a1, a2)

    var result1 = Algebra.add(a1, a2)
    var result2 = Algebra.subtract(a2, a1)

    // another way to invoke single input funcs
    var result3 = Algebra square a2

    // anonymous function
    var add = (x:Int, y:Int) => x+y

    // higer order func, anonymous func as arg
    var result5 = math(10, 25, (x,y)=>x+y)

    // partial func
    var increment = Algebra.add(1, _:Int)
    var result6 = increment(5)


    println("Result1: " + result1)
    println("Result2: " + result2)
    println("Result3: " + result3)
    println("Reuslt4: " + add(10, 23))
    println("Result5: " + result5)
    println("Result6: " + result6)