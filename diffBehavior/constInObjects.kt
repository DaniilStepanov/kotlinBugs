// !LANGUAGE: -InlineConstVals
// IGNORE_BACKEND: JVM_IR, JS_IR, NATIVE
// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS

object A {
    const val a = "1"
    const val b = "$!"
}

object B {
    const val a = "1"
    const val b = "$!"
}


fun main(args: Array<String>) {
    println(A.a === B.a)
    println(A.b === B.b)
}