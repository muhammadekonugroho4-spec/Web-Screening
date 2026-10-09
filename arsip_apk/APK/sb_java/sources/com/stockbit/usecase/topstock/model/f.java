package com.stockbit.usecase.topstock.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a f163154a;

    /* renamed from: b, reason: collision with root package name */
    public final a f163155b;

    /* renamed from: c, reason: collision with root package name */
    public final a f163156c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f163157e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f163158f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f163159a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f163160b;

        public a(boolean r1, boolean r2) {
            this.f163159a = r1;
            this.f163160b = r2;
        }

        public final boolean a() {
            return this.f163160b;
        }

        public final boolean b() {
            return this.f163159a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f163159a == r52.f163159a) goto L12;
            return false;
        L12:
            if (this.f163160b == r52.f163160b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f163159a) * 31) + Boolean.hashCode(this.f163160b);
        }

        public String toString() {
            return "TopStockValueState(isSelected=" + this.f163159a + ", isEnabled=" + this.f163160b + ")";
        }

        public /* synthetic */ a(boolean r2, boolean r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = false;
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = false;
        L8:
            this(r2, r3);
        }
    }

    public f(a r2, a r3, a r4, String r5, boolean r6, boolean r7) {
        p.l(r2, "net");
        p.l(r3, "gross");
        p.l(r4, "total");
        p.l(r5, Constants.KEY_DATE);
        this.f163154a = r2;
        this.f163155b = r3;
        this.f163156c = r4;
        this.d = r5;
        this.f163157e = r6;
        this.f163158f = r7;
    }

    public final boolean a() {
        return this.f163158f;
    }

    public final String b() {
        return this.d;
    }

    public final a c() {
        return this.f163155b;
    }

    public final a d() {
        return this.f163154a;
    }

    public final a e() {
        return this.f163156c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f163154a, r52.f163154a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163155b, r52.f163155b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163156c, r52.f163156c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f163157e == r52.f163157e) goto L24;
        return false;
    L24:
        if (this.f163158f == r52.f163158f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f163157e;
    }

    public int hashCode() {
        return (((((((((this.f163154a.hashCode() * 31) + this.f163155b.hashCode()) * 31) + this.f163156c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f163157e)) * 31) + Boolean.hashCode(this.f163158f);
    }

    public String toString() {
        return "TopStockValueAndDateUIState(net=" + this.f163154a + ", gross=" + this.f163155b + ", total=" + this.f163156c + ", date=" + this.d + ", isSingleDate=" + this.f163157e + ", canClickNextDate=" + this.f163158f + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ f(com.stockbit.usecase.topstock.model.f.a r4, com.stockbit.usecase.topstock.model.f.a r5, com.stockbit.usecase.topstock.model.f.a r6, java.lang.String r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.i r11) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r11v1 ?? I:??[int, boolean]) = (r10v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.usecase.topstock.model.f.<init>(com.stockbit.usecase.topstock.model.f$a, com.stockbit.usecase.topstock.model.f$a, com.stockbit.usecase.topstock.model.f$a, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.i):void, file: classes2.dex
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
            r3 = this;
            r11 = r10 & 1
            r0 = 0
            r1 = 3
            r2 = 0
            if (r11 == 0) goto Lc
            com.stockbit.usecase.topstock.model.f$a r4 = new com.stockbit.usecase.topstock.model.f$a
            r4.<init>(r2, r2, r1, r0)
        Lc:
            r11 = r10 & 2
            if (r11 == 0) goto L15
            com.stockbit.usecase.topstock.model.f$a r5 = new com.stockbit.usecase.topstock.model.f$a
            r5.<init>(r2, r2, r1, r0)
        L15:
            r11 = r10 & 4
            if (r11 == 0) goto L1e
            com.stockbit.usecase.topstock.model.f$a r6 = new com.stockbit.usecase.topstock.model.f$a
            r6.<init>(r2, r2, r1, r0)
        L1e:
            r11 = r10 & 8
            if (r11 == 0) goto L24
            java.lang.String r7 = ""
        L24:
            r11 = r10 & 16
            if (r11 == 0) goto L29
            r8 = 1
        L29:
            r10 = r10 & 32
            if (r10 == 0) goto L35
            r11 = r2
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            goto L3c
        L35:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r5 = r3
        L3c:
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.usecase.topstock.model.f.<init>(com.stockbit.usecase.topstock.model.f$a, com.stockbit.usecase.topstock.model.f$a, com.stockbit.usecase.topstock.model.f$a, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
