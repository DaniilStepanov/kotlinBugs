// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// IGNORE_BACKEND: JVM
// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// FILE: tmp0.kt

import kotlin.contracts.*
import kotlin.properties.*
import kotlin.reflect.*


fun block(lambda: () -> Unit) {
    contract {
        callsInPlace(lambda, InvocationKind.EXACTLY_ONCE)
    }
    lambda()
}

fun box(): String {
    val list: List<Int>

    block {
        list = listOf(1, 2, 3)
    }

    block {
        if (listOf(2, 3, 4).first { list.contains(it) } != 2) {
println("""THEN""");
throw AssertionError("Fail")
}
    }

    return "OK"
}
