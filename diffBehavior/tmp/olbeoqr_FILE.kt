// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = Int.MAX_VALUE downTo Int.MIN_VALUE
    for (i in intProgression step Int.MAX_VALUE) {
        intList += i
    }
    assertEquals(listOf(Int.MAX_VALUE, 0, Int.MIN_VALUE + 1), intList)

    val longList = mutableListOf<Long>()
    val longProgression = Long.MAX_VALUE downTo Long.MIN_VALUE
    for (i in longProgression step Long.MAX_VALUE) {
        longList += i
    }
    assertEquals(listOf(Long.MAX_VALUE, 0L, Long.MIN_VALUE + 1), longList)

    val charList = mutableListOf<Char>()
    val charProgression = Char.MAX_VALUE downTo Char.MIN_VALUE
    for (i in charProgression step Char.MAX_VALUE.toInt()) {
        charList += i
    }
    assertEquals(listOf(Char.MAX_VALUE, Char.MIN_VALUE), charList)

    return "OK"
}

class Kla0<Ty0>(t: Ty0) {
    var prope0 = t
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}}

fun fu0(box532: Kla0<out Any?>): Boolean {
    return (Long.MAX_VALUE).toString().endsWith(Char.MAX_VALUE, false);
}

fun box532(): String {
  val box532 = Kla0<Int>((Int.MAX_VALUE).absoluteValue)
  return (Char).MIN_LOW_SURROGATE.plus("qjenn")
}


