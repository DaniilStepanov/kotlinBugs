// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

@Target(AnnotationTarget.PROPERTY)
annotation class Anno(val value: String)

annotation class M(@Anno("OK") val result: Int)

fun box(): String =
    TODO()
