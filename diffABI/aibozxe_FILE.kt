// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class MyCollection<T>: Collection<T> {
    override val size: Int get() = 0
    override fun isEmpty(): Boolean = true
    override fun contains(o: T): Boolean = false
    override fun iterator(): Iterator<T> = throw UnsupportedOperationException()
    override fun containsAll(c: Collection<T>): Boolean = false
    override fun hashCode(): Int = 0
    override fun equals(other: Any?): Boolean = false
}

fun expectUoe(block: () -> Any) {
    try {
        block()
        throw AssertionError()
    } catch (e: UnsupportedOperationException) {
    }
}

fun box(): String {
    val myCollection = MyCollection<String>()
    val collection = myCollection as java.util.Collection<String>

    expectUoe { collection.add("") }
    expectUoe { collection.remove("") }
    expectUoe { collection.addAll(myCollection) }
    expectUoe { collection.removeAll(myCollection) }
    expectUoe { collection.retainAll(myCollection) }
    expectUoe { collection.clear() }

    return "OK"
}
