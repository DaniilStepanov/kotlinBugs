// Bug happens on JVM 
// FILE: tmp0.kt


fun <
 T : Int> Int.box(): T?  = 
    null



// org.jetbrains.kotlin.codegen.CompilationException: Back-end (JVM) Internal error: Couldn't transform method node:
// box (I)I:
//     // annotable parameter count: 1 (visible)
//     // annotable parameter count: 1 (invisible)
//    L0
//     LINENUMBER 3 L0
//     ACONST_NULL
//     IRETURN
//    L1
//     NOP
//    L2
//     LOCALVARIABLE $this$box I L0 L2 0
//     MAXSTACK = 1
//     MAXLOCALS = 1
// 
// File is unknown
// The root cause java.lang.AssertionError was thrown at: org.jetbrains.kotlin.codegen.optimization.MethodVerifier.transform(MethodVerifier.kt:28)
// 	at org.jetbrains.kotlin.codegen.TransformationMethodVisitor.visitEnd(TransformationMethodVisitor.kt:92)
// 	at org.jetbrains.org.objectweb.asm.MethodVisitor.visitEnd(MethodVisitor.java:783)
// 	at org.jetbrains.org.objectweb.asm.tree.MethodNode.accept(MethodNode.java:772)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethod(ClassCodegen.kt:389)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate(ClassCodegen.kt:130)
// 	at org.jetbrains.kotlin.backend.jvm.JvmLowerKt$codegenPhase$1$1.lower(JvmLower.kt:303)
// 	at org.jetbrains.kotlin.backend.common.phaser.FileLoweringPhaseAdapter.invoke(PhaseBuilders.kt:120)
// 	at org.jetbrains.kotlin.backend.common.phaser.FileLoweringPhaseAdapter.invoke(PhaseBuilders.kt:116)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.PerformByIrFilePhase.invokeSequential(performByIrFile.kt:65)
// 	at org.jetbrains.kotlin.backend.common.phaser.PerformByIrFilePhase.invoke(performByIrFile.kt:55)
// 	at org.jetbrains.kotlin.backend.common.phaser.PerformByIrFilePhase.invoke(performByIrFile.kt:41)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.CompositePhase.invoke(PhaseBuilders.kt:29)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.CompositePhase.invoke(PhaseBuilders.kt:29)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.CompilerPhaseKt.invokeToplevel(CompilerPhase.kt:43)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.doGenerateFilesInternal(JvmIrCodegenFactory.kt:191)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.generateModule(JvmIrCodegenFactory.kt:60)
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
// Caused by: java.lang.AssertionError: AFTER mandatory stack transformations: incorrect bytecode
// 	at org.jetbrains.kotlin.codegen.optimization.MethodVerifier.transform(MethodVerifier.kt:28)
// 	at org.jetbrains.kotlin.codegen.optimization.transformer.CompositeMethodTransformer.transform(CompositeMethodTransformer.kt:25)
// 	at org.jetbrains.kotlin.codegen.optimization.OptimizationMethodVisitor.performTransformations(OptimizationMethodVisitor.kt:62)
// 	at org.jetbrains.kotlin.codegen.TransformationMethodVisitor.visitEnd(TransformationMethodVisitor.kt:70)
// 	... 34 more
// Caused by: org.jetbrains.org.objectweb.asm.tree.analysis.AnalyzerException: Error at instruction #3 IRETURN: Expected I, but found R
// 	at org.jetbrains.kotlin.codegen.optimization.common.FastMethodAnalyzer.analyze(FastMethodAnalyzer.kt:148)
// 	at org.jetbrains.kotlin.codegen.optimization.transformer.MethodTransformer.analyze(MethodTransformer.java:48)
// 	at org.jetbrains.kotlin.codegen.optimization.MethodVerifier.transform(MethodVerifier.kt:26)
// 	... 37 more
// Caused by: org.jetbrains.org.objectweb.asm.tree.analysis.AnalyzerException: Expected I, but found R
// 	at org.jetbrains.org.objectweb.asm.tree.analysis.BasicVerifier.unaryOperation(BasicVerifier.java:182)
// 	at org.jetbrains.org.objectweb.asm.tree.analysis.BasicVerifier.unaryOperation(BasicVerifier.java:43)
// 	at org.jetbrains.org.objectweb.asm.tree.analysis.Frame.execute(Frame.java:552)
// 	at org.jetbrains.kotlin.codegen.optimization.common.FastMethodAnalyzer.analyze(FastMethodAnalyzer.kt:122)
// 	... 39 more
// 