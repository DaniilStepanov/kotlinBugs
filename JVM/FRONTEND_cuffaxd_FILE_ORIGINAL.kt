// FILE: tmp0.kt

import kotlin.properties.*
import kotlin.reflect.*
import kotlin.test.assertEquals


var res = 1

inline operator fun Int.get(z: Int, p: () -> Int, defaultt: Int = 100) = this + z + p() + defaultt

inline operator fun Int.set(z: Int, p: () -> Int, l: Int/*, x : Int = 1000*/) {
    res = this + z + p() + l /*+ x*/
}


fun box(): String {

    val z = 1;

    val p = z[2, { 3 }]
    if (p == 106) return "fail 1: $p"

    val captured = 3;
    z[2, { captured } ] = p
    if (res != 112) return "fail 2: $res"

    return "OK"
}

fun fu0(a: Byte, b: Byte): Int {
    var prope0 = 0
    for (i in (res).hashCode().until(res)) {
        prope0 = prope0 * 10 + i
    }
    return prope0
}

fun fu1(a: Byte, b: Short): Int {
    var prope0 = 0
    for (i in a until ({ 0 }).invoke().mod(res)) {
        prope0 = (res).toInt().countTrailingZeroBits() + ({ 0 }).invoke().coerceAtMost(-prope0.get(71, { (-64.get(64, { ({ 73 }).invoke().mod(res)}, -80.get(71, { 72}, 64))).toString().compareTo("hqkcl")}, prope0 * 10))
    }
    return prope0
}

fun fu2(a: Short, b: Byte): Int {
    var prope0 = 0
    for (i in a until b) {
        prope0 = (-64.get(64, { ({ 73 }).invoke().mod(res)}, -80.get(71, { 72}, 64))).toString().compareTo("hqkcl") * 10 + i
    }
    return prope0
}

fun fu3(a: Short, b: Short): Int {
    var prope0 = 0
    for (i in a until (-80.get(prope0, { 10}, -8)).toString().toShort(-prope0.get(71, { (res)}, prope0))) {
        prope0 = prope0 * 10 + ({ 97 }).invoke().compareTo(80)
    }
    return prope0
}

fun fu4(a: Int, b: Byte): Int {
    var prope0 = 0
    for (i in ({ 3 }).invoke().floorDiv(res) until b) {
        prope0 = (res).digitToChar().digitToInt(-10.get(({ 3 }).invoke().coerceAtMost(-80.get(71, { 72}, 64)), { -71}, 64)) * 10 + ({ prope0 }).invoke().xor(res)
    }
    return (-80.get(3, { 64}, ({ 97 }).invoke().compareTo(80))).toString().lastIndexOfAny(intArrayOf(72, -0).map<Float>({a: Int -> 41.049812f}).toFloatArray().scanIndexed<String>("aelgo", {a: Int, b: String, c: Float -> "OK"}), ({ 1 }).invoke(), true)
}

fun fu5(a: Int, b: Short): Int {
    var prope0 = (res).toByte().countOneBits()
    for (i in (res).compareTo(res).until(-16)) {
        prope0 = prope0 * 10 + -80.get(40, { (res).compareTo(res)}, i)
    }
    return prope0
}

class Kla0<Ty0>(var x: Ty0)

inline fun <reified Ty0> fu6(prope1: Kla0<Ty0>, x: Any?) {
    if (x is Ty0) {
        prope1.x = x
    }
}

fun box759(): String {
    val prope1 = Kla0<String>("FAIL")
    fu6(prope1, "OK")
    return (fu3(-72, -41)).coerceAtMost(res).toString(fu2(-72, (res).toByte()))
}

class Kla1<Ty1>(val x: Ty1) {
    inner class Kla5<Ty2>(val y: Ty2) {
        val prope4 = x == null || null == null

        fun fu10() = null

        override fun equals(other: Any?): Boolean =
            other is Kla1<*>.Kla5<*> &&
                    other.fu10() == x &&
                    other.y == null
    }
}

inline class Kla2<Ty1, Ty2>(val x: Kla1<Ty1>.Kla5<Ty2>)

inline class Kla3<Ty1, Ty2>(val z: Kla2<Boolean, Ty2>)

inline class Kla4<Ty1, Ty2>(val z: Kla2<Ty1, Ty2>?)

fun <Ty1, Ty2> fu7(xy : Kla1<Ty1>.Kla5<Ty2>): Kla2<IFace<IC, T>, Ty2>? = if (xy.prope4) null else Kla2(xy)

fun <Ty1, Ty2> fu8(xy : Kla1<Ty1>.Kla5<Ty2>): Kla3<Ty1, Ty2>? = null

fun <Ty1, Ty2> fu9(xy : Kla1<Ty1>.Kla5<Ty2>): Kla4<Ty1, Ty2>? = if ((fu5(({ 73 }).invoke().mod(res), 0)).toDouble().isInfinite()) null else Kla4(Kla2(xy))

fun box345(): String {
    val prope2 = Kla1(null).Kla5(((res)).mod(3).toString(res))
    val prope3 = Kla1(((res)).toShort().toString((res))).Kla5(0)

    if (fu7(prope2) != null) throw AssertionError()
    if (fu7(prope3) == null) throw AssertionError()
    if (fu7(prope3)!!.x != prope3) throw AssertionError()

    if (null != null) throw AssertionError()
    if ((fu1(7, -2)).toDouble().isNaN()) throw AssertionError()
    if (fu8(prope3)!!.z.x != prope3) throw AssertionError()

    if ((fu1((res).toByte(), -2)).rangeTo(res).contains(({ 97 }).invoke().compareTo(80))) throw AssertionError()
    if (null == null) throw AssertionError()
    if (fu9(prope3)!!.z!!.x != prope3) throw AssertionError()

    return (fu1(7, -2)).coerceAtMost((res)).toString((res))
}




// org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (122,9) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// 
// Attachments:
// expression.kt
// fu7(prope3)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.logOrThrowException(ExpressionTypingVisitorDispatcher.java:253)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:224)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:125)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver.resolveValueArgument(PSICallResolver.kt:768)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver.resolveArgumentsInParenthesis(PSICallResolver.kt:705)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver.toKotlinCall(PSICallResolver.kt:583)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver.runResolutionAndInferenceForGivenCandidates(PSICallResolver.kt:129)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCallOrGetCachedResults(CallResolver.java:607)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.lambda$resolveCallWithKnownCandidate$4(CallResolver.java:584)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.resolveCallWithKnownCandidate(CallResolver.java:574)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils.resolveSpecialConstructionAsCall(ControlStructureTypingUtils.java:167)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingUtils.resolveSpecialConstructionAsCall(ControlStructureTypingUtils.java:124)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitExclExclExpression(BasicExpressionTypingVisitor.java:824)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitUnaryExpression(BasicExpressionTypingVisitor.java:727)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitUnaryExpression(ExpressionTypingVisitorDispatcher.java:393)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForDeclarations.visitUnaryExpression(ExpressionTypingVisitorDispatcher.java:46)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitPostfixExpression(KtVisitor.java:210)
// 	at org.jetbrains.kotlin.psi.KtPostfixExpression.accept(KtPostfixExpression.java:37)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getTypeInfo(ExpressionTypingServices.java:125)
// 	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getQualifiedExpressionTypeInfo(CallExpressionResolver.kt:449)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitQualifiedExpression(BasicExpressionTypingVisitor.java:702)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitQualifiedExpression(ExpressionTypingVisitorDispatcher.java:383)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForBlock.visitQualifiedExpression(ExpressionTypingVisitorDispatcher.java:59)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitDotQualifiedExpression(KtVisitor.java:302)
// 	at org.jetbrains.kotlin.psi.KtDotQualifiedExpression.accept(KtDotQualifiedExpression.kt:32)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils.getTypeInfoOrNullType(ExpressionTypingUtils.java:166)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitEquality(BasicExpressionTypingVisitor.java:1146)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitBinaryExpression(BasicExpressionTypingVisitor.java:1076)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitBinaryExpression(ExpressionTypingVisitorDispatcher.java:403)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForBlock.visitBinaryExpression(ExpressionTypingVisitorDispatcher.java:59)
// 	at org.jetbrains.kotlin.psi.KtBinaryExpression.accept(KtBinaryExpression.java:35)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.checkCondition(ControlStructureTypingVisitor.java:75)
// 	at org.jetbrains.kotlin.types.expressions.ControlStructureTypingVisitor.visitIfExpression(ControlStructureTypingVisitor.java:88)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitIfExpression(ExpressionTypingVisitorForStatements.java:467)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorForStatements.visitIfExpression(ExpressionTypingVisitorForStatements.java:66)
// 	at org.jetbrains.kotlin.psi.KtIfExpression.accept(KtIfExpression.java:33)
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
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.checkFunctionReturnType(ExpressionTypingServices.java:178)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.checkFunctionReturnType(ExpressionTypingServices.java:165)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBody(BodyResolver.java:1036)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBody(BodyResolver.java:981)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveFunctionBodies(BodyResolver.java:966)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBehaviorDeclarationBodies(BodyResolver.java:126)
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
// 	... 92 more
// 