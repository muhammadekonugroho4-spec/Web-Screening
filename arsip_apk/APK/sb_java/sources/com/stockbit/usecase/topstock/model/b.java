package com.stockbit.usecase.topstock.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f163122a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f163123b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163124c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f163125e;

    public b(String r2, boolean r3, boolean r4, boolean r5, boolean r6) {
        p.l(r2, "bannerMessage");
        this.f163122a = r2;
        this.f163123b = r3;
        this.f163124c = r4;
        this.d = r5;
        this.f163125e = r6;
    }

    public final String a() {
        return this.f163122a;
    }

    public final boolean b() {
        return this.f163124c;
    }

    public final boolean c() {
        return this.f163123b;
    }

    public final boolean d() {
        return this.f163125e;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f163122a, r52.f163122a) == true) goto L12;
        return false;
    L12:
        if (this.f163123b == r52.f163123b) goto L15;
        return false;
    L15:
        if (this.f163124c == r52.f163124c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f163125e == r52.f163125e) goto L23;
        return false;
    L23:
        return true;
    }

    public final void f(String r2) {
        p.l(r2, "<set-?>");
        this.f163122a = r2;
    }

    public int hashCode() {
        return (((((((this.f163122a.hashCode() * 31) + Boolean.hashCode(this.f163123b)) * 31) + Boolean.hashCode(this.f163124c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f163125e);
    }

    public String toString() {
        return "TopStockDisplayOptionUIState(bannerMessage=" + this.f163122a + ", foreignValueColumn=" + this.f163123b + ", displayTotal=" + this.f163124c + ", isNett=" + this.d + ", isForeignShownAsDefault=" + this.f163125e + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ b(java.lang.String r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r8v1 ?? I:??[int, boolean]) = (r7v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.usecase.topstock.model.b.<init>(java.lang.String, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.i):void, file: classes2.dex
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
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
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
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.usecase.topstock.model.b.<init>(java.lang.String, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
