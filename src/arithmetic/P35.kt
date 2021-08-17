package arithmetic

fun main() {
    val a = 315
    println(a.primeFactors())
}

fun Int.primeFactors(): List<Int> {
    val listOfPrimes = mutableListOf<Int>()
    var number = this
    var i = 2
    while (i <= number) {
        if (number % i == 0) {
            listOfPrimes.add(i)
            number /= i
            i--
        }
        i++
    }

    if (listOfPrimes.size == 0) {
        println("List of primes is empty !")
    }

    return listOfPrimes
}