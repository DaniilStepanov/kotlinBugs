// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// FILE: tmp0.kt


fun box()   = 
listOf{
do {
{}
} while(true)
}    .iterator().next()

// STACKTRACE:
// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: (21,5) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.RuntimeException was thrown at: org.jetbrains.kotlin.psi2ir.generators.GeneratorKt.getTypeInferredByFrontendOrFail(Generator.kt:52)
// No type for expression: {
// 
//     for (n in intProgression) { 
//     while (intProgression != 91.until(1)) {
//  
//     assertEquals(listOf('e', 2, 3, 4, 5), intList)
// 
//     do {
// 
// 
//     e@ do {
// 
// 
// 
//     val longList = mutableListOf<Long>()
//     for (q in -49..-34) { 
//     val longProgression = 1L..6L
//     o@ for (j in 'c'..'惭') { 
//     for (i in longProgression step 2L step 1L) {
//         longList += i
//     }
//     for (k in longProgression) { 
//     p@ for (u in 92.toUByte()..21.toUByte()) { 
//     y@ while (longList != arrayListOf<Long>()) {
//  
//     try {
// assertEquals(listOf(1, 2L, try {
// 3L
// }
// 
// finally {
//  5L
// }, 4L, 1L), longList)
// }
// 
// finally {
//  mutableListOf<Char>()
// }
// 
//     for (n in 22.toULong()..39.toULong()) { 
// 
//     b@ for (w in ''..'뱲') { 
// 
//     val charList = mutableListOf<Char>()
//     for (h in 1.toUByte()..9.toUByte()) { 
//     m@ while (true == true) {
//  
//     val charProgression = 'a'..'f'
//     t@try {
// try {
// for (i in charProgression step 2 step 1) {
//         charList += i
//     }
// }
// 
// finally {
//  "OK"
// }
// }
// catch(e: NumberFormatException){
// listOf('a', 'd', '幼', 'd', 43)
// }
// }
// }
//     for (s in intProgression) { 
//     assertEquals(81.toULong()..1L.toULong(), try {
// charList
// }
// catch(e: NoWhenBranchMatchedException){
// -90
// }
// finally {
//  'a'
// })
// }
// }
// }
// }
//     }
// }
// }
// }
// } while(intList != MutableList<Int>(-28, {a: Int -> 25}))
//     } while(true == true)
//     }
//     }
// }: KtLambdaExpression:
// {
// 
//     for (n in intProgression) { 
//     while (intProgression != 91.until(1)) {
//  
//     assertEquals(listOf('e', 2, 3, 4, 5), intList)
// 
//     do {
// 
// 
//     e@ do {
// 
// 
// 
//     val longList = mutableListOf<Long>()
//     for (q in -49..-34) { 
//     val longProgression = 1L..6L
//     o@ for (j in 'c'..'惭') { 
//     for (i in longProgression step 2L step 1L) {
//         longList += i
//     }
//     for (k in longProgression) { 
//     p@ for (u in 92.toUByte()..21.toUByte()) { 
//     y@ while (longList != arrayListOf<Long>()) {
//  
//     try {
// assertEquals(listOf(1, 2L, try {
// 3L
// }
// 
// finally {
//  5L
// }, 4L, 1L), longList)
// }
// 
// finally {
//  mutableListOf<Char>()
// }
// 
//     for (n in 22.toULong()..39.toULong()) { 
// 
//     b@ for (w in ''..'뱲') { 
// 
//     val charList = mutableListOf<Char>()
//     for (h in 1.toUByte()..9.toUByte()) { 
//     m@ while (true == true) {
//  
//     val charProgression = 'a'..'f'
//     t@try {
// try {
// for (i in charProgression step 2 step 1) {
//         charList += i
//     }
// }
// 
// finally {
//  "OK"
// }
// }
// catch(e: NumberFormatException){
// listOf('a', 'd', '幼', 'd', 43)
// }
// }
// }
//     for (s in intProgression) { 
//     assertEquals(81.toULong()..1L.toULong(), try {
// charList
// }
// catch(e: NoWhenBranchMatchedException){
// -90
// }
// finally {
//  'a'
// })
// }
// }
// }
// }
//     }
// }
// }
// }
// } while(intList != MutableList<Int>(-28, {a: Int -> 25}))
//     } while(true == true)
//     }
//     }
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
//     for (n in intProgression) { 
//     while (intProgression != 91.until(1)) {
//  
//     assertEquals(listOf('e', 2, 3, 4, 5), intList)
// 
//     do {
// 
// 
//     e@ do {
// 
// 
// 
//     val longList = mutableListOf<Long>()
//     for (q in -49..-34) { 
//     val longProgression = 1L..6L
//     o@ for (j in 'c'..'惭') { 
//     for (i in longProgression step 2L step 1L) {
//         longList += i
//     }
//     for (k in longProgression) { 
//     p@ for (u in 92.toUByte()..21.toUByte()) { 
//     y@ while (longList != arrayListOf<Long>()) {
//  
//     try {
// assertEquals(listOf(1, 2L, try {
// 3L
// }
// 
// finally {
//  5L
// }, 4L, 1L), longList)
// }
// 
// finally {
//  mutableListOf<Char>()
// }
// 
//     for (n in 22.toULong()..39.toULong()) { 
// 
//     b@ for (w in ''..'뱲') { 
// 
//     val charList = mutableListOf<Char>()
//     for (h in 1.toUByte()..9.toUByte()) { 
//     m@ while (true == true) {
//  
//     val charProgression = 'a'..'f'
//     t@try {
// try {
// for (i in charProgression step 2 step 1) {
//         charList += i
//     }
// }
// 
// finally {
//  "OK"
// }
// }
// catch(e: NumberFormatException){
// listOf('a', 'd', '幼', 'd', 43)
// }
// }
// }
//     for (s in intProgression) { 
//     assertEquals(81.toULong()..1L.toULong(), try {
// charList
// }
// catch(e: NoWhenBranchMatchedException){
// -90
// }
// finally {
//  'a'
// })
// }
// }
// }
// }
//     }
// }
// }
// }
// } while(intList != MutableList<Int>(-28, {a: Int -> 25}))
//     } while(true == true)
//     }
//     }
// }
// 	at org.jetbrains.kotlin.psi2ir.generators.GeneratorKt.getTypeInferredByFrontendOrFail(Generator.kt:52)
// 	at org.jetbrains.kotlin.psi2ir.generators.LocalFunctionGenerator.generateLambda(LocalFunctionGenerator.kt:31)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:479)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitLambdaExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGeneratorExtension.genStmt(StatementGenerator.kt:509)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoopBody(LoopExpressionGenerator.kt:89)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateDoWhileLoop(LoopExpressionGenerator.kt:67)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression(StatementGenerator.kt:464)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitDoWhileExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtDoWhileExpression.accept(KtDoWhileExpression.java:32)
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
// 	at org.jetbrains.kotlin.psi2ir.generators.ArgumentsGenerationUtilsKt$generateReceiver$1.load(ArgumentsGenerationUtils.kt:95)
// 	at org.jetbrains.kotlin.psi2ir.generators.CallGenerator$generateFunctionCall$1.invoke(CallGenerator.kt:356)
// 	at org.jetbrains.kotlin.psi2ir.generators.CallGenerator$generateFunctionCall$1.invoke(CallGenerator.kt:294)
// 	at org.jetbrains.kotlin.psi2ir.intermediate.SimpleCallReceiver.call(SimpleCallReceiver.kt:27)
// 	at org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateFunctionCall(CallGenerator.kt:294)
// 	at org.jetbrains.kotlin.psi2ir.generators.CallGenerator.generateCall(CallGenerator.kt:56)
// 	at org.jetbrains.kotlin.psi2ir.generators.CallGeneratorKt.generateCall(CallGenerator.kt:424)
// 	at org.jetbrains.kotlin.psi2ir.generators.LoopExpressionGenerator.generateForLoop(LoopExpressionGenerator.kt:170)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression(StatementGenerator.kt:467)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.visitForExpression(StatementGenerator.kt:53)
// 	at org.jetbrains.kotlin.psi.KtForExpression.accept(KtForExpression.java:33)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatement(StatementGenerator.kt:69)
// 	at org.jetbrains.kotlin.psi2ir.generators.StatementGenerator.generateStatements(StatementGenerator.kt:79)
// 	at org.jetbrains.kotlin.psi2ir.generators.BodyGenerator.generateFunctionBody(BodyGenerator.kt:58)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:49)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 20 more
// 