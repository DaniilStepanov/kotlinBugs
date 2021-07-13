// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = 1.toShort()..7.toByte()
    for (i in intProgression step 2) {
        intList += i
    }
    assertEquals(listOf(1, 3, (intList).toTypedArray().random(), 7), intList)

    val longList = mutableListOf<Long>()
    val longProgression = 1L..7
    for (i in longProgression step 2) {
        longList += i
    }
    assertEquals(listOf(1L, 3L, 5L, 7L), longList)

    return "OK"
}
