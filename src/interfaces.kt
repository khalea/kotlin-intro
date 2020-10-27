// 9. Interfaces, Abstract Classes, Type Checking, Type Casting
// 1:22:30 https://www.youtube.com/watch?v=F9UC9DY-vIU

// Interfaces, like classes, can be empty. Interfaces can have props & hold state, and even have funcs.
// They cannot have fields. You can implement multiple interfaces in a class.
interface EmptyPersonInfoProvider

class EmptyPersonInfo : EmptyPersonInfoProvider {

}

interface PersonInfoProvider {
    val providerInfo : String // = "Default"; Cannot do property initialization in interfaces
    fun printInfo(person: Person) // {println(providerInfo); person.printInfo()}
    // You can provide default implementation in the interface
}

interface SessionInfoProvider {
    fun getSessionID(): String
}

// Abstract classes don't need to implement all the interface's methods, but it can't be instantiated
// Abstract classes, unlike interfaces, have constructors.

// Classes can implement multiple interfaces
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    // Must implement custom set/get with interface variables
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        person.printInfo()
    }

    override fun getSessionID(): String {
        return "Session"
    }

}

// How to check the type of a param/variable/object (is & !is)
// as casts
fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider !is SessionInfoProvider) {
        println("infoProvider is not a SessionInfoProvider")
    } else {
        println("infoProvider is a SessionInfoProvider")
        // Type Casting
        infoProvider.getSessionID() // Smart Casting: Compiler can validate that the type won't change. No explicit cast needed.
        // Explicit casting: (infoProvider as SessionInfoProvider).getSessionID()
    }
}

fun main() {
    val provider = BasicInfoProvider()
    var me = Person("Khalea", "Berry")
    provider.printInfo(me)

    val fancyProvider = FancyInfoProvider()
    fancyProvider.printInfo(me)

    checkTypes(provider)
    checkTypes(fancyProvider)
}
