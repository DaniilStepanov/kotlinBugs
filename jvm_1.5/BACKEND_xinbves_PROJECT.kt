// Bug happens on JVM 
// TARGET_BACKEND: JVM
// FILE: CompanionInitialization.java

public class CompanionInitialization {

    public static Object getCompanion() {
        return ConcreteWithStatic.Companion;
    }

}
// FILE: CompanionInitialization.kt


import kotlin.reflect.*
fun <T : Comparable<T>> foo()  = 
    typeOf<List<T>>()

