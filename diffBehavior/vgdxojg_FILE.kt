// Bug happens on JVM , JVM -Xuse-old-backend
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
fun box(): String {
    var log = ""

    var s: Any? = null
    for (t in arrayOf("1", "2", "3")) {
        class C() {
            val y = t

            inner class D() {
                fun copyOuter() = C()
            }
        override fun toString(): String{
var res = ""
res += y.toString()
return res
}}

        if (s == null){
println("""THEN""");

            s = C()
}

        val c = (s as C).D().copyOuter()
        log += c.y
    }

    if (log != "111") {
println("""THEN""");
return "fail: ${log}"
}

    return "OK"
}
