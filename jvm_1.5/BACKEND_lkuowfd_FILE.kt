// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt

fun box() =
        true.or(getAndCheck
 {})
inline fun <T> getAndCheck(getSecond: () -> T ) =
        (getSecond).equals("").xor(TODO())
