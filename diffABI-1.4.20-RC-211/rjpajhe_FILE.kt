// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

interface A {
    fun test() = ok()

    private companion object {
        fun ok() = "OK"
    }
}

class C : A

fun box() = C().test()