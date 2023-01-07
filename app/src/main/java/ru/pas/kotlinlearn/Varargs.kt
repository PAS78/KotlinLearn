package ru.pas.kotlinlearn

fun main() {

    // Позволяет любое кол-во элементов
    printEvent(1, 2, 3, 4, 5, 6, 7, 8, 9)
    printEvent(17, 14, 12)
    // Оператор * (распределят\отделяет элементы массива)
    printEvent(*intArrayOf(22, 23, 26, 28, 21), 24, 58)

}

// Выводит четные числа
fun printEvent(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}