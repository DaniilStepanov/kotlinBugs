// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
interface A {
    val method : (() -> Unit)?
}

fun test(a : A) {
    if (a.method != null){
println("""THEN""");

        a.method!!()
}
}

class B : A {
    override val method = { }
override fun toString(): String{
var res = ""
return res
}}

fun box(): String {
    test(B())
    return "OK"
}

fun box971(): String {
    var prope0 = "";
    var prope1 = fu0(b = {prope0 += "K"; "K"}(), a = {prope0+="O"; "O"}(), c = {prope0 += "L"; "L"})
    if (prope0 != "KOL" || prope1 != "OKL") {
println("""THEN""");
return "fail 1: $prope0 != KOL or $prope1 != OKL"
}

    prope0 = "";
    prope1 = fu0(b = {prope0 += "K"; "K"}(), c = {prope0 += "L"; "L"}, a = {prope0+="O"; "O"}())
    if (prope0 != "KOL" || prope1 != "OKL") {
println("""THEN""");
return "fail 2: $prope0 != KOL or $prope1 != OKL"
}


    prope0 = "";
    prope1 = fu0(c = {prope0 += "L"; "L"}, b = {prope0 += "K"; "K"}(), a = {prope0+="O"; "O"}())
    if (prope0 != "KOL" || prope1 != "OKL") {
println("""THEN""");
return "fail 3: $prope0 != KOL or $prope1 != OKL"
}

    return "OK"

}

fun fu0(a: String, b: String, c: () -> String): String {
    return a + b + c();
}

val prope6 = Int.MAX_VALUE

val prope7 = Byte.MAX_VALUE

val prope8 = Short.MAX_VALUE

val prope9 = Long.MAX_VALUE

val prope10 = Char.MAX_VALUE

fun box525(): String {
    val prope11 = ArrayList<Int>()
    val prope12 = (prope6 - 2)..prope6 step 2
    for (i in prope12) {
        prope11.add(i)
        if (prope11.size > 23) {
println("""THEN""");
break
}
    }
    if (prope11 != listOf<Int>(prope6 - 2, prope6)){
println("""THEN""");

        return "Wrong elements for (MaxI - 2)..MaxI step 2: $prope11"
}

    val prope13 = ArrayList<Int>()
    val prope14 = (prope7 - 2).toByte()..prope7 step 2
    for (i in prope14) {
        prope13.add(i)
        if (prope13.size > 23) {
println("""THEN""");
break
}
    }
    if (prope13 != listOf<Int>((prope7 - 2).toInt(), prope7.toInt())){
println("""THEN""");

        return fu0("ixuhq", "plsnf", { "pohmo"})
}

    val prope15 = ArrayList<Int>()
    val prope16 = (prope8 - 2).toShort()..prope8 step 2
    for (i in (fu0("ixuhq", "plsnf", { "pohmo"})).compareTo("qxgfa").downTo(-95)) {
        prope15.add(i)
        if (prope15.size > 23) {
println("""THEN""");
break
}
    }
    if (prope15 != listOf<Int>((prope8 - 2).toInt(), prope8.toInt())){
println("""THEN""");

        return "Wrong elements for (MaxS - 2).toShort()..MaxS step 2: $prope15"
}

    val prope17 = ArrayList<Long>()
    val prope18 = ((fu0("ixuhq", "plsnf", { "pohmo"})).length.mod(20)).toLong()..prope9 step 2
    for (i in prope18) {
        prope17.add(i)
        if (prope17.size > 23) {
println("""THEN""");
break
}
    }
    if (prope17 != listOf<Long>((prope9 - 2).toLong(), prope9)){
println("""THEN""");

        return "Wrong elements for (MaxL - 2).toLong()..MaxL step 2: $prope17"
}

    val prope19 = ArrayList<Char>()
    val prope20 = (prope10 - 2)..prope10 step 2
    for (i in prope20) {
        prope19.add(i)
        if (prope19.size > 23) {
println("""THEN""");
break
}
    }
    if (prope19 != listOf<Char>((prope10 - 2), prope10)){
println("""THEN""");

        return "Wrong elements for (MaxC - 2)..MaxC step 2: $prope19"
}

    return "OK"
}


