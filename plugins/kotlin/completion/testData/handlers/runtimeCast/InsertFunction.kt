// IGNORE_K2

fun main(args: Array<String>) {
    val b: Base = Derived()
    <caret>val a = 1
}

open class Base

class Derived: Base() {
    fun funInDerived() { }
}

// RUNTIME_TYPE: Derived
// AUTOCOMPLETE_SETTING: true