package and.binar.mygames

fun main(args: Array<String>){
    val options = arrayOf("BATU", "GUNTING", "KERTAS")
    val player1 = getPlayer1(options)
    val player2 = getPlayer2(options)
    printResult(player1, player2)
}

fun getPlayer1(optionsParam: Array<String>): String {
    var isValidChoice = false
    var player1 = ""

    while (!isValidChoice) {
        println("Masukan pemain 1")
        for (item in optionsParam) print(" $item")
        println(".")

        val player1Input = readLine()

        if (player1Input != null && player1Input in optionsParam) {
            isValidChoice = true
            player1 = player1Input
        }

        if (!isValidChoice) println("Pilih yang ada aja yah!!")
    }

    return player1
}

    fun getPlayer2(optionsParam: Array<String>): String {
        var isValidChoice = false
        var player2 = ""

        while (!isValidChoice) {
            println("Masukan pemain 2")
            for (item in optionsParam) print(" $item")
            println(".")

            val player2Input = readLine()

            if (player2Input != null && player2Input in optionsParam) {
                isValidChoice = true
                player2 = player2Input
            }

            if (!isValidChoice) println("Pilih yang ada aja yah!!")
        }

        return player2
    }
fun printResult(player1: String, player2: String) {
    val result: String

    if (player1 == player2) result = "DRAW"
    else if ((player1 == "GUNTING" && player2 == "KERTAS") ||
        (player1 == "BATU" && player2 == "GUNTING") ||
        (player1 == "KERTAS" && player2 == "BATU")) result ="Pemain 1 Menang!"

    else result = "Pemain 2 Menang!"

    println("Pemain 1 $player1, Pemain 2 $player2")
    print("$result")
}


