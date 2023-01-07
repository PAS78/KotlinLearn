package ru.pas.kotlinlearn

fun main() {

    println(animal("Алькор", 3))
    println(animal("Мася", 4))

//    println(sum(5, 3))
    println(sum(y = 5, x = 3))

}

private fun animal(name: String, paws: Int): String {

    return "Меня зовут $name и у меня есть $paws лапы"

}

fun sum(x: Int, y: Int) = "Result: ${x / y}"