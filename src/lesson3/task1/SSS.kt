package lesson3.task1

import lesson8.task1.Point

fun main() {
    println(
        Regex("""[^\d\+\-\s\n\t]""").containsMatchIn("\n")
    )

}







