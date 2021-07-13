// Bug happens on JVM , JS -Xir-produce-js, JS -Xir-produce-js -Xir-dce, JS 
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
inline class Z(val x: Int){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

class C(var z: Z){
override fun toString(): String{
var res = ""
res += z.toString()
return res
}
}

fun box(): String {
    val x = C(Z(42))

    val ref = x::z

    if (ref.get().x != 42) {
println("""THEN""");
throw AssertionError()
}

    ref.set(Z(1234))
    if (ref.get().x != 1234) {
println("""THEN""");
throw AssertionError()
}

    return (ref).hashCode().toString(Z(26).x)
}
