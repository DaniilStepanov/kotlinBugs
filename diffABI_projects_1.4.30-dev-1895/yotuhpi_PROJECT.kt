// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS
// FILE: lib1.kt

class C<T>(val t: T) {
    override fun hashCode(): Int = t as Int
}
// FILE: lib2.kt

inline class IC<TT>(val c: C<TT>) {
    fun foo(): Int = c.hashCode()
}
// FILE: main.kt

fun box(): String {
    val ic = IC<Int>(C(42))

    if (ic.foo() != 42) return "FAIL"
    return "OK"
}
