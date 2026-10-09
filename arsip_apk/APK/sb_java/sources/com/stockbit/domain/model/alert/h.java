package com.stockbit.domain.model.alert;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final AlertExpirationPeriod f80601a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80602b;

    public h(AlertExpirationPeriod r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "expiration");
        this.f80601a = r2;
        this.f80602b = r3;
    }

    public final String a() {
        return this.f80602b;
    }

    public final AlertExpirationPeriod b() {
        return this.f80601a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f80601a == r52.f80601a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80602b, r52.f80602b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f80601a.hashCode() * 31;
        String r1 = this.f80602b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "AlertExpirationDetail(expiration=" + this.f80601a + ", date=" + this.f80602b + ")";
    }
}
