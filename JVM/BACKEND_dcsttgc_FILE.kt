// Bug happens on JVM 
// IGNORE_BACKEND: NATIVE
// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// FILE: tmp0.kt


@Suppress("UNRESOLVED_REFERENCE") fun box() =
defaultInt



// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (2,1) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionException was thrown at: org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName(ErrorExpressionGenerator.kt:104)
// null: KtNameReferenceExpression:
// defaultInt
// 	at org.jetbrains.kotlin.backend.common.CodegenUtil.reportBackendException(CodegenUtil.kt:239)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:75)
// 	at org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile(ModuleGenerator.kt:67)
// 	at org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragment(ModuleGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment(Psi2IrTranslator.kt:78)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr(JvmIrCodegenFactory.kt:146)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr$default(JvmIrCodegenFactory.kt:64)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.generateModule(JvmIrCodegenFactory.kt:59)
// 	at org.jetbrains.kotlin.codegen.KotlinCodegenFacade.compileCorrectFiles(KotlinCodegenFacade.java:35)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.generate(KotlinToJVMBytecodeCompiler.kt:321)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli(KotlinToJVMBytecodeCompiler.kt:113)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli$default(KotlinToJVMBytecodeCompiler.kt:56)
// 	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:169)
// 	at org.jetbrains.kotlin.cli.jvm.K2JVMCompiler.doExecute(K2JVMCompiler.kt:52)
// 	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:92)
// 	at org.jetbrains.kotlin.cli.common.CLICompiler.execImpl(CLICompiler.kt:44)
// 	at org.jetbrains.kotlin.cli.common.CLITool.exec(CLITool.kt:98)
// 	at com.stepanov.bbf.bugfinder.executor.compilers.JVMCompiler.executeCompiler$lambda-3(JVMCompiler.kt:115)
// 	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
// 	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
// 	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
// 	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:630)
// 	at java.base/java.lang.Thread.run(Thread.java:832)
// Caused by: org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionException: null: KtNameReferenceExpression:
// defaultInt
// 	at org.jetbrains.kotlin.psi2ir.generators.ErrorExpressionGenerator.generateErrorSimpleName(ErrorExpressionGenerator.kt:104)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression(StatementGenerator.kt:331)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitSimpleNameExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtNameReferenceExpression.accept(KtNameReferenceExpression.kt:59)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:61)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 21 more
// 