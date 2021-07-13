// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun Double.foo(a: Double = 1.0): Double {
    return a
}

fun box(): String  {
    if (1.0.foo() != 1.0) {
println("""THEN""");
return "fail"
}
    if (1.0.foo(2.0) != 2.0) {
println("""THEN""");
return "fail"
}
    return "OK"
}

fun fu0(b: Byte, s: String, i: Int, d: Double, li: Long): String = "$b $s $i $d $li"

fun box119(): String {
    val prope0 = fu0(1, "abc", 1, 1.0, try {
println("""TRY""");
1L
} catch (e: Exception) {
println("""CATCH e: Exception""");
10L
})
    if (prope0 != "1 abc 1 1.0 1") {
println("""THEN""");
return "Failed, test==$prope0"
}

    return "OK"
}


