// Bug happens on JVM 
// !LANGUAGE: +InlineClasses
// FILE: tmp0.kt


fun box()  {
TODO()
val i = (1 .. 1).iterator().next()
try {
{
++i
}
}
catch(Outer: NotImplementedError)
{}
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
// FUN name:box visibility:public modality:FINAL <> () returnType:kotlin.Unit
//   BLOCK_BODY
//     BLOCK type=kotlin.Nothing origin=null
//       CALL 'public final fun TODO (): kotlin.Nothing [inline] declared in kotlin.StandardKt' type=kotlin.Nothing origin=null
//       CALL 'public final fun throwKotlinNothingValueException (): kotlin.Nothing declared in kotlin.jvm.internal.Intrinsics' type=kotlin.Nothing origin=null
//     VAR name:i type:kotlin.Int [val]
//       CALL 'public final fun next (): kotlin.Int [operator] declared in kotlin.collections.IntIterator' type=kotlin.Int origin=null
//         $this: CALL 'public open fun iterator (): kotlin.collections.IntIterator [fake_override,operator] declared in kotlin.ranges.IntRange' type=kotlin.collections.IntIterator origin=null
//           $this: CALL 'public final fun rangeTo (other: kotlin.Int): kotlin.ranges.IntRange [operator] declared in kotlin.Int' type=kotlin.ranges.IntRange origin=RANGE
//             $this: CONST Int type=kotlin.Int value=1
//             other: CONST Int type=kotlin.Int value=1
//     TRY type=kotlin.Unit
//       try: BLOCK type=kotlin.Unit origin=null
//         COMPOSITE type=kotlin.Unit origin=null
//           BLOCK type=<root>.Tmp0Kt.box.<no name provided> origin=null
//             CLASS LAMBDA_IMPL CLASS name:<no name provided> modality:FINAL visibility:public/*package*/ superTypes:[kotlin.jvm.internal.Lambda; kotlin.jvm.functions.Function0<kotlin.Int>]
//               $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.box.<no name provided>
//               CONSTRUCTOR GENERATED_MEMBER_IN_CALLABLE_REFERENCE visibility:public/*package*/ <> ($i:kotlin.Int) returnType:<root>.Tmp0Kt.box.<no name provided> [primary]
//                 VALUE_PARAMETER BOUND_VALUE_PARAMETER name:$i index:0 type:kotlin.Int
//                 BLOCK_BODY
//                   SET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Unit origin=INITIALIZER_OF_FIELD_FOR_CAPTURED_VALUE
//                     receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//                     value: GET_VAR '$i: kotlin.Int declared in <root>.Tmp0Kt.box.<no name provided>.<init>' type=kotlin.Int origin=null
//                   DELEGATING_CONSTRUCTOR_CALL 'public constructor <init> (arity: kotlin.Int) declared in kotlin.jvm.internal.Lambda'
//                     arity: CONST Int type=kotlin.Int value=0
//                   BLOCK type=kotlin.Unit origin=null
//               FUN name:invoke visibility:public modality:FINAL <> ($this:<root>.Tmp0Kt.box.<no name provided>) returnType:kotlin.Int
//                 overridden:
//                   public abstract fun invoke (): R of kotlin.jvm.functions.Function0 declared in kotlin.jvm.functions.Function0
//                 $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.box.<no name provided>
//                 BLOCK_BODY
//                   COMPOSITE type=kotlin.Unit origin=null
//                     BLOCK type=kotlin.Int origin=PREFIX_INCR
//                       SET_VAR 'val i: kotlin.Int [val] declared in <root>.Tmp0Kt.box' type=kotlin.Unit origin=PREFIX_INCR
//                         CALL 'public final fun inc (): kotlin.Int [operator] declared in kotlin.Int' type=kotlin.Int origin=PREFIX_INCR
//                           $this: GET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Int origin=null
//                             receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//                       GET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Int origin=null
//                         receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//                     COMPOSITE type=kotlin.Unit origin=null
//               FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]
//               FUN BRIDGE name:invoke visibility:public modality:OPEN <> ($this:<root>.Tmp0Kt.box.<no name provided>) returnType:kotlin.Any?
//                 $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.box.<no name provided>
//                 EXPRESSION_BODY
//                   CALL 'public final fun invoke (): kotlin.Int declared in <root>.Tmp0Kt.box.<no name provided>' type=kotlin.Int origin=BRIDGE_DELEGATION
//                     $this: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//             CONSTRUCTOR_CALL 'public/*package*/ constructor <init> ($i: kotlin.Int) [primary] declared in <root>.Tmp0Kt.box.<no name provided>' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//               $i: GET_VAR 'val i: kotlin.Int [val] declared in <root>.Tmp0Kt.box' type=kotlin.Int origin=null
//           COMPOSITE type=kotlin.Unit origin=null
//       CATCH parameter=val Outer: kotlin.NotImplementedError [val] declared in <root>.Tmp0Kt.box
//         VAR CATCH_PARAMETER name:Outer type:kotlin.NotImplementedError [val]
//         BLOCK type=kotlin.Unit origin=null
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
// FUN name:invoke visibility:public modality:FINAL <> ($this:<root>.Tmp0Kt.box.<no name provided>) returnType:kotlin.Int
//   overridden:
//     public abstract fun invoke (): R of kotlin.jvm.functions.Function0 declared in kotlin.jvm.functions.Function0
//   $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.box.<no name provided>
//   BLOCK_BODY
//     COMPOSITE type=kotlin.Unit origin=null
//       BLOCK type=kotlin.Int origin=PREFIX_INCR
//         SET_VAR 'val i: kotlin.Int [val] declared in <root>.Tmp0Kt.box' type=kotlin.Unit origin=PREFIX_INCR
//           CALL 'public final fun inc (): kotlin.Int [operator] declared in kotlin.Int' type=kotlin.Int origin=PREFIX_INCR
//             $this: GET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Int origin=null
//               receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//         GET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Int origin=null
//           receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//       COMPOSITE type=kotlin.Unit origin=null
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
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:451)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitor$DefaultImpls.visitComposite(IrElementVisitor.kt:61)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitComposite(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitComposite(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrCompositeImpl.accept(IrCompositeImpl.kt:42)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:451)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitor$DefaultImpls.visitBlock(IrElementVisitor.kt:60)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock(ExpressionCodegen.kt:388)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept(IrBlockImpl.kt:48)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTryWithInfo(ExpressionCodegen.kt:1175)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry(ExpressionCodegen.kt:1166)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitTry(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrTryImpl.accept(IrTryImpl.kt:53)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody(ExpressionCodegen.kt:446)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlockBody(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.IrBlockBody.accept(IrBody.kt:54)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.generate(ExpressionCodegen.kt:237)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.doGenerate(FunctionCodegen.kt:122)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.FunctionCodegen.generate(FunctionCodegen.kt:48)
// 	... 34 more
// Caused by: java.lang.AssertionError: Non-mapped local declaration: VAR name:i type:kotlin.Int [val]
//  in FUN name:invoke visibility:public modality:FINAL <> ($this:<root>.Tmp0Kt.box.<no name provided>) returnType:kotlin.Int
//   overridden:
//     public abstract fun invoke (): R of kotlin.jvm.functions.Function0 declared in kotlin.jvm.functions.Function0
//   $this: VALUE_PARAMETER INSTANCE_RECEIVER name:<this> type:<root>.Tmp0Kt.box.<no name provided>
//   BLOCK_BODY
//     COMPOSITE type=kotlin.Unit origin=null
//       BLOCK type=kotlin.Int origin=PREFIX_INCR
//         SET_VAR 'val i: kotlin.Int [val] declared in <root>.Tmp0Kt.box' type=kotlin.Unit origin=PREFIX_INCR
//           CALL 'public final fun inc (): kotlin.Int [operator] declared in kotlin.Int' type=kotlin.Int origin=PREFIX_INCR
//             $this: GET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Int origin=null
//               receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//         GET_FIELD 'FIELD FIELD_FOR_CAPTURED_VALUE name:$i type:kotlin.Int visibility:public/*package*/ [final]' type=kotlin.Int origin=null
//           receiver: GET_VAR '<this>: <root>.Tmp0Kt.box.<no name provided> declared in <root>.Tmp0Kt.box.<no name provided>.invoke' type=<root>.Tmp0Kt.box.<no name provided> origin=null
//       COMPOSITE type=kotlin.Unit origin=null
// 
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.findLocalIndex(ExpressionCodegen.kt:761)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.handleIntVariableSpecialCases(ExpressionCodegen.kt:791)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetValue(ExpressionCodegen.kt:826)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitSetValue(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrSetValueImpl.accept(IrSetValueImpl.kt:43)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitStatementContainer(ExpressionCodegen.kt:442)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:451)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitContainerExpression(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.visitors.IrElementVisitor$DefaultImpls.visitBlock(IrElementVisitor.kt:60)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock(ExpressionCodegen.kt:388)
// 	at org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen.visitBlock(ExpressionCodegen.kt:136)
// 	at org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl.accept(IrBlockImpl.kt:48)
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
// 	... 73 more
// 