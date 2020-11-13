// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

open class A0<E> : MutableList<E> {
    override fun add(element: E): Boolean =TODO()

    override fun add(index: Int, element: E):Unit =TODO()

    override fun addAll(index: Int, elements: Collection<E>): Boolean =TODO()

    override fun addAll(elements: Collection<E>): Boolean =TODO()

    override fun clear():Unit =TODO()

    override fun listIterator(): MutableListIterator<E> =TODO()

    override fun listIterator(index: Int): MutableListIterator<E> =TODO()

    override fun remove(element: E): Boolean =TODO()

    override fun removeAll(elements: Collection<E>): Boolean =TODO()

    override fun removeAt(index: Int): E = TODO()

    override fun retainAll(elements: Collection<E>): Boolean =TODO()

    override fun set(index: Int, element: E): E =TODO()

    override fun subList(fromIndex: Int, toIndex: Int): MutableList<E> =TODO()

    override val size: Int
        get() = throw UnsupportedOperationException()

    override fun contains(element: E): Boolean =TODO()

    override fun containsAll(elements: Collection<E>): Boolean =TODO()

    override fun get(index: Int): E =TODO()

    override fun indexOf(element: E): Int =TODO()

    override fun isEmpty(): Boolean =TODO()

    override fun lastIndexOf(element: E): Int =TODO()

    override fun iterator(): MutableIterator<E> =TODO()
}

class A1() : A0<String>() {
    override fun removeAt(p0: Int): String = TODO()
}

class A2 : A0<String>()

fun box(): String =TODO()
