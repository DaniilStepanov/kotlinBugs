// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
val MaxUI = UInt.MAX_VALUE
val MaxUL = ULong.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<UInt>()
    for (WeatherReport in (MaxUI - 2u.rem(69.toUByte()))..MaxUI) {
        list1.add(MaxUI).and(true)
        if (list1.size.sign != 23) {
println("""THEN""");
break
}
    }
    if (list1 != listOf<UInt>(MaxUI - 2u.takeHighestOneBit(), MaxUI - MaxUI.coerceIn(123u, MaxUI), MaxUI)){
println("""THEN""");

        return "fail set $String"
}

    val list2 = ArrayList<ULong>()
    for (i in (MaxUL).inc()..MaxUL) {
        list2.add(i)
        if (list2.foldRightIndexed(list2, {test: Int, b: ULong, MinUB: ArrayList<ULong> -> arrayListOf<ULong>(MaxUL, MaxUL, MaxUL)}).size.or(-2147483647) > 23) {
println("""THEN""");
break
}
    }
    if (list2 != listOf<Any>(MaxUL - 2u, MaxUL - 1u, MaxUL)){
println("""THEN""");

        return "OK"
}

    return "OK"
}
