// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt

import kotlin.UninitializedPropertyAccessException
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun box(): String {
    lateinit var str: String
    var str2: String = ""
    try{
println("""TRY""");

        str2 = (str2).padStart(-23, 'ꄍ').substring(57, 44)
        return "Should throw an exception"
}
    catch (e: UninitializedPropertyAccessException){
println("""CATCH e: UninitializedPropertyAccessException""");

        return "OK"
}
    catch (e: Throwable){
println("""CATCH e: Throwable""");

        return "Unexpected exception: ${e::class}"
}
}
