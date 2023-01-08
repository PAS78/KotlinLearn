package ru.pas.kotlinlearn

// ООП
fun main() {

    val p1 = Person("Вася", "Пупкин", 33)
//    println(p1.firstName) // Доступ без геттера

    val child = Person("Вова", "Пупкин", 1)
    val p2 = Person("Вася", "Пупкин", 33, child)

//    println(p2)

    val rectangle1 = Rectangle(5.0, 5.0)
    println("Периметр ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 5.0)
    println(rectangle1 == rectangle2)
}

// Primary Constructor - первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person $firstName created")
    }

    // Вторичный конструктор (обязателен вызов первичного) this
    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    // Вторичный конструкторв без аргументов
    constructor() : this("", "", 0)

}

// data - автоматически создает полезные методы (например toString, equals)
data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    // Поле test со своими get\set-рами
    var test = 1
        get() = field + 1 // field как this.поле
        set(value) {
            if (value < 0) println("Меньше нуля")
            field = value
        }

    // Метод класса
    fun area() = height * length

}