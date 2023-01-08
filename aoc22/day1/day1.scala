import scala.io.Source

def part1_sol() = 
    println("Reading puzzle input...")

    val fname : String  = "./day1_input.txt"
    val source = Source.fromFile(fname)

    var calories : Int = 0
    var current_max_cal : Int = 0
    for (line <- source.getLines()){
        println(line)
        if (line.trim() != ""){
            calories += line.toInt
        } else{
            if (calories > current_max_cal){
                current_max_cal = calories
            }
            calories = 0
        }

    }
    source.close()

    println("Data read completed...")
    println("Max Calories: " + current_max_cal)

def part2_sol() = 
    println("Reading puzzle input...")

    val fname : String  = "./day1_input.txt"
    val source = Source.fromFile(fname)

    var calorie_tracker : List[Int] = List()
    var calories : Int = 0
    var current_max_cal : Int = 0

    for (line <- source.getLines()){
        if (line.trim() != ""){
            calories += line.toInt
        } else{
            // add current elf's calroie to traker
            calorie_tracker = calories :: calorie_tracker
            calories = 0
        }

    }
    source.close()

    println("Data read completed...")

    println("Total Elves: " + calorie_tracker.length)

    var num_elves : Int = calorie_tracker.length

    var sorted_calorie_tracker = calorie_tracker.sorted

    var total_calorie = sorted_calorie_tracker(num_elves-1) + sorted_calorie_tracker(num_elves-2) + sorted_calorie_tracker(num_elves-3)
    print("Calorie of top-3 elves: " + total_calorie)


@main def day1() =
    // part1_sol()

    part2_sol()
    