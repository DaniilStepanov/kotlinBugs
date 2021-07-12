// Bug happens on JVM 
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*
interface A<T> {
    var x: T
}

class B() : A<String>

fun box(): String {
    val a: A<String> = B()
    try {
a
}

finally {
 "OK"
}.x = "OK"
    try {
return 
 B()

}

finally {
 try {
try {
String
}
catch(e: RuntimeException){
try {
return try {
a.x
}

finally {
 try {
try {
String
}

finally {
 String
}
}
catch(e: Exception){
try {
a.x
}
catch(e: ConcurrentModificationException){
try {
return try {
a.x
}

finally {
 try {
try {
String
}

finally {
 String
}
}
catch(e: Exception){
a.x
}
finally {
 try {
return try {
a.x
}

finally {
 try {
String
}

finally {
 B("Fail")
}
}
}
catch(e: NullPointerException){
{
 B("Fail")
}
}
}
}
}
catch(e: NoSuchElementException){
try {
return try {
a.x
}

finally {
 try {
try {
String
}

finally {
 B("Fail")
}
}

finally {
 B("Fail")
}
}
}
catch(e: NullPointerException){
{
 B("Fail")
}
}
}
}
catch(e: KotlinReflectionNotSupportedError){
return try {
a.x
}

finally {
 try {
try {
String
}

finally {
 B("Fail")
}
}

finally {
 B()
}
}
}
}
finally {
 try {
return try {
a.x
}

finally {
 try {
try {
String
}
catch(e: FileSystemException){
{
 B("Fail")
}
}
catch(e: MissingFormatWidthException){
B()
}
}

finally {
 B()
}
}
}
catch(e: NullPointerException){
{
 B()
}
}
}
}
}
catch(e: NoSuchElementException){

{
 B()
}

}
}
}

finally {
 String
}
}
}
