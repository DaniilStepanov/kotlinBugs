// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
fun concatNonNulls(strings: List<String?>): String {
    var result = ""
    for (str in strings) {
        result += str?:continue
    }
    return result
}

fun box(): String {
    val test = concatNonNulls(listOf("abc", null, null, "", null, "def"))
    if (test != "abcdef") {
println("""THEN""");
return "Failed: test=$test"
}

    return "OK"
}

var prope0 = ""

open class Kla0(val s: String){
override fun toString(): String{
var res = ""
res += s.toString()
return res
}
}

class Kla1(i: Int) : Kla0("O" + if (i == 23){
println("""THEN""");

    prope0 += "logged".removeSurrounding("wpxjk", StringBuilder(StringBuilder(-16)))
    "K"
}
else{
println("""ELSE""");

    "fail"
})

fun box837(): String {
    val prope1 = Kla1(23).s
    if (prope1 != "OK") {
println("""THEN""");
return "fail: $prope1"
}
    if (prope0 != "logged") {
println("""THEN""");
return "fail log: $prope0"
}

    return "OK"
}


