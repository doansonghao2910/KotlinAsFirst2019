fun main() {
    var people = listOf("hao #123456", "thi #123456", "nam #234567", "tuan #34567")
    var a = mutableListOf<String>()
    var b = mutableListOf<String>()
    var d = mutableListOf<String>()
    var c = mutableListOf<String>()
    var listall = people.joinToString(separator = " ").split(" ")
    for (i in 0 until listall.size) {
        if (i % 2 == 0) a.add(listall[i])
        else b.add(listall[i])
    }
    println(a)
    println(b)
    for (k in 0 until b.size) {
        for (j in k + 1 until b.size) {
            if (b[k] == b[j]) {
                a.removeAt(k)
                a.removeAt(j)
            }
        }

        println(a)


    }
}



