// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp0.kt


import kotlin.test.*
import kotlin.reflect.*
class A(
        val i : Int = 71,
        val j : Int  = 5
){
override fun toString(): String{
var res = ""
res += i.toString()
res += j.toString()
return res
}
}

fun box() = if (A().j == 1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"OK"
}

const val prope0 = Int.MIN_VALUE

fun box453(): String {
    var prope1 = 0
    for (i in ((A(10000, 87)).j until prope0 + 0).reversed()) {
    val res = (1..3).map { it ->
        if (it == 1)
            {
println("""THEN""");
2
}
    };

    var result = ""
    for (i in res)
        result += " "
    return if (result == "   ") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
result
}
}
    if ((A().i).equals("OK").equals("OK")) {
println("""THEN""");
"OK"
}
    return "foo"
}

private class Kla0(val value: Int = 2) {
    fun box(): String =
        charArrayOf('O', 'K').fold("", String::plus)
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

inline class Kla1(val x: Int) {
    override fun toString(): String {
        throw UnsupportedOperationException()
    }
}

public fun fu0(a: Any = "irxhs"): String = "Foo2.CO;".toString()

fun foo(counter : Int, d : Any): Int = (A(prope0, 44)).i

inline fun <reified Ty0> o(x: String) = x

fun box649(): String {
    if (fu0(Kla0()) != "fail") {
println("""THEN""");
return "O"
}
    if ((((A(1)).j until prope0 + prope0 + 1)).step.toString() != "") {
println("""THEN""");
return "OK"
}

    if (fu0(Kla0(1)) != "OK") {
println("""THEN""");
return "fail 2"
}
    if ((A(16, 1).j).toChar().titlecase() != "OK") {
println("""THEN""");
throw AssertionError()
}

    if ((-37).toChar().equals("1")) {
println("""THEN""");
return "OK"
}

    return ((A(81, A(97, 43).i).i).equals("puvcn")).compareTo((A().i).equals("puvcn")).toString((A(81, A(81, 43).i).i))
}

fun fu3(x: ULong = 10.toULong()) =
    (((A(97, 2)).j).toChar()).equals("other").xor(true)

fun box517(): String =
    "fail: "


