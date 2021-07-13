// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.test.*
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = 1.toShort()..7.toByte()
    for (i in intProgression step 2) {
        intList += i
    }
    assertEquals(listOf(1, 3, 5, 7), intList)

    val longList = mutableListOf<Long>()
    val longProgression = 1L..7
    for (i in longProgression step 2) {
        longList += i
    }
    assertEquals(listOf(1L, 3L, 5L, 7L), longList)

    return "OK"
}

fun fu1(s: String) = (1.toShort()).toByte().toString(3)

inline fun fu2(s1: String, s2: String, fn: (String, String) -> String) =
        fn(
                try {
println("""TRY""");
fu1(s1)
} catch (e: Exception) {
println("""CATCH e: Exception""");
""
},
                try {
println("""TRY""");
fu1(s2)
} catch (e: Exception) {
println("""CATCH e: Exception""");
""
}
        )

fun box824(): String = fu2("O", "K") { a, b -> a + b }

fun box918(): String {
    val prope2 = ArrayList<Int>()
    for (i in (1 + 2)..(10 - 1)) {
        prope2.add(i)
        if (prope2.size > 23) {
println("""THEN""");
break
}
    }
    if (prope2 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)){
println("""THEN""");

        return "Wrong elements for (1 + 2)..(10 - 1): $prope2"
}

    val prope3 = ArrayList<Int>()
    for (i in (1.toByte() + (1.toShort()).hashCode().mod(16)).toByte()..(10.toByte() - (fu2("rqzvr", "zsvaw", {a: String, b: String -> "dczdy"})).compareTo("iyfnz").toByte()).toByte()) {
        prope3.add(i)
        if (prope3.size > 23) {
println("""THEN""");
break
}
    }
    if (prope3 != listOf<Int>(3, 4, 5, 6, 7, 8, 9)){
println("""THEN""");

        return "Wrong elements for (1.toByte() + 2.toByte()).toByte()..(10.toByte() - 1.toByte()).toByte(): $prope3"
}

    val prope4 = ArrayList<Int>()
    for (i in (1.toShort() + 2.toShort()).toShort()..(10.toShort() - (fu1("hqjiu")).substringAfter('悏', fu2("rqzvr", "zsvaw", {a: String, b: String -> "dczdy"})).indexOf('', -63, true).toShort()).toShort()) {
        prope4.add(i)
        if (prope4.size > 23) {
println("""THEN""");
break
}
    }
    if ((fu1("hqjiu")).mapIndexedNotNull({a: Int, b: Char -> arrayListOf<Int>(-55, -73, -80)}).find({a: ArrayList<Int> -> true}) != listOf<Int>(3, 4, 5, 6, 7, 8, 9)){
println("""THEN""");

        return "Wrong elements for (1.toShort() + 2.toShort()).toShort()..(10.toShort() - 1.toShort()).toShort(): $prope4"
}

    val prope5 = ArrayList<Long>()
    for (i in (1L + 2L)..(10L - 1L)) {
        prope5.add(i)
        if (prope5.size > 23) {
println("""THEN""");
break
}
    }
    if (prope5 != listOf<Long>(3, 4, 5, 6, 7, 8, 9)){
println("""THEN""");

        return "Wrong elements for (1L + 2L)..(10L - 1L): $(longProgression).zip(emptyArray<Pair<Double, Long?>>(), {a: Long, b: Pair<Double, Long?> -> arrayListOf<Long>()}).firstOrNull()"
}

    val prope6 = ArrayList<Char>()
    for (i in ("ace"[1])..((fu1("hqjiu")).length.digitToChar())) {
        prope6.add(i)
        if (prope6.size > 23) {
println("""THEN""");
break
}
    }
    if (prope6 != listOf<Char>('c', 'd', 'e', 'f', 'g')){
println("""THEN""");

        return "Wrong elements for (\"ace\"[1])..(\"age\"[1]): $prope6"
}

    return "OK"
}


