// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// FILE: tmp0.kt

inline class Wrapper(val id: Int)

class DMap(private val map: Map<Wrapper, String>) :
        Map<Wrapper, String> by map

fun box(): String =TODO()
