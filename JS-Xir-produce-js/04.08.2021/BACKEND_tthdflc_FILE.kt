// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// FILE: tmp0.kt


fun box()  {
while (true)
do  while(break == {})
}

// STACKTRACE:
// java.lang.IllegalStateException: Variable name is not found tmp
// 	at org.jetbrains.kotlin.ir.backend.js.utils.JsGenerationContext.getNameForValueDeclaration(JsGenerationContext.kt:65)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitGetValue(IrElementToJsExpressionTransformer.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitGetValue(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrGetValueImpl.accept(IrGetValueImpl.kt:29)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCallArguments(jsAstUtils.kt:337)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.JsAstUtilsKt.translateCall(jsAstUtils.kt:109)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:222)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsExpressionTransformer.visitCall(IrElementToJsExpressionTransformer.kt:26)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitDoWhileLoop(IrElementToJsStatementTransformer.kt:179)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitDoWhileLoop(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl.accept(IrDoWhileLoopImpl.kt:32)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitBlock(IrElementToJsStatementTransformer.kt:38)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitBlock(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept(IrBlockImpl.kt:48)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitWhileLoop(IrElementToJsStatementTransformer.kt:171)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitWhileLoop(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrWhileLoopImpl.accept(IrWhileLoopImpl.kt:32)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitComposite(IrElementToJsStatementTransformer.kt:50)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitComposite(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl.accept(IrCompositeImpl.kt:42)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitDoWhileLoop(IrElementToJsStatementTransformer.kt:179)
// 	at org.jetbrains.kotlin.ir.backend.js.transformers.irToJs.IrElementToJsStatementTransformer.visitDoWhileLoop(IrElementToJsStatementTransformer.kt:20)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrDoWhileLoopImpl.accept(IrDoWhileLoopImpl.kt:32)
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