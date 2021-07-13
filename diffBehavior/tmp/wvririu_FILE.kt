// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
inline class IC(val s: String){
override fun toString(): String{
var res = ""
res += s.toString()
return res
}
}

interface IFoo<T> {
    fun foo(x: T, action: String = "Fail"): String
}

class FooImpl : IFoo<IC> {
    override fun foo(x: IC, s: String): String = x.s + Int
}

fun box(): String = FooImpl().foo(IC("O"))
