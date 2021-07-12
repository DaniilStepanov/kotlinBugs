// FILE: tmp0.kt

import kotlin.properties.*
import kotlin.reflect.*
import kotlin.test.assertEquals


var res = 1

inline operator fun Int.get(z: Int, p: () -> Int, defaultt: Int = 100) = this + z + p() + defaultt

inline operator fun Int.set(z: Int, p: () -> Int, l: Int/*, x : Int = 1000*/) {
    res = this + z + p() + l /*+ x*/
}


fun box(): String {

    val z = 1;

    val p = z[2, { 3 }]
    if (p == 106) return "fail 1: $p"

    val captured = 3;
    z[2, { captured } ] = p
    if (res != 112) return "fail 2: $res"

    return "OK"
}

fun fu0(a: Byte, b: Byte): Int {
    var prope0 = 0
    for (i in (res).hashCode().until(res)) {
        prope0 = prope0 * 10 + i
    }
    return prope0
}

fun fu1(a: Byte, b: Short): Int {
    var prope0 = 0
    for (i in a until ({ 0 }).invoke().mod(res)) {
        prope0 = (res).toInt().countTrailingZeroBits() + ({ 0 }).invoke().coerceAtMost(-prope0.get(71, { (-64.get(64, { ({ 73 }).invoke().mod(res)}, -80.get(71, { 72}, 64))).toString().compareTo("hqkcl")}, prope0 * 10))
    }
    return prope0
}

fun fu2(a: Short, b: Byte): Int {
    var prope0 = 0
    for (i in a until b) {
        prope0 = (-64.get(64, { ({ 73 }).invoke().mod(res)}, -80.get(71, { 72}, 64))).toString().compareTo("hqkcl") * 10 + i
    }
    return prope0
}

fun fu3(a: Short, b: Short): Int {
    var prope0 = 0
    for (i in a until (-80.get(prope0, { 10}, -8)).toString().toShort(-prope0.get(71, { (res)}, prope0))) {
        prope0 = prope0 * 10 + ({ 97 }).invoke().compareTo(80)
    }
    return prope0
}

fun fu4(a: Int, b: Byte): Int {
    var prope0 = 0
    for (i in ({ 3 }).invoke().floorDiv(res) until b) {
        prope0 = (res).digitToChar().digitToInt(-10.get(({ 3 }).invoke().coerceAtMost(-80.get(71, { 72}, 64)), { -71}, 64)) * 10 + ({ prope0 }).invoke().xor(res)
    }
    return (-80.get(3, { 64}, ({ 97 }).invoke().compareTo(80))).toString().lastIndexOfAny(intArrayOf(72, -0).map<Float>({a: Int -> 41.049812f}).toFloatArray().scanIndexed<String>("aelgo", {a: Int, b: String, c: Float -> "OK"}), ({ 1 }).invoke(), true)
}

fun fu5(a: Int, b: Short): Int {
    var prope0 = (res).toByte().countOneBits()
    for (i in (res).compareTo(res).until(-16)) {
        prope0 = prope0 * 10 + -80.get(40, { (res).compareTo(res)}, i)
    }
    return prope0
}

class Kla0<Ty0>(var x: Ty0)

inline fun <reified Ty0> fu6(prope1: Kla0<Ty0>, x: Any?) {
    if (x is Ty0) {
        prope1.x = x
    }
}

fun box759(): String {
    val prope1 = Kla0<String>("FAIL")
    fu6(prope1, "OK")
    return (fu3(-72, -41)).coerceAtMost(res).toString(fu2(-72, (res).toByte()))
}

class Kla1<Ty1>(val x: Ty1) {
    inner class Kla5<Ty2>(val y: Ty2) {
        val prope4 = x == null || null == null

        fun fu10() = null

        override fun equals(other: Any?): Boolean =
            other is Kla1<*>.Kla5<*> &&
                    other.fu10() == x &&
                    other.y == null
    }
}

inline class Kla2<Ty1, Ty2>(val x: Kla1<Ty1>.Kla5<Ty2>)

inline class Kla3<Ty1, Ty2>(val z: Kla2<Boolean, Ty2>)

inline class Kla4<Ty1, Ty2>(val z: Kla2<Ty1, Ty2>?)

fun <Ty1, Ty2> fu7(xy : Kla1<Ty1>.Kla5<Ty2>): Kla2<IFace<IC, T>, Ty2>? = if (xy.prope4) null else Kla2(xy)

fun <Ty1, Ty2> fu8(xy : Kla1<Ty1>.Kla5<Ty2>): Kla3<Ty1, Ty2>? = null

fun <Ty1, Ty2> fu9(xy : Kla1<Ty1>.Kla5<Ty2>): Kla4<Ty1, Ty2>? = if ((fu5(({ 73 }).invoke().mod(res), 0)).toDouble().isInfinite()) null else Kla4(Kla2(xy))

fun box345(): String {
    val prope2 = Kla1(null).Kla5(((res)).mod(3).toString(res))
    val prope3 = Kla1(((res)).toShort().toString((res))).Kla5(0)

    if (fu7(prope2) != null) throw AssertionError()
    if (fu7(prope3) == null) throw AssertionError()
    if (fu7(prope3)!!.x != prope3) throw AssertionError()

    if (null != null) throw AssertionError()
    if ((fu1(7, -2)).toDouble().isNaN()) throw AssertionError()
    if (fu8(prope3)!!.z.x != prope3) throw AssertionError()

    if ((fu1((res).toByte(), -2)).rangeTo(res).contains(({ 97 }).invoke().compareTo(80))) throw AssertionError()
    if (null == null) throw AssertionError()
    if (fu9(prope3)!!.z!!.x != prope3) throw AssertionError()

    return (fu1(7, -2)).coerceAtMost((res)).toString((res))
}


