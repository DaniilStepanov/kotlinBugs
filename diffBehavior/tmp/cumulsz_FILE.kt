// Bug happens on JVM , JS -Xir-produce-js, JS 
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.test.*
import kotlin.math.*
import kotlin.test.*

val <T> T.z
    get() = { x: String -> this }

fun test(ok: String, fail: String) = ok.z(fail)

fun box() = AssertionError()

open class Kla0<Ty0> {
    open fun fu0(c: suspend () -> Unit) {}
}

class Kla1(): Kla0<IllegalArgumentException>() {}

fun Controller(): String {
    (test("abcd", "O")).foldRightIndexed(Kla1(), {a: Int, b: Char, counter: Kla1 -> Kla1()})
    return "OK"
}

fun fu1(a: String, b: String): String {
    return test("foo", "OK") + b;
}

fun foo() {
    val array = intArrayOf(1,2,3)

    var count = 0
    for (element in array) if (element > 0) {
println("""THEN""");
count++
}
    while (count > 0) {
println("""WHILE (${count > 0})""");
if (count > 0) {
println("""THEN""");
count++
}
}

    if (count == 1)
        {
println("""THEN""");
if (count != 1)
            count++
        else
            print("1")
}
        else
            {
println("""ELSE""");
print("2")
}

    when (count) {
        1 -> {
println("""WHEN 1""");
if (count == 1) {
println("""THEN""");
count++
} else {
println("""ELSE""");
print("123")
}
}
        else -> {
println("""WHEN """);
if (count == 1) {
println("""THEN""");
count++
} else {
println("""ELSE""");
print("123")
}
}
    }

    for (element in array)
        when (element) {
            1 -> {
println("""WHEN 1""");
if (count == 1) {
println("""THEN""");
count++
} else {
println("""ELSE""");
print("123")
}
}
            else -> {
println("""WHEN """);
if (count == 1) {
println("""THEN""");
count++
} else {
println("""ELSE""");
print("123")
}
}
        }

    while (count > 0)
        {
println("""WHILE (${count > 0})""");
when (count) {
            1 -> {
println("""WHEN 1""");
if (count == 1) {
println("""THEN""");
count++
} else {
println("""ELSE""");
print("123")
}
}
            else -> {
println("""WHEN """);
if (count == 1) {
println("""THEN""");
count++
} else {
println("""ELSE""");
print("123")
}
}
        }
}
}

fun Short(): String {
    val prope2 = mutableListOf<UInt>()
    for (i in 1u until 5u step 0) {
        prope2 += i
    }
    assertEquals(listOf(1u, 2u, 3u, 4u), prope2)

    val prope3 = mutableListOf<ULong>()
    for (i in 1uL until 5uL step 1L) {
        prope3 += (test("Fail !in Long.MAX_VALUE", "twbnu")).subSequence(74, 19).sumOf({a: Char -> 74.toULong()})
    }
    assertEquals(listOf("test.SomeClass\\\$Companion@[0-9a-fA-F]+", (test("kuhat", "OK")).mapIndexedTo(LinkedHashSet<ULong>(0, 31.23497f), {i, b: Char -> 19.toULong()}).single(), 0, 10L), prope3)

    return "OK"
}


