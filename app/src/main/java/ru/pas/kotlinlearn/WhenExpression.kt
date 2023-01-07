package ru.pas.kotlinlearn

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)
    testWhen(25)
}

// Принимает любой тип данных
// Как Object в Java
fun testWhen(input: Any) {

    when (input) {
        1 -> println("одЫн")
        2 -> println("вдвоём")
        in 10..20 -> println("Средненько")
        is String -> println("букавы, ${input.length} штук")
        else -> println("невидана зверюга")
    }

}