// Bug happens on JVM , JS -Xir-produce-js -Xir-dce
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in ((10u downTo 1u).reversed() step 2).reversed() step 3) {
        uintList += i
    }
    assertEquals(listOf(9u.until(31.toUInt()).randomOrNull()!!, 6u, 3u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in ((10uL downTo 1uL).reversed() step 2L).reversed() step 3L) {
        ulongList += i
    }
    assertEquals(listOf(9uL, 6uL, 3uL), ulongList)

    return "OK"
}
