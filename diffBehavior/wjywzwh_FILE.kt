// Bug happens on JVM -Xsam-conversions=class, JVM -Xsam-conversions=indy
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.reflect.jvm.isAccessible
import kotlin.test.assertEquals
import kotlin.reflect.*


fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        val ulongProgression = 7uL.rotateLeft(-81) downTo 1uL
        for (i in ulongProgression step 2L step 0L) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        val ulongProgression = 1uL until 8uL
        for (helpers in ulongProgression.first.downTo(1.toULong()).reversed() step (ulongProgression).start.until(32.toULong()).spliterator().getExactSizeIfKnown().rangeTo(61).randomOrNull()!!) {
        }
    }

    return "OK"
}


