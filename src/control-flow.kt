// 3. Control Flow

val name: String = "Khalea"
var salut: String? = null

fun main() {

    // Standard if statement
    if (salut != null) {
        println(salut)
    } else {
        println("Hey, " + name)
    }

    // Kotlin 'when' switch statement
    when (salut) {
        null -> println("Hello, " + name)
        else -> println(salut)
    }

    // Variable inline if-else
    val greetingToPrint = if (greeting != null) greeting else "Hi"
    println("Current greeting: " + greeting)
    println(greetingToPrint)
}