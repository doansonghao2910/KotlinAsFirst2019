package lesson3.task1

fun main() {
    val x = "z"
    val list = mutableListOf<Int>()
    for (i in x)
        when (i) {
            'I' -> list.add(1)
            'V' -> list.add(5)
            'X' -> list.add(10)
            'L' -> list.add(50)
            'C' -> list.add(100)
            'D' -> list.add(500)
            'M' -> list.add(1000)
            else -> -1
        }
    println(list)
}





