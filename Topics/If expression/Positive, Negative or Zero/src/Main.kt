import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    println(if (num < 0) "negative" else if (num > 0) "positive" else "zero")
}