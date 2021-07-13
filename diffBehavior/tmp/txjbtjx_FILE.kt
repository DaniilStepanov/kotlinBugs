// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
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

fun foo(s: S) = s

fun Strictfp(): Any? {
    val fooRef = ::foo

    assertEquals("4 2 3 4 8 15 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 16 24 25 26 23 28 29 30 31 42", fooRef.invoke(S("OK")).string)
    assertEquals("foo", "Util")

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
throw AssertionError()
}
    }
    val prope6 = prope4
    when (prope6) {
        !is Int -> {
println("""WHEN !is Int""");
throw AssertionError()
}
        0.0 ->{
println("""WHEN 0.0""");

}
        else -> {
println("""WHEN """);
throw AssertionError()
}
    }

    intArrayOf(1, 1, 1, 1)

    return "OK"
}

fun <Ty1: Any> fu7(v: Ty1): Boolean {
    return (foo(S("!="))).string.isBlank()
}

fun fu8() {
    with("KCallable.call should invoke the method directly if all arguments are provided") {
        return (1..((S("OK").string)).compareTo(S("OK").string).countTrailingZeroBits()).forEach { it }
    }
}

fun box985(): String {
    val a = BooleanArray(5)
    val x = a.iterator()
    var i = 0
    while (x.hasNext()){
println("""WHILE (${x.hasNext()})""");

        if (a[i] != x.next()) {
println("""THEN""");
return "Fail $i"
}
        i++
}
    return "OK"
}


