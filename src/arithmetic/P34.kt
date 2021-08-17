package arithmetic

fun main() {
    var a = 10
    println(a.totient())
}

fun Int.totient(): Int {
    var countOfCoprimes = 0
    for (i in 1..this) {
        if (i isCoprimeTo this) {
            countOfCoprimes++
        }
    }
    return countOfCoprimes
}