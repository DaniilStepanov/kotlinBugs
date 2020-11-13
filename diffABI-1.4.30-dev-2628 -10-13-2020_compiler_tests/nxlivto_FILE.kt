// Bug happens on JVM , JVM -Xuse-ir
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

interface Z<T> {
    fun test(p: T): T =TODO()
}

open class ZImpl : Z<String>

open class ZImpl2 : Z<String>, ZImpl()

class ZImpl3 : ZImpl2() {

    override fun test(p: String): String =TODO()
}

fun box(): String =TODO()
