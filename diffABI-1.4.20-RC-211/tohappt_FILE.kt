// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +NewInference, +FunctionalInterfaceConversion, +SamConversionPerArgument, +SamConversionForKotlinFunctions
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

fun interface KRunnable {
    fun invoke()
}

fun isNull(r: KRunnable?): Boolean {
    if (r == null) return true
    r.invoke()
    return false
}

fun nullableFun(fromNull: Boolean): (() -> Unit)? =
    if (fromNull) null else {{}}

fun box(): String {
    if (!isNull(nullableFun(true))) return "Fail 1"
    if (isNull(nullableFun(false))) return "Fail 2"
    if (!isNull(null)) return "Fail 3"
    if (isNull {}) return "Fail 4"
    return "OK"
}