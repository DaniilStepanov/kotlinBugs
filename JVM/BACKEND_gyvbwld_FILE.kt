// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


fun box()  {
TODO()
val i = (1 .. 1).iterator().next()
try {
{
++i
}
}
catch(Outer: NotImplementedError)
{}
}
