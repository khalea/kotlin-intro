// 11. Object Expressions

// Object expressions let you create an instance of an anonymous inner class.
// Lets you slightly modify the class without needing to make a new subclass/named class.
// You make an object of an anonymous class ('object' type) that inherits from some type(s).


fun main() {

    // Object Expression: Type 'object', inherits PersonInfoProvider.
    val provider = object: PersonInfoProvider {
        override val providerInfo: String
            get() = "New info provider"

        override fun printInfo(person: Person) {
            println("Object expression! -${person.firstName} ${person.lastName}")
        }

    }

    val me = Person("Khalea", "Berry")
    provider.printInfo(me)
}