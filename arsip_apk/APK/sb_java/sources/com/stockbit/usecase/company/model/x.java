package com.stockbit.usecase.company.model;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.company.model.CorpActionAllUIState;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final CorpActionAllUIState.Status f156696a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f156697b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156698c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156699e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156700f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156701g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156702h;

    /* renamed from: i, reason: collision with root package name */
    public final String f156703i;

    /* renamed from: j, reason: collision with root package name */
    public final String f156704j;

    /* renamed from: k, reason: collision with root package name */
    public final String f156705k;

    /* renamed from: l, reason: collision with root package name */
    public final String f156706l;

    public x(CorpActionAllUIState.Status r2, boolean r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13) {
        kotlin.jvm.internal.p.l(r2, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r4, "companyId");
        kotlin.jvm.internal.p.l(r5, "companySymbol");
        kotlin.jvm.internal.p.l(r6, "ratio");
        kotlin.jvm.internal.p.l(r7, "factor");
        kotlin.jvm.internal.p.l(r8, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r9, "cumDate");
        kotlin.jvm.internal.p.l(r10, "exDate");
        kotlin.jvm.internal.p.l(r11, "recDate");
        kotlin.jvm.internal.p.l(r12, "tradingStart");
        kotlin.jvm.internal.p.l(r13, "tradingEnd");
        this.f156696a = r2;
        this.f156697b = r3;
        this.f156698c = r4;
        this.d = r5;
        this.f156699e = r6;
        this.f156700f = r7;
        this.f156701g = r8;
        this.f156702h = r9;
        this.f156703i = r10;
        this.f156704j = r11;
        this.f156705k = r12;
        this.f156706l = r13;
    }

    public static /* synthetic */ x b(x r02, CorpActionAllUIState.Status r1, boolean r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r02.f156696a;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r02.f156697b;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r02.f156698c;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r02.f156699e;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r02.f156700f;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r02.f156701g;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r02.f156702h;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r02.f156703i;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r02.f156704j;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r02.f156705k;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r02.f156706l;
    L38:
        String r132 = r11;
        String r142 = r12;
        String r112 = r9;
        String r122 = r10;
        String r92 = r7;
        String r102 = r8;
        String r72 = r5;
        String r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
    }

    public final x a(CorpActionAllUIState.Status r15, boolean r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26) {
        kotlin.jvm.internal.p.l(r15, NotificationCompat.CATEGORY_STATUS);
        kotlin.jvm.internal.p.l(r17, "companyId");
        kotlin.jvm.internal.p.l(r18, "companySymbol");
        kotlin.jvm.internal.p.l(r19, "ratio");
        kotlin.jvm.internal.p.l(r20, "factor");
        kotlin.jvm.internal.p.l(r21, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r22, "cumDate");
        kotlin.jvm.internal.p.l(r23, "exDate");
        kotlin.jvm.internal.p.l(r24, "recDate");
        kotlin.jvm.internal.p.l(r25, "tradingStart");
        kotlin.jvm.internal.p.l(r26, "tradingEnd");
        return new x(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public final String c() {
        return this.f156698c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f156702h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof x) == true) goto L8;
        return false;
    L8:
        x r52 = (x) r5;
        if (this.f156696a == r52.f156696a) goto L12;
        return false;
    L12:
        if (this.f156697b == r52.f156697b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156698c, r52.f156698c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156699e, r52.f156699e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156700f, r52.f156700f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156701g, r52.f156701g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f156702h, r52.f156702h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f156703i, r52.f156703i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f156704j, r52.f156704j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f156705k, r52.f156705k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f156706l, r52.f156706l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f156703i;
    }

    public final String g() {
        return this.f156700f;
    }

    public final String h() {
        return this.f156701g;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f156696a.hashCode() * 31) + Boolean.hashCode(this.f156697b)) * 31) + this.f156698c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156699e.hashCode()) * 31) + this.f156700f.hashCode()) * 31) + this.f156701g.hashCode()) * 31) + this.f156702h.hashCode()) * 31) + this.f156703i.hashCode()) * 31) + this.f156704j.hashCode()) * 31) + this.f156705k.hashCode()) * 31) + this.f156706l.hashCode();
    }

    public final String i() {
        return this.f156699e;
    }

    public final String j() {
        return this.f156704j;
    }

    public final CorpActionAllUIState.Status k() {
        return this.f156696a;
    }

    public final String l() {
        return this.f156706l;
    }

    public final String m() {
        return this.f156705k;
    }

    public final boolean n() {
        return this.f156697b;
    }

    public String toString() {
        return "CorpActionRightIssueUIState(status=" + this.f156696a + ", isActive=" + this.f156697b + ", companyId=" + this.f156698c + ", companySymbol=" + this.d + ", ratio=" + this.f156699e + ", factor=" + this.f156700f + ", price=" + this.f156701g + ", cumDate=" + this.f156702h + ", exDate=" + this.f156703i + ", recDate=" + this.f156704j + ", tradingStart=" + this.f156705k + ", tradingEnd=" + this.f156706l + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ x(com.stockbit.usecase.company.model.CorpActionAllUIState.Status r2, boolean r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.i r15) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r15v1 ?? I:??[int, boolean]) = (r14v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.usecase.company.model.x.<init>(com.stockbit.usecase.company.model.CorpActionAllUIState$Status, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void, file: classes2.dex
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
            r15 = r14 & 1
            if (r15 == 0) goto L6
            com.stockbit.usecase.company.model.CorpActionAllUIState$Status r2 = com.stockbit.usecase.company.model.CorpActionAllUIState.Status.Success
        L6:
            r15 = r14 & 2
            if (r15 == 0) goto Lb
            r3 = 0
        Lb:
            r15 = r14 & 4
            java.lang.String r0 = ""
            if (r15 == 0) goto L12
            r4 = r0
        L12:
            r15 = r14 & 8
            if (r15 == 0) goto L17
            r5 = r0
        L17:
            r15 = r14 & 16
            if (r15 == 0) goto L1c
            r6 = r0
        L1c:
            r15 = r14 & 32
            if (r15 == 0) goto L21
            r7 = r0
        L21:
            r15 = r14 & 64
            if (r15 == 0) goto L26
            r8 = r0
        L26:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L2b
            r9 = r0
        L2b:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L30
            r10 = r0
        L30:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L35
            r11 = r0
        L35:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L3a
            r12 = r0
        L3a:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L4c
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L59
        L4c:
            r15 = r13
            r14 = r12
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
            r3 = r1
        L59:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.usecase.company.model.x.<init>(com.stockbit.usecase.company.model.CorpActionAllUIState$Status, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
