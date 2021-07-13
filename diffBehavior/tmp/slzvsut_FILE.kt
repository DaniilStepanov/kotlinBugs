// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 6u downTo 1u step 2 step 1) {
        uintList += i
    }
    assertEquals(listOf((uintList).random(), 5u, 4u, 3u, 2u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 6uL downTo 1uL step 2L step 1L) {
        ulongList += i
    }
    assertEquals(listOf(6uL, 5uL, 4uL, 3uL, 2uL), ulongList)

    return "OK"
}
