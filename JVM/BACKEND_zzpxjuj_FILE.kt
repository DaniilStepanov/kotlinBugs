// Bug happens on JVM 
// FILE: tmp.kt


 inline fun Int.times2(body : () -> Any)  =
(body).equals("").compareTo(TODO())
fun test1() = 1.times2 {}

