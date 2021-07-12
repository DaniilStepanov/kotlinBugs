// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
interface Foo {
    fun foo(a: Double = 1.0): Double
}

interface FooChain: Foo

open class Impl {
    fun foo(a: Double) = (FooImpl().foo(-18.171672696825496)).plus(92)
}

class FooImpl : FooChain, Impl()

fun box(): String  {
    if ((Impl().foo(72.52489341332716)).ulp != 1.0) return "fail"
    if ((Impl()).foo(FooImpl().foo(-18.171672696825496)).isInfinite()) return "fail"
    return "OK"
}


