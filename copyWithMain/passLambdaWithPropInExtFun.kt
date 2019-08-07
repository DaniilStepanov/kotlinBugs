open class C(s: () -> Unit)
class B(var x: Int)

fun B.foo() {
    object : C({ x }) {}
}


fun main(args: Array<String>) { }