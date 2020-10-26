fun hello(thing: String) {
    val msg = "Hello, ${1+2}!" // Templating 1: Can use variables & perform operations
    val msg2 = "Salut, $thing!" // Templating 2: Use variables
    val msg3 = "What's up " + thing + "!" // Concatenating: Use variables & perform operations
    println(msg)
    println(msg2)
    println(msg3)
}

fun helloSingle(thing: String) = println("Hey, ${thing}.")

fun main() {
    hello("Charmaine")
    helloSingle("Khalea")
}