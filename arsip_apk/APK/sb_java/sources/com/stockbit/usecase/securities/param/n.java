package com.stockbit.usecase.securities.param;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.securities.model.SellSmartOrderType;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f162033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f162035c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f162036e;

    /* renamed from: f, reason: collision with root package name */
    public final b f162037f;

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f162038a;

        /* renamed from: b, reason: collision with root package name */
        public final float f162039b;

        /* renamed from: c, reason: collision with root package name */
        public final String f162040c;
        public final String d;

        /* renamed from: e, reason: collision with root package name */
        public final SellSmartOrderType f162041e;

        public b(String r2, float r3, String r4, String r5, SellSmartOrderType r6) {
            p.l(r2, "boardType");
            p.l(r4, "algorithmType");
            p.l(r6, "sellSmartOrderType");
            this.f162038a = r2;
            this.f162039b = r3;
            this.f162040c = r4;
            this.d = r5;
            this.f162041e = r6;
        }

        public final String a() {
            return this.f162040c;
        }

        public final String b() {
            return this.f162038a;
        }

        public final String c() {
            return this.d;
        }

        public final SellSmartOrderType d() {
            return this.f162041e;
        }

        public final float e() {
            return this.f162039b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f162038a, r52.f162038a) == true) goto L12;
            return false;
        L12:
            if (Float.compare(this.f162039b, r52.f162039b) == 0) goto L15;
            return false;
        L15:
            if (p.g(this.f162040c, r52.f162040c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L21;
            return false;
        L21:
            if (this.f162041e == r52.f162041e) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            int r02 = ((((this.f162038a.hashCode() * 31) + Float.hashCode(this.f162039b)) * 31) + this.f162040c.hashCode()) * 31;
            String r1 = this.d;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return ((r02 + r12) * 31) + this.f162041e.hashCode();
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "TrailingStopParam(boardType=" + this.f162038a + ", trailPercentage=" + this.f162039b + ", algorithmType=" + this.f162040c + ", companyType=" + this.d + ", sellSmartOrderType=" + this.f162041e + ")";
        }
    }

    public n(String r1, String r2, String r3, String r4, BigDecimal r5, b r6, a r7) {
        p.l(r1, "company");
        p.l(r2, "shares");
        p.l(r3, "type");
        p.l(r4, "gtc");
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        this.f162033a = r1;
        this.f162034b = r2;
        this.f162035c = r3;
        this.d = r4;
        this.f162036e = r5;
        this.f162037f = r6;
    }

    public final String a() {
        return this.f162033a;
    }

    public final String b() {
        return this.f162034b;
    }

    public final b c() {
        return this.f162037f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (p.g(this.f162033a, r52.f162033a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162034b, r52.f162034b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f162035c, r52.f162035c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f162036e, r52.f162036e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f162037f, r52.f162037f) == true) goto L27;
        return false;
    L27:
        if (p.g(null, null) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        int r02 = ((((((((this.f162033a.hashCode() * 31) + this.f162034b.hashCode()) * 31) + this.f162035c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f162036e.hashCode()) * 31;
        b r1 = this.f162037f;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return (r02 + r12) * 31;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PostSmartOrderUIParam(company=" + this.f162033a + ", shares=" + this.f162034b + ", type=" + this.f162035c + ", gtc=" + this.d + ", price=" + this.f162036e + ", trailingStopParam=" + this.f162037f + ", limitIfTouchedParam=null)";
    }

    public /* synthetic */ n(String r2, String r3, String r4, String r5, BigDecimal r6, b r7, a r8, int r9, kotlin.jvm.internal.i r10) {
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
        r6 = BigDecimal.ZERO;
        p.k(r6, "ZERO");
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = null;
    L21:
        if ((r9 & 64) == 0) goto L24;
        a r92 = null;
    L23:
        b r82 = r7;
        BigDecimal r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
