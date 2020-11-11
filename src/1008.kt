import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1: Int = scanner.nextInt()
    val num2: Int = scanner.nextInt()
    val num3: Double = scanner.nextDouble()

    println("NUMBER = $num1")
    println("SALARY = U$ %.2f".format(num2*num3))
}