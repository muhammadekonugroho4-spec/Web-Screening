package com.stockbit.referral.ui.spinningwheel;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f129082a;

    /* renamed from: b, reason: collision with root package name */
    public String f129083b;

    /* renamed from: c, reason: collision with root package name */
    public int f129084c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f129085e;

    public a(String r2, String r3, int r4, int r5, int r6) {
        p.l(r3, "secondaryText");
        this.f129082a = r2;
        this.f129083b = r3;
        this.f129084c = r4;
        this.d = r5;
        this.f129085e = r6;
    }

    public final int a() {
        return this.f129085e;
    }

    public final String b() {
        return this.f129083b;
    }

    public final void c(int r1) {
        this.f129085e = r1;
    }

    public final void d(String r2) {
        p.l(r2, "<set-?>");
        this.f129083b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f129082a, r52.f129082a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f129083b, r52.f129083b) == true) goto L15;
        return false;
    L15:
        if (this.f129084c == r52.f129084c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f129085e == r52.f129085e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.f129082a;
        if (r02 != null) goto L5;
        int r03 = 0;
    L7:
        return (((((((r03 * 31) + this.f129083b.hashCode()) * 31) + Integer.hashCode(this.f129084c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f129085e);
    L5:
        r03 = r02.hashCode();
        goto L7
    }

    public String toString() {
        return "SpinningWheelItemView(topText=" + this.f129082a + ", secondaryText=" + this.f129083b + ", secondaryTextOrientation=" + this.f129084c + ", icon=" + this.d + ", color=" + this.f129085e + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ a(java.lang.String r2, java.lang.String r3, int r4, int r5, int r6, int r7, kotlin.jvm.internal.i r8) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r8v1 ?? I:??[int, boolean]) = (r7v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.referral.ui.spinningwheel.a.<init>(java.lang.String, java.lang.String, int, int, int, int, kotlin.jvm.internal.i):void, file: classes10.dex
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
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 0
        L5:
            r8 = r7 & 2
            if (r8 == 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.referral.ui.spinningwheel.a.<init>(java.lang.String, java.lang.String, int, int, int, int, kotlin.jvm.internal.i):void");
    }
}
