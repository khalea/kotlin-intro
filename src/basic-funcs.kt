// 2. Funcs
// Function name & params followed by return type
fun getGreeting(): String {
    return "Hello Kotlin"
}

// Single expression function
fun singleGetGreeting(): String = "Hello single expression func!"

// Unit is like a "generic" type. It's redundant, equivalent to no return type
fun sayHello(): Unit {
    println(getGreeting())
}

fun main() {
    println(getGreeting())
    sayHello()
    println(singleGetGreeting())
}