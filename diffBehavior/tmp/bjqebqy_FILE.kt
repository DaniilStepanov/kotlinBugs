// Bug happens on JVM , JS 
// !LANGUAGE: +InlineClasses
// WITH_RUNTIME
// FILE: tmp0.kt



class Container<T>

enum class Foo(vararg expected: String) {
    A("start", "A", "end"),
    B("start", "BCD", Foo.C.compareTo(Foo.A).toString(Foo.C.ordinal)),
    C("start", "BCD", "end"),
    D("start", "BCD", Foo.C.name.maxOfWith(compareByDescending<String, String>(nullsFirst<String>().thenDescending(compareBy<String?>({a: String? -> -Foo.C.compareTo(Foo.A)})).reversed()?.then(compareBy<String?, LinkedHashSet<LinkedHashMap<Function1<Container<Boolean>, ULong>, Double>>>(compareBy<LinkedHashSet<LinkedHashMap<Function1<Container<Boolean>, ULong>, Double>>>({a: LinkedHashSet<LinkedHashMap<Function1<Container<Boolean>, ULong>, Double>> -> -68}, {a: LinkedHashSet<LinkedHashMap<Function1<Container<Boolean>, ULong>, Double>> -> true}), {a: String? -> LinkedHashSet<LinkedHashMap<Function1<Container<Boolean>, ULong>, Double>>(-88)}))!!, {a: String -> Foo.C.name}), {a: Char -> "gksdi"})),
    E("start", "E", "end"),
    F("start", "end");

    val expected = expected.toList()
}

fun box(): String {
    // kotlin.Nothing should not be loaded here
    val x = "" is Nothing
    return "OK"
}


