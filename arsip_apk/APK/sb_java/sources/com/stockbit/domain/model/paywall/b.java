package com.stockbit.domain.model.paywall;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f84623a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84624b;

    /* renamed from: c, reason: collision with root package name */
    public final a f84625c;

    public b(d r1, List r2, a r3) {
        this.f84623a = r1;
        this.f84624b = r2;
        this.f84625c = r3;
    }

    public final a a() {
        return this.f84625c;
    }

    public final List b() {
        return this.f84624b;
    }

    public final d c() {
        return this.f84623a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84623a, r52.f84623a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84624b, r52.f84624b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84625c, r52.f84625c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        d r02 = this.f84623a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        List r2 = this.f84624b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        a r23 = this.f84625c;
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
        return "PaywallEntity(lastSubscription=" + this.f84623a + ", features=" + this.f84624b + ", company=" + this.f84625c + ")";
    }
}
