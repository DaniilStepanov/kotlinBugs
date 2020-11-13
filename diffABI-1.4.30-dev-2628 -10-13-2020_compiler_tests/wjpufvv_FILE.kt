// Bug happens on JVM , JVM -Xuse-ir
// WITH_RUNTIME
// FILE: tmp0.kt

interface IFooList {
    fun foo(): List<String>
}

interface IFooMutableList {
    fun foo(): MutableList<String>
}

inline class AL(val t: MutableList<String>) : MutableList<String> {
    override val size: Int get() = t.size
    override fun get(index: Int): String = TODO()
    override fun set(index: Int, element: String): String = TODO()
    override fun contains(element: String): Boolean = TODO()
    override fun containsAll(elements: Collection<String>): Boolean = TODO()
    override fun indexOf(element: String): Int = TODO()
    override fun isEmpty(): Boolean = TODO()
    override fun iterator(): MutableIterator<String> = TODO()
    override fun lastIndexOf(element: String): Int = TODO()
    override fun add(element: String): Boolean = TODO()
    override fun add(index: Int, element: String):Unit = TODO()
    override fun addAll(index: Int, elements: Collection<String>): Boolean = TODO()
    override fun addAll(elements: Collection<String>): Boolean = TODO()
    override fun listIterator(): MutableListIterator<String> = TODO()
    override fun listIterator(index: Int): MutableListIterator<String> = TODO()
    override fun clear():Unit =TODO()
    override fun remove(element: String): Boolean = TODO()
    override fun removeAll(elements: Collection<String>): Boolean = TODO()
    override fun removeAt(index: Int): String = TODO()
    override fun retainAll(elements: Collection<String>): Boolean = TODO()
    override fun subList(fromIndex: Int, toIndex: Int): MutableList<String> = TODO()
}

class Test : IFooList, IFooMutableList {
    val arr = arrayListOf<String>()
    override fun foo():AL = TODO()
}

fun box(): String =TODO()
