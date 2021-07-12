// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


fun <Ty0> fu0(command: Ty0) : Int = TODO()
inline fun <Ty1> fu1(action: () -> Ty1)  = action()
fun fu1(): Any {
    fu0 {
        try {
try {
fu1 {
return@fu0
}
}
finally {
return@fu0
}
}
finally {}
    }
return ""
}

