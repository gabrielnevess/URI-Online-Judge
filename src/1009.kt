import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val name: String = scanner.next()
    val num2: Double = scanner.nextDouble()
    val num3: Double = scanner.nextDouble()
    val perc: Double = 15.0/100
    val result: Double = (num2 + (num3 * perc))

    println("TOTAL = R$ %.2f".format(result))
}