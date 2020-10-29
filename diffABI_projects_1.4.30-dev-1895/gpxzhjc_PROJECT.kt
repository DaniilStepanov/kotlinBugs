// Bug happens on JVM , JVM -Xuse-ir
// !LANGUAGE: -ReleaseCoroutines
// WITH_COROUTINES
// WITH_RUNTIME
// IGNORE_BACKEND: JVM_IR
// TARGET_BACKEND: JVM
// FILE: lib.kt

interface I {}

suspend inline fun foo() = object : I {}
