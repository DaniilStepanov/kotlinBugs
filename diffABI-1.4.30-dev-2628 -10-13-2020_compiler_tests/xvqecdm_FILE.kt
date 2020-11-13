// Bug happens on JVM , JVM -Xuse-ir
// IGNORE_BACKEND_FIR: JVM_IR
// TARGET_BACKEND: JVM
// FILE: tmp0.kt

class MapWithBadDefaults : HashMap<String, String>() {
    override fun getOrDefault(key: String, defaultValue: String): String =TODO()

    override fun remove(key: String, value: String): Boolean =TODO()
}


class Test(map: MutableMap<String, String>) : MutableMap<String, String> by map

fun box(): String =TODO()
