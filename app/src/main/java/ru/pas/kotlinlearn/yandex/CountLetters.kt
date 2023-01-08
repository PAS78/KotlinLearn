package ru.pas.kotlinlearn.yandex

fun main() {

    print(countLetters("AABBCCCDMAAAFFFFFF"))

}

private fun countLetters(str: String): String {

    var currentLatter = str[0]
    var count = 1
    var result = ""

    for (letter in str.substring(1)) {
        if (currentLatter == letter)
            count++
        else {
            if (count == 1)
                result += currentLatter
            else
                result += "$currentLatter$count"

            count = 1
            currentLatter = letter

        }
    }

    // Обработка последних букв
    if (count == 1)
        result += currentLatter
    else
        result += "$currentLatter$count"

    return result;
}