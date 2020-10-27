// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

class Foo

class Builder {
    var size: Int = 0

    fun addFoo(foo: Foo): Builder {
        size++
        return this
    }
}

fun box(): String {
    val b = Builder()
    listOf(Foo(), Foo(), Foo()).forEach(b::addFoo)
    return if (b.size == 3) "OK" else "Fail"
}
