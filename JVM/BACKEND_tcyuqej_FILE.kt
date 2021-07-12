// Bug happens on JVM 
// IGNORE_BACKEND: JVM_IR
// FILE: tmp0.kt


fun box1()   =
try {}
catch(e: Int){}<Int>::foo

