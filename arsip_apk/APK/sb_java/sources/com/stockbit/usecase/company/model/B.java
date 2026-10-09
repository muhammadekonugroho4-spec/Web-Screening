package com.stockbit.usecase.company.model;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f156115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156117c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156118e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156119f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156120g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f156121h;

    public B(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "companyId");
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r4, "shares");
        kotlin.jvm.internal.p.l(r5, "percentage");
        kotlin.jvm.internal.p.l(r6, "start");
        kotlin.jvm.internal.p.l(r7, "end");
        kotlin.jvm.internal.p.l(r8, "payDate");
        this.f156115a = r2;
        this.f156116b = r3;
        this.f156117c = r4;
        this.d = r5;
        this.f156118e = r6;
        this.f156119f = r7;
        this.f156120g = r8;
        this.f156121h = r9;
    }

    public final String a() {
        return this.f156115a;
    }

    public final String b() {
        return this.f156119f;
    }

    public final String c() {
        return this.f156120g;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f156116b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof B) == true) goto L8;
        return false;
    L8:
        B r52 = (B) r5;
        if (kotlin.jvm.internal.p.g(this.f156115a, r52.f156115a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156116b, r52.f156116b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156117c, r52.f156117c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156118e, r52.f156118e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156119f, r52.f156119f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f156120g, r52.f156120g) == true) goto L30;
        return false;
    L30:
        if (this.f156121h == r52.f156121h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f156117c;
    }

    public final String g() {
        return this.f156118e;
    }

    public final boolean h() {
        return this.f156121h;
    }

    public int hashCode() {
        return (((((((((((((this.f156115a.hashCode() * 31) + this.f156116b.hashCode()) * 31) + this.f156117c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156118e.hashCode()) * 31) + this.f156119f.hashCode()) * 31) + this.f156120g.hashCode()) * 31) + Boolean.hashCode(this.f156121h);
    }

    public String toString() {
        return "CorpActionTenderOfferUIState(companyId=" + this.f156115a + ", price=" + this.f156116b + ", shares=" + this.f156117c + ", percentage=" + this.d + ", start=" + this.f156118e + ", end=" + this.f156119f + ", payDate=" + this.f156120g + ", isCorpActionActive=" + this.f156121h + ")";
    }

    public /* synthetic */ B(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L26;
        r9 = false;
    L26:
        boolean r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
    }
}
