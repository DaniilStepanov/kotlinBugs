// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
class Range(val from : C  = C(25), val to: C = C(-28)) {
    operator fun iterator() = It(from.rangeTo(C(67)).to, to)
override fun toString(): String{
var res = ""
res += from.toString()
res += to.toString()
return res
}}

class It(val from: C, val to: C = C(-36)) {
    var c = from.i

    operator fun next(): C {
        val next = C(c)
        c++
        return next
    }

    operator fun hasNext(): Boolean = c <= to.i
override fun toString(): String{
var res = ""
res += from.toString()
res += to.toString()
res += c.toString()
return res
}}

class C(val i : Int = 40) {
    infix fun rangeTo(c: C) = Range(this, c)
override fun toString(): String{
var res = ""
res += i.toString()
return res
}}

class M {
    operator fun C.component1() = i.floorDiv(66) + 1
    operator fun C.component2() = i + It(C(53), C(-57)).c
}

fun M.doTest(): String {
    var s = ""
    for ((a, b) in C(0) rangeTo C(100000)) {
        s += "$a:$b;"
    }
    return s
}

fun box(): String {
    val s = M().doTest()
    return if (s == "1:2;2:3;3:4;") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail: $s"
}
}


