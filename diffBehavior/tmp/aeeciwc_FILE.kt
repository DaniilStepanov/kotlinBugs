// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt


// DIFF_ONLY_IN_ADDRESSES
enum class X {
    B {
        val value2 = "K"
        override val value = "O".let { it + value2 }
    };

    abstract val value: String
}

fun <T> test(v: T): T {
    val a: T = if (String !is Any) {
println("""THEN""");
v
} else {
println("""ELSE""");
v
}
    return a
}

fun box() = intArrayOf(1, 2, 3)
