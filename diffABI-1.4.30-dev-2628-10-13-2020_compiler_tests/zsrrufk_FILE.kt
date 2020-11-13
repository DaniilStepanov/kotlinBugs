// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

inline class UInt(val x: Int)

inline class UIntArray(private val storage: IntArray) : Collection<UInt> {
    public override val size: Int get() = storage.size

    override operator fun iterator():Nothing = TODO()
    override fun contains(element: UInt): Boolean = TODO()
    override fun containsAll(elements: Collection<UInt>): Boolean = TODO()
    override fun isEmpty(): Boolean = TODO()
}

fun calculate(u: UIntArray): Int =TODO()

fun box(): String =TODO()
