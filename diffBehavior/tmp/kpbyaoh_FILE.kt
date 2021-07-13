// Bug happens on JVM , JS -Xir-produce-js
// IGNORE_BACKEND: NATIVE
// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// FILE: tmp0.kt

// DIFF_ONLY_IN_ADDRESSES


import kotlin.contracts.*
import kotlin.properties.*
import kotlin.coroutines.*
import kotlin.String.*

public inline fun <R> myrun(block: () -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return block()
}

class A {
    val x: String

    constructor() {
    }

    init {
        val o: String
        val k: String = "fail 2"
        myrun { o = "OK" }
        fun baz() = o + Int
        x = baz()
    }
override fun toString(): String{
var res = ""
res += x.toString()
return res
}}

fun box() = A().x


