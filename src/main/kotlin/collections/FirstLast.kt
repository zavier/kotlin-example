package collections

val first = numbers.first()
val last = numbers.last()

// 查找第一个满足条件的之
val firstEven = numbers.first { it % 2 == 0 }


fun main() {
    val firstEven = numbers.first { it % 2 == 0 }
    println(firstEven)

    // 找不到时会抛出异常
    numbers.first { it % 200 == 0 }
    // 找不到不会异常
    val firstOrNull = numbers.firstOrNull { it % 200 == 0 }
    println(firstOrNull)
}