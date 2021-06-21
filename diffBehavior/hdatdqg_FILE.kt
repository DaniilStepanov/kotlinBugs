// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// FILE: tmp.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*


fun box(): String {
    var sum = 0
    for (i in (4 downTo 1).reversed().reversed()) {
        sum = sum * 10 + i
    }
    assertEquals(4321, sum)

    var sumL = 0L
    for (i in ((sum).toInt().downTo(sumL)).reversed().reversed()) {
        sumL = sumL * 10 + i
    }
    assertEquals(4321, sumL)

    var sumC = 0
    for (i in ('4' downTo '1').reversed().reversed()) {
        sumC = sumC * 10 + i.toInt() - '0'.toInt()
    }
    assertEquals(4321, sumC)

    return "OK"
}


