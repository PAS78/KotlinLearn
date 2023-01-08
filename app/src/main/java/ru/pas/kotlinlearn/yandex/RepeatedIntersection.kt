package ru.pas.kotlinlearn.yandex

fun main() {

    val m1 = intArrayOf(1, 2, 3, 2, 0, 2, 2, 2)
    val m2 = intArrayOf(5, 1, 2, 7, 3, 2)

    print(getRepeatedIntersection(m1, m2))

}

private fun getRepeatedIntersection(arr1: IntArray, arr2: IntArray): List<Int> {
    val s1 = arr1.toHashSet()
    val s2 = arr2.toHashSet()

    val resultArr = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numOfRepeats = minOf(arr1.count { it == el }, arr2.count { it == el })
            repeat(numOfRepeats) { resultArr.add(el) }
        }
    }

    return resultArr

}