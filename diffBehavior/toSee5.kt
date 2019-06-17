// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JVM
// See KT-15971

interface Foo {
    fun foo(a: Double = 1.0!!): Double
}

interface FooChain: Foo

open class Impl {
    fun foo(a: Double) = a!!
}

class FooImpl : FooChain, Impl()



fun main(args: Array<String>) {
    FooImpl().foo()
}