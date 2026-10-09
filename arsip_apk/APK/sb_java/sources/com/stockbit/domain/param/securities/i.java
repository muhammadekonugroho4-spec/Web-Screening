package com.stockbit.domain.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f87498a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f87500c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87501e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87502f;

    /* renamed from: g, reason: collision with root package name */
    public final a f87503g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87504h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87505a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87506b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87507c;
        public final String d;

        public a(String r2, String r3, String r4, String r5) {
            kotlin.jvm.internal.p.l(r2, "splitMethod");
            kotlin.jvm.internal.p.l(r3, "splitQty");
            kotlin.jvm.internal.p.l(r4, "splitRangeMin");
            kotlin.jvm.internal.p.l(r5, "splitRangeMax");
            this.f87505a = r2;
            this.f87506b = r3;
            this.f87507c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f87505a;
        }

        public final String b() {
            return this.f87506b;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f87507c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f87505a, r52.f87505a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f87506b, r52.f87506b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f87507c, r52.f87507c) == true) goto L18;
            return false;
        L18:
            if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f87505a.hashCode() * 31) + this.f87506b.hashCode()) * 31) + this.f87507c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "SplitOrderDomainParam(splitMethod=" + this.f87505a + ", splitQty=" + this.f87506b + ", splitRangeMin=" + this.f87507c + ", splitRangeMax=" + this.d + ")";
        }
    }

    public i(String r2, String r3, boolean r4, String r5, String r6, String r7, a r8, String r9) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r5, "symbol");
        kotlin.jvm.internal.p.l(r6, "boardType");
        kotlin.jvm.internal.p.l(r7, "platformOrderType");
        kotlin.jvm.internal.p.l(r9, "uiRef");
        this.f87498a = r2;
        this.f87499b = r3;
        this.f87500c = r4;
        this.d = r5;
        this.f87501e = r6;
        this.f87502f = r7;
        this.f87503g = r8;
        this.f87504h = r9;
    }

    public final String a() {
        return this.f87501e;
    }

    public final String b() {
        return this.f87502f;
    }

    public final String c() {
        return this.f87498a;
    }

    public final String d() {
        return this.f87499b;
    }

    public final a e() {
        return this.f87503g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f87498a, r52.f87498a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87499b, r52.f87499b) == true) goto L15;
        return false;
    L15:
        if (this.f87500c == r52.f87500c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87501e, r52.f87501e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87502f, r52.f87502f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87503g, r52.f87503g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87504h, r52.f87504h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f87504h;
    }

    public final boolean h() {
        return this.f87500c;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f87498a.hashCode() * 31) + this.f87499b.hashCode()) * 31) + Boolean.hashCode(this.f87500c)) * 31) + this.d.hashCode()) * 31) + this.f87501e.hashCode()) * 31) + this.f87502f.hashCode()) * 31;
        a r1 = this.f87503g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f87504h.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PostOrderBuyV2DomainParam(price=" + this.f87498a + ", shares=" + this.f87499b + ", isGtc=" + this.f87500c + ", symbol=" + this.d + ", boardType=" + this.f87501e + ", platformOrderType=" + this.f87502f + ", splitOrder=" + this.f87503g + ", uiRef=" + this.f87504h + ")";
    }
}
