import java.util.*

// 13. Obj. Declaration, Enum Classes
// Obj. Declaration: Convenient way of creating 'thread safe' singletons.
// Singleton pattern restricts the instantiation of a class to one instance.
// Useful when only 1 unique object is needed.

// Enum Classes:

// Factory: We want to limit ways that entities can be created

class NewEntity constructor(val id: String, val type: String) {

    override fun toString(): String {
        return "id: $id, type: $type"
    }

}

// Enum Class: A class to hold type-safe enums (enum: a set of elements, usually IDs. Act as constants)
// Lets you pass in diff types to the factory method & customize how
// new entities are created by mapping a type to a name.
enum class EntityType {
    EASY, MEDIUM, HARD;

    // Format Method: Lowercase + Capitalize first letter
    fun getFormattedName() = name.toLowerCase().capitalize()
}


object NewEntityFactory {

    // Single Expression Func Version: fun create() = NewEntity("0368", "Cherie")

    fun create(type: EntityType) : NewEntity {
        val id = UUID.randomUUID().toString() // Generate random uuid

        // Refactored: Enum Class types offer differentiation
        val type = when (type) {
            EntityType.EASY -> type.name // prints "EASY"
            EntityType.MEDIUM -> type.getFormattedName() // prints "Medium"
            EntityType.HARD -> "Hard" //
        }

        return NewEntity(id, type)
    }
}


fun main() {
    val entity = NewEntityFactory.create(EntityType.HARD)
    println(entity)
    val entityMed = NewEntityFactory.create(EntityType.MEDIUM)
    println(entityMed)
    val entityEasy = NewEntityFactory.create(EntityType.EASY)
    println(entityEasy)
}