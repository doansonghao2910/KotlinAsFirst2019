package lesson3.task1

fun main() {
    var expression = "0 - 0 + 1 + 1"
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    val list = expression.split(" ")
    for (i in 1 until list.size) {
        if (list[i] == "+") {
            a.add(list[i + 1].toInt())
            a.sum()
        }
        if (list[i] == "-") {
            b.add(list[i + 1].toInt())
            b.sum()

        }

    }
    println(a.sum() - b.sum() + list[0].toInt())
}







