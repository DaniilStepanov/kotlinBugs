// Bug happens on JVM 
// FILE: tmp0.kt


fun inlineFun()   =
try {}
catch(e: Throwable){
{
try {
::ok
}
catch(e: NoWhenBranchMatchedException){}
}
}

