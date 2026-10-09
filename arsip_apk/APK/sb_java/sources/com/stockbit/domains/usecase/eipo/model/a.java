package com.stockbit.domains.usecase.eipo.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.domain.model.eipo.b;
import com.stockbit.search.SearchEntryPoint;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88192c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88193e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88194f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88195g;

    /* renamed from: h, reason: collision with root package name */
    public final String f88196h;

    /* renamed from: i, reason: collision with root package name */
    public final String f88197i;

    /* renamed from: j, reason: collision with root package name */
    public final String f88198j;

    /* renamed from: k, reason: collision with root package name */
    public final double f88199k;

    /* renamed from: l, reason: collision with root package name */
    public final List f88200l;

    /* renamed from: m, reason: collision with root package name */
    public final List f88201m;

    /* renamed from: n, reason: collision with root package name */
    public final String f88202n;

    /* renamed from: o, reason: collision with root package name */
    public final String f88203o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f88204p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f88205q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f88206r;

    /* renamed from: s, reason: collision with root package name */
    public final int f88207s;

    /* renamed from: t, reason: collision with root package name */
    public final int f88208t;

    /* renamed from: u, reason: collision with root package name */
    public final double f88209u;

    /* renamed from: v, reason: collision with root package name */
    public final C0831a f88210v;

    /* renamed from: com.stockbit.domains.usecase.eipo.model.a$a, reason: collision with other inner class name */
    public static final class C0831a {

        /* renamed from: a, reason: collision with root package name */
        public final String f88211a;

        /* renamed from: b, reason: collision with root package name */
        public final String f88212b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f88213c;

        public C0831a(String r2, String r3) {
            p.l(r2, "orderId");
            p.l(r3, "orderDateTime");
            this.f88211a = r2;
            this.f88212b = r3;
            if (r2.length() <= 0) goto L5;
            boolean r22 = true;
        L6:
            this.f88213c = r22;
            return;
        L5:
            r22 = false;
            goto L6
        }

        public final boolean a() {
            return this.f88213c;
        }

        public final String b() {
            return this.f88212b;
        }

        public final String c() {
            return this.f88211a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0831a) == true) goto L8;
            return false;
        L8:
            C0831a r52 = (C0831a) r5;
            if (p.g(this.f88211a, r52.f88211a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f88212b, r52.f88212b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f88211a.hashCode() * 31) + this.f88212b.hashCode();
        }

        public String toString() {
            return "LatestOrder(orderId=" + this.f88211a + ", orderDateTime=" + this.f88212b + ")";
        }

        public /* synthetic */ C0831a(String r2, String r3, int r4, i r5) {
            if ((r4 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r4 & 2) == 0) goto L8;
            r3 = "";
        L8:
            this(r2, r3);
        }
    }

    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final C0832a f88214e = null;

        /* renamed from: a, reason: collision with root package name */
        public final String f88215a;

        /* renamed from: b, reason: collision with root package name */
        public final String f88216b;

        /* renamed from: c, reason: collision with root package name */
        public final String f88217c;
        public final String d;

        /* renamed from: com.stockbit.domains.usecase.eipo.model.a$b$a, reason: collision with other inner class name */
        public static final class C0832a {
            public /* synthetic */ C0832a(i r1) {
                this();
            }

            public final b a(b.C0773b r4) {
                p.l(r4, "entity");
                return new b(r4.a(), r4.c(), r4.b());
            }

            public C0832a() {
            }
        }

        static {
            f88214e = new C0832a(null);
        }

        public b(String r2, String r3, String r4) {
            p.l(r2, "code");
            p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f88215a = r2;
            this.f88216b = r3;
            this.f88217c = r4;
            this.d = r2 + " - " + r3;
        }

        public final String a() {
            return this.f88215a;
        }

        public final String b() {
            return this.f88217c;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f88216b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f88215a, r52.f88215a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f88216b, r52.f88216b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f88217c, r52.f88217c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f88215a.hashCode() * 31) + this.f88216b.hashCode()) * 31;
            String r1 = this.f88217c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Underwriter(code=" + this.f88215a + ", name=" + this.f88216b + ", color=" + this.f88217c + ")";
        }

        public /* synthetic */ b(String r2, String r3, String r4, int r5, i r6) {
            if ((r5 & 1) == 0) goto L6;
            r2 = "";
        L6:
            if ((r5 & 2) == 0) goto L9;
            r3 = "";
        L9:
            if ((r5 & 4) == 0) goto L11;
            r4 = null;
        L11:
            this(r2, r3, r4);
        }
    }

    public a(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, double r27, List r29, List r30, String r31, String r32, boolean r33, boolean r34, boolean r35, int r36, int r37, double r38, C0831a r40) {
        p.l(r17, "symbol");
        p.l(r18, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r19, "logoUrl");
        p.l(r20, "description");
        p.l(r21, SearchEntryPoint.KEY_SECTOR);
        p.l(r22, "subSector");
        p.l(r23, "businessLine");
        p.l(r24, "address");
        p.l(r25, "website");
        p.l(r26, "offeredShares");
        p.l(r29, "participantAdmin");
        p.l(r30, "underwriter");
        p.l(r31, "prospectusUrl");
        p.l(r32, "prospectusSummaryUrl");
        p.l(r40, "latestOrder");
        this.f88190a = r17;
        this.f88191b = r18;
        this.f88192c = r19;
        this.d = r20;
        this.f88193e = r21;
        this.f88194f = r22;
        this.f88195g = r23;
        this.f88196h = r24;
        this.f88197i = r25;
        this.f88198j = r26;
        this.f88199k = r27;
        this.f88200l = r29;
        this.f88201m = r30;
        this.f88202n = r31;
        this.f88203o = r32;
        this.f88204p = r33;
        this.f88205q = r34;
        this.f88206r = r35;
        this.f88207s = r36;
        this.f88208t = r37;
        this.f88209u = r38;
        this.f88210v = r40;
    }

    public final String a() {
        return this.f88196h;
    }

    public final String b() {
        return this.f88195g;
    }

    public final String c() {
        return this.d;
    }

    public final boolean d() {
        return this.f88204p;
    }

    public final boolean e() {
        return this.f88206r;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f88190a, r82.f88190a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88191b, r82.f88191b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88192c, r82.f88192c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f88193e, r82.f88193e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f88194f, r82.f88194f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f88195g, r82.f88195g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f88196h, r82.f88196h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f88197i, r82.f88197i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f88198j, r82.f88198j) == true) goto L39;
        return false;
    L39:
        if (Double.compare(this.f88199k, r82.f88199k) == 0) goto L42;
        return false;
    L42:
        if (p.g(this.f88200l, r82.f88200l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f88201m, r82.f88201m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f88202n, r82.f88202n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f88203o, r82.f88203o) == true) goto L54;
        return false;
    L54:
        if (this.f88204p == r82.f88204p) goto L57;
        return false;
    L57:
        if (this.f88205q == r82.f88205q) goto L60;
        return false;
    L60:
        if (this.f88206r == r82.f88206r) goto L63;
        return false;
    L63:
        if (this.f88207s == r82.f88207s) goto L66;
        return false;
    L66:
        if (this.f88208t == r82.f88208t) goto L69;
        return false;
    L69:
        if (Double.compare(this.f88209u, r82.f88209u) == 0) goto L72;
        return false;
    L72:
        if (p.g(this.f88210v, r82.f88210v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final C0831a f() {
        return this.f88210v;
    }

    public final String g() {
        return this.f88192c;
    }

    public final double h() {
        return this.f88209u;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.f88190a.hashCode() * 31) + this.f88191b.hashCode()) * 31) + this.f88192c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f88193e.hashCode()) * 31) + this.f88194f.hashCode()) * 31) + this.f88195g.hashCode()) * 31) + this.f88196h.hashCode()) * 31) + this.f88197i.hashCode()) * 31) + this.f88198j.hashCode()) * 31) + Double.hashCode(this.f88199k)) * 31) + this.f88200l.hashCode()) * 31) + this.f88201m.hashCode()) * 31) + this.f88202n.hashCode()) * 31) + this.f88203o.hashCode()) * 31) + Boolean.hashCode(this.f88204p)) * 31) + Boolean.hashCode(this.f88205q)) * 31) + Boolean.hashCode(this.f88206r)) * 31) + Integer.hashCode(this.f88207s)) * 31) + Integer.hashCode(this.f88208t)) * 31) + Double.hashCode(this.f88209u)) * 31) + this.f88210v.hashCode();
    }

    public final String i() {
        return this.f88191b;
    }

    public final String j() {
        return this.f88198j;
    }

    public final List k() {
        return this.f88200l;
    }

    public final double l() {
        return this.f88199k;
    }

    public final String m() {
        return this.f88203o;
    }

    public final String n() {
        return this.f88202n;
    }

    public final String o() {
        return this.f88193e;
    }

    public final String p() {
        return this.f88194f;
    }

    public final String q() {
        return this.f88190a;
    }

    public final List r() {
        return this.f88201m;
    }

    public final int s() {
        return this.f88207s;
    }

    public final int t() {
        return this.f88208t;
    }

    public String toString() {
        return "EIpoCompanyDetailNewUIState(symbol=" + this.f88190a + ", name=" + this.f88191b + ", logoUrl=" + this.f88192c + ", description=" + this.d + ", sector=" + this.f88193e + ", subSector=" + this.f88194f + ", businessLine=" + this.f88195g + ", address=" + this.f88196h + ", website=" + this.f88197i + ", offeredShares=" + this.f88198j + ", percentageTotalShares=" + this.f88199k + ", participantAdmin=" + this.f88200l + ", underwriter=" + this.f88201m + ", prospectusUrl=" + this.f88202n + ", prospectusSummaryUrl=" + this.f88203o + ", hasUnboxing=" + this.f88204p + ", isSharia=" + this.f88205q + ", hasWarrantBonus=" + this.f88206r + ", warrantRatioFrom=" + this.f88207s + ", warrantRatioTo=" + this.f88208t + ", maxLot=" + this.f88209u + ", latestOrder=" + this.f88210v + ")";
    }

    public final String u() {
        return this.f88197i;
    }

    public final boolean v() {
        return this.f88205q;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ a(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, double r35, java.util.List r37, java.util.List r38, java.lang.String r39, java.lang.String r40, boolean r41, boolean r42, boolean r43, int r44, int r45, double r46, com.stockbit.domains.usecase.eipo.model.a.C0831a r48, int r49, kotlin.jvm.internal.i r50) {
        /*  JADX ERROR: Simple mode code generation failed
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: ARITH (r1v0 ?? I:??[int, boolean]) = (r49v0 ?? I:??[int, boolean, short, byte, char]) & (1 ??[boolean, int, float, short, byte, char]) A[DECLARE_VAR] in method: com.stockbit.domains.usecase.eipo.model.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, boolean, boolean, int, int, double, com.stockbit.domains.usecase.eipo.model.a$a, int, kotlin.jvm.internal.i):void, file: classes8.dex
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
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stockbit.domains.usecase.eipo.model.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, boolean, boolean, int, int, double, com.stockbit.domains.usecase.eipo.model.a$a, int, kotlin.jvm.internal.i):void");
    }
}
