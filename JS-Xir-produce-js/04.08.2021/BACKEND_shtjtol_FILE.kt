// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// WITH_REFLECT
// TARGET_BACKEND: JS
// !USE_EXPERIMENTAL: kotlin.ExperimentalStdlibApi
// FILE: tmp0.kt

package test
import kotlin.reflect.*
class C
fun check( ):Int = TODO()
fun box()  {
    {TODO()}
    {TODO()}
    {TODO()}
    {TODO()}
{TODO()}
    {TODO()}
{TODO()}
    {TODO()}
    {TODO()}
    {TODO()}
{TODO()}
    {TODO()}
    {TODO()}
    typeOf<suspend () -> Int>()
TODO()
    TODO()
    TODO()
}

// STACKTRACE:
// java.lang.IllegalStateException: Can't find name for declaration CLASS FUNCTION_INTERFACE_CLASS INTERFACE name:SuspendFunction0 modality:ABSTRACT visibility:public superTypes:[kotlin.Function<R of kotlin.coroutines.SuspendFunction0>]
// 	at org.jetbrains.kotlin.ir.backend.js.utils.NameTables.getNameForStaticDeclaration(NameTables.kt:267)
// 	at org.jetbrains.kotlin.ir.backend.js.utils.IrNamerImpl.getNameForStaticDeclaration(IrNamerImpl.kt:19)
// 	at org.jetbrains.kotlin.ir.backend.js.utils.IrNamerBase.getNameForClass(IrNamer.kt:48)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.EmptyCrossModuleReferenceInfo$withReferenceTracking$1.getNameForClass(MultiModuleSupport.kt)
// 	at org.jetbrains.kotlin.ir.backend.js.utils.JsStaticContext.getNameForClass(JsStaticContext.kt)
// 	at org.jetbrains.kotlin.ir.backend.js.utils.JsGenerationContext.getNameForClass(JsGenerationContext.kt)
// 	at org.jetbrains.kotlin.ir.backend.js.utils.IrTypeUtilsKt.getClassRef(IrTypeUtils.kt:91)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsIntrinsicTransformers$1$2.invoke(JsIntrinsicTransformers.kt:96)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsIntrinsicTransformers$1$2.invoke(JsIntrinsicTransformers.kt:94)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:104)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitVararg(IrElementToJsExpressionTransformer.kt:43)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitVararg(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl.accept(IrVarargImpl.kt:53)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsIntrinsicTransformersKt.translateCallArguments(JsIntrinsicTransformers.kt:236)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsIntrinsicTransformersKt.access$translateCallArguments(JsIntrinsicTransformers.kt:1)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsIntrinsicTransformers$1$14.invoke(JsIntrinsicTransformers.kt:161)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsIntrinsicTransformers$1$14.invoke(JsIntrinsicTransformers.kt:160)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:104)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitCall(IrElementToJsStatementTransformer.kt:140)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitCall(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitBlockBody(IrElementToJsStatementTransformer.kt:30)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitBlockBody(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBody.kt:54)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateFunction(jsAstUtils.kt:67)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrFunctionToJsTransformer.visitSimpleFunction(IrFunctionToJsTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrFunctionToJsTransformer.visitSimpleFunction(IrFunctionToJsTransformer.kt:14)
// 	at org.jetbrains.kotlin.ir.declarations.IrSimpleFunction.accept(IrSimpleFunction.kt:28)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrDeclarationToJsTransformer.visitSimpleFunction(IrDeclarationToJsTransformer.kt:17)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrDeclarationToJsTransformer.visitSimpleFunction(IrDeclarationToJsTransformer.kt:12)
// 	at org.jetbrains.kotlin.ir.declarations.IrSimpleFunction.accept(IrSimpleFunction.kt:28)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrFileToJsTransformer.visitFile(IrFileToJsTransformer.kt:19)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrFileToJsTransformer.visitFile(IrFileToJsTransformer.kt:13)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.accept(IrFileImpl.kt:81)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrModuleToJsTransformer.generateModuleBody(IrModuleToJsTransformer.kt:302)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrModuleToJsTransformer.generateWrappedModuleBody2(IrModuleToJsTransformer.kt:157)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrModuleToJsTransformer.generateWrappedModuleBody(IrModuleToJsTransformer.kt:117)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrModuleToJsTransformer.generateModule(IrModuleToJsTransformer.kt:69)
// 	at org.jetbrains.kotlin.ir.backend.js.CompilerKt.compile(compiler.kt:148)
// 	at org.jetbrains.kotlin.ir.backend.js.CompilerKt.compile$default(compiler.kt:39)
// 	at org.jetbrains.kotlin.cli.js.K2JsIrCompiler.doExecute(K2JsIrCompiler.kt:246)
// 	at org.jetbrains.kotlin.cli.js.K2JSCompiler.doExecute(K2JSCompiler.java:182)
// 	at org.jetbrains.kotlin.cli.js.K2JSCompiler.doExecute(K2JSCompiler.java:75)
// 	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:92)
// 	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:44)
// 	at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:98)
// 	at com.stepanov.bbf.bugfinder.executor.compilers.JSCompiler.executeCompiler$lambda-1(JSCompiler.kt:87)
// 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
// 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
// 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
// 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
// 	at java.base/java.lang.Thread.run(Thread.java:829)
// 