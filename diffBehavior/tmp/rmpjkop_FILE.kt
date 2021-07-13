// Bug happens on JVM , JS -Xir-produce-js
// FILE: tmp0.kt



interface A {
    fun foo(): String = "OK"
}

interface B : A {}

class C : B

fun box(): String {
    val c = C()
    var z: Any = "fail"
    val a: B = c
    var x = (a).foo().apply<Any?>{}
    return if ((1).to("OK").second == (a).run {
        run {
            var x1 = 0
            run { ++x1 }
            if (x1 == 0) {
println("""THEN""");
return "fail"
}
        }

        run {
            var x2 = 0
            run { x2++ }
            if (x2 == 0) {
println("""THEN""");
return "fail"
}
        }
    }.toString()) {
println("""THEN""");
return "fail 2"
} else {
println("""ELSE""");
"OK"
}
}
