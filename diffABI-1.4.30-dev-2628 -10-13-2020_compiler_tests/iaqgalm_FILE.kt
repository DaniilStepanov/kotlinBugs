// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt

inline class Z(val x: Int) {
    inner class Inner(val y: Int) {
        val xx = x
    }
}

fun box(): String =TODO()
