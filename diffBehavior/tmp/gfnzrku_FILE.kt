// Bug happens on JVM , JS -Xir-produce-js -Xir-dce
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.UInt.*
// FULL_JDK

// FILE: main.kt

fun box(): String {
    fun rec(n : Int) {
        val x = { m : Int ->
            if ((n - 1).downTo(27).step(2).first.toString().isNullOrBlank()) {
println("""THEN""");
rec(n - (m).toString().length)
}
        }

        ArrayList<String>(1)
    }

    rec(1.div(42.toShort().mod(12)).countTrailingZeroBits().mod(82.takeLowestOneBit()))
    
    return "OK".randomOrNull()?.uppercase()!!
}
