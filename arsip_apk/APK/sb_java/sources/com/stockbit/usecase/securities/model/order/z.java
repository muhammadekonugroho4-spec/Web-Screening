package com.stockbit.usecase.securities.model.order;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final String f161510a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161511b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161512c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161513e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161514f;

    /* renamed from: g, reason: collision with root package name */
    public final String f161515g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161516h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161517i;

    /* renamed from: j, reason: collision with root package name */
    public final String f161518j;

    /* renamed from: k, reason: collision with root package name */
    public final String f161519k;

    /* renamed from: l, reason: collision with root package name */
    public final String f161520l;

    /* renamed from: m, reason: collision with root package name */
    public final String f161521m;

    /* renamed from: n, reason: collision with root package name */
    public final String f161522n;

    /* renamed from: o, reason: collision with root package name */
    public final String f161523o;

    /* renamed from: p, reason: collision with root package name */
    public final String f161524p;

    /* renamed from: q, reason: collision with root package name */
    public final int f161525q;

    public z(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, int r33) {
        kotlin.jvm.internal.p.l(r17, "priceOpen");
        kotlin.jvm.internal.p.l(r18, "priceAverage");
        kotlin.jvm.internal.p.l(r19, "priceAverageFee");
        kotlin.jvm.internal.p.l(r20, "lotOpen");
        kotlin.jvm.internal.p.l(r21, "amountOpen");
        kotlin.jvm.internal.p.l(r22, "amountInvested");
        kotlin.jvm.internal.p.l(r23, "amountInvestedFee");
        kotlin.jvm.internal.p.l(r24, "amountOpenFee");
        kotlin.jvm.internal.p.l(r25, "timeOrder");
        kotlin.jvm.internal.p.l(r26, "timeOpen");
        kotlin.jvm.internal.p.l(r27, "timeDone");
        kotlin.jvm.internal.p.l(r28, "lotDone");
        kotlin.jvm.internal.p.l(r29, "amountDone");
        kotlin.jvm.internal.p.l(r30, "brokerFee");
        kotlin.jvm.internal.p.l(r31, "exchangeFee");
        kotlin.jvm.internal.p.l(r32, "amountDoneFee");
        this.f161510a = r17;
        this.f161511b = r18;
        this.f161512c = r19;
        this.d = r20;
        this.f161513e = r21;
        this.f161514f = r22;
        this.f161515g = r23;
        this.f161516h = r24;
        this.f161517i = r25;
        this.f161518j = r26;
        this.f161519k = r27;
        this.f161520l = r28;
        this.f161521m = r29;
        this.f161522n = r30;
        this.f161523o = r31;
        this.f161524p = r32;
        this.f161525q = r33;
    }

    public final String a() {
        return this.f161521m;
    }

    public final String b() {
        return this.f161524p;
    }

    public final String c() {
        return this.f161515g;
    }

    public final String d() {
        return this.f161513e;
    }

    public final String e() {
        return this.f161516h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof z) == true) goto L8;
        return false;
    L8:
        z r52 = (z) r5;
        if (kotlin.jvm.internal.p.g(this.f161510a, r52.f161510a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161511b, r52.f161511b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161512c, r52.f161512c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161513e, r52.f161513e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161514f, r52.f161514f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f161515g, r52.f161515g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f161516h, r52.f161516h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f161517i, r52.f161517i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f161518j, r52.f161518j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f161519k, r52.f161519k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f161520l, r52.f161520l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f161521m, r52.f161521m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f161522n, r52.f161522n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f161523o, r52.f161523o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f161524p, r52.f161524p) == true) goto L57;
        return false;
    L57:
        if (this.f161525q == r52.f161525q) goto L59;
        return false;
    L59:
        return true;
    }

    public final String f() {
        return this.f161522n;
    }

    public final int g() {
        return this.f161525q;
    }

    public final String h() {
        return this.f161523o;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f161510a.hashCode() * 31) + this.f161511b.hashCode()) * 31) + this.f161512c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161513e.hashCode()) * 31) + this.f161514f.hashCode()) * 31) + this.f161515g.hashCode()) * 31) + this.f161516h.hashCode()) * 31) + this.f161517i.hashCode()) * 31) + this.f161518j.hashCode()) * 31) + this.f161519k.hashCode()) * 31) + this.f161520l.hashCode()) * 31) + this.f161521m.hashCode()) * 31) + this.f161522n.hashCode()) * 31) + this.f161523o.hashCode()) * 31) + this.f161524p.hashCode()) * 31) + Integer.hashCode(this.f161525q);
    }

    public final String i() {
        return this.f161520l;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f161511b;
    }

    public final String l() {
        return this.f161510a;
    }

    public final String m() {
        return this.f161519k;
    }

    public final String n() {
        return this.f161518j;
    }

    public String toString() {
        return "RawValuesUIState(priceOpen=" + this.f161510a + ", priceAverage=" + this.f161511b + ", priceAverageFee=" + this.f161512c + ", lotOpen=" + this.d + ", amountOpen=" + this.f161513e + ", amountInvested=" + this.f161514f + ", amountInvestedFee=" + this.f161515g + ", amountOpenFee=" + this.f161516h + ", timeOrder=" + this.f161517i + ", timeOpen=" + this.f161518j + ", timeDone=" + this.f161519k + ", lotDone=" + this.f161520l + ", amountDone=" + this.f161521m + ", brokerFee=" + this.f161522n + ", exchangeFee=" + this.f161523o + ", amountDoneFee=" + this.f161524p + ", configType=" + this.f161525q + ")";
    }

    public /* synthetic */ z(String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, int r34, int r35, kotlin.jvm.internal.i r36) {
        String r2 = "";
        if ((r35 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r35 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r35 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r35 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r35 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r35 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r35 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r35 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r35 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r35 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r35 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L58:
        String r182 = r1;
        if ((r35 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r35 & 32768) != 0) goto L67;
        r2 = r33;
    L67:
        if ((r35 & 65536) == 0) goto L70;
        int r352 = 0;
    L71:
        this(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r2, r352);
        return;
    L70:
        r352 = r34;
        goto L71
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
