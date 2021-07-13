// Bug happens on JVM , JS -Xir-produce-js
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
val range0 = '1' until '3'
val range1 = '3' until '1'

val element0 = '0'
val element1 = '1'
val element2 = '2'
val element3 = '3'
val element4 = '4'

fun box(): String {
    testR0xE0()
    testR0xE1()
    testR0xE2()
    testR0xE3()
    testR0xE4()
    testR1xE0()
    testR1xE1()
    testR1xE2()
    testR1xE3()
    testR1xE4()
    return "OK"
}

fun testR0xE0() {
    // with possible local optimizations
    if ('0' in '1' until '3' != range0.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    if ('0' !in '1' until '3' != !range0.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    if (!('0' in '1' until '3') != !range0.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    if (!('0' !in '1' until '3') != range0.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element0 in '1' until '3' != range0.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
    if (element0 !in '1' until '3' != !range0.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element0 in '1' until '3') != !range0.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element0 !in '1' until '3') != range0.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR0xE1() {
    // with possible local optimizations
    if ('1' in '1' until '3' != range0.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    if ('1' !in '1' until '3' != !range0.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    if (!('1' in '1' until '3') != !range0.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    if (!('1' !in '1' until '3') != range0.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element1 in '1' until '3' != range0.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
    if (element1 !in '1' until '3' != !range0.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element1 in '1' until '3') != !range0.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element1 !in '1' until '3') != range0.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR0xE2() {
    // with possible local optimizations
    if ('2' in '1' until '3' != range0.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    if ('2' !in '1' until '3' != !range0.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    if (!('2' in '1' until '3') != !range0.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    if (!('2' !in '1' until '3') != range0.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element2 in '1' until '3' != range0.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
    if (element2 !in '1' until '3' != !range0.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element2 in '1' until '3') != !range0.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element2 !in '1' until '3') != range0.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR0xE3() {
    // with possible local optimizations
    if ('3' in '1' until '3' != range0.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    if ('3' !in '1' until '3' != !range0.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    if (!('3' in '1' until '3') != !range0.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    if (!('3' !in '1' until '3') != range0.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element3 in '1' until '3' != range0.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
    if (element3 !in '1' until '3' != !range0.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element3 in '1' until '3') != !range0.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element3 !in '1' until '3') != range0.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR0xE4() {
    // with possible local optimizations
    if ('4' in '1' until '3' != range0.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    if ('4' !in '1' until '3' != !range0.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    if (!('4' in '1' until '3') != !range0.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    if (!('4' !in '1' until '3') != range0.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element4 in '1' until '3' != range0.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
    if (element4 !in '1' until '3' != !range0.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element4 in '1' until '3') != !range0.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element4 !in '1' until '3') != range0.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR1xE0() {
    // with possible local optimizations
    if ('0' in '3' until '1' != range1.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    if ('0' !in '3' until '1' != !range1.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    if (!('0' in '3' until '1') != !range1.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    if (!('0' !in '3' until '1') != range1.contains('0')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element0 in '3' until '1' != range1.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
    if (element0 !in '3' until '1' != !range1.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element0 in '3' until '1') != !range1.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element0 !in '3' until '1') != range1.contains(element0)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR1xE1() {
    // with possible local optimizations
    if ('1' in '3' until '1' != range1.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    if ('1' !in '3' until '1' != !range1.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    if (!('1' in '3' until '1') != !range1.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    if (!('1' !in '3' until '1') != range1.contains('1')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element1 in '3' until '1' != range1.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
    if (element1 !in '3' until '1' != !range1.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element1 in '3' until '1') != !range1.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element1 !in '3' until '1') != range1.contains(element1)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR1xE2() {
    // with possible local optimizations
    if ('2' in '3' until '1' != range1.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    if ('2' !in '3' until '1' != !range1.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    if (!('2' in '3' until '1') != !range1.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    if (!('2' !in '3' until '1') != range1.contains('2')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element2 in '3' until '1' != range1.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
    if (element2 !in '3' until '1' != !range1.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element2 in '3' until '1') != !range1.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element2 !in '3' until '1') != range1.contains(element2)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR1xE3() {
    // with possible local optimizations
    if ('3' in '3' until '1' != range1.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    if ('3' !in '3' until '1' != !range1.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    if (!('3' in '3' until '1') != !range1.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    if (!('3' !in '3' until '1') != range1.contains('3')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element3 in '3' until '1' != range1.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
    if (element3 !in '3' until '1' != !range1.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element3 in '3' until '1') != !range1.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element3 !in '3' until '1') != range1.contains(element3)) {
println("""THEN""");
throw AssertionError()
}
}

fun testR1xE4() {
    // with possible local optimizations
    if ('4' in '3' until '1' != range1.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    if ('4' !in '3' until '1' != !range1.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    if (!('4' in '3' until '1') != !range1.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    if (!('4' !in '3' until '1') != range1.contains('4')) {
println("""THEN""");
throw AssertionError()
}
    // no local optimizations
    if (element4 in '3' until '1' != range1.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
    if (element4 !in '3' until '1' != !range1.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element4 in '3' until '1') != !range1.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
    if (!(element4 !in '3' until '1') != range1.contains(element4)) {
println("""THEN""");
throw AssertionError()
}
}

fun fu0(a: String, b: String): String {
    return (element0).compareTo(element2).toString(13) + b;
}

fun box396(): String {
    var prope0 = "";
    val prope1 = fu0(b = {prope0 += "K"; "K"}(), a = {prope0+="O"; "O"}())

    if ((element0).uppercase() != "KO" || (element1).toInt().toString(-37) != "OK") {
println("""THEN""");
return "fail: $prope0 != KO or $prope1 != OK"
}

    return "OK"
}


