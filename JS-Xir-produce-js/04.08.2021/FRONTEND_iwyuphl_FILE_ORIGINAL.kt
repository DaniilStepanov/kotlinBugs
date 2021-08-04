// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// FILE: tmp0.kt

import kotlin.experimental.ExperimentalTypeInference
import kotlin.properties.*
import kotlin.reflect.*
import kotlin.math.*


fun <K> FlowCollector<K>.bar(): K = null as K
fun <K> FlowCollector<K>.foo(): K = null as K

fun <K> K.bar3(): K = null as K
fun <K> K.foo3(): K = null as K
val inv = ::Foo6 in setOf(try {
::Foo6
}

finally {
 try {
setOf(null )
}
catch(e: IllegalArgumentException){
bar4
}
catch(T: NoSuchElementException){
(foo2())
}
foo2()

})


fun bar2(): bar2 = -31
fun foo2(): Float = foo2()

val bar4: Int
    get() = (bar4).toByte().countTrailingZeroBits()

var foo4: Float
    get() = foo2()
    set(value) {}

val <K> FlowCollector<K>.bar5: K get() = null as K
@OptIn(ExperimentalTypeInference::class)

val <K> FlowCollector<K>.foo5: Foo6 get() = foo5

class Foo6

class Foo7<T>
fun foo7() = ::Foo6 !! as Foo7<String>

interface FlowCollector<in e> {}

@OptIn(ExperimentalTypeInference::class)
fun <L> flow(@BuilderInference block: suspend FlowCollector<L>.() -> Unit) = Flow(block)

class Flow<out R>(private val block: suspend FlowCollector<R>.() -> Unit)

fun poll71(): Flow<String> {
    return flow {
        val bar4 = ::bar2!! () 
        try {
(foo4).coerceAtMost(foo2())
}

finally {
 (foo4)
}.toBits()
true == true
Unit

class K
null

    }
-62
val inv = ::Foo6!!
        inv
{
 bar2()
}
::bar2 as Foo7<Int> 
}

fun poll73(): Flow<String> {
    return flow {
        try {
val inv = ::bar4!!
String

        inv
}
catch(e: AssertionError){
bar4
}
::Int!!

    }
}

fun poll75(): Flow<Int> {
    return flow {
        null


    }
foo2()
class Foo6

}

fun poll85(): Flow<String> {
    s@ do {

    do {

    q@ for (h in try {
bar4
}

finally {
 "yehgq"
}..88) { 

    return flow {
        o@ for (e in bar4..1) { 
        try {
val inv = try {
val inv = ::bar4!!
        inv
}
catch(e: AssertionError){
bar4
} in setOf(try {
::Foo6
}

finally {
 inv
})
}

finally {
        (Int)
    }
bar4

break
break@o

        (Int).toString().regionMatches(bar4, "yehgq", -62, bar2(), false)
}
17
foo2() 
    }
foo2()
null 
}
} while(true == true)
} while(bar4 != -17)
try {
setOf(::Foo6)
}
catch(e: IllegalArgumentException){
inv
}
catch(e: NoSuchElementException){
::Foo6
}
String 
}

fun box() = (bar4).compareTo(bar4).toString(bar2())

// STACKTRACE:
// org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (85,12) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// 
// Attachments:
// expression.kt
// flow {
//         try {
// val inv = ::bar4!!
// String
// 
//         inv
// }
// catch(e: AssertionError){
// bar4
// }
// ::Int!!
// 
//     }
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.logOrThrowException(ExpressionTypingVisitorDispatcher.java:253)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:224)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.visitReturnExpression(ControlStructureTypingVisitor.java:918)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitReturnExpression(ExpressionTypingVisitorDispatcher.java:279)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForBlock.visitReturnExpression(ExpressionTypingVisitorDispatcher.java:59)
// 	at org.jetbrains.kotlin.psi.KtReturnExpression.accept(KtReturnExpression.java:33)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitExpression(ExpressionTypingVisitorForStatements.java:436)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitExpression(ExpressionTypingVisitorForStatements.java:67)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitExpressionWithLabel(KtVisitor.java:226)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitReturnExpression(KtVisitor.java:222)
// 	at org.jetbrains.kotlin.psi.KtReturnExpression.accept(KtReturnExpression.java:33)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeOfLastExpressionInBlock(ExpressionTypingServices.java:402)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedTypeWithWritableScope(ExpressionTypingServices.java:327)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:206)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:183)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitBlockExpression(ExpressionTypingVisitorForStatements.java:479)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitBlockExpression(ExpressionTypingVisitorForStatements.java:67)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.checkFunctionReturnType(ExpressionTypingServices.java:178)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.checkFunctionReturnType(ExpressionTypingServices.java:165)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBody(BodyResolver.java:1036)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBody(BodyResolver.java:981)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBodies(BodyResolver.java:966)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBehaviorDeclarationBodies(BodyResolver.java:126)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBodies(BodyResolver.java:253)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations(LazyTopDownAnalyzer.kt:227)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations$default(LazyTopDownAnalyzer.kt:58)
// 	at org.jetbrains.kotlin.js.analyze.AbstractTopDownAnalyzerFacadeForJS.analyzeFilesWithGivenTrace(TopDownAnalyzerFacadeForJS.kt:131)
// 	at org.jetbrains.kotlin.js.analyze.AbstractTopDownAnalyzerFacadeForJS.analyzeFiles(TopDownAnalyzerFacadeForJS.kt:87)
// 	at org.jetbrains.kotlin.ir.backend.js.ModulesStructure$runAnalysis$1.invoke(klib.kt:460)
// 	at org.jetbrains.kotlin.ir.backend.js.ModulesStructure$runAnalysis$1.invoke(klib.kt:459)
// 	at org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.analyzeAndReport(AnalyzerWithCompilerReport.kt:113)
// 	at org.jetbrains.kotlin.ir.backend.js.ModulesStructure.runAnalysis(klib.kt:459)
// 	at org.jetbrains.kotlin.ir.backend.js.KlibKt.runAnalysisAndPreparePsi2Ir(klib.kt:351)
// 	at org.jetbrains.kotlin.ir.backend.js.KlibKt.loadIr(klib.kt:265)
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
// Caused by: java.lang.AssertionError: Resolution error of this type shouldn't occur for resolve ExclExcl as a call
// 	at com.intellij.openapi.diagnostic.DefaultLogger.error(DefaultLogger.java:57)
// 	at com.intellij.openapi.diagnostic.Logger.error(Logger.java:165)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils$ThrowingOnErrorTracingStrategy.logError(ControlStructureTypingUtils.java:578)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils$ThrowingOnErrorTracingStrategy.logError(ControlStructureTypingUtils.java:570)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils$ThrowingOnErrorTracingStrategy.invisibleMember(ControlStructureTypingUtils.java:684)
// 	at org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCall(DiagnosticReporterByTrackingStrategy.kt:70)
// 	at org.jetbrains.kotlin.resolve.calls.tower.VisibilityError.report(ImplicitScopeTower.kt:110)
// 	at org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic(KotlinToResolvedCallTransformer.kt:534)
// 	at org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportDiagnostics(KotlinToResolvedCallTransformer.kt:478)
// 	at org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter.completeResolvedCall(ResolvedAtomCompleter.kt:183)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession.completeCall(BuilderInferenceSession.kt:522)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession.updateCall(BuilderInferenceSession.kt:469)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession.access$updateCall(BuilderInferenceSession.kt:42)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession$Companion.updateCalls(BuilderInferenceSession.kt:590)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession$Companion.access$updateCalls(BuilderInferenceSession.kt:569)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession.updateAllCalls(BuilderInferenceSession.kt:274)
// 	at org.jetbrains.kotlin.resolve.calls.inference.BuilderInferenceSession.inferPostponedVariables(BuilderInferenceSession.kt:261)
// 	at org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.applyResultsOfAnalyzedLambdaToCandidateSystem(PostponedArgumentsAnalyzer.kt:186)
// 	at org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda(PostponedArgumentsAnalyzer.kt:134)
// 	at org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyze(PostponedArgumentsAnalyzer.kt:38)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter$runCompletion$1.invoke(KotlinCallCompleter.kt:229)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter$runCompletion$1.invoke(KotlinCallCompleter.kt:219)
// 	at org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.analyzeArgumentWithFixedParameterTypes(KotlinConstraintSystemCompleter.kt:181)
// 	at org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion(KotlinConstraintSystemCompleter.kt:77)
// 	at org.jetbrains.kotlin.resolve.calls.inference.components.KotlinConstraintSystemCompleter.runCompletion(KotlinConstraintSystemCompleter.kt:33)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion(KotlinCallCompleter.kt:219)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion$default(KotlinCallCompleter.kt:210)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion(KotlinCallCompleter.kt:207)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion(KotlinCallCompleter.kt:60)
// 	at org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific(KotlinCallResolver.kt:162)
// 	at org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall(KotlinCallResolver.kt:82)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver.runResolutionAndInference(PSICallResolver.kt:101)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCallOrGetCachedResults(CallResolver.java:601)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.lambda$computeTasksAndResolveCall$0(CallResolver.java:213)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:211)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:199)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.resolveFunctionCall(CallResolver.java:329)
// 	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getResolvedCallForFunction(CallExpressionResolver.kt:99)
// 	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfoWithoutFinalTypeCheck(CallExpressionResolver.kt:221)
// 	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getCallExpressionTypeInfo(CallExpressionResolver.kt:198)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitCallExpression(BasicExpressionTypingVisitor.java:708)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitCallExpression(ExpressionTypingVisitorDispatcher.java:388)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForBlock.visitCallExpression(ExpressionTypingVisitorDispatcher.java:59)
// 	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	... 62 more
// Caused by: java.lang.Throwable: Resolution error of this type shouldn't occur for resolve ExclExcl as a call
// 	... 107 more
// 