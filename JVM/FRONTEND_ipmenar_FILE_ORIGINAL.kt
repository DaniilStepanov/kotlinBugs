// WITH_RUNTIME
// FILE: tmp0.kt


import kotlin.properties.*
import kotlin.coroutines.intrinsics.*
import kotlin.math.*
fun getOrElse() =
        mapOf<String, Int>().getOrElse("a") { 3 }

fun isNotEmpty(l: ArrayList<Int>) =
        l.iterator()?.hasNext() ?: false

fun box() = "UNSUPPORTED_FEATURE"

inline class Kla3(val x: Int) {
    inline fun fu5(): Kla3 = Kla3(x = (getOrElse()).toInt())
}

fun box394(): String {
    val prope0 = Kla3(0)
    val listOf = prope0.fu5().fu5()

    if ((isNotEmpty(ArrayList<Int>())).xor(isNotEmpty(ArrayList<Int>()))) "OK"

    return (isNotEmpty(ArrayList<Int>())).compareTo(isNotEmpty(ArrayList<Int>())).toString(getOrElse())
}

inline fun fu6( prope3: () -> String): Lazy<String> {
    val prope2 = ((isNotEmpty(ArrayList<Int>())).compareTo(isNotEmpty(ArrayList<Int>()))).takeLowestOneBit().toString(getOrElse())
    return object : Lazy<String> {
        override val value: String
            get() = prope2

        override fun isInitialized(): Boolean = ((isNotEmpty(ArrayList<Int>())).compareTo(isNotEmpty(ArrayList<Int>()))).toString().none()
    }
}

class Kla4 {
    val prope3: String
    init {
        val prope4 by fu6 { return nonLocal }
        prope3 = prope4
    }

    constructor()
    constructor(apply: String)
}

fun uintProgression(): String = Kla4("OK").prope3




// org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (38,29) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// 
// Attachments:
// expression.kt
// return nonLocal
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.logOrThrowException(ExpressionTypingVisitorDispatcher.java:253)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:224)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitExpression(ExpressionTypingVisitorForStatements.java:434)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitExpression(ExpressionTypingVisitorForStatements.java:66)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitExpressionWithLabel(KtVisitor.java:226)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitReturnExpression(KtVisitor.java:222)
// 	at org.jetbrains.kotlin.psi.KtReturnExpression.accept(KtReturnExpression.java:33)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeOfLastExpressionInBlock(ExpressionTypingServices.java:394)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedTypeWithWritableScope(ExpressionTypingServices.java:327)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:206)
// 	at org.jetbrains.kotlin.types.expressions.FunctionsTypingVisitor.computeUnsafeReturnType(FunctionsTypingVisitor.kt:272)
// 	at org.jetbrains.kotlin.types.expressions.FunctionsTypingVisitor.computeReturnType(FunctionsTypingVisitor.kt:237)
// 	at org.jetbrains.kotlin.types.expressions.FunctionsTypingVisitor.visitLambdaExpression(FunctionsTypingVisitor.kt:174)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitLambdaExpression(ExpressionTypingVisitorDispatcher.java:262)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForDeclarations.visitLambdaExpression(ExpressionTypingVisitorDispatcher.java:46)
// 	at org.jetbrains.kotlin.psi.KtLambdaExpression.accept(KtLambdaExpression.java:40)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:125)
// 	at org.jetbrains.kotlin.resolve.calls.tower.KotlinResolutionCallbacksImpl.analyzeAndGetLambdaReturnArguments(KotlinResolutionCallbacksImpl.kt:192)
// 	at org.jetbrains.kotlin.resolve.calls.components.PostponedArgumentsAnalyzer.analyzeLambda(PostponedArgumentsAnalyzer.kt:125)
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
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForDeclarations.visitCallExpression(ExpressionTypingVisitorDispatcher.java:46)
// 	at org.jetbrains.kotlin.psi.KtCallExpression.accept(KtCallExpression.java:35)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:146)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:120)
// 	at org.jetbrains.kotlin.resolve.DelegatedPropertyResolver.resolveWithNewInference(DelegatedPropertyResolver.kt:555)
// 	at org.jetbrains.kotlin.resolve.DelegatedPropertyResolver.resolveDelegateExpression(DelegatedPropertyResolver.kt:503)
// 	at org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver$resolveDelegatedPropertyType$1.invoke(VariableTypeAndInitializerResolver.kt:151)
// 	at org.jetbrains.kotlin.resolve.VariableTypeAndInitializerResolver$resolveDelegatedPropertyType$1.invoke(VariableTypeAndInitializerResolver.kt:149)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:408)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValue.invoke(LockBasedStorageManager.java:527)
// 	at org.jetbrains.kotlin.types.DeferredType.getDelegate(DeferredType.java:107)
// 	at org.jetbrains.kotlin.types.WrappedType.getAnnotations(KotlinType.kt:127)
// 	at org.jetbrains.kotlin.resolve.LocalVariableResolver.resolveLocalVariableDescriptor(LocalVariableResolver.kt:211)
// 	at org.jetbrains.kotlin.resolve.LocalVariableResolver.process(LocalVariableResolver.kt:80)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitProperty(ExpressionTypingVisitorForStatements.java:115)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitProperty(ExpressionTypingVisitorForStatements.java:66)
// 	at org.jetbrains.kotlin.psi.KtProperty.accept(KtProperty.java:58)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedTypeWithWritableScope(ExpressionTypingServices.java:341)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:206)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBlockReturnedType(ExpressionTypingServices.java:183)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitBlockExpression(ExpressionTypingVisitorForStatements.java:477)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitBlockExpression(ExpressionTypingVisitorForStatements.java:66)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:147)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:120)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:95)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveAnonymousInitializer(BodyResolver.java:704)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveAnonymousInitializers(BodyResolver.java:687)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBehaviorDeclarationBodies(BodyResolver.java:122)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBodies(BodyResolver.java:253)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations(LazyTopDownAnalyzer.kt:227)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations$default(LazyTopDownAnalyzer.kt:58)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration(TopDownAnalyzerFacadeForJVM.kt:127)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.TopDownAnalyzerFacadeForJVM.analyzeFilesWithJavaIntegration$default(TopDownAnalyzerFacadeForJVM.kt:86)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:252)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler$analyze$1.invoke(KotlinToJVMBytecodeCompiler.kt:243)
// 	at org.jetbrains.kotlin.cli.common.messages.AnalyzerWithCompilerReport.analyzeAndReport(AnalyzerWithCompilerReport.kt:113)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.analyze(KotlinToJVMBytecodeCompiler.kt:243)
// 	at org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler.compileModules$cli(KotlinToJVMBytecodeCompiler.kt:90)
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
// Caused by: java.lang.IllegalArgumentException: Argument for @NotNull parameter 'function' of org/jetbrains/kotlin/types/expressions/ControlStructureTypingVisitor.getFunctionExpectedReturnType must not be null
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.$$$reportNull$$$0(ControlStructureTypingVisitor.java)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.getFunctionExpectedReturnType(ControlStructureTypingVisitor.java)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.visitReturnExpression(ControlStructureTypingVisitor.java:858)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitReturnExpression(ExpressionTypingVisitorDispatcher.java:279)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForBlock.visitReturnExpression(ExpressionTypingVisitorDispatcher.java:59)
// 	at org.jetbrains.kotlin.psi.KtReturnExpression.accept(KtReturnExpression.java:33)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	... 114 more
// 