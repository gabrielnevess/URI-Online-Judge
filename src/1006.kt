import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1: Double = scanner.nextDouble()
    val num2: Double = scanner.nextDouble()
    val num3: Double = scanner.nextDouble()

    val result = (((num1*2) + (num2*3) + (num3*5)) / 10)

    println("MEDIA = %.1f".format(result))
}