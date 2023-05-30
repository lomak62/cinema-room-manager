import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var seqLength = 0
    while (scanner.nextInt() > 0) seqLength++
    println(seqLength)
}