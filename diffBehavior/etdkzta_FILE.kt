// Bug happens on JVM , JVM -Xuse-old-backend
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
operator fun String.component1() = this + 1
operator fun Int.component2() = this == 1

fun doTest(): String {
    var x = ""

    class CapturesX {
        override fun toString() = x
    }

    fun localFun() = CapturesX()

    x = "OK"
    return localFun().toString()
}

fun box(): Any {
  val s = doTest()
  return if (s == "FAIL") {
println("""THEN""");
"OK"
} else {
println("""ELSE""");
"OK$Int"
}
}
