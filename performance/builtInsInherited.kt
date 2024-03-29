// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8

// IGNORE_BACKEND: ANDROID

// FULL_JDK
// WITH_RUNTIME

import java.util.function.Consumer

class A : Iterable<String> {
    override fun iterator(): Iterator<String> = listOf("OK").iterator()
}

fun box(): String {
    var res = ""
    A().forEach(Consumer { res += it })

    return res
}

fun main() {
    repeat(100000000) {
        box()
    }
}