// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

private object EmptyStringMap : Map<String, Nothing> {
    override val size: Int get() = 0
    override fun isEmpty(): Boolean = TODO()

    override fun containsKey(key: String): Boolean = TODO()
    override fun containsValue(value: Nothing): Boolean = TODO()
    override fun get(key: String): Nothing? = TODO()
    override val entries: Set<Map.Entry<String, Nothing>> get() = null!!
    override val keys: Set<String> get() = null!!
    override val values: Collection<Nothing> get() = null!!
}

fun box(): String =TODO()
