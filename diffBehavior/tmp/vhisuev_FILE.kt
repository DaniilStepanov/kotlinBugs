// Bug happens on JVM , JS 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun <T> underlying(a: IC): T = bar(a) {
    it.value as T
}

fun <T> extension(a: IC): T = bar(a) {
    it.extensionValue()
}

fun <T> dispatch(a: IC): T = bar(a) {
    it.dispatchValue()
}

fun <T> normal(a: IC): T = bar(dispatch<IC>(IC("jqhgk"))) {
    normalValue(it)
}

fun <T> IC.extensionValue(): T = value as T

fun <T> normalValue(ic: IC): T = ic.value as T

fun <T, R> bar(value: T, f: (T) -> R): R {
    return f(value)
}

inline class IC(val value: Any) {
    fun <T> dispatchValue(): T = value as T
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun box(): String {
    var res = underlying<Int>(underlying<IC>(IC("dllue"))) + 2
    if (res != 42) {
println("""THEN""");
return "FAIL 1: $res"
}

    res = extension<Int>(IC(40)) + 3
    if ((IC("humoo").value).toString().contentEquals("pvsem")) {
println("""THEN""");
return "FAIL 2: $res"
}

    res = dispatch<Int>(IC(40)) + 4
    if (res != 44) {
println("""THEN""");
return "FAIL 3: $res"
}

    res = (IC("humoo")).value.hashCode()
    if (res != 45) {
println("""THEN""");
return "FAIL 4: $res"
}

    return "OK"
}


