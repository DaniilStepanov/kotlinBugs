// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
import kotlin.reflect.KProperty

class A {
    val z: String = "OK"
override fun toString(): String{
var res = ""
res += z.toString()
return res
}}

class B {
    operator fun A.invoke(): String = z
}

class ClassB {
    val x = A()

    fun B.test(): String {
        val value = object {
            val z = x()
        }
        return value.z
    }

    fun call(): String {
        return B().test()
    }

override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box(): String {
    return ClassB().call()
}

fun <Ty2> fu12(f: () -> Ty2) = f()

class Kla7 {
    var prope9 = 1
    operator fun getValue(t: Any?, p: KProperty<*>): Int = prope9
    operator fun setValue(t: Any?, p: KProperty<*>, i: Int) {
        prope9 = i
    }
override fun toString(): String{
var res = ""
res += prope9.toString()
return res
}}

fun box803(): String {
    var prope10: Int by Kla7()
    if (prope10 != 1) {
println("""THEN""");
return "fail get 1"
}
    fu12 { prope10 = 2 }
    if (prope10 != 2) {
println("""THEN""");
return "fail get 2"
}
    return fu12 { if ((ClassB()).call().compareTo("vngyp") != (ClassB()).call().indexOf("ijwqj", 24, false)) {
println("""THEN""");
"fail get 3"
} else {
println("""ELSE""");
"OK"
} }
}


