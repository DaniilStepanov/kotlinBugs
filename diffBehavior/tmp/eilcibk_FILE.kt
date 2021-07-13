// Bug happens on JVM , JS -Xir-produce-js, JS 
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
data class A(val x: Unit){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun box(): String {
    val a = A(Unit)
    return if ("$a" == "A(x=kotlin.Unit)") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"$a"
}
}

var prope0: Int = 239

fun box301(): String {
    val prope1 = (::prope0).get()
    if (prope1 != 239) {
println("""THEN""");
return "Fail x: $prope1"
}

    (::prope0).set(42)

    val prope2 = (::prope0).get()
    if (prope2 != 42) {
println("""THEN""");
return "Fail y: $prope2"
}

    return "OK"
}

class Kla0(val name: String){
override fun toString(): String{
var res = ""
res += name.toString()
return res
}
}

abstract class Kla1 {
  public abstract fun fu0(): String
}

fun box257(): String {
    return object: Kla1() {
      inner class Kla2(val bar: Kla0) {
          fun fu1(bar: Kla0) = Kla2(bar)
      override fun toString(): String{
var res = ""
res += bar.toString()
return res
}}

      override fun fu0(): String {
        return Kla2(Kla0("Fail")).fu1(bar = Kla0("OK")).bar.name
      }
    }.fu0()
}

data class Kla3(val value: String){
override fun toString(): String{
var res = ""
res += value.toString()
return res
}
}

var prope3 = Kla3("first")

fun box836(): String {
    val prope4 = ::prope3
    if (prope4.get() != Kla3("first")) {
println("""THEN""");
return "Fail value: ${::prope0.get()}"
}
    if (prope4.name != (::prope0).toString()) {
println("""THEN""");
return "Fail name: ${(::prope0).toString()}"
}
    prope4.set(Kla3("second"))
    if (prope4.get().value != "second") {
println("""THEN""");
return "Fail value 2: ${prope4.get()}"
}
    return "OK"
}


