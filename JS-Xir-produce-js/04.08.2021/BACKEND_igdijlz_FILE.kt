// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// FILE: tmp0.kt


val ref = try {}
finally {}<Int>::invoke


// STACKTRACE:
// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (10,15) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.NullPointerException was thrown at: org.jetbrains.kotlin.psi2ir.generators.ReflectionReferencesGenerator.generateCallableReference(ReflectionReferencesGenerator.kt:68)
// null: KtCallableReferenceExpression:
// try {
// Id
// }
// 
// finally {
//  val ref = Id<String>::invoke
// }<String>::invoke
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
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty(StatementGenerator.kt:119)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitProperty(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtProperty.accept(KtProperty.java:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements(StatementGenerator.kt:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 20 more
// 