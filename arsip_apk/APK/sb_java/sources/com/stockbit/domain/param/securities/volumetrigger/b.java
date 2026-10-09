package com.stockbit.domain.param.securities.volumetrigger;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f87582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87583b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87584c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87585e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87586f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87587g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87588h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87589i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87590a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87591b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87592c;

        public a(String r1, String r2, String r3) {
            this.f87590a = r1;
            this.f87591b = r2;
            this.f87592c = r3;
        }

        public final String a() {
            return this.f87590a;
        }

        public final String b() {
            return this.f87591b;
        }

        public final String c() {
            return this.f87592c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f87590a, r52.f87590a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87591b, r52.f87591b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f87592c, r52.f87592c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            String r02 = this.f87590a;
            int r1 = 0;
            if (r02 != null) goto L5;
            int r03 = 0;
        L6:
            int r04 = r03 * 31;
            String r2 = this.f87591b;
            if (r2 != null) goto L9;
            int r22 = 0;
        L10:
            int r05 = (r04 + r22) * 31;
            String r23 = this.f87592c;
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
            return "Asset(code=" + this.f87590a + ", marketBoard=" + this.f87591b + ", type=" + this.f87592c + ")";
        }
    }

    public b(a r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        this.f87582a = r1;
        this.f87583b = r2;
        this.f87584c = r3;
        this.d = r4;
        this.f87585e = r5;
        this.f87586f = r6;
        this.f87587g = r7;
        this.f87588h = r8;
        this.f87589i = r9;
    }

    public final a a() {
        return this.f87582a;
    }

    public final String b() {
        return this.f87588h;
    }

    public final String c() {
        return this.f87583b;
    }

    public final String d() {
        return this.f87584c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87582a, r52.f87582a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87583b, r52.f87583b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87584c, r52.f87584c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87585e, r52.f87585e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87586f, r52.f87586f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87587g, r52.f87587g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f87588h, r52.f87588h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f87589i, r52.f87589i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f87585e;
    }

    public final String g() {
        return this.f87586f;
    }

    public final String h() {
        return this.f87587g;
    }

    public int hashCode() {
        a r02 = this.f87582a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f87583b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f87584c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f87585e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f87586f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f87587g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f87588h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f87589i;
        if (r215 == null) goto L39;
        r1 = r215.hashCode();
    L39:
        return r011 + r1;
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
        return this.f87589i;
    }

    public String toString() {
        return "PostVolumeTriggerOrderDomainParam(asset=" + this.f87582a + ", orderExpiryType=" + this.f87583b + ", orderPrice=" + this.f87584c + ", orderSide=" + this.d + ", orderType=" + this.f87585e + ", shares=" + this.f87586f + ", triggerVolume=" + this.f87587g + ", evaluationPrice=" + this.f87588h + ", uiRef=" + this.f87589i + ")";
    }
}
