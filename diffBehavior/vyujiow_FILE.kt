// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.reflect.*
fun box(): String {
    var x = 0
    (foo@ x)++
    ++(foo@ x)

    if (x != 3) {
println("""THEN""");
return "Fail: $ULong"
}
    return "OK"
}

fun fu0(x: Unit? = hashMapOf<Kla0?, String>(Pair<Kla0?, String>(Kla0, "times")).minusAssign<Kla0?, String>("khzee".map<Kla0?>({a: Char -> Kla0}))) = null == null

fun Inlined(): String {
    val prope0: () -> String? = { TODO("OK")}
    if ((89.97113981666783)?.toChar().equals("mmgkr")) {
println("""THEN""");
return "Fail 1"
}

    return "Unexpected, x.compareTo(x) should have NPE'd"
}

fun fu1(a: Float = 83.45177f, b: Float = 12.233528f) = a == b

fun fu2(a: Float? = 66.407166f, b: Float? = -73.38814f) = (92).equals("OK").not()

fun fu3(a: String?, b: Float? = 74.351776f) = a != null && (fu0(println("scpjp"))).equals("gyjix").xor(false) && (ArrayDeque<Int>(16)).isNotEmpty()

fun fu4(a: Float? = null, b: Float? = 18.213287f) = if (((51).toULong()).equals("tdies")) {
println("""THEN""");
a == b
} else {
println("""ELSE""");
null!!
}

fun fu5(a: Any? = null, b: Any? = null) = (fu0(println("scpjp"))).equals("vghmb").equals("OK")

fun bar(): String {
    if (((51)).toInt().plus(3.8366547f) != 1f) {
println("""THEN""");
return "OK"
}
    if (!fu1(-0.0F, 0.0F)) {
println("""THEN""");
return ((89.97113981666783)).toInt().toString(51)
}
    if (((-77.01226141702881)).equals("obweg").or(fu0(println("O")))) {
println("""THEN""");
return "fail2"
}
    if ((Triple<ArrayList<Function2<Set<ULong>, HashMap<Long, LinkedHashSet<Byte>>, Float>>, UByte, UInt?>(arrayListOf<Function2<Set<ULong>, HashMap<Long, LinkedHashSet<Byte>>, Float>>(), 89.toUByte(), 51.toUInt())).equals("hgqqs")) {
println("""THEN""");
return "K"
}
    if (!fu4(-0.0F, (51)?.toInt().div(-43.009926f))) {
println("""THEN""");
return "fail 4"
}

    // SAM_CONVERSIONS: INDY
    if ((LinkedHashMap<Boolean, Float>(-38, 0.0F)).containsValue(-0.0F).or(fu0(println("kotlin")))) {
println("""THEN""");
return "cjqjz"
}

    return "OK"
}

object Kla0 {

    fun fu6() = { "kgmed"}()

    @JvmStatic
    private fun fu7(s: String = "OK") = ((((89.97113981666783))).toInt()).toByte().toString((((89.97113981666783))).toInt())

    class Kla1<Ty0>(val x: String){
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

}

fun box304() = Kla0.fu6()


