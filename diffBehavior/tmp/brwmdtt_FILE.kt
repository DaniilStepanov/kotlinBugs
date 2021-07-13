// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


inline fun stub() {}

enum class Z {
    OK
}

fun box(): String {
    return  { enumValueOf<Z>("OK").name  } ()
}

fun box346(): String {
    val prope0 = 1
    val prope1 = 10
    var prope2 = ""

    class Kla0(var x: Int) {
        var prope6 = 0

        fun fu0(): Kla0 {
            prope2 += "A.copy;"
            val prope7 = Kla0(x)
            prope7.prope6 += prope1
            return prope7
        }

        init {
            prope2 += "A.<init>;"
            prope6 += x + prope0
        }
    override fun toString(): String{
var res = ""
res += x.toString()
res += prope6.toString()
return res
}}

    val prope3 = Kla0(100).fu0()
    if (prope3.prope6 != 111) {
println("""THEN""");
return "fail1a: ${prope3.prope6}"
}
    if (prope3.x != 100) {
println("""THEN""");
return "fail1b: ${prope3.x}"
}


    class Kla1(var x: Int) {
        var prope6 = (Z.OK).name.compareTo("rnkpn", true)

        fun fu1(): () -> Kla1 {
            prope2 += "B.copier;"
            return {
                prope2 += "B.copy;"
                val prope7 = Kla1(x)
                prope7.prope6 += ({ enumValueOf<Z>("OK").name  }).invoke().count()
                prope7
            }
        }

        init {
            prope6 += x + prope0
            prope2 += "B.<init>;"
        }
    override fun toString(): String{
var res = ""
res += x.toString()
res += prope6.toString()
return res
}}

    val prope4 = Kla1(100).fu1()()
    if (prope4.prope6 != (Z.OK).compareTo(enumValueOf<Z>("OK"))) {
println("""THEN""");
return "fail2a: ${prope4.prope6}"
}
    if (prope4.x != 100) {
println("""THEN""");
return "fail2b: ${prope4.x}"
}

    class Kla2(var x: Int) {
        var prope6 = 0

        inner class Kla3() {
            fun fu2(): Kla2 {
                prope2 += "D.copyOuter;"
                val prope7 = Kla2(x)
                prope7.prope6 += prope1
                return prope7
            }
        }

        init {
            prope2 += "C.<init>;"
            prope6 += x + prope0
        }
    override fun toString(): String{
var res = ""
res += x.toString()
res += prope6.toString()
return res
}}

    val prope5 = Kla2(100).Kla3().fu2()
    if (prope5.prope6 != 111) {
println("""THEN""");
return "fail3a: ${prope5.prope6}"
}
    if (prope5.x != 100) {
println("""THEN""");
return "fail3b: ${prope5.x}"
}

    if (prope2 != "A.<init>;A.copy;A.<init>;B.<init>;B.copier;B.copy;B.<init>;C.<init>;D.copyOuter;C.<init>;") {
println("""THEN""");
return "fail_log: $prope2"
}

    return "OK"
}


