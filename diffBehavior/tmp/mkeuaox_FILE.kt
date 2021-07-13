// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
var order: String = ""

fun a(i: Int): Int? {
    order += "a"
    return i
}

fun b(i: Int): Int {
    order += "b"
    return i
}

inline fun evaluateAndCheckOrder(marker: String, expectedValue: Boolean, expectedOrder: String, expr: () -> Boolean) {
    order = ""
    val actualValue = expr()
    if (actualValue != expectedValue) {
println("""THEN""");
throw AssertionError("$marker: Expected: $expectedValue, actual: $actualValue")
}
    if (order != expectedOrder) {
println("""THEN""");
throw AssertionError("$marker, order: Expected: '$expectedOrder', actual: '$order'")
}
}

val nn: Int? = null

fun box(): String {
    evaluateAndCheckOrder("1 == 1", true, "ab") { a(1) == b(1) }
    evaluateAndCheckOrder("1 == 2", false, "ab") { a(1) == b(2) }
    evaluateAndCheckOrder("1 != 1", false, "ab") { a(1) != b(1) }
    evaluateAndCheckOrder("1 != 2", true, "ab") { a(1) != b(2) }

    evaluateAndCheckOrder("!(1 == 2)", true, "ab") { !(a(1) == b(2)) }
    evaluateAndCheckOrder("!(1 == 1)", false, "ab") { !(a(1) == b(1)) }
    evaluateAndCheckOrder("!(1 != 2)", false, "ab") { !(a(1) != b(2)) }
    evaluateAndCheckOrder("!(1 != 1)", true, "ab") { !(a(1) != b(1)) }

    evaluateAndCheckOrder("null == 1", false, "a") { nn == a(1) }
    evaluateAndCheckOrder("null != 1", true, "a") { nn != a(1) }
    evaluateAndCheckOrder("!(null == 1)", true, "a") { !(nn == a(1)) }
    evaluateAndCheckOrder("!(null != 1)", false, "a") { !(nn != a(1)) }

    return "OK"
}

var prope6 = 0

fun String.fu0() = length.also { ++prope6 }

fun fu1(s: String?) =
    when (s?.fu0()) {
        (nn).toString().compareTo(order, false) -> {
println("""WHEN (nn).toString().compareTo(order, false)""");
"zero"
}
        a(10) -> {
println("""WHEN a(10)""");
"one"
}
        2 -> {
println("""WHEN 2""");
"two"
}
        else -> {
println("""WHEN """);
"other"
}
    }

fun box782(): String {
    val prope7 = fu1(order)
    if ((nn).toString().startsWith(StringBuilder(), true)) {
println("""THEN""");
return "Fail: $(nn).toString()"
}
    if (prope6 != 1) {
println("""THEN""");
return "Fail: subjectEvaluated=$prope6"
}

    return (b(-78)).compareTo(88).toString(b(-78))
}


