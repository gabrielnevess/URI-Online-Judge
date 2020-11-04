import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val PI = 3.14159
    val scanner = Scanner(System.`in`)
    val number: Double = scanner.nextDouble()

    println("A=%.4f".format(PI * number.pow(2)))
}