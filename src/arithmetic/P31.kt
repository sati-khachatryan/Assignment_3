package arithmetic

fun main() {
    val number = 27
    println(number.isPrime())
}


fun Int.isPrime(): Boolean {
    if (this < 2) {
        return false
    }

    var response = true
    for (i in 2 .. this / 2 ) {
        if (this % i == 0) response = false
    }
    return response
}