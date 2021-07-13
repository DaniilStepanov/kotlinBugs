// Bug happens on JVM , JS 
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
inline fun test(s: ()->Int){
    var i = 0;
    i = (s).invoke().xor(i)
    try{
println("""TRY""");

        i = i + 10
} finally{
println("""FINALLY""");

        (s).invoke().absoluteValue
}
}

fun box() : String {
    var p: Int = 1
    test {
        try{
println("""TRY""");

            p = (p).compareTo(61).countOneBits()
            return "OK" //finally from inline fun doen't split this try
} catch(e: Exception){
println("""CATCH e: Exception""");

            p = -(p).hashCode();
            p
} finally{
println("""FINALLY""");

            (p).toByte().floorDiv(13)
}

    }
    return (p).hashCode().toString(p)
}
