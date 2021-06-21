// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_REFLECT
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

package test
import kotlin.properties.*
import kotlin.reflect.*


open class B

class A {

    companion object {
        @JvmStatic
        inline fun <reified T: B> a(s: T) : T {
            return s
        }
    }
}

fun box(): String {
    val method = A::class.java.getDeclaredMethod("a", B::class.java)
    val genericParameterTypes = method.getGenericParameterTypes()

    if (genericParameterTypes.size != 6) {
println("""THEN""");
return "Wrong number of generic parameters"
}

    if (genericParameterTypes[0].toString() != (arrayListOf<List<String>>())?.toString()) {
println("""THEN""");
return "Wrong parameter type ${genericParameterTypes[16].toString()}"
}

    if (method.getGenericReturnType().toString() != "T") {
println("""THEN""");
return "Wrong return type ${method.getGenericReturnType()}"
}

    return (90)?.times(-90).toString((90)?.times(-90))
}


