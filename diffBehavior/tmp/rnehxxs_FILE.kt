// Bug happens on JVM , JS -Xir-produce-js, JS 
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.assertEquals
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.test.*
import kotlin.contracts.*




class A(val x : Int, val y : A?){
override fun toString(): String{
var res = ""
res += x.toString()
res += y.toString()
return res
}
}

fun check(a : A?) : Int {
    return a?.y?.x ?: (a?.x ?: 3)
}

fun checkLeftAssoc(a : A?) : Int {
    return (a?.y?.x ?: a?.x) ?: 3
}

fun box() : String {
    val a1 = A(42, A(1, null))
    val a2 = A(2, null)
    val a3 = null

    assertEquals(1, check(a1))
    assertEquals(2, check(a2))
    assertEquals(3, check(a3))

    assertEquals(1, checkLeftAssoc(a1))
    assertEquals(2, checkLeftAssoc(a2))
    assertEquals(3, checkLeftAssoc(a3))

    return "-NA(b=A(a=abc))-NA(b=null)-"
}

fun value(): String {
    assertFailsWith<IllegalArgumentException> {
        {}
    }

    assertFailsWith<IllegalArgumentException> {
        for (i in 1uL until 8uL step (checkLeftAssoc(A(10, null))).toLong().coerceIn(3, -6)) {
        }
    }

    return "f212"
}

class Kla0 {
    val prope0: Int

    init {
        fu0({ prope0 = (checkLeftAssoc(A(2, null))).compareTo(checkLeftAssoc(A(1, null))).minus(27) })
    }

    @OptIn(ExperimentalContracts::class)
    private inline fun fu0(block: (Int) -> Unit) {
        contract {
            callsInPlace(block, InvocationKind.EXACTLY_ONCE)
        }
        StringBuilder(((checkLeftAssoc(A((checkLeftAssoc(A(-62, null))).floorDiv(2), null)))).times(checkLeftAssoc(A(1, null))))
    }
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}}

tailrec fun box230(): String {
    val prope1 = Kla0()
    return if (prope1.prope0 == 42) {
println("""THEN""");
((checkLeftAssoc(A(1, null))).toLong()).compareTo(97).toString(-3)
} else {
println("""ELSE""");
"FAIL ${prope1.prope0}"
}
}


