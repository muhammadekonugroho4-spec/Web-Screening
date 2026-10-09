package com.stockbit.feature.transaction.ui.amend.model;

import java.util.Set;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Set f109525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f109526b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109527c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f109528e;

    static {
    }

    public b(Set r2, boolean r3, boolean r4, boolean r5, int r6) {
        p.l(r2, "activeErrors");
        this.f109525a = r2;
        this.f109526b = r3;
        this.f109527c = r4;
        this.d = r5;
        this.f109528e = r6;
    }

    public final Set a() {
        return this.f109525a;
    }

    public final int b() {
        return this.f109528e;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f109527c;
    }

    public final boolean e() {
        return this.f109526b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f109525a, r52.f109525a) == true) goto L12;
        return false;
    L12:
        if (this.f109526b == r52.f109526b) goto L15;
        return false;
    L15:
        if (this.f109527c == r52.f109527c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f109528e == r52.f109528e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f109525a.hashCode() * 31) + Boolean.hashCode(this.f109526b)) * 31) + Boolean.hashCode(this.f109527c)) * 31) + Boolean.hashCode(this.d)) * 31) + Integer.hashCode(this.f109528e);
    }

    public String toString() {
        return "AmendErrorUIState(activeErrors=" + this.f109525a + ", isPriceTextRed=" + this.f109526b + ", isLotTextRed=" + this.f109527c + ", isButtonDisabled=" + this.d + ", lot=" + this.f109528e + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ b(java.util.Set r2, boolean r3, boolean r4, boolean r5, int r6, int r7, kotlin.jvm.internal.i r8) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r8v1 ?? I:??[int, boolean]) = (r7v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.feature.transaction.ui.amend.model.b.<init>(java.util.Set, boolean, boolean, boolean, int, int, kotlin.jvm.internal.i):void, file: classes9.dex
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
            if (r8 == 0) goto L8
            java.util.Set r2 = kotlin.collections.a0.e()
        L8:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Le
            r3 = r0
        Le:
            r8 = r7 & 4
            if (r8 == 0) goto L13
            r4 = r0
        L13:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            r5 = 1
        L18:
            r7 = r7 & 16
            if (r7 == 0) goto L23
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L29
        L23:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L29:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.feature.transaction.ui.amend.model.b.<init>(java.util.Set, boolean, boolean, boolean, int, int, kotlin.jvm.internal.i):void");
    }
}
