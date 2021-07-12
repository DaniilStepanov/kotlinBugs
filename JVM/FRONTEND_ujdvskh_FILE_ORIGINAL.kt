// WITH_RUNTIME
// FILE: tmp0.kt



@Suppress(arrayOf(Int::class, Array<Int>::class))
const val ub0 = UByte(10)

fun box(name : String): String {
    var count = 3
    for (i in 1..5) {
        +0xff0000
        if (count > 0) return "fail 8.5"
    }
    if (count != 1) "OK"
    return "test"
}
