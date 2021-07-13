// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.math.*
fun box(): Any {
val i = (1L..
return ""
).iterator().next()
E += i
}


// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (6,1) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.NullPointerException was thrown at: org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.store(PropertyLValue.kt:164)
// null: KtBinaryExpression:
// E += i
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
// Caused by: java.lang.NullPointerException
// 	at org.jetbrains.kotlin.psi2ir.intermediate.AccessorPropertyLValue.store(PropertyLValue.kt:164)
// 	at org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator$generateAugmentedAssignment$1.invoke(AssignmentGenerator.kt:83)
// 	at org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator$generateAugmentedAssignment$1.invoke(AssignmentGenerator.kt:64)
// 	at org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase$assign$1.invoke(PropertyLValue.kt:54)
// 	at org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase$assign$1.invoke(PropertyLValue.kt:43)
// 	at org.jetbrains.kotlin.psi2ir.intermediate.SimpleCallReceiver.call(SimpleCallReceiver.kt:27)
// 	at org.jetbrains.kotlin.psi2ir.intermediate.PropertyLValueBase.assign(PropertyLValue.kt:43)
// 	at org.jetbrains.kotlin.psi2ir.generators.AssignmentGenerator.generateAugmentedAssignment(AssignmentGenerator.kt:64)
// 	at org.jetbrains.kotlin.psi2ir.generators.OperatorExpressionGenerator.generateBinaryExpression(OperatorExpressionGenerator.kt:132)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBinaryExpression(StatementGenerator.kt:441)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBinaryExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtBinaryExpression.accept(KtBinaryExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements(StatementGenerator.kt:80)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:59)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 21 more
// 