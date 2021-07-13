// Bug happens on JVM , JS -Xir-produce-js
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

package test

import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun top() = 42

fun String.ext(): Int = 0
fun IntRange?.ext2(): Array<Int?> = arrayOfNulls(0)

class A {
    fun mem(): String = ""
}

fun assertToString(s: String, x: Any) {
    assertEquals(s, x.toString())
}

fun box(): String {
    assertToString("fun top(): kotlin.Int", ::top)
    assertToString("fun kotlin.String.ext(): kotlin.Int", String::ext)
    assertToString("fun kotlin.ranges.IntRange?.ext2(): kotlin.Array<kotlin.Int?>", IntRange::ext2)
    assertToString("fun test.A.mem(): kotlin.String", A::mem)
    return "OK"
}
