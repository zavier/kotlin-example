package basic

fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNotNul = "The compiler assumes non-null"
//    inferredNotNul = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
//    strLength(nullable)

}