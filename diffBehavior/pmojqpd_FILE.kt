// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// FILE: tmp.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*


fun box(): String {
    assertFailsWith<IllegalArgumentException> {
        for (i in 7 downTo 1 step 0 step 2) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 7L downTo 1L step 0L step 2L) {
        }
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 'g' downTo 'a' step 0 step 2) {
        }
    }

    return "OK"
}

fun box238(): String {
    var prope0 = 0u
    for (i: UInt? in 1u..3u) {
        prope0 = fu0(prope0, i)
    }
    return if (prope0 == 6u) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $prope0"
}
}

fun fu0(i: UInt, z: UInt?): UInt {
    return i + z!!
}


