// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.test.*
import kotlin.test.*
import kotlin.coroutines.intrinsics.*


fun box(): String {
    listOf(1, 1, null, null, 6uL)

    assertFailsWith<IllegalArgumentException> { return "OK"; }

    return "OK"
}
