// Bug happens on JVM 
// !LANGUAGE: +UseCorrectExecutionOrderForVarargArguments
// WITH_RUNTIME
// FILE: tmp0.kt


fun box()  {
    var acc1 = ""
acc1 +=
{ 
 try {}
finally {
 {}
}
 }
}
