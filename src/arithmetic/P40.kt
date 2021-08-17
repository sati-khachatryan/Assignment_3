package arithmetic

fun main() {
    val a = 28
    println(a.goldbach())
}

fun Int.goldbach(): Pair<Int, Int> {

    val listOfPrimes = mutableListOf<Int>()
    for (i in 2 until this) {
        if (i.isPrime()) listOfPrimes.add(i)
    }
    println(listOfPrimes)
    var first = 0
    var second = 0
    for (i in 0 until listOfPrimes.size) {
        if ((this - listOfPrimes[i]).isPrime()) {
            first = listOfPrimes[i]
            second = this - listOfPrimes[i]
        }

    }
    return Pair(first, second)
}