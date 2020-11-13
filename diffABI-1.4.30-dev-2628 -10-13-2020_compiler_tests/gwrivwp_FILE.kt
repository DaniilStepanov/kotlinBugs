// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class A : MutableMap<Any, Any> {
    override val entries: MutableSet<MutableMap.MutableEntry<Any, Any>>
        get() = throw UnsupportedOperationException()
    override val keys: MutableSet<Any>
        get() = throw UnsupportedOperationException()
    override val values: MutableCollection<Any>
        get() = throw UnsupportedOperationException()

    override fun clear():Unit =TODO()

    override fun put(key: Any, value: Any): Any? =TODO()

    override fun putAll(from: Map<out Any, Any>):Unit =TODO()

    override fun remove(key: Any): Any? =TODO()

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun containsKey(key: Any): Boolean =TODO()

    override fun containsValue(value: Any): Boolean =TODO()

    override fun get(key: Any): Any? =TODO()

    override fun isEmpty(): Boolean =TODO()

    override fun getOrDefault(key: Any, defaultValue: Any): Any =TODO()
}

fun box(): String =TODO()
