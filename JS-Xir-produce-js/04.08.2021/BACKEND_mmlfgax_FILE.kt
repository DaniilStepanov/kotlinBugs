// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// WITH_RUNTIME
// FILE: tmp0.kt















 
 
 {
    

    v@ return@v
}




// STACKTRACE:
// java.lang.NullPointerException
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.jumpCrossesTryCatchBoundary(ControlFlowProcessor.kt:914)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.returnCrossesTryCatchBoundary(ControlFlowProcessor.kt:905)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.visitReturnExpression(ControlFlowProcessor.kt:941)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitReturnExpression(KtVisitorVoid.java:723)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitReturnExpression(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtReturnExpression.accept(KtReturnExpression.java:33)
// 	at org.jetbrains.kotlin.psi.KtElementImpl.accept(KtElementImpl.java:51)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.generateInstructions(ControlFlowProcessor.kt:180)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.visitLabeledExpression(ControlFlowProcessor.kt:300)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitLabeledExpression(KtVisitorVoid.java:693)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitLabeledExpression(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtLabeledExpression.accept(KtLabeledExpression.kt:29)
// 	at org.jetbrains.kotlin.psi.KtElementImpl.accept(KtElementImpl.java:51)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.generateInstructions(ControlFlowProcessor.kt:180)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.visitBlockExpression(ControlFlowProcessor.kt:1019)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitBlockExpression(KtVisitorVoid.java:861)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitBlockExpression(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:79)
// 	at org.jetbrains.kotlin.psi.KtBlockExpression.accept(KtBlockExpression.java:86)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor$CFPVisitor.generateInstructions(ControlFlowProcessor.kt:180)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor.generate(ControlFlowProcessor.kt:93)
// 	at org.jetbrains.kotlin.cfg.ControlFlowProcessor.generatePseudocode(ControlFlowProcessor.kt:78)
// 	at org.jetbrains.kotlin.cfg.ControlFlowInformationProviderImpl.<init>(ControlFlowInformationProviderImpl.kt:87)
// 	at org.jetbrains.kotlin.cfg.ControlFlowInformationProviderImpl$Factory.createControlFlowInformationProvider(ControlFlowInformationProviderImpl.kt:1242)
// 	at org.jetbrains.kotlin.resolve.ControlFlowAnalyzer.checkFunction(ControlFlowAnalyzer.java:122)
// 	at org.jetbrains.kotlin.resolve.ControlFlowAnalyzer.process(ControlFlowAnalyzer.java:75)
// 	at org.jetbrains.kotlin.resolve.BodyResolver.resolveBodies(BodyResolver.java:254)
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
// 