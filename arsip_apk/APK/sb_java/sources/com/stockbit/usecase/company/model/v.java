package com.stockbit.usecase.company.model;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f156684a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156685b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156686c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156687e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156688f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f156689g;

    public v(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8) {
        kotlin.jvm.internal.p.l(r2, "companyId");
        kotlin.jvm.internal.p.l(r3, "value");
        kotlin.jvm.internal.p.l(r4, "cumDate");
        kotlin.jvm.internal.p.l(r5, "exDate");
        kotlin.jvm.internal.p.l(r6, "recDate");
        kotlin.jvm.internal.p.l(r7, "payDate");
        this.f156684a = r2;
        this.f156685b = r3;
        this.f156686c = r4;
        this.d = r5;
        this.f156687e = r6;
        this.f156688f = r7;
        this.f156689g = r8;
    }

    public final String a() {
        return this.f156684a;
    }

    public final String b() {
        return this.f156686c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f156688f;
    }

    public final String e() {
        return this.f156687e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (kotlin.jvm.internal.p.g(this.f156684a, r52.f156684a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156685b, r52.f156685b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156686c, r52.f156686c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156687e, r52.f156687e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156688f, r52.f156688f) == true) goto L27;
        return false;
    L27:
        if (this.f156689g == r52.f156689g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f156685b;
    }

    public final boolean g() {
        return this.f156689g;
    }

    public int hashCode() {
        return (((((((((((this.f156684a.hashCode() * 31) + this.f156685b.hashCode()) * 31) + this.f156686c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156687e.hashCode()) * 31) + this.f156688f.hashCode()) * 31) + Boolean.hashCode(this.f156689g);
    }

    public String toString() {
        return "CorpActionDividendUIState(companyId=" + this.f156684a + ", value=" + this.f156685b + ", cumDate=" + this.f156686c + ", exDate=" + this.d + ", recDate=" + this.f156687e + ", payDate=" + this.f156688f + ", isActive=" + this.f156689g + ")";
    }

    public /* synthetic */ v(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
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
