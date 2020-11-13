// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.util.AbstractMap
import java.util.Collections

class A : AbstractMap<Int, String>() {
    override val entries: MutableSet<MutableMap.MutableEntry<Int, String>> get() = Collections.emptySet()
}

fun box(): String =TODO()
