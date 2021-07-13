// Bug happens on JVM , JS -Xir-produce-js
// WITH_REFLECT
// IGNORE_BACKEND: JS
// IGNORE_BACKEND: NATIVE
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


val top = 42
var top2 = -23

val Int.intExt: Int get() = this
val Char.charExt: Int get() = this.toInt()

class A(var mem: String){
override fun toString(): String{
var res = ""
res += mem.toString()
return res
}
}
class B(var mem: String){
override fun toString(): String{
var res = ""
res += mem.toString()
return res
}
}


fun checkEqual(x: Any, y: Any) {
    assertEquals(x, y)
    assertEquals(x.hashCode(), y.hashCode(), "Elements are equal but their hash codes are not: ${x.hashCode()} != ${y.hashCode()}")
}

fun box(): String {
    checkEqual(::top, ::top)
    checkEqual(::top2, ::top2)
    checkEqual(Int::intExt, Int::intExt)
    checkEqual(A::mem, A::mem)

    assertFalse(::top == ::top2)
    assertFalse(Int::intExt == Char::charExt)
    assertFalse(A::mem == B::mem)

    return "OK"
}
