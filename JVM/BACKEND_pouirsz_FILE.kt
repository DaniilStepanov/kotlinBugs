// Bug happens on JVM 
// FILE: tmp0.kt


@Suppress( "INVISIBLE_MEMBER","INVISIBLE_REFERENCE")
@kotlin.internal.LowPriorityInOverloadResolution
fun fu1(java: Any) = 1
fun fu1(a: Any) = TODO().get(TODO())



// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.IllegalStateException was thrown at: org.jetbrains.kotlin.ir.symbols.impl.IrBindablePublicSymbolBase.bind(IrPublicSymbolBase.kt:58)
// 	at org.jetbrains.kotlin.backend.common.CodegenUtil.reportBackendException(CodegenUtil.kt:239)
// 	at org.jetbrains.kotlin.backend.common.CodegenUtil.reportBackendException$default(CodegenUtil.kt:235)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:78)
// 	at org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateSingleFile(ModuleGenerator.kt:67)
// 	at org.jetbrains.kotlin.psi2ir.generators.ModuleGenerator.generateModuleFragment(ModuleGenerator.kt:47)
// 	at org.jetbrains.kotlin.psi2ir.Psi2IrTranslator.generateModuleFragment(Psi2IrTranslator.kt:78)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr(JvmIrCodegenFactory.kt:146)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.convertToIr$default(JvmIrCodegenFactory.kt:64)
// 	at org.jetbrains.kotlin.backend.jvm.JvmIrCodegenFactory.generateModule(JvmIrCodegenFactory.kt:59)
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
// Caused by: java.lang.IllegalStateException: IrSimpleFunctionPublicSymbolImpl for /fu1|-6265007112105827683[0] is already bound: FUN name:fu1 visibility:public modality:FINAL <> () returnType:<Uninitialized>
// 	at org.jetbrains.kotlin.ir.symbols.impl.IrBindablePublicSymbolBase.bind(IrPublicSymbolBase.kt:58)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrFunctionImpl.<init>(IrFunctionImpl.kt:99)
// 	at org.jetbrains.kotlin.ir.declarations.impl.IrFactoryImpl.createFunction(IrFactoryImpl.kt:125)
// 	at org.jetbrains.kotlin.ir.declarations.IrFactory$DefaultImpls.createFunction$default(IrFactory.kt:91)
// 	at org.jetbrains.kotlin.ir.util.OverridesKt$declareSimpleFunctionWithOverrides$1.invoke(overrides.kt:25)
// 	at org.jetbrains.kotlin.ir.util.OverridesKt$declareSimpleFunctionWithOverrides$1.invoke(overrides.kt:23)
// 	at org.jetbrains.kotlin.ir.util.SymbolTable.declareSimpleFunction(SymbolTable.kt:1819)
// 	at org.jetbrains.kotlin.ir.util.OverridesKt.declareSimpleFunctionWithOverrides(overrides.kt:23)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.declareSimpleFunctionInner(FunctionGenerator.kt:87)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.access$declareSimpleFunctionInner(FunctionGenerator.kt:38)
// 	at org.jetbrains.kotlin.psi2ir.generators.FunctionGenerator.generateFunctionDeclaration(FunctionGenerator.kt:395)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:49)
// 	... 21 more
// 