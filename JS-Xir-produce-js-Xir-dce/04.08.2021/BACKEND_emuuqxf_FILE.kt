// Bug happens on JS -Xir-produce-js -Xir-dce ver 1.6.0-dev-1486
// FILE: tmp0.kt


fun box()  {
while (true)
do  while(break == {
for (a in "") {
{}
}
})
}

// STACKTRACE:
// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (76,1) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.RuntimeException was thrown at: org.jetbrains.kotlin.psi2ir.generators.GeneratorKt.getTypeInferredByFrontendOrFail(Generator.kt:52)
// No type for expression: {
// 
// 
// 
//     z@ for (s in 4.toUByte()..40.toUByte()) { 
// 
//     f@ while (true) break
// }
// }: KtLambdaExpression:
// {
// 
// 
// 
//     z@ for (s in 4.toUByte()..40.toUByte()) { 
// 
//     f@ while (true) break
// }
// }
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
// Caused by: java.lang.RuntimeException: No type for expression: {
// 
// 
// 
//     z@ for (s in 4.toUByte()..40.toUByte()) { 
// 
//     f@ while (true) break
// }
// }
// 	at org.jetbrains.kotlin.psi2ir.generators.GeneratorKt.getTypeInferredByFrontendOrFail(Generator.kt:52)
// 	at org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator.generateLambda(LocalFunctionGenerator.kt:31)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:479)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
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
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateLambdaBody(BodyGenerator.kt:100)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateLambdaFunctionDeclaration(FunctionGenerator.kt:59)
// 	at org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator.generateLambda(LocalFunctionGenerator.kt:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:479)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
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
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateExpression(StatementGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genExpr(StatementGenerator.kt:508)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop(LoopExpressionGenerator.kt:72)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression(StatementGenerator.kt:464)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtDoWhileExpression.accept(KtDoWhileExpression.java:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoopBody(LoopExpressionGenerator.kt:82)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateWhileLoop(LoopExpressionGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:461)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtWhileExpression.accept(KtWhileExpression.java:29)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoopBody(LoopExpressionGenerator.kt:89)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop(LoopExpressionGenerator.kt:67)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression(StatementGenerator.kt:464)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtDoWhileExpression.accept(KtDoWhileExpression.java:32)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements(StatementGenerator.kt:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 20 more
// 