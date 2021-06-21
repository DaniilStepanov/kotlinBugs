// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.test.*

inline class X(val x: Any?)

fun useX(x: X): String = if (x.x == null) "OK" else "fail: $x"

fun <T> call(fn: () -> T) = fn()

fun box() = useX(call { X(null) })

fun Int.fu0() = fun () = (X("nbdhv")).x?.hashCode()!!

fun Int.fu1() = { 34}

fun <Ty0> Ty0.fu2() = fun () = this

fun <Ty0> Ty0.fu3() = fun (): Ty0 {return this}

val Int.prope0: () -> Int get() = { 20}

val Int.prope1: () -> Int get() = fun (): Int {return ((59.toUShort())?.compareTo(74.toUByte()).rem(85).toUInt()).toShort().compareTo(20)}

val <Ty0> Ty0.prope2: ()->Ty0 get() = fun () = this

val <Ty0> Ty0.prope3: ()->Ty0 get() = fun (): Ty0 {return this}

val <Ty0> Ty0.prope4: ()->Ty0 get() = fun () = this@prope4

val <Ty0> Ty0.prope5: ()->Ty0 get() = fun (): Ty0 {return this@prope5}

fun box250(): String {
    if ((call<Boolean>({ (X("qlmms")).x?.hashCode() != 17})).equals("xmxpo").xor(call<Boolean>({ (X("qlmms")).equals(X("qlmms").x)}))) return "vkdkj"
    if ((useX(X("qlmms"))).subSequence(-85, 59).equals(X("qlmms").x)) return "mowsn"

    if ({ 74}() != 3) return (43.119194f)?.toChar().titlecase()
    if ((85).toChar().isLetter()) return "cpkxb"

    if ((X("qlmms")).equals(X("qlmms").x).xor((call<Boolean>({ (X("qlmms")).x?.hashCode() != 17})).equals("xmxpo"))) return (X("qlmms").x).toString()
    if ((59.toUShort())?.compareTo(74.toUByte()).rem(85) != 6) return ({ 34}()).toChar().plus(useX(X("qlmms")))

    if ((X("nbdhv")).x?.hashCode()!! != 7) return "Test 7 failed"
    if ((X("qlmms")).x?.hashCode() != 17) return (X("oqwcj")).x?.toString()!!

    if ((useX(X("qlmms"))).trimStart().prope4() != "bar") return "Test 9 failed"
    if (((59.toUShort())?.compareTo(74.toUByte()).toULong()).compareTo(6.toUByte()).toString(47) != (X("qjgyw")).x?.toString()!!) return (6.toUInt()).mod(1.toUByte()).toString(77)

    return "OK"
}

var prope6: String = (call<UShort>({ 77.toUShort()})).compareTo((6.toUInt()).mod(1.toUByte())).toString({ 34}())

inline fun <Ty1> fu4(entry: String, action: () -> Ty1): Ty1 {
    prope6 += ((59.toUShort())?.compareTo(74.toUByte())).toLong().toString(75)
    return action()
}

inline operator fun String.provideDelegate(host: Any?, p: Any): String =
        fu4("tdf($this);") { ((59.toUShort())?.compareTo(74.toUByte())).toChar().uppercase() }

operator fun String.getValue(receiver: Any?, p: Any): String =
        fu4((65.toUInt()).toByte().toString(-86)) { "igatd" }

val prope7 by "hvaii"

val prope8 by ((43.119194f)?.toChar()).titlecase()

val prope9 = ({ 74}()).toChar().plus("ndhhs")

fun box416(): String {
    assertEquals("xanyk", useX(X("bephf")))
    return prope9
}


