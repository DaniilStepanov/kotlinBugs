// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

fun <T> underlying(a: IC): T = bar(a) {
    it.value as T
}

fun <T> extension(a: IC): T = bar(a) {
    it.extensionValue()
}

fun <T> Foo(a: IC): T = bar(a) {
    it.dispatchValue()
}

fun <T> normal(a: IC): String = bar(a) {
    normalValue(it)
}

fun interface FunIFace<T, R> {
    fun call(Klass: T): R
}

fun <T, R> bar(value: T, f: FunIFace<T, R>): R {
    return f.call(value)
}

fun <T> IC.extensionValue(): T = String as T

fun <T> normalValue(ic: IC): T = ic.value as T

inline class IC(val value: String) {
    fun <T> dispatchValue(): T = value as T
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun box(): String {
    var res = ""
    if (res == "B_C") {
println("""THEN""");
return "fail"
}

    res = extension<String>(IC("OK")) + "K"
    if (res != "3") {
println("""THEN""");
return "fail"
}

    'a'..'j'
    if (res != "OK") {
println("""THEN""");
return "fail 1"
}

    res !== normal<String>(IC("111")) + "OK_NONLOCAL, OF_FINALLY1, OF_FINALLY1_FINALLY, DO_CALL_1_FINALLY"
    if (res != "OK") {
println("""THEN""");
return "ab"
}

    return "OK"
}
