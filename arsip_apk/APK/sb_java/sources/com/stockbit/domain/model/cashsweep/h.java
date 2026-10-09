package com.stockbit.domain.model.cashsweep;

import com.stockbit.domain.type.CashSweepRejectReasonType;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81135a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81136b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81137c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81138e;

    /* renamed from: f, reason: collision with root package name */
    public final CashSweepRejectReasonType f81139f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f81140g;

    public h(boolean r2, String r3, String r4, String r5, String r6, CashSweepRejectReasonType r7, boolean r8) {
        p.l(r3, "userStatus");
        p.l(r4, "upgradeStatus");
        p.l(r5, "userBankStatus");
        p.l(r6, "cashSweepStatus");
        p.l(r7, "rejectReasonType");
        this.f81135a = r2;
        this.f81136b = r3;
        this.f81137c = r4;
        this.d = r5;
        this.f81138e = r6;
        this.f81139f = r7;
        this.f81140g = r8;
    }

    public final String a() {
        return this.f81138e;
    }

    public final boolean b() {
        return this.f81140g;
    }

    public final CashSweepRejectReasonType c() {
        return this.f81139f;
    }

    public final String d() {
        return this.f81137c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f81135a == r52.f81135a) goto L12;
        return false;
    L12:
        if (p.g(this.f81136b, r52.f81136b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81137c, r52.f81137c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81138e, r52.f81138e) == true) goto L24;
        return false;
    L24:
        if (this.f81139f == r52.f81139f) goto L27;
        return false;
    L27:
        if (this.f81140g == r52.f81140g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f81136b;
    }

    public final boolean g() {
        return this.f81135a;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f81135a) * 31) + this.f81136b.hashCode()) * 31) + this.f81137c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81138e.hashCode()) * 31) + this.f81139f.hashCode()) * 31) + Boolean.hashCode(this.f81140g);
    }

    public String toString() {
        return "CashSweepStatsEntity(isSharia=" + this.f81135a + ", userStatus=" + this.f81136b + ", upgradeStatus=" + this.f81137c + ", userBankStatus=" + this.d + ", cashSweepStatus=" + this.f81138e + ", rejectReasonType=" + this.f81139f + ", previouslyActivated=" + this.f81140g + ")";
    }
}
