// Bug happens on JVM 
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt


fun asSucceeds(block: Any = {} ):Int = TODO()
fun box()   =
asSucceeds { try {}
finally {
 ::fn1
} }
