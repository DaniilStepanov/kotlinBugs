// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// WITH_RUNTIME
// IGNORE_BACKEND: WASM
// FILE: tmp0.kt

import kotlin.coroutines.*
fun launch(block: suspend (Int) -> Int)   =
block.startCoroutine( TODO(),Continuation(EmptyCoroutineContext) { try {}
finally { ::foo1 } })


// STACKTRACE:
// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (13,11) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.NullPointerException was thrown at: org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference(ReflectionReferencesGenerator.kt:68)
// null: KtCallableReferenceExpression:
// ::foo2
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
// Caused by: java.lang.NullPointerException
// 	at org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference(ReflectionReferencesGenerator.kt:68)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallableReferenceExpression(StatementGenerator.kt:501)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallableReferenceExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtCallableReferenceExpression.accept(KtCallableReferenceExpression.java:43)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:182)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genExpr(StatementGenerator.kt:508)
// 	at org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch(TryCatchExpressionGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTryExpression(StatementGenerator.kt:476)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTryExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtTryExpression.accept(KtTryExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genExpr(StatementGenerator.kt:508)
// 	at org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateAsPrimitiveNumericComparisonOperand(OperatorExpressionGenerator.kt:310)
// 	at org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateEqualityOperator(OperatorExpressionGenerator.kt:331)
// 	at org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression(OperatorExpressionGenerator.kt:141)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBinaryExpression(StatementGenerator.kt:440)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBinaryExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtBinaryExpression.accept(KtBinaryExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody(BodyGenerator.kt:100)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateLambdaFunctionDeclaration(FunctionGenerator.kt:59)
// 	at org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator.generateLambda(LocalFunctionGenerator.kt:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:479)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
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
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.generateValueArgumentUsing(ArgumentsGenerationUtils.kt:301)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateValueArgumentsUsing(ArgumentsGenerationUtils.kt:690)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCallUsing(ArgumentsGenerationUtils.kt:448)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCall(ArgumentsGenerationUtils.kt:438)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:364)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDotQualifiedExpression(StatementGenerator.kt:382)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDotQualifiedExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtDotQualifiedExpression.accept(KtDotQualifiedExpression.kt:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements(StatementGenerator.kt:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 20 more
// 