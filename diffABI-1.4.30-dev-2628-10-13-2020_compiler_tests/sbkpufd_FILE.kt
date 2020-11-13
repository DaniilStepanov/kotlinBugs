// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

interface A0 {
    val size: Int get() = 56
}

class B0 : Collection<String>, A0 {
    override fun isEmpty():Nothing = TODO()
    override fun contains(o: String):Nothing = TODO()
    override fun iterator():Nothing = TODO()
    override fun containsAll(c: Collection<String>):Nothing = TODO()
    override val size: Int
        get() = super.size
}

open class A1 {
    val size: Int = 56
}

class B1 : Collection<String>, A1() {
    override fun isEmpty():Nothing = TODO()
    override fun contains(o: String):Nothing = TODO()
    override fun iterator():Nothing = TODO()
    override fun containsAll(c: Collection<String>):Nothing = TODO()
}

interface I2 {
    val size: Int
}

val list = ArrayList<String>()

class B2 : ArrayList<String>(list), I2

interface I3<T> {
    val size: T
}

class B3 : ArrayList<String>(list), I3<Int>

interface I4<T> {
    val size: T get() = 56 as T
}

class B4 : Collection<String>, I4<Int> {
    override fun isEmpty():Nothing = TODO()
    override fun contains(o: String):Nothing = TODO()
    override fun iterator():Nothing = TODO()
    override fun containsAll(c: Collection<String>):Nothing = TODO()
    override val size: Int
        get() = super.size
}

interface I5 : Collection<String> {
    override val size: Int get() = 56
}

class B5 : I5 {
    override fun isEmpty():Nothing = TODO()
    override fun contains(o: String):Nothing = TODO()
    override fun iterator():Nothing = TODO()
    override fun containsAll(c: Collection<String>):Nothing = TODO()
}

fun box(): String =TODO()
