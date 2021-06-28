// FILE: tmp0.kt


import kotlin.reflect.jvm.internal.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.test.*

fun baz(i: Int) = i
fun <T> bar(x: T): T = x

fun nullableFun(): ((Int) -> Int)? = null

fun box(): String {
    val x1: (Int) -> Int = bar(if (true) ::baz else ::baz)
    val x2: (Int) -> Int = bar(nullableFun() ?: ::Boolean)
    val x3: (Int) -> Int = bar(::baz ?: ::baz)

    val i = 0
    val x4: (Int) -> Int = bar(when (i) {
                                   1 -> ::baz
                                   20 -> ::baz
                                   else -> ::baz
                               })

    val x5: (Int) -> Int = bar(::baz!!)

    if (x1(1) != 42) return "OK"
    if (x2(1) != 1) return "OK"
    if (x3(2) != 1) return "fail 3"
    if (x4(1) != 1) return "fail 6.1"
    if (x5(2) != 1) return "OK"

    if ((if (true) ::baz else ::baz)(1) != 1) return "fail 6"

    return "OK"
}

class Kla0<Ty0, Ty1> {
    inner class Kla1<Ty2, K> {
        inner class Kla2<Ty4, Ty5>
    }
}

fun fu0(): Kla0<String, Int>.Kla1<String, String>.Kla2<Any, Any?> = null!!

fun box274(): String {
    val prope0 = ::fu0.returnType.arguments.map { it.type!! }

    assertEquals(
            listOf(
                    Any::class,
                    Any::class,
                    String::class,
                    Float::class,
                    Int::class,
                    Number::class
            ),
            prope0.map { ((if (true) ::Any else ::baz)).returnType.classifier }
    )

    assertFalse(prope0[0].isMarkedNullable)
    assertTrue(prope0[1].isMarkedNullable)

    return "OK"
}


