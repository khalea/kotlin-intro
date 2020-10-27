// 10. Inheritance
// Kotlin classes are closed/final by default - they can't be inherited or extended.

class FancyInfoProvider: BasicInfoProvider() {
    override val providerInfo: String
        get() = "FancyInfoProvider"
}