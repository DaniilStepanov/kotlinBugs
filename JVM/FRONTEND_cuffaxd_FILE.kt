// Bug happens on JVM 
// FILE: tmp0.kt


class Kla2<Ty1, Ty1>
fun <Ty1
> fu7: Kla2<IFace<>, Ty1
=
fu7!!



// org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (5,1) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// 
// Attachments:
// expression.kt
// fu7
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
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:146)
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
// 	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo(CallExpressionResolver.kt:172)
// 	at org.jetbrains.kotlin.resolve.calls.CallExpressionResolver.getSimpleNameExpressionTypeInfo(CallExpressionResolver.kt:146)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitSimpleNameExpression(BasicExpressionTypingVisitor.java:172)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitSimpleNameExpression(ExpressionTypingVisitorDispatcher.java:333)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForDeclarations.visitSimpleNameExpression(ExpressionTypingVisitorDispatcher.java:46)
// 	at org.jetbrains.kotlin.psi.KtNameReferenceExpression.accept(KtNameReferenceExpression.kt:59)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	... 53 more
// 