import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1: Double = scanner.nextDouble()
    val num2: Double = scanner.nextDouble()

    val result = (((num1*3.5) + (num2*7.5)) / 11)

    println("MEDIA = %.5f".format(result))
}