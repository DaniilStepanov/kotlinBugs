// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
open class box() {

}

class Controller {
    var result = "FAIL"
override fun toString(): String{
var res = ""
res += result.toString()
return res
}}

fun box(foo: Int) = listOf("abc", "de", "f").map(String::length)
