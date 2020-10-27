// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

@Target(AnnotationTarget.PROPERTY)
annotation class Anno

inline class Z(val s: String)

class A {
    @Anno
    val Z.r: String get() = s
}

fun box(): String {
    with(A()) {
        return Z("OK").r
    }
}
