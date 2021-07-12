// Bug happens on JVM 
// FILE: tmp0.kt


val FINALLY_CHAIN = ""
fun test1(): Any {
test2(TODO(),{  i->
return ""
})
}
inline fun test2( holder: Int,l: (s: Int) -> Int)   = 
    try {
        l(FINALLY_CHAIN.length)
        var externalResult:Any = TODO()
}
    finally {}

