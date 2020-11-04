import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val num1: Int = scanner.nextInt()
    val num2: Int = scanner.nextInt()
    val num3: Int = scanner.nextInt()
    val num4: Int = scanner.nextInt()

    println("DIFERENCA = ${(num1*num2-num3*num4)}")
}