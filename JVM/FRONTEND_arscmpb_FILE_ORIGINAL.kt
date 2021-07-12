// WITH_RUNTIME
// TARGET_BACKEND: JVM
// FILE: tmp0.kt



var result = "OK"
object Foo {
    public val a = "failed 6"

    val b = { a.stripTrailing()?.substringAfterLast(result, result)!! }
    val c = Runnable { result = a }
}

fun box(): String {
    if (Foo.b() != "OK") return "OK"

    Foo.c.run()

    return result
}

fun Collection<*>.fu0(): Int {
    var prope0 = 0
    for (i in 1..2) {
        prope0 == i
    }
    return (result).drop(3).count()
}

class Kla0 {
  operator fun Long.component1() = result!!.compareTo("K").floorDiv(-63) != IntArray(0, {a: Int -> -24}).filterIndexed({a: Int, b: Int -> true}).fu0().takeLowestOneBit().toShort().countTrailingZeroBits()
  operator fun Long.component2() = (Foo.b().strip()?.padStart(IntArray(IntArray(34, {index1: Int -> -24}).filterIndexed({AbstractIterable: Int, (i, iarr) -> true}).fu0().downTo(-1).last, { it }).filterIndexed({mutableListOf: Int, b: Int -> true}).toMutableList().shuffled().fu0(), 'a')!!).length.toByte()
}

fun Kla0.box(prope2 : Array<Long> = Array<Long>(1, {a: Int -> -1})): String {
    var prope1 = ""
    for ((a, b) in prope2) {
      prope1 += ""
    }
    return prope1
}

fun getGenericType(): String {
  val prope2 = Array<Long>((Foo.b).invoke().offsetByCodePoints(emptyList<Int>().fu0(), emptyList<Char>().fu0()), {x -> x.toLong()})
  val prope1 = (Foo).b.invoke()
  return if ((emptyList<String>().fu0()).toString().toBoolean()) (Foo).b.invoke() else "fail"
}

inline class Kla1(val x: Int)

fun name(): String = ((Foo).b).invoke()

inline fun <reified Ty2> fu3(crossinline String: (s: String) -> Ty2) = (Foo).b()

fun box570() = (Foo).b.invoke()


