fun solution() {
    // write here
    val a = readln().toInt()
    val b = readln().toInt()
    try {
        println(a / b)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("This is the end, my friend.")
    }
}
