package arithmetic

fun main() {
    val a = 10
    println(a.primeFactorMultiplicity())

}

fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>> {
    val listOfPrimeFactors = this.primeFactors()
    val listOfPairs = mutableListOf<Pair<Int, Int>>()
    var value = listOfPrimeFactors[0]
    var numberOfValue = 1
    var i = 0
    while (i < listOfPrimeFactors.size - 1) {
        if (value == listOfPrimeFactors[i + 1]) {
            numberOfValue++
        } else {
            listOfPairs.add(value to numberOfValue)
            value = listOfPrimeFactors[i + 1]
            numberOfValue = 1
        }

        i++
    }

    listOfPairs.add(value to numberOfValue)
    return listOfPairs
}