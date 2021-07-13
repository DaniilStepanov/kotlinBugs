// IGNORE_BACKEND: NATIVE
// FILE: tmp0.kt

//For KT-6020
// FILE: A.java
import kotlin.reflect.KProperty1
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty
import kotlin.properties.*
import kotlin.coroutines.*
import kotlin.math.*


class Value<T>(var value: T = null as T, var text: String? = null){
inline fun <T>  jbnhd(a: Any?, isValue: String): Unit = TODO()
}

val <T> Value<T>.additionalText by DVal(Value<T>::text) // WITH_RUNTIME

val <T> Value<T>.additionalValue by DVal(Value<T>::value) // KJS_WITH_FULL_RUNTIME

class DVal<T, R, P: KProperty1<KClass<*>, R>>(val kmember: P) {
    operator fun getValue(t: T, p: KProperty<*>): R {
        return kmember.get(t)
    }
inline  private  fun  jbkfi(block: () -> R): String = TODO()
infix   fun <T>   String.cghtt(a: Any): Int = TODO()
}

fun box(): String {
    val p = Value("O".stripLeading()?.replace('ڦ', '☀', Value<Boolean>(false, "INVISIBLE_REFERENCE").value.and(Value<Boolean>(Value<Boolean>(false, "OK").value.and(Value<Boolean>(false, Value<Boolean>().text).value), "OK").value.or(true)))!!, "fail")
    return Value<Boolean>().text + p.additionalText.plus(127849)
}


// org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (14,36) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// 
// Attachments:
// expression.kt
// DVal(Value<T>::text)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.logOrThrowException(ExpressionTypingVisitorDispatcher.java:253)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:224)
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
// 	at org.jetbrains.kotlin.resolve.BodyResolver.computeDeferredType(BodyResolver.java:1068)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveProperty(BodyResolver.java:788)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolvePropertyDeclarationBodies(BodyResolver.java:846)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBehaviorDeclarationBodies(BodyResolver.java:120)
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
// Caused by: java.lang.IndexOutOfBoundsException: Empty list doesn't contain element at index 0.
// 	at kotlin.collections.EmptyList.get(Collections.kt:36)
// 	at kotlin.collections.EmptyList.get(Collections.kt:24)
// 	at org.jetbrains.kotlin.types.checker.ClassicTypeSystemContext$DefaultImpls.getParameter(ClassicTypeSystemContext.kt:211)
// 	at org.jetbrains.kotlin.resolve.calls.components.ClassicTypeSystemContextForCS.getParameter(ClassicTypeSystemContextForCS.kt:25)
// 	at org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintSystemImpl.getParameter(NewConstraintSystemImpl.kt)
// 	at org.jetbrains.kotlin.resolve.calls.components.CompletionModeCalculator$CalculatorForNestedCall.collectRequiredDirectionsForVariables(CompletionModeCalculator.kt:142)
// 	at org.jetbrains.kotlin.resolve.calls.components.CompletionModeCalculator$CalculatorForNestedCall.collectRequiredDirectionsForVariables(CompletionModeCalculator.kt:147)
// 	at org.jetbrains.kotlin.resolve.calls.components.CompletionModeCalculator$CalculatorForNestedCall.computeDirections(CompletionModeCalculator.kt:94)
// 	at org.jetbrains.kotlin.resolve.calls.components.CompletionModeCalculator$CalculatorForNestedCall.computeCompletionMode(CompletionModeCalculator.kt:77)
// 	at org.jetbrains.kotlin.resolve.calls.components.CompletionModeCalculator$Companion.computeCompletionMode(CompletionModeCalculator.kt:51)
// 	at org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter.runCompletion(KotlinCallCompleter.kt:53)
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
// 	... 38 more
// 