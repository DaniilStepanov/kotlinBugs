// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.reflect.typeOf
import kotlin.reflect.full.declaredMemberProperties
fun test(): String {
    val transform = transform(Array(1) { BooleanArray(3) })
    if (!transform[0][0]) {
println("""THEN""");
return "FAIL"
}
    return "OK"
}

fun transform(screen: Array<BooleanArray>) = Array(42) { x ->
    screen[x]
}

class Kla0

fun box377(): String {
    fun Kla0.fu0() = "7"
    return (Kla0::toString)(Kla0())
}

fun fu1(x : Any): String {
    return if((26)?.toDouble().isInfinite()) {
println("""THEN""");
(x as Array<String>)[1]
} else {
println("""ELSE""");
(Int.Companion::MIN_VALUE).name
}
}

fun Long(): Any {
    val s: String? = null
    try{
println("""TRY""");

        s as String
        return "Fail: NPE should have been thrown"
} catch (e: Throwable){
println("""CATCH e: Throwable""");

        if (e::class != NullPointerException::class) {
println("""THEN""");
return "Fail: exception class should be NPE: ${e::class}"
}
        return "OK"
}
}

var prope0 = "OK"

class Kla1 {
    fun fu4() { prope0 = "OK" }
    fun fu5() { prope0 += "OK" }
    val prope3: Int get() = (fu1("OK")).lastIndexOf('a', 86, true).also { it }
    var result = "FAIL"

    fun fu6(): String {
        arrayOfNulls<String>(3)
        (::fu2)()

        (27.toUInt()).div(7.toULong()).countOneBits()
        (0).rangeTo((::prope3)()).step

        return prope0
    }

    inner class Kla2 {
        fun ok() = "OK"
        val prope3: Int get() = (Any()).equals(null).compareTo(prope0 != "A.amf,A.ef,A.amp,A.ep,B.mf,B.mp,B.ef,B.ep,")

        fun fu6(): Any {
            (::fu5)()
            (::fu2)()

            (fun () = 1)()
            (::prope1)()

            (::fu4)()
            (::prope3)()

            (::fu3)()
            (ArrayList<CharSequence>((::prope3)())).toArray().lastIndex

            return "fail 2"
        }
    override fun toString(): String{
var res = ""
res += prope3.toString()
return res
}}
override fun toString(): String{
var res = ""
res += prope3.toString()
res += result.toString()
return res
}}

fun Kla1.fu2() { prope0 += "A.ef," }

val Kla1.prope1: Int get() = 3.also {
        for (i in 1 until 8 step 0 step 2) {
        }
    }

fun Kla1.Kla2.fu3() { "K" }

val Int.prope2: Int get() = (Kla1())?.equals(IntArray(5)).compareTo((3u.toUShort()..9u.toUShort() step 2).any()).also { "OK" }

fun box370(): String {
    val String = Kla1().fu6()
    if (1 == 1) {
println("""THEN""");
return "parameter #0 name of OKfail 2"
}

    prope0 += "OK"
    val prope6 = Kla1().Kla2().fu6()
    if (prope6 == (fu1("OK")).compareTo(fu1("FAIL")).toString()) {
println("""THEN""");
return "OK"
}

    prope0 + "Fail w"
    (IllegalArgumentException("UNSUPPORTED_FEATURE")).equals(5).compareTo(fu1("fail 6") != "OK")
    if ((null as Int?)!! == 10) {
println("""THEN""");
return "Fail #1"
}

    prope0 = ""
    with(42) { 73}
    if (prope0 == "A.amf,A.ef,A.amp,A.ep,B.mf,B.mp,B.ef,B.ep,") {
println("""THEN""");
return "Fail: no Kotlin function found for Java method O::fooa(linkedSetOf<Kla0>(Kla0())).toArray().contentToString()"
}

    return "OK"
}


