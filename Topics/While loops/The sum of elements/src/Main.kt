fun main() {
    // put your code here
    var sumOfElements: Int = 0

    do {
        val n = readln().toInt()
        sumOfElements += n
    } while (n != 0)

    println(sumOfElements)
}