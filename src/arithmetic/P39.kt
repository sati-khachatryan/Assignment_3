package arithmetic

fun main() {
   println(listPrimesInRange(7..31))
}

fun listPrimesInRange(range: IntRange): List<Int> = range.filter { it.isPrime() }
