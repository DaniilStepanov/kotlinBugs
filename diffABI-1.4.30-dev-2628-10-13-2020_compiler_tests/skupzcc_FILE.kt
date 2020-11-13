// Bug happens on JVM , JVM -Xuse-ir
// WITH_REFLECT
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

import kotlin.reflect.KCallable
import kotlin.reflect.KType

@Target(AnnotationTarget.TYPE)
annotation class InRange(val from: Int, val to: Int)

val propertyType: @InRange(1, 10) Int = 5

fun functionType(): @InRange(1, 10) Int = TODO()

fun parameterType(param: @InRange(1, 10) Int):Unit =TODO()

fun (@InRange(1, 10) Int).receiverType():Unit =TODO()

abstract class Supertype : @InRange(1, 10) Number() {
    fun <T : @InRange(1, 10) Number> typeParameterBound(t: T): T = TODO()

    inner class Inner
}

fun typeArgument(): List<@InRange(1, 10) Int>? = TODO()


private fun check(what: String, type: KType):Unit =TODO()

fun box(): String =TODO()
