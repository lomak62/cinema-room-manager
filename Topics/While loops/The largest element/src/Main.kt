fun main() {
    // put your code here
    var largest: Int = 0

    do {
        val n = readln().toInt()
        if (n > largest) {
            largest = n
        }
    } while (n != 0)

    println(largest)
}