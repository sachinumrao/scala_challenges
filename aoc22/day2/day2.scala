import scala.io.Source

def part1_sol() = 
    // define hashmaps for opponent
    var opp_map = HashMap(
        "A" -> "ROCK",
        "B" -> "PAPER",
        "C" -> "SCISSOR"
    )

    var player_map = HashMap(
        "X" -> "ROCK",
        "Y" -> "PAPER",
        "Z" -> "SCISSOR"
    )

    var score_map = HashMap(
        "WIN" -> 6,
        "DRAW" -> 3,
        "LOSE" -> 0
    )

    var move_score = HashMap(
        "ROCK" -> 1,
        "PAPER" -> 2,
        "SCISSOR" -> 3
    )

    // define hashmaps for player

    println("Reading puzzle input...")

    val fname : String  = "./day2_input.txt"
    val source = Source.fromFile(fname)

    
    for (line <- source.getLines()){
        println(line)
        

    }
    source.close()

    println("Data read completed...")
    


@main def day2() = 
    part1_sol()