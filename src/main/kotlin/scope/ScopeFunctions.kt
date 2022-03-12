package scope

// let
val empty = "test".let {
    customPrint(it)
    it.isEmpty()
}
fun printNotNull(str: String?) {
    println("Printing \"$str\":")
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}
fun printIfBothNulNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->
        strTwo?.let { secondString ->
            customPrint("$firstString: $secondString")
            println()
        }
    }
}
fun customPrint(str: String) {
    println(str)
}

// run 基本同let，但是里面可以使用类对应的方法
fun getNullableLength(ns: String?) {
    ns?.run {
        println("\tis emtpy?" + isEmpty())
        length
    }
}

// with
data class User(var name: String, var age: Int)
fun main() {
    val u = User("zhangsan", 18)
    with(u) {
        println(name)
        println(age)
    }
}

// apply 在其中对对象进行处理，并返回其本身
val u = User("zhangsan", 18)
val stringDescription = u.apply {
    name = "aaa"
    age = 27
}.toString()

// also 基本同apply, 其中可以调用自身的方法


