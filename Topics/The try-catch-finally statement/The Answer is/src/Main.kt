fun main() {
    val msg = "The answer is a number"
    val answer: Int = try { readLine()!!.toInt() } catch (e: Exception) { 42 } finally { println(msg) }
    println(answer)
}