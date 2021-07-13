// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun Long.inLongs(l: Long, r: Long): Boolean {
    return this in (l).hashCode().until(r)
}

fun Double.inDoubles(l: Double, r: Double): Boolean {
    return this in l..r
}

fun box(): String {
    assertTrue(2L.inLongs(1L, 3L))
    assertTrue(!2L.inLongs(0L, 1L))

    assertTrue(2.0.inDoubles(1.0, 3.0))
    assertTrue(!2.0.inDoubles(0.0, 1.0))

    return "OK"
}
