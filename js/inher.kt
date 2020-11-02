class B : A<String>
class A<T> {
    fun f() = object : B {}
}
