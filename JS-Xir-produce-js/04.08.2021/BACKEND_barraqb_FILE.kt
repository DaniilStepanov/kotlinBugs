// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// FILE: tmp0.kt


class Del<T>(var x: T) {
    operator fun getValue( thisRef: Any?,kProp: Any) = x
operator fun setValue( thisRef: Any?,kProp: Any,value: Int ):Int = TODO()
}
fun box()  {
for (o in "") {
var xs by Del(continue)
}
}

// STACKTRACE:
// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (30,33) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.RuntimeException was thrown at: org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue(LoopExpressionGenerator.kt:107)
// Loop not found for continue expression: continue: KtContinueExpression:
// continue
// 	at org.jetbrains.kotlin.backend.common.CodegenUtil.reportBackendException(CodegenUtil.kt:239)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:75)
// 	at org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile(ModuleGenerator.kt:67)
// 	at org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragment(ModuleGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment(Psi2IrTranslator.kt:78)
// 	at org.jetbrains.kotlin.ir.backend.js.KlibKt.generateModuleFragmentWithPlugins(klib.kt:395)
// 	at org.jetbrains.kotlin.ir.backend.js.KlibKt.generateModuleFragmentWithPlugins$default(klib.kt:364)
// 	at org.jetbrains.kotlin.ir.backend.js.KlibKt.loadIr(klib.kt:286)
// 	at org.jetbrains.kotlin.ir.backend.js.CompilerKt.compile(compiler.kt:66)
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
// Caused by: java.lang.RuntimeException: Loop not found for continue expression: continue
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateContinue(LoopExpressionGenerator.kt:107)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitContinueExpression(StatementGenerator.kt:473)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitContinueExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtContinueExpression.accept(KtContinueExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.generateVarargExpressionUsing(ArgumentsGenerationUtils.kt:256)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.generateValueArgumentUsing(ArgumentsGenerationUtils.kt:306)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateValueArgumentsUsing(ArgumentsGenerationUtils.kt:690)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCallUsing(ArgumentsGenerationUtils.kt:448)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCall(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:364)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.generateValueArgumentUsing(ArgumentsGenerationUtils.kt:301)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateValueArgumentsUsing(ArgumentsGenerationUtils.kt:690)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCallUsing(ArgumentsGenerationUtils.kt:448)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCall(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:364)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateInitializerForLocalDelegatedPropertyDelegate(DelegatedPropertyGenerator.kt:330)
// 	at org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegateVariableForLocalDelegatedProperty(DelegatedPropertyGenerator.kt:303)
// 	at org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateLocalDelegatedProperty(DelegatedPropertyGenerator.kt:253)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateLocalDelegatedProperty(StatementGenerator.kt:130)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty(StatementGenerator.kt:109)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtProperty.accept(KtProperty.java:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:182)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genExpr(StatementGenerator.kt:508)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop(LoopExpressionGenerator.kt:213)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression(StatementGenerator.kt:467)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtForExpression.accept(KtForExpression.java:33)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:182)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genExpr(StatementGenerator.kt:508)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop(LoopExpressionGenerator.kt:213)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression(StatementGenerator.kt:467)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtForExpression.accept(KtForExpression.java:33)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody(LoopExpressionGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop(LoopExpressionGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:461)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtWhileExpression.accept(KtWhileExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody(LoopExpressionGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop(LoopExpressionGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:461)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtWhileExpression.accept(KtWhileExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody(LoopExpressionGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop(LoopExpressionGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:461)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtWhileExpression.accept(KtWhileExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody(LoopExpressionGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop(LoopExpressionGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:461)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtWhileExpression.accept(KtWhileExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody(LoopExpressionGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop(LoopExpressionGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:461)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtWhileExpression.accept(KtWhileExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements(StatementGenerator.kt:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 20 more
// 