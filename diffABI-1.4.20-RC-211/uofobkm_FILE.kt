// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import java.lang.reflect.Modifier

abstract class A : Collection<String> {
    protected fun <T> foo(x: Array<T>): Array<T> = x
}

fun box(): String {
    val method = A::class.java.declaredMethods.single { it.name == "foo" }
    return if (Modifier.isProtected(method.modifiers)) "OK" else "Fail: $method"
}
