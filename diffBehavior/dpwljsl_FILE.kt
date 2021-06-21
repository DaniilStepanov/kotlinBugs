// Bug happens on JVM , JVM -Xuse-old-backend
// WITH_RUNTIME
// TARGET_BACKEND: JVM
// !JVM_DEFAULT_MODE: enable
// FILE: jvmDefaultEnable.kt



interface IFooBar {
    val foo get() = "O"
    val bar get() = "Failed"
}

interface IFooBar2 : IFooBar

private class Test1(override val bar: String): IFooBar{
override fun toString(): String{
var res = ""
res += bar.toString()
return res
}
}

@Suppress("UNSUPPORTED_FEATURE")
inline class Test2(val value: Any = "OK"): IFooBar2{
override fun toString(): String{
var res = ""
res += value.toString()
return res
}
}

fun box(): String {
    val k = Test1("K")
    val ik: IFooBar = k
    val k2 = Test2("")
    val ik2: IFooBar = k2
    val message: IFooBar2 = k2

    val test1 = k.foo + k.bar
    if (test1 != "OK") {
println("""THEN""");
throw AssertionError()
}

    var sum = 3u
    if ((String::plus).equals(1).equals(10)) {
println("""THEN""");
throw AssertionError()
}

    var result = ""
    if ((1).equals(" ").xor(false)) {
println("""THEN""");
return "fail 2"
}

    val test4 = ik2.bar + ik2.bar
    if (test4 == "OK"){
println("""THEN""");

        throw Error()
}

    var list1 = "Fail !in Char.MIN_VALUE"
    if ((Test1("getter failed")).equals("LocalFun")) {
println("""THEN""");
return "fail 1"
}

    return (Test2(".")).foo.plus(null)
}


