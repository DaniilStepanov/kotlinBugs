// Bug happens on JVM 
// FILE: tmp0.kt


interface Foo {
    fun foo(Double
)
interface FooChain: Foo
class Impl {
    fun foo(: 
) = FooImpl(
.foo
class FooImpl : FooChain, Impl



// org.jetbrains.kotlin.util.KotlinFrontEndException: Exception while analyzing expression at (7,5) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// 
// Attachments:
// expression.kt
// FooImpl(
// .foo
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.logOrThrowException(ExpressionTypingVisitorDispatcher.java:253)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:224)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:164)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:134)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.getTypeInfo(ExpressionTypingVisitorDispatcher.java:146)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingServices.getBodyExpressionType(ExpressionTypingServices.java:239)
// 	at org.jetbrains.kotlin.resolve.DescriptorResolver.lambda$inferReturnTypeFromExpressionBody$4(DescriptorResolver.java:1241)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:408)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValue.invoke(LockBasedStorageManager.java:527)
// 	at org.jetbrains.kotlin.types.DeferredType.getDelegate(DeferredType.java:107)
// 	at org.jetbrains.kotlin.types.WrappedType.unwrap(KotlinType.kt:134)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.isReturnTypeMoreSpecific(OverridingUtil.java:647)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.isMoreSpecific(OverridingUtil.java:594)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.isMoreSpecificThenAllOf(OverridingUtil.java:633)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.selectMostSpecificMember(OverridingUtil.java:669)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.createAndBindFakeOverride(OverridingUtil.java:719)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.createAndBindFakeOverrides(OverridingUtil.java:575)
// 	at org.jetbrains.kotlin.resolve.OverridingUtil.generateOverridesInFunctionGroup(OverridingUtil.java:500)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides(LazyClassMemberScope.kt:206)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions(LazyClassMemberScope.kt:273)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetFunctions(AbstractLazyMemberScope.kt:98)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.access$doGetFunctions(AbstractLazyMemberScope.kt:36)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope$functionDescriptors$1.invoke(AbstractLazyMemberScope.kt:49)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope$functionDescriptors$1.invoke(AbstractLazyMemberScope.kt:49)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$MapBasedMemoizedFunction.invoke(LockBasedStorageManager.java:578)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull.invoke(LockBasedStorageManager.java:651)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedFunctions(AbstractLazyMemberScope.kt:92)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedFunctions(LazyClassMemberScope.kt:249)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors(LazyClassMemberScope.kt:100)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope$allDescriptors$1.invoke(LazyClassMemberScope.kt:70)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope$allDescriptors$1.invoke(LazyClassMemberScope.kt:62)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:408)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValue.invoke(LockBasedStorageManager.java:527)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedDescriptors(LazyClassMemberScope.kt:92)
// 	at org.jetbrains.kotlin.resolve.DescriptorUtils.getAllDescriptors(DescriptorUtils.java:598)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassDescriptor.resolveMemberHeaders(LazyClassDescriptor.java:665)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.resolveAllHeadersInClasses(LazyTopDownAnalyzer.kt:241)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations(LazyTopDownAnalyzer.kt:214)
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
// Caused by: java.lang.AssertionError: Recursion detected on input: foo under LockBasedStorageManager@3ec13b19 (TopDownAnalyzer for JVM)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedFunctions(AbstractLazyMemberScope.kt:92)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedFunctions(LazyClassMemberScope.kt:249)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerLevelsKt.getContributedFunctionsAndIntercept(TowerLevels.kt:429)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerLevelsKt.access$getContributedFunctionsAndIntercept(TowerLevels.kt:1)
// 	at org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel$getFunctions$1.invoke(TowerLevels.kt:189)
// 	at org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel$getFunctions$1.invoke(TowerLevels.kt:188)
// 	at org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.collectMembers(TowerLevels.kt:101)
// 	at org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel.getFunctions(TowerLevels.kt:188)
// 	at org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessorsKt$createSimpleFunctionProcessor$1.invoke(ScopeTowerProcessors.kt:233)
// 	at org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessorsKt$createSimpleFunctionProcessor$1.invoke(ScopeTowerProcessors.kt:233)
// 	at org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.simpleProcess(ScopeTowerProcessors.kt:99)
// 	at org.jetbrains.kotlin.resolve.calls.tower.SimpleScopeTowerProcessor$DefaultImpls.process(ScopeTowerProcessors.kt:60)
// 	at org.jetbrains.kotlin.resolve.calls.tower.AbstractSimpleScopeTowerProcessor.process(ScopeTowerProcessors.kt:63)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor.process(ScopeTowerProcessors.kt:38)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData(TowerResolver.kt:287)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.access$processTowerData(TowerResolver.kt:80)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver$Task.process(TowerResolver.kt:161)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver$Task.run(TowerResolver.kt:180)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run(TowerResolver.kt:99)
// 	at org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runResolve(TowerResolver.kt:86)
// 	at org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall(KotlinCallResolver.kt:75)
// 	at org.jetbrains.kotlin.resolve.calls.tower.PSICallResolver.runResolutionAndInference(PSICallResolver.kt:101)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.doResolveCallOrGetCachedResults(CallResolver.java:601)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.lambda$computeTasksAndResolveCall$0(CallResolver.java:213)
// 	at org.jetbrains.kotlin.util.PerformanceCounter.time(PerformanceCounter.kt:101)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:211)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.computeTasksAndResolveCall(CallResolver.java:199)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.resolveCallWithGivenName(CallResolver.java:163)
// 	at org.jetbrains.kotlin.resolve.calls.CallResolver.resolveBinaryCall(CallResolver.java:248)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.getTypeInfoForBinaryCall(BasicExpressionTypingVisitor.java:1551)
// 	at org.jetbrains.kotlin.types.expressions.BasicExpressionTypingVisitor.visitBinaryExpression(BasicExpressionTypingVisitor.java:1054)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.visitBinaryExpression(ExpressionTypingVisitorDispatcher.java:403)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher$ForDeclarations.visitBinaryExpression(ExpressionTypingVisitorDispatcher.java:46)
// 	at org.jetbrains.kotlin.psi.KtBinaryExpression.accept(KtBinaryExpression.java:35)
// 	at org.jetbrains.kotlin.types.expressions.ExpressionTypingVisitorDispatcher.lambda$getTypeInfo$0(ExpressionTypingVisitorDispatcher.java:175)
// 	... 57 more
// 