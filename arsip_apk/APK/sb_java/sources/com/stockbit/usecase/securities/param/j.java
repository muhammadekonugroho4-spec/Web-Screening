package com.stockbit.usecase.securities.param;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.securities.model.order.PortfolioType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f161986a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161987b;

    /* renamed from: c, reason: collision with root package name */
    public final int f161988c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161989e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161990f;

    /* renamed from: g, reason: collision with root package name */
    public final a f161991g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161992h;

    /* renamed from: i, reason: collision with root package name */
    public final PortfolioType f161993i;

    /* renamed from: j, reason: collision with root package name */
    public final String f161994j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f161995a;

        /* renamed from: b, reason: collision with root package name */
        public final String f161996b;

        /* renamed from: c, reason: collision with root package name */
        public final String f161997c;
        public final String d;

        public a(String r2, String r3, String r4, String r5) {
            p.l(r2, "splitQty");
            p.l(r3, "splitMethod");
            p.l(r4, "splitRangeMin");
            p.l(r5, "splitRangeMax");
            this.f161995a = r2;
            this.f161996b = r3;
            this.f161997c = r4;
            this.d = r5;
        }

        public final String a() {
            return this.f161996b;
        }

        public final String b() {
            return this.f161995a;
        }

        public final String c() {
            return this.d;
        }

        public final String d() {
            return this.f161997c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f161995a, r52.f161995a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f161996b, r52.f161996b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f161997c, r52.f161997c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r52.d) == true) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((this.f161995a.hashCode() * 31) + this.f161996b.hashCode()) * 31) + this.f161997c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "SplitOrderUIParam(splitQty=" + this.f161995a + ", splitMethod=" + this.f161996b + ", splitRangeMin=" + this.f161997c + ", splitRangeMax=" + this.d + ")";
        }
    }

    public j(String r2, String r3, int r4, String r5, String r6, String r7, a r8, String r9, PortfolioType r10, String r11) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r5, "symbol");
        p.l(r6, "boardType");
        p.l(r7, "platformType");
        p.l(r9, "dayTradeMultiplier");
        p.l(r10, "portfolioType");
        p.l(r11, "uiRef");
        this.f161986a = r2;
        this.f161987b = r3;
        this.f161988c = r4;
        this.d = r5;
        this.f161989e = r6;
        this.f161990f = r7;
        this.f161991g = r8;
        this.f161992h = r9;
        this.f161993i = r10;
        this.f161994j = r11;
    }

    public final String a() {
        return this.f161989e;
    }

    public final String b() {
        return this.f161992h;
    }

    public final int c() {
        return this.f161988c;
    }

    public final String d() {
        return this.f161990f;
    }

    public final PortfolioType e() {
        return this.f161993i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f161986a, r52.f161986a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f161987b, r52.f161987b) == true) goto L15;
        return false;
    L15:
        if (this.f161988c == r52.f161988c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f161989e, r52.f161989e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f161990f, r52.f161990f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f161991g, r52.f161991g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f161992h, r52.f161992h) == true) goto L33;
        return false;
    L33:
        if (this.f161993i == r52.f161993i) goto L36;
        return false;
    L36:
        if (p.g(this.f161994j, r52.f161994j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f161986a;
    }

    public final String g() {
        return this.f161987b;
    }

    public final a h() {
        return this.f161991g;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f161986a.hashCode() * 31) + this.f161987b.hashCode()) * 31) + Integer.hashCode(this.f161988c)) * 31) + this.d.hashCode()) * 31) + this.f161989e.hashCode()) * 31) + this.f161990f.hashCode()) * 31;
        a r1 = this.f161991g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((r02 + r12) * 31) + this.f161992h.hashCode()) * 31) + this.f161993i.hashCode()) * 31) + this.f161994j.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f161994j;
    }

    public String toString() {
        return "PostOrderBuyV2UIParam(price=" + this.f161986a + ", shares=" + this.f161987b + ", gtc=" + this.f161988c + ", symbol=" + this.d + ", boardType=" + this.f161989e + ", platformType=" + this.f161990f + ", splitOrder=" + this.f161991g + ", dayTradeMultiplier=" + this.f161992h + ", portfolioType=" + this.f161993i + ", uiRef=" + this.f161994j + ")";
    }

    public /* synthetic */ j(String r14, String r15, int r16, String r17, String r18, String r19, a r20, String r21, PortfolioType r22, String r23, int r24, kotlin.jvm.internal.i r25) {
        if ((r24 & 64) == 0) goto L5;
        a r9 = null;
    L7:
        if ((r24 & 128) == 0) goto L9;
        String r10 = "";
    L11:
        if ((r24 & 256) == 0) goto L14;
        PortfolioType r11 = PortfolioType.REGULAR;
    L15:
        this(r14, r15, r16, r17, r18, r19, r9, r10, r11, r23);
        return;
    L14:
        r11 = r22;
        goto L15
    L9:
        r10 = r21;
        goto L11
    L5:
        r9 = r20;
        goto L7
    }
}
