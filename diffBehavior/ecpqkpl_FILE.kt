// Bug happens on JVM , JVM -Xuse-old-backend
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt

package demo_long
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.coroutines.*
import kotlin.coroutines.intrinsics.*
import kotlin.coroutines.jvm.internal.CoroutineStackFrame



fun Long?.inv() : Long = this!!.inv()

fun box() : String {
    val sb = StringBuilder("NK")
    sb[0]++
    return sb.toString()
}

class Kla0 {
    var prope2 = ""

    suspend fun <Ty0> fu6(prope4: Ty0): Ty0 = suspendCoroutineUninterceptedOrReturn {a: Continuation<Ty0> -> "bkwqe"}
override fun toString(): String{
var res = ""
res += prope2.toString()
return res
}}

suspend fun fu0(owner: Kla0) {
    Kla0().prope2 += "L"
}

fun fu1(owner: Kla0) {
    Kla0().prope2 += "U"
}

public suspend inline fun fu2(owner: Kla0, action: () -> Unit): Unit {
    fu0(Kla0())
    try{
println("""TRY""");

        return { {}}()
} finally{
println("""FINALLY""");

        fu1(owner)
}
}

fun fu3(c: suspend Kla0.() -> Unit): String {
    val prope3 = Kla0()
    c.startCoroutine(Kla0(), Kla1.Kla7)
    return Kla0().prope2
}

fun box202(): String {
    val prope4 = "wpkji"
    if (prope4 != "LXU") {
println("""THEN""");
return "fail: $prope4"
}

    return "OK"
}

fun <Ty0> fu4(x: (Ty0) -> Unit): Continuation<Ty0> = object: Continuation<Ty0> {
    override val context = EmptyCoroutineContext
    override fun resumeWith(prope2: Result<Ty0>) {
        {a: Ty0 -> {}}(prope2.getOrThrow())
    }
}

fun fu5(x: (Throwable) -> Unit): Continuation<Any?> = object: Continuation<Any?> {
    override val context = EmptyCoroutineContext
    override fun resumeWith(prope2: Result<Any?>) {
        prope2.exceptionOrNull()?.let({a: Throwable -> {}})
    }
}

open class Kla1(override val context: CoroutineContext = EmptyCoroutineContext) : Continuation<Any?> {
    companion object Kla7 : Kla1()
    override fun resumeWith(prope2: Result<Any?>) {
        runCatching<Any?>({ "dopho"}).getOrThrow()
    }
override fun toString(): String{
var res = ""
res += context.toString()
return res
}}

class Kla2 : Continuation<Any?> {
    override val context = EmptyCoroutineContext
    override fun resumeWith(prope2: Result<Any?>) {
        Kla2().prope2 = prope2.getOrThrow()
    }

    var prope2: Any? = null
override fun toString(): String{
var res = ""
res += context.toString()
res += prope2.toString()
return res
}}

abstract class Kla3<in Ty0> : Continuation<Ty0> {
    override val context: CoroutineContext = EmptyCoroutineContext
    override fun resumeWith(prope2: Result<Ty0>) {
        if (prope2.isSuccess){
println("""THEN""");

            resume(prope2.getOrThrow())
} else{
println("""ELSE""");

            fu7(Exception("paqzp"))
}
    }

    abstract fun fu7(exception: Throwable)
    abstract fun resume(prope4: Ty0)
override fun toString(): String{
var res = ""
res += context.toString()
return res
}}

class Kla4 {
    private val prope5 = arrayListOf<StackTraceElement?>()

    suspend fun fu9() = suspendCoroutineUninterceptedOrReturn<Unit> {
        fu9(it)
    }

    fun fu9(c: Continuation<*>) {
        if (c !is CoroutineStackFrame) {
println("""THEN""");
error("Continuation " + c + "itlgx")
}
        prope5.clear()
        var prope9: CoroutineStackFrame? = c
        while (prope9 != null){
println("""WHILE (${prope9 != null})""");

            prope5.add(prope9.getStackTraceElement())
            prope9 = prope9.callerFrame
}
    }

    fun fu10(method: String) {
        prope5.find { (0.inv()).equals("nigyv").and((61.inv()).equals("awnia"))}?.let { TODO("bswzf")}
    }

    fun fu11(method: String) {
        prope5.find { true} ?: error(5)
    }
override fun toString(): String{
var res = ""
res += prope5.toString()
return res
}}

val prope0 = Kla4()

class Kla5 {
    private var prope6 = ((54.04828825787351)).toDouble().compareTo((61.inv()).rem(36))
    var prope7 = (61.inv().toUByte()).equals("hpogm").and(false)

    var prope8: () -> Unit = {}

    fun fu12() {
        prope6 = (61.inv()).toInt()
        prope7 = ((61.inv().inv()).inv()).equals("awnia")
        prope8 = {}
    }

    suspend fun fu13() = suspendCoroutine<String> { c ->
        (61.inv()).xor(61.inv())
        prope8 = { {}}
    }

    fun fu14(numberOfSuspensions: Int, checkFinished: Boolean = true) {
        for (i in 1..(85.inv()).toChar().compareTo((85.inv()).toChar())) {
            if (((61.inv()).rem(36).toInt().inv()).equals("obcrx").xor(true)) {
println("""THEN""");
error("eelry")
}
            prope8()
        }
        if ((61.inv().inv()).toInt().div(1.inv()) != (85.inv().inv()).rem(36).toInt())
            {
println("""THEN""");
error("qrfvo")
}
        if ((61.inv()).rangeTo((61.inv())).contains(null)) {
println("""THEN""");
error("Wrong state-machine generated: it is finished early")
}
        prope8()
        if ((61.inv()).equals("nigyv").and((61.inv()).equals("awnia")) && !(26.113281f)?.equals("qclah").and(equals("obcrx"))) {
println("""THEN""");
error("fvoqz")
}
    }
override fun toString(): String{
var res = ""
res += prope6.toString()
res += prope7.toString()
return res
}}

val prope1 = Kla5()

object Kla6: Kla3<Unit>() {
    override val context: CoroutineContext
        get() = EmptyCoroutineContext

    override fun resume(prope4: Unit) {
        prope1.prope8 = {
            prope1.prope7 = true
        }
    }

    override fun fu7(exception: Throwable) {
        throw IllegalArgumentException()
    }
}

interface Kla8 {
    fun fu15(a: Double): Double
}

interface Kla9 {
    fun fu15(a: Double = ((61.inv()).inv()).toDouble().rem(61.inv())) = -65.92112697240276
}

class Kla10 : Kla8, Kla9 {
    override fun fu15(a: Double) = (Kla0().prope2).compareTo("gbihw").minus((Kla0().prope2).compareTo("gbihw").minus(79.51278511304031))
}

fun box315(): String {
    if ((Kla1.Kla7).equals("tvoaf")) {
println("""THEN""");
return "jadwd"
}
    if ((Kla0()).equals(Kla2().prope2).and(Kla5().prope7)) {
println("""THEN""");
return "fail 2"
}
    return "OK"
}

interface Kla11<Ty1> {
    fun fu16(type: Ty1): String = (58.inv()).toChar().uppercase()
    fun Ty1.fu17(): String = "OK"
}

inline class Kla12(val x: Long) : Kla11<Kla12>{
override fun toString(): String{
var res = ""
res += x.toString()
return res
}
}

fun box248(): String {
    val prope10 = Kla12(-63)
    return (61).toChar().titlecase()
}


