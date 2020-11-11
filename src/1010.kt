import java.util.*

fun main(args: Array<String>) {
    var result: Double = 0.0
    val scanner = Scanner(System.`in`)

    for (x in 1..2) {
        val num1: Int = scanner.nextInt()
        val num2: Int = scanner.nextInt()
        val num3: Double = scanner.nextDouble()
        result += (num2 * num3)
    }

    println("VALOR A PAGAR: R$ %.2f".format(result))
}