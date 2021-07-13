// Bug happens on JVM 
// WITH_RUNTIME
// FILE: tmp0.kt


fun <Ty0> fu0(command: Ty0) : Int = TODO()
inline fun <Ty1> fu1(action: () -> Ty1)  = action()
fun fu1(): Any {
    fu0 {
        try {
try {
fu1 {
return@fu0
}
}
finally {
return@fu0
}
}
finally {}
    }
return ""
}



// org.jetbrains.kotlin.backend.common.BackendException: Backend Internal error: Exception during IR lowering
// File being compiled: /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.RuntimeException was thrown at: org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate(FunctionCodegen.kt:50)
// 	at org.jetbrains.kotlin.backend.common.CodegenUtil.reportBackendException(CodegenUtil.kt:239)
// 	at org.jetbrains.kotlin.backend.common.CodegenUtil.reportBackendException$default(CodegenUtil.kt:235)
// 	at org.jetbrains.kotlin.backend.common.phaser.PerformByIrFilePhase.invokeSequential(performByIrFile.kt:68)
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
// Caused by: java.lang.RuntimeException: Exception while generating code for:
// FUN name:fu1 visibility:public modality:FINAL <> () returnType:kotlin.Any
//   BLOCK_BODY
//     COMPOSITE type=kotlin.Unit origin=null
//       CALL 'public final fun fu0 <Ty0> (command: Ty0 of <root>.Tmp0Kt.fu0): kotlin.Int declared in <root>.Tmp0Kt' type=kotlin.Int origin=null
//         <Ty0>: kotlin.Function0<kotlin.Unit>
//         command: BLOCK type=<root>.Tmp0Kt.fu1.<no name provided> origin=null
//           CLASS LAMBDA_IMPL CLASS name:<no name provided> modality:FINAL visibility:public/*package*/ superTypes:[kotlin.jvm.internal.Lambda; kotlin.jvm.functions.Function0<kotlin.Unit>]
//             $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.fu1.<no name provided>
//             CONSTRUCTOR GENERATED_MEMBER_IN_CALLABLE_REFERENCE visibility:public/*package*/ <> () returnType:<root>.Tmp0Kt.fu1.<no name provided> [primary]
//               BLOCK_BODY
//                 DELEGATING_CONSTRUCTOR_CALL 'public constructor <init> (arity: kotlin.Int) declared in kotlin.jvm.internal.Lambda'
//                   arity: CONST Int type=kotlin.Int value=0
//                 BLOCK type=kotlin.Unit origin=null
//             FUN name:invoke visibility:public modality:FINAL <> ($this:<root>.Tmp0Kt.fu1.<no name provided>) returnType:kotlin.Unit
//               overridden:
//                 public abstract fun invoke (): R of kotlin.jvm.functions.Function0 declared in kotlin.jvm.functions.Function0
//               $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.fu1.<no name provided>
//               BLOCK_BODY
//                 TRY type=kotlin.Unit
//                   try: BLOCK type=kotlin.Unit origin=null
//                     TRY type=kotlin.Unit
//                       try: BLOCK type=kotlin.Unit origin=null
//                         BLOCK type=kotlin.Nothing origin=null
//                           CALL 'public final fun fu1 <Ty1> (action: kotlin.Function0<Ty1 of <root>.Tmp0Kt.fu1>): Ty1 of <root>.Tmp0Kt.fu1 [inline] declared in <root>.Tmp0Kt' type=kotlin.Nothing origin=null
//                             <Ty1>: kotlin.Nothing
//                             action: BLOCK type=kotlin.Function0<kotlin.Nothing> origin=LAMBDA
//                               COMPOSITE type=kotlin.Unit origin=null
//                               FUNCTION_REFERENCE 'private final fun invoke$lambda-0 (): kotlin.Nothing declared in <root>.Tmp0Kt.fu1.<no name provided>' type=kotlin.Function0<kotlin.Nothing> origin=LAMBDA reflectionTarget=null
//                           CALL 'public final fun throwKotlinNothingValueException (): kotlin.Nothing declared in kotlin.jvm.internal.Intrinsics' type=kotlin.Nothing origin=null
//                       finally: BLOCK type=kotlin.Unit origin=null
//                         RETURN type=kotlin.Nothing from='public final fun invoke (): kotlin.Unit declared in <root>.Tmp0Kt.fu1.<no name provided>'
//                           GET_FIELD 'FIELD FIELD_FOR_OBJECT_INSTANCE name:INSTANCE type:kotlin.Unit visibility:public [final,static]' type=kotlin.Unit origin=null
//                   finally: BLOCK type=kotlin.Unit origin=null
//             FIELD FIELD_FOR_STATIC_CALLABLE_REFERENCE_INSTANCE name:INSTANCE type:<root>.Tmp0Kt.fu1.<no name provided> visibility:public [final,static]
//             FUN CLASS_STATIC_INITIALIZER name:<clinit> visibility:public/*package*/ modality:FINAL <> () returnType:kotlin.Unit
//               BLOCK_BODY
//                 SET_FIELD 'FIELD FIELD_FOR_STATIC_CALLABLE_REFERENCE_INSTANCE name:INSTANCE type:<root>.Tmp0Kt.fu1.<no name provided> visibility:public [final,static]' type=kotlin.Unit origin=INITIALIZE_FIELD
//                   value: CONSTRUCTOR_CALL 'public/*package*/ constructor <init> () [primary] declared in <root>.Tmp0Kt.fu1.<no name provided>' type=<root>.Tmp0Kt.fu1.<no name provided> origin=null
//             FUN BRIDGE name:invoke visibility:public modality:OPEN <> ($this:<root>.Tmp0Kt.fu1.<no name provided>) returnType:kotlin.Any?
//               $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.fu1.<no name provided>
//               EXPRESSION_BODY
//                 CALL 'public final fun invoke (): kotlin.Unit declared in <root>.Tmp0Kt.fu1.<no name provided>' type=kotlin.Unit origin=BRIDGE_DELEGATION
//                   $this: GET_VAR '<this>: <root>.Tmp0Kt.fu1.<no name provided> declared in <root>.Tmp0Kt.fu1.<no name provided>.invoke' type=<root>.Tmp0Kt.fu1.<no name provided> origin=null
//           GET_FIELD 'FIELD FIELD_FOR_STATIC_CALLABLE_REFERENCE_INSTANCE name:INSTANCE type:<root>.Tmp0Kt.fu1.<no name provided> visibility:public [final,static]' type=<root>.Tmp0Kt.fu1.<no name provided> origin=null
//       COMPOSITE type=kotlin.Unit origin=null
//     RETURN type=kotlin.Nothing from='public final fun fu1 (): kotlin.Any declared in <root>.Tmp0Kt'
//       CONST String type=kotlin.String value=""
// 
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate(FunctionCodegen.kt:50)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate$default(FunctionCodegen.kt:43)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethodNode(ClassCodegen.kt:339)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethod(ClassCodegen.kt:356)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate(ClassCodegen.kt:130)
// 	at org.jetbrains.kotlin.backend.jvm.JvmLowerKt$codegenPhase$1$1.lower(JvmLower.kt:303)
// 	at org.jetbrains.kotlin.backend.common.phaser.FileLoweringPhaseAdapter.invoke(PhaseBuilders.kt:120)
// 	at org.jetbrains.kotlin.backend.common.phaser.FileLoweringPhaseAdapter.invoke(PhaseBuilders.kt:116)
// 	at org.jetbrains.kotlin.backend.common.phaser.NamedCompilerPhase.invoke(CompilerPhase.kt:96)
// 	at org.jetbrains.kotlin.backend.common.phaser.PerformByIrFilePhase.invokeSequential(performByIrFile.kt:65)
// 	... 25 more
// Caused by: java.lang.RuntimeException: Exception while generating code for:
// FUN name:invoke visibility:public modality:FINAL <> ($this:<root>.Tmp0Kt.fu1.<no name provided>) returnType:kotlin.Unit
//   overridden:
//     public abstract fun invoke (): R of kotlin.jvm.functions.Function0 declared in kotlin.jvm.functions.Function0
//   $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.fu1.<no name provided>
//   BLOCK_BODY
//     TRY type=kotlin.Unit
//       try: BLOCK type=kotlin.Unit origin=null
//         TRY type=kotlin.Unit
//           try: BLOCK type=kotlin.Unit origin=null
//             BLOCK type=kotlin.Nothing origin=null
//               CALL 'public final fun fu1 <Ty1> (action: kotlin.Function0<Ty1 of <root>.Tmp0Kt.fu1>): Ty1 of <root>.Tmp0Kt.fu1 [inline] declared in <root>.Tmp0Kt' type=kotlin.Nothing origin=null
//                 <Ty1>: kotlin.Nothing
//                 action: BLOCK type=kotlin.Function0<kotlin.Nothing> origin=LAMBDA
//                   COMPOSITE type=kotlin.Unit origin=null
//                   FUNCTION_REFERENCE 'private final fun invoke$lambda-0 (): kotlin.Nothing declared in <root>.Tmp0Kt.fu1.<no name provided>' type=kotlin.Function0<kotlin.Nothing> origin=LAMBDA reflectionTarget=null
//               CALL 'public final fun throwKotlinNothingValueException (): kotlin.Nothing declared in kotlin.jvm.internal.Intrinsics' type=kotlin.Nothing origin=null
//           finally: BLOCK type=kotlin.Unit origin=null
//             RETURN type=kotlin.Nothing from='public final fun invoke (): kotlin.Unit declared in <root>.Tmp0Kt.fu1.<no name provided>'
//               GET_FIELD 'FIELD FIELD_FOR_OBJECT_INSTANCE name:INSTANCE type:kotlin.Unit visibility:public [final,static]' type=kotlin.Unit origin=null
//       finally: BLOCK type=kotlin.Unit origin=null
// 
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate(FunctionCodegen.kt:50)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate$default(FunctionCodegen.kt:43)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethodNode(ClassCodegen.kt:339)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generateMethod(ClassCodegen.kt:356)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ClassCodegen.generate(ClassCodegen.kt:130)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitClass(ExpressionCodegen.kt:900)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitClass(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.declarations.IrClass.accept(IrClass.kt:55)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:451)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitor$DefaultImpls.visitBlock(IrElementVisitor.kt:60)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock(ExpressionCodegen.kt:388)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept(IrBlockImpl.kt:48)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.gen(ExpressionCodegen.kt:219)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator$DefaultImpls.genValueAndPut(IrCallGenerator.kt:47)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator$DefaultCallGenerator.genValueAndPut(IrCallGenerator.kt:50)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall(ExpressionCodegen.kt:488)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitCall(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCallImpl.accept(IrCallImpl.kt:47)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:451)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitor$DefaultImpls.visitComposite(IrElementVisitor.kt:61)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitComposite(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitComposite(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl.accept(IrCompositeImpl.kt:42)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody(ExpressionCodegen.kt:446)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBody.kt:54)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generate(ExpressionCodegen.kt:237)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.doGenerate(FunctionCodegen.kt:122)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate(FunctionCodegen.kt:48)
// 	... 34 more
// Caused by: java.lang.IllegalStateException: Bad exception handler end
// 	at org.jetbrains.kotlin.codegen.inline.MaxStackFrameSizeAndLocalsCalculator.visitMaxs(MaxStackFrameSizeAndLocalsCalculator.java:320)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.doGenerate(FunctionCodegen.kt:126)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate(FunctionCodegen.kt:48)
// 	... 68 more
// 