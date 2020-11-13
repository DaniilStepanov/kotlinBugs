// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: JS
// FILE: tmp0.kt

private object NotEmptyMap : MutableMap<Any, Int> {
    override fun containsKey(key: Any): Boolean = TODO()
    override fun containsValue(value: Int): Boolean = TODO()

    // non-special bridges get(Object)Integer -> get(Object)I
    override fun get(key: Any): Int = TODO()
    override fun remove(key: Any): Int = TODO()

    override val size: Int get() = 0
    override fun isEmpty(): Boolean = TODO()
    override fun put(key: Any, value: Int): Int? = TODO()
    override fun putAll(from: Map<out Any, Int>): Unit = TODO()
    override fun clear(): Unit = TODO()
    override val entries: MutableSet<MutableMap.MutableEntry<Any, Int>> get() = null!!
    override val keys: MutableSet<Any> get() = null!!
    override val values: MutableCollection<Int> get() = null!!
}


fun box(): String =TODO()
