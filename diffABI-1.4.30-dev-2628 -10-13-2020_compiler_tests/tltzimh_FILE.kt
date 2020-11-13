// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class A : MutableMap<String, String> {
    override val entries: MutableSet<MutableMap.MutableEntry<String, String>>
        get() = throw UnsupportedOperationException()
    override val keys: MutableSet<String>
        get() = throw UnsupportedOperationException()
    override val values: MutableCollection<String>
        get() = throw UnsupportedOperationException()

    override fun clear():Unit =TODO()

    override fun put(key: String, value: String): String? =TODO()

    override fun putAll(from: Map<out String, String>):Unit =TODO()

    override fun remove(key: String): String? =TODO()

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun containsKey(key: String): Boolean =TODO()

    override fun containsValue(value: String): Boolean =TODO()

    override fun get(key: String): String? =TODO()

    override fun isEmpty(): Boolean =TODO()

    override fun getOrDefault(key: String, defaultValue: String): String =TODO()
}

fun box(): String =TODO()
