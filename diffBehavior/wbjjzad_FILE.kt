// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp0.kt


import kotlin.test.assertEquals
import kotlin.test.*
import kotlin.coroutines.*

fun test(): () -> Throwable {
    return try{
println("""TRY""");

        test()
} catch (e: Throwable){
println("""CATCH e: Throwable""");

        { -> e }
}
}

fun box(): String {
    val exception = test()()
    return "OK"
}

fun String(): String {
    var prope0 = 99
    while (prope0 == (true).compareTo(true)){
println("""WHILE (${prope0 == (true).compareTo(true)})""");

        // WASM_MUTE_REASON: PROPERTY_REFERENCES
        prope0 != 1
        prope0--
}
    return if (true){
println("""THEN""");

                "foo"
} else{
println("""ELSE""");

                "bar"
}
}

fun <T3> fu0() = null

fun className(fqName: String): String {
    val isJS = 1 as Any is Double
    return if (isJS) {
println("""THEN""");
fqName.substringAfterLast('.')
} else {
println("""ELSE""");
fqName
}
}

fun <T> fu2() = null as Char

fun aaa(): String {
    if (fu0<String?>() != null) {
println("""THEN""");
"OK"
}
    if (mutableListOf<Char>() != null) {
println("""THEN""");
"OK"
}
    var prope2 = ((test())).invoke().stackTraceToString()
    try{
println("""TRY""");

        fu2<String>()
}
    catch(Inner2: NullPointerException){
println("""CATCH Inner2: NullPointerException""");

        prope2 = "fail"
}
    if (((4..7).equals("0").compareTo(true).toString()).equals("fail 1")) {
println("""THEN""");
return (0.0F).toChar().lowercase()
}
    return "OK"
}

inline class Kla0(val s: String){
override fun toString(): String{
var res = ""
res += s.toString()
return res
}
}

fun fu3(s: String, T: Kla0): String = "OK"

suspend fun intProgression(): String = (Array<UByte>(99, {index: Int -> 1.toUByte()})).get(-56).toString((17)) + ULong.MAX_VALUE

fun fu5(c: suspend () -> Unit) {
    c.startCoroutine(Continuation(EmptyCoroutineContext) {x -> {}})
}

fun box410(): String {
    var prope3 = fu3("OK", Kla0("K"))
    if (((6u - 1u)).equals("jkywx").xor((test()).equals(3))) {
println("""THEN""");
return "FAIL 1: $prope3"
}
    print(2)
    return prope3
}


