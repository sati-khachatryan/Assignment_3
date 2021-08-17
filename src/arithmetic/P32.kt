package arithmetic

fun main() {

    println(gcd(36, 63))

}

fun gcd(first: Int, second: Int): Int {
    var firstNumber = first
    var secondNumber = second
    while (firstNumber != 0 && secondNumber != 0) {
        if (firstNumber > secondNumber) {
            firstNumber %= secondNumber
        } else {
            secondNumber %= firstNumber
        }
    }

    var gcd = 0
    gcd = if (firstNumber == 0) {
        secondNumber
    } else {
        firstNumber
    }
    return gcd
}