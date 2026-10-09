package com.stockbit.domain.model.company.runningtrade;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final c f81898a;

    /* renamed from: b, reason: collision with root package name */
    public final c f81899b;

    /* renamed from: c, reason: collision with root package name */
    public final c f81900c;

    public g(c r2, c r3, c r4) {
        p.l(r2, "value");
        p.l(r3, "lot");
        p.l(r4, Constants.KEY_FREQUENCY);
        this.f81898a = r2;
        this.f81899b = r3;
        this.f81900c = r4;
    }

    public final c a() {
        return this.f81900c;
    }

    public final c b() {
        return this.f81899b;
    }

    public final c c() {
        return this.f81898a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81898a, r52.f81898a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81899b, r52.f81899b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81900c, r52.f81900c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81898a.hashCode() * 31) + this.f81899b.hashCode()) * 31) + this.f81900c.hashCode();
    }

    public String toString() {
        return "RunningTradeGroupedTotalEntity(value=" + this.f81898a + ", lot=" + this.f81899b + ", frequency=" + this.f81900c + ")";
    }
}
