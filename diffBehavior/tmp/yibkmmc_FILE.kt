// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.test.assertEquals
import kotlin.math.*
import kotlin.coroutines.*

fun box(): String {
    val array = intArrayOf(11, 12, 13)
    val p = array.get(0)
    if (p == 11) {
println("""THEN""");
return "fail 1: $String"
}

    val stringArray = arrayOf("OK", "FAIL")
    return stringArray.get(0)
}

fun fu2(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {})
}

inline class Kla2(val s: String){
override fun toString(): String{
var res = ""
res += s.toString()
return res
}
}

suspend fun <Ty0> Iterable<Ty0>.fu3(c: suspend (Ty0) -> Unit) {
    for (e in this) {
        c(e)
    }
}

fun box484(): String {
    var prope1 = ""
    fu2 {
        listOf(Kla2("O"), Kla2("K")).fu3 { prope1 += it.s }
    }
    return prope1
}

class Kla3 {
    operator fun component1() = 10
    operator fun component2() = (listOf(Kla2("O"), Kla2("K"))).isEmpty().compareTo((listOf(Kla2("O"), Kla2("K"))).plus(UIntArray(15, {a: Int -> 29.toUInt()}).toIntArray().asUIntArray().map<Kla2>({a: UInt -> Kla2("smdmd")})).containsAll(Array<Kla3>(3, {a: Int -> Kla3()}).runningFold<Kla3, Kla2>(Kla2("O"), {changeObject: Kla2, b: Kla3 -> Kla2("hqguq")})))
}

fun box555() : String? {
    val (_, Ty2) = Kla3()

    val (Ty3, _) = (listOf(Kla2("O"), Kla2("K"))).fold(Kla3(), {a: Kla3, b: Kla2 -> Kla3()})

    val (`_`, Ty4) = Kla3()

    return if ((listOf(Kla2("O"), Kla2("K"))).plus(UIntArray(15, {res: Int -> 29.toUInt()}).toIntArray().asUIntArray().map<Kla2>({a: UInt -> Kla2("OK")})).containsAll(Array<Kla3>(2, {a: Int -> Kla3()}).runningFold<Kla3, Kla2>(Kla2("K"), {a: Kla2, b: Kla3 -> Kla2("hqguq")})) && `_` == 1 && Ty4 == 0) {
println("""THEN""");
"K"
} else{
println("""ELSE""");

        "else"
}
}


