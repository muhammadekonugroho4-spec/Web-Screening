package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final String f156109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156110b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156111c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156112e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156113f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f156114g;

    public A(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8) {
        kotlin.jvm.internal.p.l(r2, "companyId");
        kotlin.jvm.internal.p.l(r3, "ratio");
        kotlin.jvm.internal.p.l(r4, "factor");
        kotlin.jvm.internal.p.l(r5, "cumDate");
        kotlin.jvm.internal.p.l(r6, "exDate");
        kotlin.jvm.internal.p.l(r7, "recDate");
        this.f156109a = r2;
        this.f156110b = r3;
        this.f156111c = r4;
        this.d = r5;
        this.f156112e = r6;
        this.f156113f = r7;
        this.f156114g = r8;
    }

    public final String a() {
        return this.f156109a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f156112e;
    }

    public final String d() {
        return this.f156111c;
    }

    public final String e() {
        return this.f156110b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof A) == true) goto L8;
        return false;
    L8:
        A r52 = (A) r5;
        if (kotlin.jvm.internal.p.g(this.f156109a, r52.f156109a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156110b, r52.f156110b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156111c, r52.f156111c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156112e, r52.f156112e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156113f, r52.f156113f) == true) goto L27;
        return false;
    L27:
        if (this.f156114g == r52.f156114g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f156113f;
    }

    public final boolean g() {
        return this.f156114g;
    }

    public int hashCode() {
        return (((((((((((this.f156109a.hashCode() * 31) + this.f156110b.hashCode()) * 31) + this.f156111c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156112e.hashCode()) * 31) + this.f156113f.hashCode()) * 31) + Boolean.hashCode(this.f156114g);
    }

    public String toString() {
        return "CorpActionStockSplitUIState(companyId=" + this.f156109a + ", ratio=" + this.f156110b + ", factor=" + this.f156111c + ", cumDate=" + this.d + ", exDate=" + this.f156112e + ", recDate=" + this.f156113f + ", isActive=" + this.f156114g + ")";
    }

    public /* synthetic */ A(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = false;
    L23:
        boolean r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92);
    }
}
