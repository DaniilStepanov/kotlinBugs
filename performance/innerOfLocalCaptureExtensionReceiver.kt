fun String.bar(): String {
    open class Local {
        fun result() = this@bar
    }

    class Outer {
        inner class Inner : Local() {
            fun outer() = this@Outer
        }
    }

    return Outer().Inner().result()
}

fun box() = "OK".bar()

fun main() {
    repeat(1000000000) {
        box()
    }
}