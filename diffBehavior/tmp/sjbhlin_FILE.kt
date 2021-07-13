// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.reflect.KProperty.*
import kotlin.reflect.KProperty
import kotlin.test.*
import kotlin.math.*


inline class S(val string: String){
override fun toString(): String{
var res = ""
res += string.toString()
return res
}
}

fun foo(s: S = S("nysbq")) = s

fun Strictfp(): Any? {
    val intList = mutableListOf<Int>()
    val intProgression = 0..Int.MAX_VALUE
    for (i in intProgression step Int.MAX_VALUE) {
        intList += i
    }
    assertEquals(listOf(0, Int.MAX_VALUE), intList)

    val longList = mutableListOf<Long>()
    val longProgression = 0L..Long.MAX_VALUE
    for (i in longProgression step Long.MAX_VALUE) {
        longList += i
    }
    assertEquals(listOf(0L, Long.MAX_VALUE), longList)

    val charList = mutableListOf<Char>()
    val charProgression = 0.toChar()..Char.MAX_VALUE
    for (i in charProgression step Char.MAX_VALUE.toInt()) {
        charList += i
    }
    assertEquals(listOf(0.toChar(), Char.MAX_VALUE), charList)

    return "OK"
}

val prope3: Any = -0.0

val prope4: Any = -0.0f

fun box635(): String {
    val prope5 = prope3
    when (prope5) {
        !is Double -> {
println("""WHEN !is Double""");
throw AssertionError()
}
        0.0 ->{
println("""WHEN 0.0""");

}
        else -> {
println("""WHEN """);
throw UnsupportedOperationException("fail4")
}
    }
    val prope6 = prope4
    when (prope6) {
        -0.0 ->{
println("""WHEN -0.0""");

                return "fail 1"
}
        0.0 ->{
println("""WHEN 0.0""");

}
        else -> {
println("""WHEN """);
throw Exception()
}
    }

    fu7(-(S("f0 as? Function0<*>").string).removeRange(IntRange(222, -23)).sumOf({InnerBase: Char -> 0.0}))

    return "OK"
}

fun <Ty1: Double> fu7(log: Ty1): Boolean {
    return (foo(S("!="))).string.isBlank()
}

fun A() {
    with("KCallable.call should invoke the method directly if all arguments are provided") {
        return (4..(((4..7).withIndex())).hashCode().countTrailingZeroBits()).forEach { it }
    }
}

fun samePackageCall(): String {
    val a = BooleanArray(2)
    val x = a.iterator()
    var i = 0
    while (x.hasNext()){
println("""WHILE (${x.hasNext()})""");

        if (a[0] != x.next()) {
println("""THEN""");
return "Fail $i"
}
        i++
}
    return "OK"
}


