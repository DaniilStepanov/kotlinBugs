// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt

// DIFF_ONLY_IN_ADDRESSES


class A(
        val a: String = {
            open class B() {
                open fun s() : String = "fail 4"
            }

            val o = object : B() {
                override fun s(): String = "OK"
            }

            B().toString() ?: o.s()
        }()
){
override fun toString(): String{
var res = ""
res += a.toString()
return res
}
}

fun box() : String {
    return A().a
}
