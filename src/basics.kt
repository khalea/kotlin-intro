import kotlin.reflect.typeOf

// 1. Basics — Hello, variables,


// Top Level Variable: Outside of a function

// Kotlin types are non-nullable by default. So String != nullableString
val firstname: String = "Khalea"
// Nullable string variables can be null.
var greeting: String? = "What's up"

// Kotlin supports type inference, so we can omit the type declaration
var lastname = "Berry"

fun main() {
    println(greeting + " " + firstname + " " + lastname)

    // Mutable variables
    val name: String = "Felipe"
    println(name)
    // name = "Kamille" -> Error: val can't be reassigned

    // Immutable variable
    var day: String = "Monday"
    println(day)
    day = "Tuesday"
    println(day)

}