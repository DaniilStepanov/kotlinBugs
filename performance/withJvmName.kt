// TARGET_BACKEND: JVM
// WITH_RUNTIME

// FILE: foo.kt

@file:Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
@file:JvmPackageName("jjj")
@file:JvmName("Foooo")

fun f(): String = "O"

val g: String? get() = "K"

inline fun i(block: () -> String) = block()

// FILE: bar.kt

fun box(): String = i { f() + g }

fun main() {
    repeat(100000000) {
        box()
    }
}