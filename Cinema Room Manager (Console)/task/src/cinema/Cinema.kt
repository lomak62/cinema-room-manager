package cinema
import java.util.Scanner
val scanner = Scanner(System.`in`)
val seatData = mutableListOf<String>()
val income = mutableListOf<Int>()

fun cinemaRoom(rows: Int, seats: Int) {
    println()
    println("Cinema:")
    for (s in 0..seats) if (s == 0) print(" ") else print(" $s")
    for (r in 1..rows) {
        print("\n$r")
        for (s in 1..seats) {
            print(" ${if (r.toString() + s.toString() in seatData) "B" else "S"}")
        }
    }
    println()
}

fun ticketBuy(rows: Int, seats: Int) {
    while (true) {
        println()
        println("Enter a row number:")
        val r = scanner.nextInt()
        println("Enter a seat number in that row:")
        val s = scanner.nextInt()
        println()
        if (r.toString() + s.toString() in seatData) {
            println("That ticket has already been purchased!")
        } else if (r > rows || s > seats) {
            println("Wrong input!")
        } else {
            seatData.add(r.toString() + s.toString())

            val ticketPrice = if (rows * seats <= 60) 10 else if (r <= rows / 2) 10 else 8
            income.add(ticketPrice)
            println("Ticket price: $$ticketPrice")
            break
        }
    }
}

fun totalIncome(r: Int, s: Int): Int {
    return if (r * s <= 60) r * s * 10 else ((r / 2) * s * 10) + ((r / 2) + (r % 2)) * s * 8
}

fun statistics(rows: Int, seats: Int) {
    val soldTickets = income.size
    val percentage = (soldTickets * 100.00) / (rows * seats)
    val formatPercentage = "%.2f".format(percentage)
    val currentIncome = income.sum()

    println()
    println("Number of purchased tickets: $soldTickets")
    println("Percentage: $formatPercentage%")
    println("Current income: $$currentIncome")
    println("Total income: $${totalIncome(rows, seats)}")
}

fun help() {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
}

fun main() {
    println("Enter the number of rows:")
    val rows = scanner.nextInt()
    println("Enter the number of seats in each row:")
    val seats = scanner.nextInt()

    while (true) {
        println()
        help()
        when (scanner.nextInt()) {
            0 -> break
            1 -> cinemaRoom(rows, seats)
            2 -> ticketBuy(rows, seats)
            3 -> statistics(rows, seats)
        }
    }
}