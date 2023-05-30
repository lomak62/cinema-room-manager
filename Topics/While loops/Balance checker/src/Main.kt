import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var exitCode = 0
    while (scanner.hasNextInt()) {
        // TODO
        val next = scanner.nextInt()
        if (balance - next < 0) {
            exitCode = 1
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $next.")
        } else {
            balance -= next
        }
    }
    if (exitCode == 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
    // TODO
}