package arithmetic

import kotlin.math.pow

fun main() {
    val a = 10
    println(a.totient2())

}
fun Int.totient2() {
        totient(this.primeFactorMultiplicity())
}

fun totient(primeFactors: List<Pair<Int, Int>>) : Double {
    val (p, m) = primeFactors.first()
   if (primeFactors.tail().isEmpty())
       return 0.0
    return (p - 1) * p.toDouble().pow(m.toInt() - 1) * totient(primeFactors.tail())

}
fun <T> List<T>.tail() = drop(1)



