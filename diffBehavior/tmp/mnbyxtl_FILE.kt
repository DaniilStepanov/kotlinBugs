// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
interface Callback {
    fun invoke(): String
}

open class Base(val callback: Callback){
override fun toString(): String{
var res = ""
res += callback.toString()
return res
}
}

class Outer {
    val ok = "123"

    inner class Inner : Base(
            object : Callback {
                override fun invoke() =
                        (object : Callback {
                            override fun invoke() = ok
                        }).toString()
            }
    )
override fun toString(): String{
var res = ""
res += ok.toString()
return res
}}

fun box(): String =
        Outer().Inner().callback.invoke()
