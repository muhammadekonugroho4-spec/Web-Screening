package com.stockbit.datasource.param.securities;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f80093a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80094b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80095c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80096e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80097f;

    /* renamed from: g, reason: collision with root package name */
    public final a f80098g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80099h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f80100a;

        /* renamed from: b, reason: collision with root package name */
        public final String f80101b;

        /* renamed from: c, reason: collision with root package name */
        public final String f80102c;
        public final String d;

        public a(String r2, String r3, String r4, String r5) {
            p.l(r2, "splitMethod");
            p.l(r3, "splitQty");
            p.l(r4, "splitRangeMin");
            p.l(r5, "splitRangeMax");
            this.f80100a = r2;
            this.f80101b = r3;
            this.f80102c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f80100a;
        }

        public final String b() {
            return this.f80101b;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f80102c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f80100a, r52.f80100a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f80101b, r52.f80101b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f80102c, r52.f80102c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f80100a.hashCode() * 31) + this.f80101b.hashCode()) * 31) + this.f80102c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "SplitOrderDataParam(splitMethod=" + this.f80100a + ", splitQty=" + this.f80101b + ", splitRangeMin=" + this.f80102c + ", splitRangeMax=" + this.d + ")";
        }
    }

    public d(String r2, String r3, boolean r4, String r5, String r6, String r7, a r8, String r9) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r5, "symbol");
        p.l(r6, "boardType");
        p.l(r7, "platformOrderType");
        p.l(r9, "uiRef");
        this.f80093a = r2;
        this.f80094b = r3;
        this.f80095c = r4;
        this.d = r5;
        this.f80096e = r6;
        this.f80097f = r7;
        this.f80098g = r8;
        this.f80099h = r9;
    }

    public final String a() {
        return this.f80096e;
    }

    public final String b() {
        return this.f80097f;
    }

    public final String c() {
        return this.f80093a;
    }

    public final String d() {
        return this.f80094b;
    }

    public final a e() {
        return this.f80098g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f80093a, r52.f80093a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80094b, r52.f80094b) == true) goto L15;
        return false;
    L15:
        if (this.f80095c == r52.f80095c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80096e, r52.f80096e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80097f, r52.f80097f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80098g, r52.f80098g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80099h, r52.f80099h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f80099h;
    }

    public final boolean h() {
        return this.f80095c;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f80093a.hashCode() * 31) + this.f80094b.hashCode()) * 31) + Boolean.hashCode(this.f80095c)) * 31) + this.d.hashCode()) * 31) + this.f80096e.hashCode()) * 31) + this.f80097f.hashCode()) * 31;
        a r1 = this.f80098g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f80099h.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PostOrderBuyV2DataParam(price=" + this.f80093a + ", shares=" + this.f80094b + ", isGtc=" + this.f80095c + ", symbol=" + this.d + ", boardType=" + this.f80096e + ", platformOrderType=" + this.f80097f + ", splitOrder=" + this.f80098g + ", uiRef=" + this.f80099h + ")";
    }
}
