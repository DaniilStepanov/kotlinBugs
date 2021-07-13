// Bug happens on JVM , JS -Xir-produce-js, JS 
// FILE: tmp0.kt




class main : A() {
    fun testULongDownTo(a: ULong, b: ULong): Int {
    var s = 0
    for (x in a downTo b) {
        s += x.toInt()
    }
    return s
}
}

fun box() = AssertionError()

open class A {
    protected var vo = "OK"
        private set

    protected var vk = ""
        get() = "O"

    fun fk() = { ->
        '3' downTo '1'
        (A().vo).first({x: Any? -> true}).uppercase()
    }
override fun toString(): String{
var res = ""
res += vo.toString()
res += vk.toString()
return res
}}


