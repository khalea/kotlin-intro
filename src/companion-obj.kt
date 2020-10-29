// 12. Companion Objects, Object Declarations
// Companion objects are objects scoped to an instance of another class
// They can implement other interfaces
// Factory: Factories create instances of a class

// Why use Factory & Companion Object?: They provide similar functionality to static classes in Java


interface IdProvider  {
    fun getID(): String
}

// Constructor is private for use with a factory in this file only.
class Entity private constructor(val id: String) {

    companion object: IdProvider { // Custom Name: companion object Factory {...} -> Entity.Factory.create()
        const val id = "id"

        override fun getID(): String {
            return "123"
        }

        fun create() = Entity(getID())
    }
}



fun main() {
    // Used to create an instance of the class, as companion objects
    // have access to the private properties & methods of the class.
    // Entity.Companion.create() or Entity.create()
    val entity = Entity.Companion.create()

    // Can reference properties of companion objects like it's a static class property
    println(Entity.id)
}