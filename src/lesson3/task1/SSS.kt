fun main() {
    val a = mutableListOf<String>()
    val x = listOf("Марат", "Marat", "Семён", "Марат", "Марат")
    val maplol = (x.groupBy { it }.mapValues { it.value.size })
    var list1 = maplol.values.toList()
    var list2 = maplol.keys.toList()
    for (i in 0 until list1.size) {
        if (list1[i] >= 2) a.add(list2[i])
        else a.add("")
        println(list2)
    }

}
