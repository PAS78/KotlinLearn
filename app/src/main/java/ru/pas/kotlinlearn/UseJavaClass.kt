package ru.pas.kotlinlearn

// https://www.youtube.com/watch?v=UqQqoQRVXIA&list=PLY8G5DMG6TiNVIy6sZ0RHb14nKDFG7uQc

fun main() {

    val myJavaClass = MyJavaClass("Java")
    val msg = myJavaClass.javaStringVar
    println("$msg forever!\n")

    val worldName = "Планета Земля"
    val playerName = "Мася"
    val playerAge = 18
    var playerLives = 10
    var playerMoney = 8.4
    var isSavedGame = false

    if (isSavedGame) {
        println("Load saved data...")
        println("Start Game...")
    } else {
        println("Start new Game...")
    }

    // Alt + Ctrl + M
    printPlayer(worldName, playerName, playerAge, playerLives, playerMoney)

    when (playerLives) {
        in 0..5 -> println("Bad")
        in 6..10 -> println("OK")
        else -> println("Oh")
    }

}

private fun printPlayer(
    worldName: String,
    playerName: String,
    playerAge: Int,
    playerLives: Int,
    playerMoney: Double
) {
    println("Мир: $worldName")
    println("Игрок: $playerName готов")
    println("Возраст (лет): $playerAge")
    println("Жизни (баллов): $playerLives")
    println("Деньги: $playerMoney")
}