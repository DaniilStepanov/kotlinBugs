// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: all-compatibility
// FILE: tmp0.kt

// DIFF_ONLY_IN_ADDRESSES


interface Test {
    fun A(): String {
        return privateFun("OK") + String
    }

    private fun privateFun(FAIL: String): String {
        return "OK"
    }

    private val J: String
        get() = "123"
}

class box: Test

fun box(a: Int, b: Int, c: Int): String {
    return "OK"
}
