package ru.pas.kotlinlearn

fun main() {

    println(function1(lambda1));

    function2()

}

private val lambda1 = { param1: String, param2: String, param3: String, param4: Boolean ->
    if (param4) {
        param1 + param3
    } else param2 + param3
}

private fun function1(lam: (String, String, String, Boolean) -> String): String {
    return lam("Kotlin", "Java", " must die", false)
}

// Работа со списками через Лямбду
private fun function2() {
    val a = listOf(1, 2, 3, 4, 5)

    // Цикл с лямбдой по сипску
    a.forEach { e -> print(e) }
    // Применяет ко всем элементам
    println(a.map { x -> x * 3 })
    // Фильрация по ляvмбде
    println(a.filter { y -> y % 2 == 0 })
    // sum()
    println(a.reduce { sum, e -> sum + e })
    // Временная переменная it - элелмент коллекции
    println(a.any { it > 4 })
    println(a.all { it < 4 })

}