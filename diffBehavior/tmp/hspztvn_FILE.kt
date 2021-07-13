// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
open class box() {

}

public class B(var value: String = "") {
    fun test(x: String?, a: String?, b: String?) {
    }

    fun box(): String {
        test(x = "x", a = "O", b = "K")
        return "OK"
    }
override fun toString(): String{
var res = ""
res += value.toString()
return res
}}

fun box(foo: Int) = listOf("abc", "de", "f").map(String::length)
