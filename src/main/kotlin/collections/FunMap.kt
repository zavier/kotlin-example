package collections

val numberList = listOf(1, -2, 3, -4, 5, -6)
val doubled = numberList.map { x -> x * 2 }
val tripled = numberList.map { it * 3 }