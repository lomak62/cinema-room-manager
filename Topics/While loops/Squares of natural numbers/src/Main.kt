fun main() {
    // put your code here
    val N = readln().toInt()
    var sq = 0
    var nn = 1

    while (sq <= N) {
        sq = nn * nn
        if (sq <= N) {
            println(sq)
        }
        nn++
    }
}
