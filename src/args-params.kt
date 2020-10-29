// 6. Varargs, Spread Operator, Named Args, Default Params

// Varargs give you the option to not pass in an arg for a given parameter
// They are an array of the specified type
fun greetMe(saying: String, vararg things: String) {
    things.forEach { item ->
        println("$saying: $item")
    }
}

fun greetThem(greeting: String, name: String) = println("$greeting, $name")
fun defaultGreet(greeting: String = "Hey", name: String = "Human") = println("$greeting, $name")

fun main() {
    val coolThings = arrayOf("Kotlin", "Programming", "Comic Books", "Music")
    // Use spread operator (*) to explode the arguments so you can use each of them
    greetMe("This thing is cool", *coolThings)

    // Named Arguments: Allow you to mix the order of args. Must use names for all or no args.
    greetThem(name = "Khalea", greeting = "Bonjour")
    defaultGreet()
    defaultGreet(greeting = "What's up", name = "Bud")
}