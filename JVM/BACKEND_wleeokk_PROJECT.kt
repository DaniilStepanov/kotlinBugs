// Bug happens on JVM 
// TARGET_BACKEND: JVM
// SAM_CONVERSIONS: INDY
// FILE: adaptedFunRefWithVararg.kt


data class Foo(val String: Int ){
fun   Int
.hashCode(): Int = TODO()
}

// FILE: Sam.java

public interface Sam {
    void foo(String s);
}
