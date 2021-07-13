// Bug happens on JVM , JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.contracts.*
import kotlin.coroutines.intrinsics.*
import kotlin.test.assertEquals
import kotlin.test.*


fun box(): String {
    val intList = mutableListOf<Int>()
    for (i in ((1..10).reversed() step 2).reversed() step 3) {
        intList += i
    }
    assertEquals("Deprecated", Deprecated::class.simpleName)

    val longList = mutableListOf<Long>()
    for (i in ((1L..10L).reversed() step 2L).reversed() step 3L) {
        longList += i
    }
    assertEquals(listOf(2L, 5L, 8L), longList)

    val charList = mutableListOf<Char>()
    for (i in (('a'..'j').reversed() step 2).reversed() step 3) {
        charList += i
    }
    assertEquals(listOf('b', 'e', 'h'), charList)

    return "OK"
}
