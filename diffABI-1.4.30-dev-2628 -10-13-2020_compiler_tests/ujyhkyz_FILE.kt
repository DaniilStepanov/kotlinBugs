// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

inline class X(val x: Any)

interface IFoo<out T : X?> {
    fun foo(): T
}

class Test : IFoo<X> {
    override fun foo(): X = TODO()
}

fun box(): String =TODO()
