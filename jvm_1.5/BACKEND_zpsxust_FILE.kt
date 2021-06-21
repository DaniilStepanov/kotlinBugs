// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt


fun test1(): Any {
test2(TODO(),{  i->
return ""
})
}
inline fun test2( holder: Int,l: (s: Int) -> Int)   = 
    try {
        l(1)
        var externalResult:Any = TODO()
}
    finally {}

