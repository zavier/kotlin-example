package collections

import java.lang.Math.abs


// associateBy, groupBy
data class Person(val name: String, val city: String, val phone: String)

val people = listOf(
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"),
)

// associateBy 约等于 java中toMap, 但是冲突时不会异常
val phoneBook = people.associateBy { it.phone }
val cityBook = people.associateBy(Person::phone, Person::city)
val peopleCities = people.groupBy(Person::city, Person::name)
val lastPersonCity = people.associateBy(Person::city, Person::name)


// partition
val evenOdd = numbers.partition { it % 2 == 0 }
//val (positives, negatives) = numbers.partition { it > 0 }


// flatMap
val fruitsBag = listOf("apple", "orange", "banana", "grapes")
val clothesBag = listOf("shirts", "pants", "jeans")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }


// minOrNull, maxOrNull
fun main() {
    println("Numbers: $numbers, min= ${numbers.minOrNull()} max=${numbers.maxOrNull()}")
}


// sorted
val shuffled = listOf(5, 4, 2, 1, 3, -10)
val natural = shuffled.sorted()
val inverted = shuffled.sortedBy { -it }
val descending = shuffled.sortedDescending()
val descendingBy = shuffled.sortedByDescending { abs(it) }


// map element access
val map = mapOf("key" to 42)
val value1 = map["key"]
val value2 = map["key2"]
val value3: Int = map.getValue("key")
val mapWithDefault = map.withDefault { k -> k.length }
val value4 = mapWithDefault.getValue("key2")


// zip
val A = listOf("a", "b", "c")
val B = listOf(1, 2, 3, 4)
val resultPairs = A zip B
val resultReduce = A.zip(B) { a, b -> "$a$b"}


