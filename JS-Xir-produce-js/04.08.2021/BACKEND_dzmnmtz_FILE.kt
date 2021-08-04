// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR
// IGNORE_BACKEND: JS_IR_ES6
// IGNORE_BACKEND: JS, NATIVE
// FILE: tmp0.kt


open class Foo<T, U : Any>(lambda: Any
 )
class BarT : Foo<Int, Int>({ try {}
finally { ::foo1 } })


// STACKTRACE:
// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (22,11) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
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
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateSuperConstructorCall(BodyGenerator.kt:242)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generatePrimaryConstructorBody(BodyGenerator.kt:181)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generatePrimaryConstructor(FunctionGenerator.kt:231)
// 	at org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generatePrimaryConstructor(ClassGenerator.kt:455)
// 	at org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass(ClassGenerator.kt:112)
// 	at org.jetbrains.kotlin.psi2ir.generators.ClassGenerator.generateClass$default(ClassGenerator.kt:84)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateClassOrObjectDeclaration(DeclarationGenerator.kt:104)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:53)
// 	... 20 more
// 