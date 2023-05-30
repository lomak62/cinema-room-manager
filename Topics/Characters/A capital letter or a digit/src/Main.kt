fun main() {
    // write your code here
    val a: Char = readln().first()

    println(a.isUpperCase() || a >= '\u0031' && a <= '\u0039')
}