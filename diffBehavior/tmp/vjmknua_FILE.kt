// Bug happens on JVM , JS -Xir-produce-js
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun foo(b: Byte, s: String, i: Int, d: Double, li: Long): String = "$b $s $i $d $li"

fun box(): String {
    val test = foo(1, "abc", 1, 1.0, try {
println("""TRY""");
1L
} catch (e: Exception) {
println("""CATCH e: Exception""");
10L
})
    if (test != "1 abc 1 1.0 1") {
println("""THEN""");
return "Failed, test==$test"
}

    return "OK"
}
