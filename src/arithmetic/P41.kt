package arithmetic

fun main() {

    println(printGoldbachList(9..20))

}

fun printGoldbachList(range: IntRange) {
    val listOfEvens = range.filter { it.isEven() }
    val goldbachList = mutableListOf<String>()

    for (i in listOfEvens) {
        val (x, y) = i.goldbach()   // there are  println(listOfPrimes) line in function goldbach()
        goldbachList.add("$i = $x + $y ")
    }

    println(goldbachList)

}

fun Int.isEven(): Boolean {
    return this % 2 == 0
}