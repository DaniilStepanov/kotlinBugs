// Bug happens on JVM 
// WITH_REFLECT
// IGNORE_BACKEND: JS_IR, JS, NATIVE
// IGNORE_BACKEND: JS_IR_ES6
// FILE: tmp0.kt


interface I1
interface I3 
interface I : I1, I3
fun box()   = 
I::class.members.single { 
try {
it.name == 
""
}
finally {
{}
}
 }


// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (11,1) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.RuntimeException was thrown at: org.jetbrains.kotlin.psi2ir.generators.GeneratorKt.getTypeInferredByFrontendOrFail(Generator.kt:52)
// No type for expression: {}: KtLambdaExpression:
// {}
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
// Caused by: java.lang.RuntimeException: No type for expression: {}
// 	at org.jetbrains.kotlin.psi2ir.generators.GeneratorKt.getTypeInferredByFrontendOrFail(Generator.kt:52)
// 	at org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator.generateLambda(LocalFunctionGenerator.kt:31)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:480)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:183)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitBlockExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:83)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genExpr(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.TryCatchExpressionGenerator.generateTryCatch(TryCatchExpressionGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTryExpression(StatementGenerator.kt:477)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitTryExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtTryExpression.accept(KtTryExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody(BodyGenerator.kt:101)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateLambdaFunctionDeclaration(FunctionGenerator.kt:59)
// 	at org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator.generateLambda(LocalFunctionGenerator.kt:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:480)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:83)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:427)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$pregenerateCall$1.invoke(ArgumentsGenerationUtils.kt:427)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.generateValueArgumentUsing(ArgumentsGenerationUtils.kt:296)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateValueArgumentsUsing(ArgumentsGenerationUtils.kt:665)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCallUsing(ArgumentsGenerationUtils.kt:437)
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt.pregenerateCall(ArgumentsGenerationUtils.kt:427)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:365)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitCallExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDotQualifiedExpression(StatementGenerator.kt:383)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDotQualifiedExpression(StatementGenerator.kt:54)
// 	at org.jetbrains.kotlin.psi.KtDotQualifiedExpression.accept(KtDotQualifiedExpression.kt:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:70)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:61)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 21 more
// 