// Bug happens on JVM -Xuse-ir
// FILE: tmp.kt

interface A {
    fun foo
interface B : A
interface C
{
fun foo = Impl(
.foo
interface D : B, C
class Impl : D

