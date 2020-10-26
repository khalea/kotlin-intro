fun saySmth(greeting: String, thing: String) = println("$greeting, $thing!")

fun main() {

    // Array
    val someThings = arrayOf("Kotlin", "Programming", "Comics")
    println("Size: ${someThings.size}") // # Elements in array
    println("1st: ${someThings[0]}") // Get by index
    println("2nd: ${someThings.get(1)}") // Get by index
    println("3rd: $someThings[2]") // Memory object reference

    // Enhanced For Loop
    for (thing in someThings) {
        println("Array item: $thing")
    }

    // Lambda Syntax: the item is called 'it' by default, but the name can be changed like so
    someThings.forEach { thing ->
        println( thing + "o" )
    }

    // ForEachIndex: Passes us the index & item. Useful!
    someThings.forEachIndexed { index, thing ->
        println("$thing is at index $index")
    }

    // List
    val coolThings = listOf<String>("Kotlin", "Programming", "Comics")

    // List ForEach
    coolThings.forEach { thing ->
        println("ArrayList item: $thing")
    }

    // Map
    val map = mapOf<Int, String>(1 to "a", 2 to "b", 3 to "c")
    map.forEach {key, value ->
        println("Key $key -> Value $value")
    }

    // Mutable Collections: Collection types are immutable by default
    val mutableThings = mutableListOf<String>()
    mutableThings.add("dog")

    val mutableMapThings = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mutableMapThings.put(4, "d")
}