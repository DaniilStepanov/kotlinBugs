// Bug happens on JS -Xir-produce-js ver 1.6.0-dev-1486
// FILE: tmp0.kt









typealias Action2<K> = Action2<











val 
: Action2



























// STACKTRACE:
// org.jetbrains.kotlin.util.KotlinFrontEndException: Front-end Internal error: Failed to analyze declaration Tag5
// File being compiled: (11,1) in /home/stepanov/Kotlin/bbfgradle/tmp/tmp0.kt
// The root cause java.lang.IndexOutOfBoundsException was thrown at: kotlin.collections.EmptyList.subList(Collections.kt:49)
// 	at org.jetbrains.kotlin.resolve.ExceptionWrappingKtVisitorVoid.visitDeclaration(ExceptionWrappingKtVisitorVoid.kt:43)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitDeclaration(KtVisitorVoid.java:457)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitDeclaration(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitNamedDeclaration(KtVisitor.java:398)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitNamedDeclaration(KtVisitorVoid.java:381)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitNamedDeclaration(KtVisitorVoid.java:969)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitNamedDeclaration(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitClassOrObject(KtVisitor.java:41)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClassOrObject(KtVisitorVoid.java:37)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClassOrObject(KtVisitorVoid.java:469)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClassOrObject(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitClass(KtVisitor.java:33)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClass(KtVisitorVoid.java:33)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClass(KtVisitorVoid.java:463)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClass(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtClass.accept(KtClass.kt:20)
// 	at org.jetbrains.kotlin.psi.KtElementImplStub.accept(KtElementImplStub.java:49)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer$analyzeDeclarations$1.registerDeclarations(LazyTopDownAnalyzer.kt:80)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer$analyzeDeclarations$1.visitKtFile(LazyTopDownAnalyzer.kt:98)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitKtFile(KtVisitorVoid.java:517)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitKtFile(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtFile.accept(KtFile.kt:243)
// 	at org.jetbrains.kotlin.psi.KtFile.accept(KtFile.kt:230)
// 	at org.jetbrains.kotlin.resolve.ExceptionWrappingKtVisitorVoid.visitElement(ExceptionWrappingKtVisitorVoid.kt:27)
// 	at com.intellij.psi.PsiElementVisitor.visitFile(PsiElementVisitor.java:35)
// 	at org.jetbrains.kotlin.psi.KtVisitor.visitKtFile(KtVisitor.java:73)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitKtFile(KtVisitorVoid.java:69)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitKtFile(KtVisitorVoid.java:517)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitKtFile(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtFile.accept(KtFile.kt:243)
// 	at org.jetbrains.kotlin.psi.KtFile.accept(KtFile.kt:230)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer.analyzeDeclarations(LazyTopDownAnalyzer.kt:203)
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
// Caused by: java.lang.IndexOutOfBoundsException: fromIndex: 1, toIndex: 0
// 	at kotlin.collections.EmptyList.subList(Collections.kt:49)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.appendDefaultArgumentsForLocalClassifier(TypeResolver.kt:902)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.buildFinalArgumentList(TypeResolver.kt:586)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias(TypeResolver.kt:634)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier(TypeResolver.kt:513)
// 	at org.jetbrains.kotlin.resolve.TypeResolver$resolveTypeElement$1.visitUserType(TypeResolver.kt:263)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitUserType(KtVisitorVoid.java:933)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitUserType(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtUserType.accept(KtUserType.java:42)
// 	at org.jetbrains.kotlin.psi.KtElementImplStub.accept(KtElementImplStub.java:49)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement(TypeResolver.kt:245)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType(TypeResolver.kt:124)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveType(TypeResolver.kt:114)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.access$resolveType(TypeResolver.kt:64)
// 	at org.jetbrains.kotlin.resolve.TypeResolver$resolveTypeElement$1.visitFunctionType(TypeResolver.kt:330)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitFunctionType(KtVisitorVoid.java:945)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitFunctionType(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtFunctionType.accept(KtFunctionType.java:64)
// 	at org.jetbrains.kotlin.psi.KtElementImplStub.accept(KtElementImplStub.java:49)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement(TypeResolver.kt:245)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType(TypeResolver.kt:124)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveType(TypeResolver.kt:114)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveAbbreviatedType(TypeResolver.kt:92)
// 	at org.jetbrains.kotlin.resolve.DescriptorResolver.lambda$resolveTypeAliasDescriptor$2(DescriptorResolver.java:780)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:408)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValue.invoke(LockBasedStorageManager.java:527)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyTypeAliasDescriptor.getUnderlyingType(LazyTypeAliasDescriptor.kt:54)
// 	at org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor.isInner(AbstractTypeAliasDescriptor.kt:55)
// 	at org.jetbrains.kotlin.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(typeParameterUtils.kt:29)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyTypeAliasDescriptor$lazyTypeConstructorParameters$1.invoke(LazyTypeAliasDescriptor.kt:84)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyTypeAliasDescriptor$lazyTypeConstructorParameters$1.invoke(LazyTypeAliasDescriptor.kt:84)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:408)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedNotNullLazyValue.invoke(LockBasedStorageManager.java:527)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyTypeAliasDescriptor.getTypeConstructorTypeParameters(LazyTypeAliasDescriptor.kt:114)
// 	at org.jetbrains.kotlin.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1.getParameters(AbstractTypeAliasDescriptor.kt:105)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForTypeAlias(TypeResolver.kt:615)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeForClassifier(TypeResolver.kt:513)
// 	at org.jetbrains.kotlin.resolve.TypeResolver$resolveTypeElement$1.visitUserType(TypeResolver.kt:263)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitUserType(KtVisitorVoid.java:933)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitUserType(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtUserType.accept(KtUserType.java:42)
// 	at org.jetbrains.kotlin.psi.KtElementImplStub.accept(KtElementImplStub.java:49)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveTypeElement(TypeResolver.kt:245)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolvePossiblyBareType(TypeResolver.kt:124)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveType(TypeResolver.kt:114)
// 	at org.jetbrains.kotlin.resolve.TypeResolver.resolveType(TypeResolver.kt:85)
// 	at org.jetbrains.kotlin.resolve.FunctionDescriptorResolver.resolveValueParameters(FunctionDescriptorResolver.kt:441)
// 	at org.jetbrains.kotlin.resolve.FunctionDescriptorResolver.createConstructorDescriptor(FunctionDescriptorResolver.kt:409)
// 	at org.jetbrains.kotlin.resolve.FunctionDescriptorResolver.resolvePrimaryConstructorDescriptor(FunctionDescriptorResolver.kt:344)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor(LazyClassMemberScope.kt:507)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope$primaryConstructor$1.invoke(LazyClassMemberScope.kt:192)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope$primaryConstructor$1.invoke(LazyClassMemberScope.kt:192)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$LockBasedLazyValue.invoke(LockBasedStorageManager.java:408)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getPrimaryConstructor(LazyClassMemberScope.kt:495)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters(LazyClassMemberScope.kt:410)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties(LazyClassMemberScope.kt:395)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.doGetProperties(AbstractLazyMemberScope.kt:145)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.access$doGetProperties(AbstractLazyMemberScope.kt:36)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope$propertyDescriptors$1.invoke(AbstractLazyMemberScope.kt:51)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope$propertyDescriptors$1.invoke(AbstractLazyMemberScope.kt:51)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$MapBasedMemoizedFunction.invoke(LockBasedStorageManager.java:578)
// 	at org.jetbrains.kotlin.storage.LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull.invoke(LockBasedStorageManager.java:651)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope.getContributedVariables(AbstractLazyMemberScope.kt:139)
// 	at org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedVariables(LazyClassMemberScope.kt:380)
// 	at org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver$resolveToDescriptor$1.visitParameter(LazyDeclarationResolver.kt:139)
// 	at org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver$resolveToDescriptor$1.visitParameter(LazyDeclarationResolver.kt:94)
// 	at org.jetbrains.kotlin.psi.KtParameter.accept(KtParameter.java:50)
// 	at org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver.resolveToDescriptor(LazyDeclarationResolver.kt:94)
// 	at org.jetbrains.kotlin.resolve.lazy.LazyDeclarationResolver.resolveToDescriptor(LazyDeclarationResolver.kt:91)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer$analyzeDeclarations$1.registerPrimaryConstructorParameters(LazyTopDownAnalyzer.kt:157)
// 	at org.jetbrains.kotlin.resolve.LazyTopDownAnalyzer$analyzeDeclarations$1.visitClass(LazyTopDownAnalyzer.kt:149)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClass(KtVisitorVoid.java:463)
// 	at org.jetbrains.kotlin.psi.KtVisitorVoid.visitClass(KtVisitorVoid.java:21)
// 	at org.jetbrains.kotlin.psi.KtClass.accept(KtClass.kt:20)
// 	at org.jetbrains.kotlin.psi.KtElementImplStub.accept(KtElementImplStub.java:49)
// 	at org.jetbrains.kotlin.resolve.ExceptionWrappingKtVisitorVoid.visitDeclaration(ExceptionWrappingKtVisitorVoid.kt:32)
// 	... 54 more
// 