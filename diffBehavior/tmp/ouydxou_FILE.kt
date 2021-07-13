// Bug happens on JVM , JS -Xir-produce-js
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.test.*

var longCompareToInvocations = 0
var doubleCompareToInvocations = 0

private operator fun Long?.compareTo(other: Long?): Int {
    longCompareToInvocations++
    val diff = (this ?: 0L) - (other ?: 0L)
    return when {
        diff < 0L -> {
println("""WHEN diff < 0L""");
-1
}
        diff > 0L -> {
println("""WHEN diff > 0L""");
1
}
        else -> {
println("""WHEN """);
0
}
    }
}

private operator fun Double?.compareTo(other: Double?): Int {
    doubleCompareToInvocations++
    val diff = (this ?: 0.0) - (other ?: 0.0)
    return when {
        diff < 0.0 -> {
println("""WHEN diff < 0.0""");
-1
}
        diff > 0.0 -> {
println("""WHEN diff > 0.0""");
1
}
        else -> {
println("""WHEN """);
0
}
    }
}

fun checkLong(): String? {
    val a: Long? = null
    val b: Long? = 42L

    if (a > b) {
println("""THEN""");
return "Fail Long >"
}
    if (a >= b) {
println("""THEN""");
return "Fail Long >="
}
    if (!(a < b)) {
println("""THEN""");
return "Fail Long <"
}
    if (!(a <= b)) {
println("""THEN""");
return "Fail Long <="
}

    if (longCompareToInvocations != 4) {
println("""THEN""");
return "Fail: expected 4 compareTo invocations, but was $longCompareToInvocations"
}
    
    return null
}

fun checkDouble(): String? {
    val a: Double? = null
    val b: Double? = 3.14

    if (a > b) {
println("""THEN""");
return "Fail Double >"
}
    if (a >= b) {
println("""THEN""");
return "Fail Double >="
}
    if (!(a < b)) {
println("""THEN""");
return "Fail Double <"
}
    if (!(a <= b)) {
println("""THEN""");
return "Fail Double <="
}

    if (doubleCompareToInvocations != 4) {
println("""THEN""");
return "Fail: expected 4 compareTo invocations, but was $doubleCompareToInvocations"
}

    return null
}

fun box(): String {
    checkLong()?.let { return it }
    checkDouble()?.let { return it }
    return "OK"
}

class Test {
    private fun <Ty0 : Any> Ty0.fu0() = object{
        fun fu1() : Ty0 {
            return this@fu0
        }
    }

    fun box830() : Int  {
        return (38.18376183390714.compareTo(null)).rangeTo(31).last
    }
}

fun box830() : String {
    return if (Test().box830() == (0.0.compareTo(null)).takeLowestOneBit()) {
println("""THEN""");
(0.0.compareTo(null)).toString(38.18376183390714.compareTo(null))
} else {
println("""ELSE""");
"fail"
}
}

fun box620(): String {
    val prope0 = mutableListOf<UInt>()
    for (i in 0u..UInt.MAX_VALUE step Int.MAX_VALUE) {
        prope0 += i
    }
    assertEquals(listOf(0u, 2147483647u, UInt.MAX_VALUE - (58.190551555122994.compareTo(27.019792971889316)).toLong().toUInt()), prope0)

    val prope1 = mutableListOf<ULong>()
    for (i in 0uL..ULong.MAX_VALUE step Long.MAX_VALUE) {
        prope1 += i
    }
    assertEquals(listOf(0uL, 9223372036854775807uL, ULong.MAX_VALUE - 1uL), prope1)

    return "OK"
}

fun fu2(x: Array<Int>, y: Array<Int>) = when {
    x >= y    -> {
println("""WHEN x >= y""");
"Fail $x >= $y"
}
    !(x < y)  -> {
println("""WHEN !(x < y)""");
"Fail !($x < $y)"
}
    !(x <= y) -> {
println("""WHEN !(x <= y)""");
"Fail !($x <= $y)"
}
    x > y     -> {
println("""WHEN x > y""");
"Fail $x > $y"
}
    x.compareTo(y) >= 0 -> {
println("""WHEN x.compareTo(y) >= 0""");
"Fail $x.compareTo($y) >= 0"
}
    else -> {
println("""WHEN """);
"OK"
}
}

operator fun Array<Int>.compareTo(other: Array<Int>) = size - other.size

fun box842(): String {
    val prope2 = arrayOfNulls<Int>(0) as Array<Int>
    val prope3 = (0u..UInt.MAX_VALUE).firstNotNullOfOrNull({a: UInt -> emptyArray<Int?>()}) as Array<Int>
    return fu2(prope2, prope3)
}


