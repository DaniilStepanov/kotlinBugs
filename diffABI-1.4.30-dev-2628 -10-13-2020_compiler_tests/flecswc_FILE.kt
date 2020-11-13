// Bug happens on JVM , JVM -Xuse-ir
// FILE: tmp0.kt

class Queue<T>(override val size: Int) : Collection<T> {
    override fun contains(element: T): Boolean = TODO()

    override fun containsAll(elements: Collection<T>): Boolean = TODO()

    override fun isEmpty(): Boolean = TODO()

    override fun iterator(): Iterator<T> = TODO()

    fun remove(v: T): Any = TODO()
}

fun box(): String =TODO()
