// Bug happens on JVM 
// FILE: tmp0.kt


fun inlineFun()   =
try {}
catch(e: IllegalArgumentException){
{
try {
::ok
}
catch(e: NoWhenBranchMatchedException){}
}
}
.to{}.second

