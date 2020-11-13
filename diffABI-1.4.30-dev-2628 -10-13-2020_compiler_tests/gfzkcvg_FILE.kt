// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

interface IFoo<T : IFoo<T>> {
    fun T.foo(): String = TODO()
    fun bar(): String
}

inline class Z(val x: Int) : IFoo<Z> {
    override fun bar(): String = TODO()
}

inline class L(val x: Long) : IFoo<L> {
    override fun bar(): String = TODO()
}

inline class S(val x: String) : IFoo<S> {
    override fun bar(): String = TODO()
}

fun Z.testZ():Unit =TODO()

fun L.testL():Unit =TODO()

fun S.testS():Unit =TODO()

fun box(): String =TODO()
