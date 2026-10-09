package androidx.compose.ui.window;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f20838a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20839b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20840c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20841e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20842f;

    static {
    }

    public n(int r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6) {
        this.f20838a = r1;
        this.f20839b = r2;
        this.f20840c = r3;
        this.d = r4;
        this.f20841e = r5;
        this.f20842f = r6;
    }

    public final boolean a() {
        return this.f20840c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f20841e;
    }

    public final int d() {
        return this.f20838a;
    }

    public final boolean e() {
        return this.f20839b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (this.f20838a == r52.f20838a) goto L12;
        return false;
    L12:
        if (this.f20839b == r52.f20839b) goto L15;
        return false;
    L15:
        if (this.f20840c == r52.f20840c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f20841e == r52.f20841e) goto L24;
        return false;
    L24:
        if (this.f20842f == r52.f20842f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f20842f;
    }

    public int hashCode() {
        return (((((((((this.f20838a * 31) + Boolean.hashCode(this.f20839b)) * 31) + Boolean.hashCode(this.f20840c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f20841e)) * 31) + Boolean.hashCode(this.f20842f);
    }

    public /* synthetic */ n(boolean r2, boolean r3, boolean r4, boolean r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = true;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = true;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = true;
    L14:
        this(r2, r3, r4, r5);
    }

    public n(boolean r8, boolean r9, boolean r10, boolean r11) {
        this(r8, r9, r10, SecureFlagPolicy.Inherit, true, r11);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ n(boolean r2, boolean r3, boolean r4, androidx.compose.ui.window.SecureFlagPolicy r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.i r9) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0000: ARITH (r9v1 ?? I:??[int, boolean]) = (r8v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: androidx.compose.ui.window.n.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.i):void, file: classes.dex
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
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 1
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            androidx.compose.ui.window.SecureFlagPolicy r5 = androidx.compose.ui.window.SecureFlagPolicy.Inherit
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.n.<init>(boolean, boolean, boolean, androidx.compose.ui.window.SecureFlagPolicy, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    public n(boolean r9, boolean r10, boolean r11, SecureFlagPolicy r12, boolean r13, boolean r14) {
        this(r9, r10, r11, r12, r13, r14, false);
    }

    public n(boolean r1, boolean r2, boolean r3, SecureFlagPolicy r4, boolean r5, boolean r6, boolean r7) {
        int r12 = AndroidPopup_androidKt.e(r1, r4, r6);
        if (r4 != SecureFlagPolicy.Inherit) goto L6;
        boolean r42 = true;
    L7:
        this(r12, r42, r2, r3, r5, r7);
        return;
    L6:
        r42 = false;
        goto L7
    }
}
