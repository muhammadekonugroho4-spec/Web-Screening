package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f156690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156692c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156693e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156694f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156695g;

    public w(boolean r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        kotlin.jvm.internal.p.l(r3, "companySymbol");
        kotlin.jvm.internal.p.l(r4, "ratio");
        kotlin.jvm.internal.p.l(r5, "factor");
        kotlin.jvm.internal.p.l(r6, "cumDate");
        kotlin.jvm.internal.p.l(r7, "exDate");
        kotlin.jvm.internal.p.l(r8, "recDate");
        this.f156690a = r2;
        this.f156691b = r3;
        this.f156692c = r4;
        this.d = r5;
        this.f156693e = r6;
        this.f156694f = r7;
        this.f156695g = r8;
    }

    public final String a() {
        return this.f156691b;
    }

    public final String b() {
        return this.f156693e;
    }

    public final String c() {
        return this.f156694f;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f156692c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (this.f156690a == r52.f156690a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156691b, r52.f156691b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156692c, r52.f156692c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156693e, r52.f156693e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156694f, r52.f156694f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156695g, r52.f156695g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f156695g;
    }

    public final boolean g() {
        return this.f156690a;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f156690a) * 31) + this.f156691b.hashCode()) * 31) + this.f156692c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156693e.hashCode()) * 31) + this.f156694f.hashCode()) * 31) + this.f156695g.hashCode();
    }

    public String toString() {
        return "CorpActionReverseSplitUIState(isActive=" + this.f156690a + ", companySymbol=" + this.f156691b + ", ratio=" + this.f156692c + ", factor=" + this.d + ", cumDate=" + this.f156693e + ", exDate=" + this.f156694f + ", recDate=" + this.f156695g + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ w(boolean r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.i r10) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r10v1 ?? I:??[int, boolean]) = (r9v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.usecase.company.model.w.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.MethodGen.generateSimpleCode(MethodGen.java:355)
            	at jadx.core.codegen.MethodGen.addSimpleMethodCode(MethodGen.java:323)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:286)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.ArgType.getPrimitiveType()" because "type" is null
            	at jadx.core.codegen.ClassGen.useType(ClassGen.java:554)
            	at jadx.core.codegen.InsnGen.useType(InsnGen.java:269)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:166)
            	at jadx.core.codegen.InsnGen.declareVar(InsnGen.java:159)
            	at jadx.core.codegen.InsnGen.assignVar(InsnGen.java:152)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:299)
            	... 31 more
            */
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L5
            r2 = 0
        L5:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto Lc
            r3 = r0
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.usecase.company.model.w.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
