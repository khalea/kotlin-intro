// 7. Classes, Class Properties, Init Blocks, Property Access Syntax, Primary Constructor Props,
//      Secondary Constructors, Default Property Values

// Can remove brackets if a class is empty
// Pass parameters in primary constructor
class Person(_firstName: String, _lastName: String) {
    // Properties
    val firstName: String
    val lastName: String

    // Runs whenever an instance is created. Can init property values
    init {
        firstName = _firstName
        lastName = _lastName
    }

    fun printInfo() {
        println("$firstName $lastName")
    }
}

class Human(_firstName: String, _lastName: String) {
    // Declare, Assign, & Initialize Properties
    val firstName: String = _firstName
    val lastName: String = _lastName
}

// Vals in the primary constructor have no setters, but do have a getter. Vars have both.
class HomoSapien(val _firstName: String, val _lastName: String) {
    // Secondary Constructor: Alternate constructors
    // This one takes no params
    constructor() : this("Johnny", "Appleseed") {
        // Body
        println("No name provided. Default $_firstName $_lastName")
    }
    init {
        println("Init 2")
    }

}

fun main() {
    // Create instance of class
    val person = Person("Khalea", "Berry")
    // Property access syntax: No setters & getters. Dot notation.
    println("I'm ${person.firstName} ${person.lastName}.")

    // HomoSapien Class: No params provided.
    val person2 = HomoSapien()
}