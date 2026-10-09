package com.stockbit.canvas.ui.compose.ui;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final double f51830a;

    /* renamed from: b, reason: collision with root package name */
    public final double f51831b;

    /* renamed from: c, reason: collision with root package name */
    public final com.stockbit.canvas.ui.compose.ui.model.m f51832c;
    public final long d;

    static {
    }

    public r(double r1, double r3, com.stockbit.canvas.ui.compose.ui.model.m r5, long r6) {
        this.f51830a = r1;
        this.f51831b = r3;
        this.f51832c = r5;
        this.d = r6;
    }

    public final com.stockbit.canvas.ui.compose.ui.model.m a(long r5) {
        com.stockbit.canvas.ui.compose.ui.model.m r02 = this.f51832c;
        if (r02 != null) goto L5;
    L7:
        return null;
    L5:
        if (r5 >= this.d) goto L7;
        return r02;
    }

    public final double b() {
        return this.f51831b;
    }

    public final double c() {
        return this.f51830a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof r) == true) goto L8;
        return false;
    L8:
        r r82 = (r) r8;
        if (Double.compare(this.f51830a, r82.f51830a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f51831b, r82.f51831b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f51832c, r82.f51832c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((Double.hashCode(this.f51830a) * 31) + Double.hashCode(this.f51831b)) * 31;
        com.stockbit.canvas.ui.compose.ui.model.m r1 = this.f51832c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Long.hashCode(this.d);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "LotChangeRow(price=" + this.f51830a + ", lot=" + this.f51831b + ", change=" + this.f51832c + ", expiresAtMillis=" + this.d + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ r(double r9, double r11, com.stockbit.canvas.ui.compose.ui.model.m r13, long r14, int r16, kotlin.jvm.internal.i r17) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r0v0 ?? I:??[int, boolean]) = (r16v0 ?? I:??[int, boolean, short, byte, char]) & (4 ??[int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.canvas.ui.compose.ui.r.<init>(double, double, com.stockbit.canvas.ui.compose.ui.model.m, long, int, kotlin.jvm.internal.i):void, file: classes7.dex
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
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r5 = r13
            r13 = r16 & 8
            if (r13 == 0) goto L11
            r0 = 0
            r6 = r0
            r3 = r11
            r0 = r8
            r1 = r9
            goto L15
        L11:
            r6 = r14
            r0 = r8
            r1 = r9
            r3 = r11
        L15:
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.canvas.ui.compose.ui.r.<init>(double, double, com.stockbit.canvas.ui.compose.ui.model.m, long, int, kotlin.jvm.internal.i):void");
    }
}
