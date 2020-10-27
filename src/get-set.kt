// 8. Custom Getters & Setters, Class functions

// Classes, properties, etc are public by default
// Classes, properties, etc are public by default
// Visibility modifiers: public, private (only available within the file),
//      internal (public within the module), protected (only available within a class & subclasses)

class Individual(val firstName: String = "Khalea", val lastName: String = "Berry") {
    var nickName: String? = null
        // Custom setter
        set(value) {
            field = value
            println("New nickname: $value")
        }

    // Class Method
    fun printInfo() {
        // val nicknameToPrint = if (nickName != null) nickName else " "
        val nicknameToPrint = nickName ?: " " // If/Else Operator
        println("$firstName ($nicknameToPrint) $lastName")
    }
}

fun main() {
    var me = Individual()
    var you = Individual()

    // Use custom setter when accessing/mutating property
    me.nickName = "Lea"
    println(me.nickName)
    me.printInfo()

}