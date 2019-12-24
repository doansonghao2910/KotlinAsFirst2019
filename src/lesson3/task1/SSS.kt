fun main() {
    var x = "."
    var line = "во входном файле с именем е.содержится некоторый текст"
    var map = mutableMapOf<String, Int>()
    var i = 0
    var d = 0
    var line1 = ""
    while (i < line.length - x.length) {
        line1 = line.substring(i, i + x.length)
        if (line1 == x) {
            d++
        }
        i++
    }
    println(d)

}
