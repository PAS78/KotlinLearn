package ru.pas.kotlinlearn

fun main() {

    var a: String? = null

    println(a?.length)

    // Elvis оператор - ?:
    val b = a?.length ?: -1

    // !! Генерим NPE
    a = if ((0..10).random() < 11) null else ""
    val c = a!!.length

}