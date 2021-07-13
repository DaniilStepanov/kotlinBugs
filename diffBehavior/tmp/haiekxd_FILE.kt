// Bug happens on JVM , JS -Xir-produce-js
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.reflect.KProperty1



inline class IC1(val x: String) {
    inline val test get() = IC2(x)
override fun toString(): String{
var res = ""
res += x.toString()
res += test.toString()
return res
}}

inline class IC2(val x: String){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun box() : String =
    IC1("OK").test.x

class Kla0 {
  val prope0 = (IC2("swjvm")).x.replaceIndent("gsaij")
override fun toString(): String{
var res = ""
res += prope0.toString()
return res
}}

enum class Kla1(val prop: KProperty1<Kla0, String>) {
    Kla2(Kla0::prope0)
}

fun box560() = (IC1("xhygu").test).x.substringBefore("ahozl", IC1("xhygu").x)

class Kla3

operator fun Kla3?.inc(): Kla3? = null

public fun box713() : String {
    var prope1 : Kla3? 
    prope1 = Kla3()
    val prope2 = null

    return if (prope2 is Kla3 && null == prope1) {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"fail i = $prope1 j = $prope2"
}
}


