package com.stockbit.domain.param.securities;

/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final a f87564a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87565b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87566c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87567e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87568f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87569g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87570h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87571i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87572j;

    /* renamed from: k, reason: collision with root package name */
    public final String f87573k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87574a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87575b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87576c;

        public a(String r1, String r2, String r3) {
            this.f87574a = r1;
            this.f87575b = r2;
            this.f87576c = r3;
        }

        public final String a() {
            return this.f87574a;
        }

        public final String b() {
            return this.f87575b;
        }

        public final String c() {
            return this.f87576c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f87574a, r52.f87574a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f87575b, r52.f87575b) == true) goto L15;
            return false;
        L15:
            if (kotlin.jvm.internal.p.g(this.f87576c, r52.f87576c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f87574a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f87575b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f87576c;
            if (r23 == null) goto L15;
            r1 = r23.hashCode();
        L15:
            return r05 + r1;
        L9:
            r22 = r2.hashCode();
            goto L10
        L5:
            r03 = r02.hashCode();
            goto L6
        }

        public String toString() {
            return "PostStopOrderAssetDomainParam(code=" + this.f87574a + ", marketBoard=" + this.f87575b + ", type=" + this.f87576c + ")";
        }
    }

    public p(a r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        this.f87564a = r1;
        this.f87565b = r2;
        this.f87566c = r3;
        this.d = r4;
        this.f87567e = r5;
        this.f87568f = r6;
        this.f87569g = r7;
        this.f87570h = r8;
        this.f87571i = r9;
        this.f87572j = r10;
        this.f87573k = r11;
    }

    public final a a() {
        return this.f87564a;
    }

    public final String b() {
        return this.f87565b;
    }

    public final String c() {
        return this.f87566c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f87567e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f87564a, r52.f87564a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f87565b, r52.f87565b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f87566c, r52.f87566c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f87567e, r52.f87567e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f87568f, r52.f87568f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f87569g, r52.f87569g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f87570h, r52.f87570h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f87571i, r52.f87571i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f87572j, r52.f87572j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f87573k, r52.f87573k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f87573k;
    }

    public final String g() {
        return this.f87568f;
    }

    public final String h() {
        return this.f87569g;
    }

    public int hashCode() {
        a r02 = this.f87564a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87565b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f87566c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f87567e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f87568f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f87569g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f87570h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f87571i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f87572j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f87573k;
        if (r219 == null) goto L47;
        r1 = r219.hashCode();
    L47:
        return r013 + r1;
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.f87570h;
    }

    public final String j() {
        return this.f87571i;
    }

    public final String k() {
        return this.f87572j;
    }

    public String toString() {
        return "PostStopOrderDomainParam(asset=" + this.f87564a + ", orderExpiryType=" + this.f87565b + ", orderPrice=" + this.f87566c + ", orderSide=" + this.d + ", orderType=" + this.f87567e + ", productCode=" + this.f87568f + ", shares=" + this.f87569g + ", triggerPrice=" + this.f87570h + ", triggerType=" + this.f87571i + ", uiRef=" + this.f87572j + ", portfolioPositionType=" + this.f87573k + ")";
    }
}
