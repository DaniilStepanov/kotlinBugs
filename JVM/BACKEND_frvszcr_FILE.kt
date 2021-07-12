// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


interface I1
interface I3 
interface I : I1, I3
fun box()   = 
I::class.members.single { 
try {
it.name == 
""
}
finally {
{}
}
 }
