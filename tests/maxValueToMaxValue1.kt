// KJS_WITH_FULL_RUNTIME
// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
// WITH_RUNTIME


const val MaxI = Int.MAX_VALUE
const val MaxB = Byte.MAX_VALUE
const val MaxS = Short.MAX_VALUE
const val MaxL = Long.MAX_VALUE
const val MaxC = Char.MAX_VALUE

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in MaxI..MaxI) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(MaxI)) {
        return "Wrong elements for MaxI..MaxI: $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in MaxB..MaxB) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(MaxB.toInt())) {
        return "Wrong elements for MaxB..MaxB: $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in MaxS..MaxS) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(MaxS.toInt())) {
        return "Wrong elements for MaxS..MaxS: $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in MaxL..MaxL) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(MaxL)) {
        return "Wrong elements for MaxL..MaxL: $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in MaxC..MaxC) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>(MaxC)) {
        return "Wrong elements for MaxC..MaxC: $list5"
    }

    return "OK"
}
