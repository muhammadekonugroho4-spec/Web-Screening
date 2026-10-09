package com.stockbit.watchlist.widget.model;

import android.graphics.Bitmap;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f171559a;

    /* renamed from: b, reason: collision with root package name */
    public final String f171560b;

    /* renamed from: c, reason: collision with root package name */
    public final String f171561c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f171562e;

    /* renamed from: f, reason: collision with root package name */
    public final String f171563f;

    /* renamed from: g, reason: collision with root package name */
    public final String f171564g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f171565h;

    /* renamed from: i, reason: collision with root package name */
    public final Bitmap f171566i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap f171567j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f171568k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f171569l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f171570m;

    /* renamed from: n, reason: collision with root package name */
    public final String f171571n;

    static {
    }

    public a(String r2, String r3, String r4, String r5, double r6, String r8, String r9, boolean r10, Bitmap r11, Bitmap r12, boolean r13, boolean r14, boolean r15, String r16) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        p.l(r4, "formattedPrice");
        p.l(r5, "formattedPercent");
        p.l(r8, "priceChange");
        p.l(r9, "iconUrl");
        this.f171559a = r2;
        this.f171560b = r3;
        this.f171561c = r4;
        this.d = r5;
        this.f171562e = r6;
        this.f171563f = r8;
        this.f171564g = r9;
        this.f171565h = r10;
        this.f171566i = r11;
        this.f171567j = r12;
        this.f171568k = r13;
        this.f171569l = r14;
        this.f171570m = r15;
        this.f171571n = r16;
    }

    public static /* synthetic */ a b(a r16, String r17, String r18, String r19, String r20, double r21, String r23, String r24, boolean r25, Bitmap r26, Bitmap r27, boolean r28, boolean r29, boolean r30, String r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        String r2 = r16.f171559a;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.f171560b;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = r16.f171561c;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.d;
    L19:
        if ((r32 & 16) == 0) goto L21;
        double r6 = r16.f171562e;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r8 = r16.f171563f;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r9 = r16.f171564g;
    L31:
        if ((r32 & 128) == 0) goto L33;
        boolean r10 = r16.f171565h;
    L35:
        if ((r32 & 256) == 0) goto L37;
        Bitmap r11 = r16.f171566i;
    L39:
        if ((r32 & 512) == 0) goto L41;
        Bitmap r12 = r16.f171567j;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        boolean r13 = r16.f171568k;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        boolean r14 = r16.f171569l;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        boolean r15 = r16.f171570m;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        String r322 = r16.f171571n;
    L60:
        return r16.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r322);
    L58:
        r322 = r31;
        goto L60
    L53:
        r15 = r30;
        goto L55
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r10 = r25;
        goto L35
    L29:
        r9 = r24;
        goto L31
    L25:
        r8 = r23;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final a a(String r18, String r19, String r20, String r21, double r22, String r24, String r25, boolean r26, Bitmap r27, Bitmap r28, boolean r29, boolean r30, boolean r31, String r32) {
        p.l(r18, "symbol");
        p.l(r19, "companyName");
        p.l(r20, "formattedPrice");
        p.l(r21, "formattedPercent");
        p.l(r24, "priceChange");
        p.l(r25, "iconUrl");
        return new a(r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32);
    }

    public final String c() {
        return this.f171560b;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f171561c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f171559a, r82.f171559a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f171560b, r82.f171560b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f171561c, r82.f171561c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f171562e, r82.f171562e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f171563f, r82.f171563f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f171564g, r82.f171564g) == true) goto L30;
        return false;
    L30:
        if (this.f171565h == r82.f171565h) goto L33;
        return false;
    L33:
        if (p.g(this.f171566i, r82.f171566i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f171567j, r82.f171567j) == true) goto L39;
        return false;
    L39:
        if (this.f171568k == r82.f171568k) goto L42;
        return false;
    L42:
        if (this.f171569l == r82.f171569l) goto L45;
        return false;
    L45:
        if (this.f171570m == r82.f171570m) goto L48;
        return false;
    L48:
        if (p.g(this.f171571n, r82.f171571n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final boolean f() {
        return this.f171568k;
    }

    public final boolean g() {
        return this.f171570m;
    }

    public final boolean h() {
        return this.f171569l;
    }

    public int hashCode() {
        int r02 = ((((((((((((((this.f171559a.hashCode() * 31) + this.f171560b.hashCode()) * 31) + this.f171561c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f171562e)) * 31) + this.f171563f.hashCode()) * 31) + this.f171564g.hashCode()) * 31) + Boolean.hashCode(this.f171565h)) * 31;
        Bitmap r1 = this.f171566i;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Bitmap r13 = this.f171567j;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (((((((r03 + r14) * 31) + Boolean.hashCode(this.f171568k)) * 31) + Boolean.hashCode(this.f171569l)) * 31) + Boolean.hashCode(this.f171570m)) * 31;
        String r15 = this.f171571n;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final Bitmap i() {
        return this.f171566i;
    }

    public final String j() {
        return this.f171564g;
    }

    public final double k() {
        return this.f171562e;
    }

    public final String l() {
        return this.f171563f;
    }

    public final Bitmap m() {
        return this.f171567j;
    }

    public final String n() {
        return this.f171571n;
    }

    public final String o() {
        return this.f171559a;
    }

    public final boolean p() {
        return this.f171565h;
    }

    public String toString() {
        return "WatchlistWidgetItemState(symbol=" + this.f171559a + ", companyName=" + this.f171560b + ", formattedPrice=" + this.f171561c + ", formattedPercent=" + this.d + ", percentDouble=" + this.f171562e + ", priceChange=" + this.f171563f + ", iconUrl=" + this.f171564g + ", isCrypto=" + this.f171565h + ", iconBitmap=" + this.f171566i + ", sparklineBitmap=" + this.f171567j + ", hasCorporateAction=" + this.f171568k + ", hasUma=" + this.f171569l + ", hasNotation=" + this.f171570m + ", statusLabel=" + this.f171571n + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ a(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, double r24, java.lang.String r26, java.lang.String r27, boolean r28, android.graphics.Bitmap r29, android.graphics.Bitmap r30, boolean r31, boolean r32, boolean r33, java.lang.String r34, int r35, kotlin.jvm.internal.i r36) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: ARITH (r1v0 ?? I:??[int, boolean]) = (r35v0 ?? I:??[int, boolean, short, byte, char]) & (128(0x80, float:1.8E-43) ??[int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.watchlist.widget.model.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean, android.graphics.Bitmap, android.graphics.Bitmap, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.i):void, file: classes2.dex
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
            r19 = this;
            r0 = r35
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 0
            if (r1 == 0) goto L9
            r12 = r2
            goto Lb
        L9:
            r12 = r28
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r3 = 0
            if (r1 == 0) goto L12
            r13 = r3
            goto L14
        L12:
            r13 = r29
        L14:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1a
            r14 = r3
            goto L1c
        L1a:
            r14 = r30
        L1c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L22
            r15 = r2
            goto L24
        L22:
            r15 = r31
        L24:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L2b
            r16 = r2
            goto L2d
        L2b:
            r16 = r32
        L2d:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L34
            r17 = r2
            goto L36
        L34:
            r17 = r33
        L36:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L4d
            r18 = r3
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r10 = r26
            r11 = r27
            r3 = r19
            goto L5f
        L4d:
            r18 = r34
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r10 = r26
            r11 = r27
        L5f:
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.watchlist.widget.model.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, boolean, android.graphics.Bitmap, android.graphics.Bitmap, boolean, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
