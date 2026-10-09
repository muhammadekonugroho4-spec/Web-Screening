package com.stockbit.feature.transaction.ui.buystockcompose.model;

import com.stockbit.usecase.securities.model.common.DayTradeInfoEventType;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f111645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111646b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111647c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111648e;

    /* renamed from: f, reason: collision with root package name */
    public final String f111649f;

    /* renamed from: g, reason: collision with root package name */
    public final DayTradeInfoEventType f111650g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f111651h;

    static {
    }

    public n(String r2, String r3, String r4, int r5, String r6, String r7, DayTradeInfoEventType r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, "dayTradeBuyingPower");
        kotlin.jvm.internal.p.l(r3, "tradingBalance");
        kotlin.jvm.internal.p.l(r4, "leverageBalance");
        kotlin.jvm.internal.p.l(r6, "openTime");
        kotlin.jvm.internal.p.l(r7, "closeTime");
        kotlin.jvm.internal.p.l(r8, "dayTradeInfoEventType");
        this.f111645a = r2;
        this.f111646b = r3;
        this.f111647c = r4;
        this.d = r5;
        this.f111648e = r6;
        this.f111649f = r7;
        this.f111650g = r8;
        this.f111651h = r9;
    }

    public final String a() {
        return this.f111649f;
    }

    public final String b() {
        return this.f111645a;
    }

    public final DayTradeInfoEventType c() {
        return this.f111650g;
    }

    public final String d() {
        return this.f111647c;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f111645a, r52.f111645a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f111646b, r52.f111646b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f111647c, r52.f111647c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f111648e, r52.f111648e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f111649f, r52.f111649f) == true) goto L27;
        return false;
    L27:
        if (this.f111650g == r52.f111650g) goto L30;
        return false;
    L30:
        if (this.f111651h == r52.f111651h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f111648e;
    }

    public final String g() {
        return this.f111646b;
    }

    public final boolean h() {
        return this.f111651h;
    }

    public int hashCode() {
        return (((((((((((((this.f111645a.hashCode() * 31) + this.f111646b.hashCode()) * 31) + this.f111647c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f111648e.hashCode()) * 31) + this.f111649f.hashCode()) * 31) + this.f111650g.hashCode()) * 31) + Boolean.hashCode(this.f111651h);
    }

    public String toString() {
        return "DayTradeUIState(dayTradeBuyingPower=" + this.f111645a + ", tradingBalance=" + this.f111646b + ", leverageBalance=" + this.f111647c + ", multiplier=" + this.d + ", openTime=" + this.f111648e + ", closeTime=" + this.f111649f + ", dayTradeInfoEventType=" + this.f111650g + ", isDayTradeActivated=" + this.f111651h + ')';
    }

    public /* synthetic */ n(String r3, String r4, String r5, int r6, String r7, String r8, DayTradeInfoEventType r9, boolean r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r9 = DayTradeInfoEventType.EVENT_TYPE_UNSPECIFIED;
    L24:
        if ((r11 & 128) == 0) goto L27;
        boolean r112 = false;
    L26:
        DayTradeInfoEventType r102 = r9;
        String r92 = r8;
        String r82 = r7;
        int r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92, r102, r112);
        return;
    L27:
        r112 = r10;
        goto L26
    }
}
