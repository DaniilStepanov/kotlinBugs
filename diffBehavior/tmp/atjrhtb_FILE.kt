// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.String.*
import kotlin.reflect.*
import kotlin.reflect.*
import kotlin.test.*


fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val arrayOf = 7u downTo 1u
        for (fromIndex: Int in (3.toShort()..5.toShort()).step(0)) {
    }
    }

    assertFailsWith<IllegalArgumentException> { return "abc"; }

    return "fail 5"
}
