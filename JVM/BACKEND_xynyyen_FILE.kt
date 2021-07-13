// Bug happens on JVM 
// FILE: tmp0.kt


val test by test



// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during psi2ir
// File being compiled: /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.ArrayIndexOutOfBoundsException was thrown at: org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.updateNullThisRefValue(DelegatedPropertyGenerator.kt:435)
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
// Caused by: java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// 	at org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.updateNullThisRefValue(DelegatedPropertyGenerator.kt:435)
// 	at org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedPropertyGetterBody(DelegatedPropertyGenerator.kt:404)
// 	at org.jetbrains.kotlin.psi2ir.generators.DelegatedPropertyGenerator.generateDelegatedProperty(DelegatedPropertyGenerator.kt:72)
// 	at org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generateDelegatedProperty(PropertyGenerator.kt:174)
// 	at org.jetbrains.kotlin.psi2ir.generators.PropertyGenerator.generatePropertyDeclaration(PropertyGenerator.kt:43)
// 	at org.jetbrains.kotlin.psi2ir.generators.DeclarationGenerator.generateMemberDeclaration(DeclarationGenerator.kt:51)
// 	... 21 more
// 