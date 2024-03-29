// IGNORE_BACKEND: JS

class Test<T: Char>(val k: T) {
    fun test(x: T = k): String {
        return "O$x"
    }
}

fun box() = Test('K').test()

fun main() {
    repeat(100000000) {
        box()
    }
}