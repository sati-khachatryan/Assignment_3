package arithmetic

fun main() {
    val someNumber = 35
    println(someNumber.isCoprimeTo(64))

}

infix fun Int.isCoprimeTo(that: Int): Boolean {
    val response = gcd(this, that)
    return response == 1

}