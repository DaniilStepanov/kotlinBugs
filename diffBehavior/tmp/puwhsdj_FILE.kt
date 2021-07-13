// Bug happens on JVM , JS 
// IGNORE_BACKEND: JVM
// FILE: tmp0.kt

class A(val z: String) {
    fun map(s: String) = z + s
fun  pdvag(a: A?, b: A): HashMap<Char, Float> = TODO()
tailrec internal  fun  byrtn(a: String): Sequence<UShort?> = TODO()
internal  fun <T, S: NoSuchElementException>  qswvb(a: Float, b: A, c: ArrayDeque<Sequence<ArrayList<Long>>>): Boolean = TODO()
private var evrk: Boolean  = false
get() = false
private set
suspend public  fun <T: AbstractCollection<Long>, S>  jmzbk(a: S, b: T, c: A?): A = TODO()
internal  fun   Function2<Triple<Char, A, A?>, String, MutableMap<A, A>>.tfljl(a: Function2<A, A, ULong>, b: Char): Byte = TODO()
suspend protected  fun  nplda(a: Boolean, b: A): UByte? = TODO()
private val jsqt: A  
get() = A("hwtfw")
inline  private  fun <reified T>   Short.ddcxb(a: HashSet<Byte>, b: List<HashMap<Double?, A>>, c: A, d: A): Double = TODO()
public var cana: Short?  = 73
get() = 73
private set
internal var fcgf: A?  = A("cvbvs")
get() = A("cvbvs")
private set
val A.rmlh: A  
get() =  A("rtedk")
internal var oeyy: ULong?  
get() = TODO()
set(value) = TODO()
infix protected  fun <T, S>   Triple<Boolean, Byte, String>.rcsht(a: S): ULong? = TODO()
internal val fhxi: UInt  
get() = TODO()
internal  fun  lzjau(a: Short?, b: A, c: Function2<LinkedHashSet<Byte?>, Collection<A>, List<A?>>, d: A): Map<ULong, UByte> = TODO()
public var nttj: Boolean  
get() = TODO()
set(value) = TODO()
override fun toString(): String{
var res = ""
res += z.toString()
res += evrk.toString()
res += jsqt.toString()
res += cana.toString()
res += fcgf.toString()
res += oeyy.toString()
res += fhxi.toString()
res += nttj.toString()
return res
}}

fun test(foo: Int) = "${foo}bar"

fun boxToNullableInterface(): String {
    if (Char.MAX_VALUE in Char.MAX_VALUE until Char.MAX_VALUE) {
println("""THEN""");
return "Fail in Char.MAX_VALUE"
}
    if (!(Char.MAX_VALUE !in Char.MAX_VALUE until Char.MAX_VALUE)) {
println("""THEN""");
return "Fail !in Char.MAX_VALUE"
}

    try{
println("""TRY""");

if (Int.MAX_VALUE in Int.MAX_VALUE until Int.MAX_VALUE) {
println("""THEN""");
return "Fail in Int.MAX_VALUE"
}
}
catch(e: Error){
println("""CATCH e: Error""");

Char
}
    if (!(try{
println("""TRY""");

Int.MAX_VALUE !in Int.MAX_VALUE until Int.MAX_VALUE
}

finally{
println("""FINALLY""");

 UInt.MAX_VALUE until try {
UInt.MAX_VALUE
}

finally {
 String
}
})) {
println("""THEN""");
return "Fail !in Int.MAX_VALUE"
}

    if (Long.MAX_VALUE in Long.MAX_VALUE until Long.MAX_VALUE) {
println("""THEN""");
return "Fail in Long.MAX_VALUE"
}
    if (!(Long.MAX_VALUE !in Long.MAX_VALUE until try{
println("""TRY""");

Long
}

finally{
println("""FINALLY""");

 Long
}.MAX_VALUE)) {
println("""THEN""");
return "Fail !in Long.MAX_VALUE"
}

    if (UInt.MAX_VALUE in UInt.MAX_VALUE until try{
println("""TRY""");

UInt.MAX_VALUE
}

finally{
println("""FINALLY""");

 String
}) {
println("""THEN""");
return "Fail in UInt.MAX_VALUE"
}
    if (!(UInt.MAX_VALUE !in UInt.MAX_VALUE until UInt.MAX_VALUE)) {
println("""THEN""");
return "Fail !in UInt.MAX_VALUE"
}

    if (ULong.MAX_VALUE in ULong.MAX_VALUE until ULong.MAX_VALUE) {
println("""THEN""");
return "Fail in ULong.MAX_VALUE"
}
    if (!(ULong.MAX_VALUE !in ULong.MAX_VALUE until ULong.MAX_VALUE)) {
println("""THEN""");
return "Fail !in ULong.MAX_VALUE"
}

    return "OK"
}
