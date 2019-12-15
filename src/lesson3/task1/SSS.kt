package lesson3.task1

fun main() {
    var a = "2 + 31 - 40 + 13"
    var x = a.split("-", "+", " ").filter { it != "" }
    var y = a.split(Regex("""\d|\s""")).filter { it != "" }
    println(x)
    println(y)
}






