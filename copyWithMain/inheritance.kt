abstract class Father {
    abstract inner class InClass {
        abstract fun work()
    }
}

class Child : Father()

val Child.ChildInClass
    get() = object : Father.InClass() {
        override fun work() = TODO()
    }


fun main(args: Array<String>) { }