package com.stockbit.usecase.company.model;

import androidx.core.app.NotificationCompat;
import com.stockbit.usecase.company.model.CorpActionAllUIState;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final CorpActionAllUIState.Status f156122a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156123b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156124c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156125e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156126f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156127g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156128h;

    /* renamed from: i, reason: collision with root package name */
    public final String f156129i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f156130j;

    public C(CorpActionAllUIState.Status r2, boolean r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, boolean r11) {
        kotlin.jvm.internal.p.l(r2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r4, "companySymbol");
        kotlin.jvm.internal.p.l(r5, "warrantId");
        kotlin.jvm.internal.p.l(r6, "tradingStart");
        kotlin.jvm.internal.p.l(r7, "tradingEnd");
        kotlin.jvm.internal.p.l(r8, "exerciseStart");
        kotlin.jvm.internal.p.l(r9, "exerciseEnd");
        kotlin.jvm.internal.p.l(r10, "exercisePrice");
        this.f156122a = r2;
        this.f156123b = r3;
        this.f156124c = r4;
        this.d = r5;
        this.f156125e = r6;
        this.f156126f = r7;
        this.f156127g = r8;
        this.f156128h = r9;
        this.f156129i = r10;
        this.f156130j = r11;
    }

    public static /* synthetic */ C b(C r02, CorpActionAllUIState.Status r1, boolean r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, boolean r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r02.f156122a;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r02.f156123b;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r02.f156124c;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r02.f156125e;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r02.f156126f;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r02.f156127g;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r8 = r02.f156128h;
    L27:
        if ((r11 & 256) == 0) goto L30;
        r9 = r02.f156129i;
    L30:
        if ((r11 & 512) == 0) goto L32;
        r10 = r02.f156130j;
    L32:
        String r112 = r9;
        boolean r122 = r10;
        String r92 = r7;
        String r102 = r8;
        String r72 = r5;
        String r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102, r112, r122);
    }

    public final C a(CorpActionAllUIState.Status r13, boolean r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, boolean r22) {
        kotlin.jvm.internal.p.l(r13, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r15, "companySymbol");
        kotlin.jvm.internal.p.l(r16, "warrantId");
        kotlin.jvm.internal.p.l(r17, "tradingStart");
        kotlin.jvm.internal.p.l(r18, "tradingEnd");
        kotlin.jvm.internal.p.l(r19, "exerciseStart");
        kotlin.jvm.internal.p.l(r20, "exerciseEnd");
        kotlin.jvm.internal.p.l(r21, "exercisePrice");
        return new C(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
    }

    public final String c() {
        return this.f156124c;
    }

    public final String d() {
        return this.f156128h;
    }

    public final String e() {
        return this.f156129i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C) == true) goto L8;
        return false;
    L8:
        C r52 = (C) r5;
        if (this.f156122a == r52.f156122a) goto L12;
        return false;
    L12:
        if (this.f156123b == r52.f156123b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156124c, r52.f156124c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156125e, r52.f156125e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156126f, r52.f156126f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156127g, r52.f156127g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f156128h, r52.f156128h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f156129i, r52.f156129i) == true) goto L36;
        return false;
    L36:
        if (this.f156130j == r52.f156130j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f156127g;
    }

    public final CorpActionAllUIState.Status g() {
        return this.f156122a;
    }

    public final String h() {
        return this.f156126f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f156122a.hashCode() * 31) + Boolean.hashCode(this.f156123b)) * 31) + this.f156124c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156125e.hashCode()) * 31) + this.f156126f.hashCode()) * 31) + this.f156127g.hashCode()) * 31) + this.f156128h.hashCode()) * 31) + this.f156129i.hashCode()) * 31) + Boolean.hashCode(this.f156130j);
    }

    public final String i() {
        return this.f156125e;
    }

    public final String j() {
        return this.d;
    }

    public final boolean k() {
        return this.f156130j;
    }

    public String toString() {
        return "CorpActionWarrantUIState(status=" + this.f156122a + ", showArrow=" + this.f156123b + ", companySymbol=" + this.f156124c + ", warrantId=" + this.d + ", tradingStart=" + this.f156125e + ", tradingEnd=" + this.f156126f + ", exerciseStart=" + this.f156127g + ", exerciseEnd=" + this.f156128h + ", exercisePrice=" + this.f156129i + ", isActive=" + this.f156130j + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ C(com.stockbit.usecase.company.model.CorpActionAllUIState.Status r3, boolean r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, int r13, kotlin.jvm.internal.i r14) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r14v1 ?? I:??[int, boolean]) = (r13v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.usecase.company.model.C.<init>(com.stockbit.usecase.company.model.CorpActionAllUIState$Status, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.i):void, file: classes2.dex
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
            r14 = r13 & 1
            if (r14 == 0) goto L6
            com.stockbit.usecase.company.model.CorpActionAllUIState$Status r3 = com.stockbit.usecase.company.model.CorpActionAllUIState.Status.Success
        L6:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto Lc
            r4 = r0
        Lc:
            r14 = r13 & 4
            java.lang.String r1 = ""
            if (r14 == 0) goto L13
            r5 = r1
        L13:
            r14 = r13 & 8
            if (r14 == 0) goto L18
            r6 = r1
        L18:
            r14 = r13 & 16
            if (r14 == 0) goto L1d
            r7 = r1
        L1d:
            r14 = r13 & 32
            if (r14 == 0) goto L22
            r8 = r1
        L22:
            r14 = r13 & 64
            if (r14 == 0) goto L27
            r9 = r1
        L27:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L2c
            r10 = r1
        L2c:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L31
            r11 = r1
        L31:
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L41
            r14 = r0
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            goto L4c
        L41:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L4c:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.usecase.company.model.C.<init>(com.stockbit.usecase.company.model.CorpActionAllUIState$Status, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.i):void");
    }
}
