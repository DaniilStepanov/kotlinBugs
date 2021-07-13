// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


inline fun<reified T> Array<Any>.filterIsInstance(): List<T> {
    return this.filter { it is T }.map { it as T }
}

fun box(): String {
    val src: Array<Any> = arrayOf(1,2,3.toDouble(), "abc", "cde")

    assertEquals(arrayListOf(1,2), src.filterIsInstance<Int>())
    assertEquals(arrayListOf(3.0), src.filterIsInstance<Double>())
    assertEquals(arrayListOf("abc", "cde"), src.filterIsInstance<String>())
    assertEquals(src.toList(), src.filterIsInstance<Any>())

    return "OK"
}
