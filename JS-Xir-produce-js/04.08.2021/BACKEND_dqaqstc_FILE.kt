// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// WITH_RUNTIME
// FILE: tmp0.kt


@Suppress("INVISIBLE_MEMBER"
)
fun foo() = 
String("").hashCode()


// STACKTRACE:
// java.lang.IllegalStateException: Validation failed in file tmp0.kt
// 	at org.jetbrains.kotlin.backend.common.IrValidator.error(IrValidator.kt:83)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.access$error(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator$elementChecker$1.invoke(IrValidator.kt:87)
// 	at org.jetbrains.kotlin.backend.common.IrValidator$elementChecker$1.invoke(IrValidator.kt:87)
// 	at org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.ensureBound(CheckIrElementVisitor.kt:61)
// 	at org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitFunctionAccess(CheckIrElementVisitor.kt:321)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:164)
// 	at org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall(CheckIrElementVisitor.kt:160)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:165)
// 	at org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall(CheckIrElementVisitor.kt:24)
// 	at org.jetbrains.kotlin.backend.common.CheckIrElementVisitor.visitCall(CheckIrElementVisitor.kt:24)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptVoid(IrElementVisitorVoid.kt:271)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:90)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitExpression(IrElementVisitorVoid.kt:104)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitMemberAccess(IrElementVisitorVoid.kt:158)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitMemberAccess(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFunctionAccess(IrElementVisitorVoid.kt:161)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFunctionAccess(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:164)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:165)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression.acceptChildren(IrFunctionAccessExpression.kt:42)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitExpression(IrElementVisitorVoid.kt:104)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitMemberAccess(IrElementVisitorVoid.kt:158)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitMemberAccess(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFunctionAccess(IrElementVisitorVoid.kt:161)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFunctionAccess(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:164)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:165)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression.acceptChildren(IrMemberAccessExpression.kt:55)
// 	at org.jetbrains.kotlin.ir.expressions.IrFunctionAccessExpression.acceptChildren(IrFunctionAccessExpression.kt:41)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitExpression(IrElementVisitorVoid.kt:104)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitMemberAccess(IrElementVisitorVoid.kt:158)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitMemberAccess(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFunctionAccess(IrElementVisitorVoid.kt:161)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFunctionAccess(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:164)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCall(IrElementVisitorVoid.kt:165)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCall(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.ir.expressions.IrContainerExpression.acceptChildren(IrBlock.kt:37)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitExpression(IrElementVisitorVoid.kt:104)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitContainerExpression(IrElementVisitorVoid.kt:116)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitContainerExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitBlock(IrElementVisitorVoid.kt:122)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBlock(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitBlock(IrElementVisitorVoid.kt:123)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBlock(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBlock(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept(IrBlockImpl.kt:48)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.acceptChildren(IrTryImpl.kt:93)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCatch(IrElementVisitorVoid.kt:231)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCatch(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitCatch(IrElementVisitorVoid.kt:232)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCatch(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitCatch(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCatchImpl.accept(IrTryImpl.kt:88)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.acceptChildren(IrTryImpl.kt:58)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitExpression(IrElementVisitorVoid.kt:104)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitTry(IrElementVisitorVoid.kt:228)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitTry(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitTry(IrElementVisitorVoid.kt:229)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitTry(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitTry(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.accept(IrTryImpl.kt:53)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl.acceptChildren(IrReturnImpl.kt:37)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitExpression(IrElementVisitorVoid.kt:104)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitExpression(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitReturn(IrElementVisitorVoid.kt:243)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitReturn(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitReturn(IrElementVisitorVoid.kt:244)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitReturn(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitReturn(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrReturnImpl.accept(IrReturnImpl.kt:34)
// 	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.acceptChildren(IrBody.kt:57)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitBody(IrElementVisitorVoid.kt:86)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBody(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitBlockBody(IrElementVisitorVoid.kt:92)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBlockBody(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitBlockBody(IrElementVisitorVoid.kt:93)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBlockBody(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitBlockBody(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBody.kt:54)
// 	at org.jetbrains.kotlin.ir.declarations.IrFunction.acceptChildren(IrFunction.kt:58)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitDeclaration(IrElementVisitorVoid.kt:40)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitDeclaration(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFunction(IrElementVisitorVoid.kt:49)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFunction(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitSimpleFunction(IrElementVisitorVoid.kt:52)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitSimpleFunction(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitSimpleFunction(IrElementVisitorVoid.kt:53)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitSimpleFunction(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitSimpleFunction(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.declarations.IrSimpleFunction.accept(IrSimpleFunction.kt:28)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.acceptChildren(IrFileImpl.kt:84)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitPackageFragment(IrElementVisitorVoid.kt:30)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitPackageFragment(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFile(IrElementVisitorVoid.kt:37)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFile(IrValidator.kt:68)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitFile(IrElementVisitorVoid.kt:38)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFile(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitFile(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrFileImpl.accept(IrFileImpl.kt:81)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.acceptChildren(IrModuleFragmentImpl.kt:40)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoidKt.acceptChildrenVoid(IrElementVisitorVoid.kt:275)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitElement(IrValidator.kt:91)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitModuleFragment(IrElementVisitorVoid.kt:27)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitModuleFragment(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid$DefaultImpls.visitModuleFragment(IrElementVisitorVoid.kt:28)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitModuleFragment(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.backend.common.IrValidator.visitModuleFragment(IrValidator.kt:61)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrModuleFragmentImpl.accept(IrModuleFragmentImpl.kt:37)
// 	at org.jetbrains.kotlin.backend.common.phaser.DumperVerifierKt.validationCallback(DumperVerifier.kt:145)
// 	at org.jetbrains.kotlin.backend.common.phaser.DumperVerifierKt.validationCallback$default(DumperVerifier.kt:137)
// 	at org.jetbrains.kotlin.ir.backend.js.JsLoweringPhasesKt$validateIrBeforeLowering$1.invoke(JsLoweringPhases.kt:130)
// 	at org.jetbrains.kotlin.ir.backend.js.JsLoweringPhasesKt$validateIrBeforeLowering$1.invoke(JsLoweringPhases.kt:129)
// 	at org.jetbrains.kotlin.ir.backend.js.JsLoweringPhasesKt$makeCustomJsModulePhase$1.invoke(JsLoweringPhases.kt:62)
// 	at org.jetbrains.kotlin.ir.backend.js.JsLoweringPhasesKt$makeCustomJsModulePhase$1.invoke(JsLoweringPhases.kt:54)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.CompositePhase.invoke(PhaseBuilders.kt:29)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.CompilerPhaseKt.invokeToplevel(CompilerPhase.kt:43)
// 	at org.jetbrains.kotlin.ir.backend.js.CompilerKt.compile(compiler.kt:136)
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
// 