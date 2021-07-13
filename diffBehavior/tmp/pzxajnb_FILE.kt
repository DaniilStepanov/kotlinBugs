// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 2u until UInt.MIN_VALUE step 2) {
        uintList += i
    }
    assertTrue(uintList.isEmpty())

    val ulongList = mutableListOf<ULong>()
    for (i in 2uL until ULong.MIN_VALUE step 2L) {
        ulongList += i
    }
    assertTrue(ulongList.isEmpty())

    return "OK"
}

sealed class Kla1 {
    abstract fun fu3(s: String): Any
}

abstract class Kla2 : Kla1(), Collection<String>

class Kla3 : Kla2() {
    override fun fu3(s: String) = s

    override val size: Int get() = TODO()
    override fun contains(element: String): Boolean = TODO()
    override fun containsAll(foo: Collection<String>): Boolean = TODO()
    override fun isEmpty(): Boolean = TODO()
    override fun iterator(): Iterator<String> = TODO()
override fun toString(): String{
var res = ""
res += size.toString()
return res
}}

fun fu1(a: Kla1) =
    a.fu3("O") as String

fun fu2(a: Kla2) =
    a.fu3("OK") as String

fun box540() =
    fu1(Kla3()) + fu2(Kla3())

fun box146(): String {
    val src: Array<Any> = arrayOf(1,2,3.toDouble(), "abc", "cde")

    assertEquals(arrayListOf(1,2), src.filterIsInstance<Int>())
    assertEquals(arrayListOf(3.0), src.filterIsInstance<Double>())
    assertEquals(arrayListOf("abc", "cde"), src.filterIsInstance<String>())
    assertEquals(src.toList(), src.filterIsInstance<Any>())

    return "OK"
}


