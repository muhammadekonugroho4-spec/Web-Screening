package com.stockbit.domain.model.tradingcommunity;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85954b;

    /* renamed from: c, reason: collision with root package name */
    public final float f85955c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f85956e;

    /* renamed from: f, reason: collision with root package name */
    public final float f85957f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85958g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f85959h;

    /* renamed from: i, reason: collision with root package name */
    public final String f85960i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f85961j;

    public c(String r2, String r3, float r4, float r5, float r6, float r7, String r8, Integer r9, String r10, boolean r11) {
        p.l(r2, "communityName");
        p.l(r3, "leaveDate");
        p.l(r8, "minimumBalance");
        p.l(r10, "leaderFullName");
        this.f85953a = r2;
        this.f85954b = r3;
        this.f85955c = r4;
        this.d = r5;
        this.f85956e = r6;
        this.f85957f = r7;
        this.f85958g = r8;
        this.f85959h = r9;
        this.f85960i = r10;
        this.f85961j = r11;
    }

    public final String a() {
        return this.f85953a;
    }

    public final String b() {
        return this.f85960i;
    }

    public final String c() {
        return this.f85954b;
    }

    public final String d() {
        return this.f85958g;
    }

    public final float e() {
        return this.f85955c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f85953a, r52.f85953a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85954b, r52.f85954b) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.f85955c, r52.f85955c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f85956e, r52.f85956e) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.f85957f, r52.f85957f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f85958g, r52.f85958g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85959h, r52.f85959h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f85960i, r52.f85960i) == true) goto L36;
        return false;
    L36:
        if (this.f85961j == r52.f85961j) goto L38;
        return false;
    L38:
        return true;
    }

    public final float f() {
        return this.d;
    }

    public final float g() {
        return this.f85956e;
    }

    public final float h() {
        return this.f85957f;
    }

    public int hashCode() {
        int r02 = ((((((((((((this.f85953a.hashCode() * 31) + this.f85954b.hashCode()) * 31) + Float.hashCode(this.f85955c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f85956e)) * 31) + Float.hashCode(this.f85957f)) * 31) + this.f85958g.hashCode()) * 31;
        Integer r1 = this.f85959h;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + this.f85960i.hashCode()) * 31) + Boolean.hashCode(this.f85961j);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final Integer i() {
        return this.f85959h;
    }

    public final boolean j() {
        return this.f85961j;
    }

    public String toString() {
        return "TradingCommunityEntity(communityName=" + this.f85953a + ", leaveDate=" + this.f85954b + ", newTotalBuy=" + this.f85955c + ", newTotalSell=" + this.d + ", oldTotalBuy=" + this.f85956e + ", oldTotalSell=" + this.f85957f + ", minimumBalance=" + this.f85958g + ", roomId=" + this.f85959h + ", leaderFullName=" + this.f85960i + ", isLeaderHasPILicense=" + this.f85961j + ")";
    }
}
