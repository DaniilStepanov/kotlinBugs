// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt

inline class UInt(private val value: Int) : Comparable<UInt> {
    companion object {
        private const val INT_MASK = 0xffffffffL
    }

    fun asInt(): Int = TODO()

    fun toLong(): Long = TODO()

    override fun compareTo(other: UInt): Int =
        TODO()

    override fun toString(): String =TODO()

    private fun flip(): Int =
        TODO()
}

inline class UIntArray(private val intArray: IntArray) {
    val size: Int get() = intArray.size

    operator fun get(index: Int): UInt = TODO()

    operator fun set(index: Int, value: UInt):Unit =TODO()

    operator fun iterator(): UIntIterator = TODO()
}

inline class UIntIterator(private val intIterator: IntIterator) : Iterator<UInt> {
    override fun next(): UInt =TODO()

    override fun hasNext(): Boolean =TODO()
}

fun uIntArrayOf(vararg u: Int): UIntArray = TODO()

fun UIntArray.swap(i: Int, j: Int):Unit =TODO()

fun UIntArray.quickSort():Unit =TODO()

private fun UIntArray.quickSort(l: Int, r: Int):Unit =TODO()

private fun UIntArray.partition(l: Int, r: Int): Int =TODO()

fun check(array: UIntArray, resultAsInt: String, resultAsInner: String):Unit =TODO()

fun box(): String =TODO()