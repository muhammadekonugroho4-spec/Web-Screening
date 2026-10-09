package com.stockbit.domain.model.markettime;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f84319a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84320b;

    /* renamed from: c, reason: collision with root package name */
    public final MarketStatus f84321c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84322e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84323f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84324g;

    /* renamed from: h, reason: collision with root package name */
    public final int f84325h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84326i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84327j;

    public b(int r2, String r3, MarketStatus r4, boolean r5, boolean r6, String r7, String r8, int r9, String r10, String r11) {
        p.l(r3, "stateName");
        p.l(r4, "marketStatus");
        p.l(r7, "stateStartTime");
        p.l(r8, "stateEndTime");
        p.l(r10, "timeLeftFormatted");
        p.l(r11, "suspendInfo");
        this.f84319a = r2;
        this.f84320b = r3;
        this.f84321c = r4;
        this.d = r5;
        this.f84322e = r6;
        this.f84323f = r7;
        this.f84324g = r8;
        this.f84325h = r9;
        this.f84326i = r10;
        this.f84327j = r11;
    }

    public final MarketStatus a() {
        return this.f84321c;
    }

    public final String b() {
        return this.f84327j;
    }

    public final String c() {
        return this.f84326i;
    }

    public final int d() {
        return this.f84325h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f84319a == r52.f84319a) goto L12;
        return false;
    L12:
        if (p.g(this.f84320b, r52.f84320b) == true) goto L15;
        return false;
    L15:
        if (this.f84321c == r52.f84321c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f84322e == r52.f84322e) goto L24;
        return false;
    L24:
        if (p.g(this.f84323f, r52.f84323f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84324g, r52.f84324g) == true) goto L30;
        return false;
    L30:
        if (this.f84325h == r52.f84325h) goto L33;
        return false;
    L33:
        if (p.g(this.f84326i, r52.f84326i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84327j, r52.f84327j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f84319a) * 31) + this.f84320b.hashCode()) * 31) + this.f84321c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f84322e)) * 31) + this.f84323f.hashCode()) * 31) + this.f84324g.hashCode()) * 31) + Integer.hashCode(this.f84325h)) * 31) + this.f84326i.hashCode()) * 31) + this.f84327j.hashCode();
    }

    public String toString() {
        return "SessionDetailEntity(session=" + this.f84319a + ", stateName=" + this.f84320b + ", marketStatus=" + this.f84321c + ", isLastSession=" + this.d + ", isEndOfDay=" + this.f84322e + ", stateStartTime=" + this.f84323f + ", stateEndTime=" + this.f84324g + ", timeLeftRaw=" + this.f84325h + ", timeLeftFormatted=" + this.f84326i + ", suspendInfo=" + this.f84327j + ")";
    }
}
