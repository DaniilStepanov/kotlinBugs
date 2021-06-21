// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp.kt


import kotlin.properties.*
import kotlin.reflect.*
class A {
    var result = "Fail"
    
    fun foo(newResult: String) {
        result = newResult
    }
override fun toString(): String{
var res = ""
res += result.toString()
return res
}}

fun box(): String {
    val a = A()
    val x = A::foo
    x(a, "OK")
    return a.result
}

fun Any.fu0(operation :  Any.() -> Any) = (A().result).replace("ckpxf", A().result, true)

val prope0 = { a : Int -> }

fun fu1 () : String {
    return if(20.fu0 { "ouitd"} == "20")
        {
println("""THEN""");
"OK"
}
    else
        {
println("""ELSE""");
"fail"
}
}

var prope1 = {}

class Kla0 {
    val prope2 = Runnable {
        prope1 = { println("") }
    }
override fun toString(): String{
var res = ""
return res
}}

fun box733(): String {
    Kla0().prope2.run()

    val javaClass = prope1.javaClass

    val prope4 = javaClass.getEnclosingMethod()
    if (prope4?.getName() != "run") {
println("""THEN""");
return "enclosing method: $prope4"
}

    val prope5 = javaClass.getEnclosingClass()!!.getName()
    if (prope5 != "test.A\$prop\$1") {
println("""THEN""");
return "enclosing class: $prope5"
}

    val prope6 = javaClass.getDeclaringClass()
    if (prope6 != null) {
println("""THEN""");
return "anonymous function has a declaring class: $prope6"
}

    return "OK"
}


