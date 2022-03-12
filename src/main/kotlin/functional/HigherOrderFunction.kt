package functional

// 高阶函数

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
fun sum(x: Int, y: Int) = x + y


fun operation(): (Int) -> Int {
    return ::square
}
fun square(x: Int) = x * x


fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }

}