package com.stockbit.domain.model.valueobject.company.pricefeed;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f86813a;

    /* renamed from: b, reason: collision with root package name */
    public final float f86814b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86815c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final float f86816e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86817f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86818g;

    public a(String r2, float r3, String r4, String r5, float r6, String r7, String r8) {
        p.l(r2, "stockCode");
        p.l(r4, "bestBidPriceFormatted");
        p.l(r5, "bestBidQuantity");
        p.l(r7, "bestAskPriceFormatted");
        p.l(r8, "bestAskQuantity");
        this.f86813a = r2;
        this.f86814b = r3;
        this.f86815c = r4;
        this.d = r5;
        this.f86816e = r6;
        this.f86817f = r7;
        this.f86818g = r8;
    }

    public final String a() {
        return this.f86817f;
    }

    public final float b() {
        return this.f86816e;
    }

    public final String c() {
        return this.f86818g;
    }

    public final String d() {
        return this.f86815c;
    }

    public final float e() {
        return this.f86814b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f86813a, r52.f86813a) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.f86814b, r52.f86814b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f86815c, r52.f86815c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (Float.compare(this.f86816e, r52.f86816e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f86817f, r52.f86817f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86818g, r52.f86818g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f86813a;
    }

    public int hashCode() {
        return (((((((((((this.f86813a.hashCode() * 31) + Float.hashCode(this.f86814b)) * 31) + this.f86815c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.hashCode(this.f86816e)) * 31) + this.f86817f.hashCode()) * 31) + this.f86818g.hashCode();
    }

    public String toString() {
        return "BestBidOfferUIState(stockCode=" + this.f86813a + ", bestBidPriceRaw=" + this.f86814b + ", bestBidPriceFormatted=" + this.f86815c + ", bestBidQuantity=" + this.d + ", bestAskPriceRaw=" + this.f86816e + ", bestAskPriceFormatted=" + this.f86817f + ", bestAskQuantity=" + this.f86818g + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ a(java.lang.String r3, float r4, java.lang.String r5, java.lang.String r6, float r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.i r11) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r11v1 ?? I:??[int, boolean]) = (r10v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.domain.model.valueobject.company.pricefeed.a.<init>(java.lang.String, float, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void, file: classes8.dex
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
            r2 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r11 = r10 & 2
            r0 = 0
            if (r11 == 0) goto Lc
            r4 = r0
        Lc:
            r11 = r10 & 4
            java.lang.String r1 = "-"
            if (r11 == 0) goto L13
            r5 = r1
        L13:
            r11 = r10 & 8
            if (r11 == 0) goto L18
            r6 = r1
        L18:
            r11 = r10 & 16
            if (r11 == 0) goto L1d
            r7 = r0
        L1d:
            r11 = r10 & 32
            if (r11 == 0) goto L22
            r8 = r1
        L22:
            r10 = r10 & 64
            if (r10 == 0) goto L2f
            r11 = r1
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L37
        L2f:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L37:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.domain.model.valueobject.company.pricefeed.a.<init>(java.lang.String, float, java.lang.String, java.lang.String, float, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
