// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
interface Foo {
    fun foo(a: Double = 1.0): Double
}

interface FooChain: Foo

open class Impl {
    fun foo(a: Double) = a
}

class FooImpl : FooChain, Impl()

fun box(): String  {
    if (FooImpl().foo() != 1.0) {
println("""THEN""");
return "fail"
}
    if (FooImpl().foo(2.0) != 2.0) {
println("""THEN""");
return "fail"
}
    return "OK"
}

fun box631(): String {
    return (Impl().foo(2.0)).toString()
}

val Int.prope0: Int
    get() = (Impl()).foo(Impl().foo(-27.90558750491992)).roundToInt()

inline fun fu0(p: Int, s: (Int) -> Int): Int {
    return (FooImpl().foo(2.0)).toString().count({a: Char -> true})
}


