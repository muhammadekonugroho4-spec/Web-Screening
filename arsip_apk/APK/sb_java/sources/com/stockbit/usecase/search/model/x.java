package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.company.CompanyEntryPoint;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f160080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160081b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160082c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160083e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f160085g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f160086h;

    /* renamed from: i, reason: collision with root package name */
    public final long f160087i;

    /* renamed from: j, reason: collision with root package name */
    public final long f160088j;

    public x(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, boolean r9, long r10, long r12) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "symbol");
        kotlin.jvm.internal.p.l(r5, "image");
        kotlin.jvm.internal.p.l(r6, "type");
        kotlin.jvm.internal.p.l(r7, CompanyEntryPoint.EXTRA_DESC);
        this.f160080a = r2;
        this.f160081b = r3;
        this.f160082c = r4;
        this.d = r5;
        this.f160083e = r6;
        this.f160084f = r7;
        this.f160085g = r8;
        this.f160086h = r9;
        this.f160087i = r10;
        this.f160088j = r12;
    }

    public final long a() {
        return this.f160088j;
    }

    public final String b() {
        return this.f160084f;
    }

    public final String c() {
        return this.f160084f;
    }

    public final String d() {
        return this.f160080a;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof x) == true) goto L8;
        return false;
    L8:
        x r82 = (x) r8;
        if (kotlin.jvm.internal.p.g(this.f160080a, r82.f160080a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160081b, r82.f160081b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160082c, r82.f160082c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f160083e, r82.f160083e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f160084f, r82.f160084f) == true) goto L27;
        return false;
    L27:
        if (this.f160085g == r82.f160085g) goto L30;
        return false;
    L30:
        if (this.f160086h == r82.f160086h) goto L33;
        return false;
    L33:
        if (this.f160087i == r82.f160087i) goto L36;
        return false;
    L36:
        if (this.f160088j == r82.f160088j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f160081b;
    }

    public final String g() {
        return this.f160082c;
    }

    public final String h() {
        return this.f160081b;
    }

    public int hashCode() {
        return (((((((((((((((((this.f160080a.hashCode() * 31) + this.f160081b.hashCode()) * 31) + this.f160082c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160083e.hashCode()) * 31) + this.f160084f.hashCode()) * 31) + Boolean.hashCode(this.f160085g)) * 31) + Boolean.hashCode(this.f160086h)) * 31) + Long.hashCode(this.f160087i)) * 31) + Long.hashCode(this.f160088j);
    }

    public final String i() {
        return this.f160083e;
    }

    public String toString() {
        return "SearchCompany(id=" + this.f160080a + ", name=" + this.f160081b + ", symbol=" + this.f160082c + ", image=" + this.d + ", type=" + this.f160083e + ", desc=" + this.f160084f + ", isTradeable=" + this.f160085g + ", isShariaTradeable=" + this.f160086h + ", searchId=" + this.f160087i + ", companyId=" + this.f160088j + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ x(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, boolean r24, long r25, long r27, int r29, kotlin.jvm.internal.i r30) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: ARITH (r1v0 ?? I:??[int, boolean]) = (r29v0 ?? I:??[int, boolean, short, byte, char]) & (64 ??[int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.usecase.search.model.x.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, long, long, int, kotlin.jvm.internal.i):void, file: classes2.dex
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
            r16 = this;
            r0 = r29
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L9
            r10 = r2
            goto Lb
        L9:
            r10 = r23
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L11
            r11 = r2
            goto L13
        L11:
            r11 = r24
        L13:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L1b
            r12 = r2
            goto L1d
        L1b:
            r12 = r25
        L1d:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L31
            r14 = r2
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r3 = r16
            goto L41
        L31:
            r14 = r27
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
        L41:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.usecase.search.model.x.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, long, long, int, kotlin.jvm.internal.i):void");
    }
}
