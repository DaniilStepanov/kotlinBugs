interface Trait {
    fun foo() = "O"
    fun bar(): String
}

class SimpleClass : Trait {
    override fun bar() = "K"
}

// Delegating 'toString' doesn't work, see KT-9519
class ComplexClass : Trait by SimpleClass() {
    fun qux() = foo() + bar()
}

fun box() = ComplexClass().qux()

fun main() {
    repeat(100000000) {
        box()
    }
}