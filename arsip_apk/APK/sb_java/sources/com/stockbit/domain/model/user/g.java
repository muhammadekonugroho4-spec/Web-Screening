package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f86637a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86638b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86639c;

    public g(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "target");
        kotlin.jvm.internal.p.l(r3, "channel");
        kotlin.jvm.internal.p.l(r4, "nextAttemptTime");
        this.f86637a = r2;
        this.f86638b = r3;
        this.f86639c = r4;
    }

    public final String a() {
        return this.f86638b;
    }

    public final String b() {
        return this.f86639c;
    }

    public final String c() {
        return this.f86637a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f86637a, r52.f86637a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86638b, r52.f86638b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86639c, r52.f86639c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86637a.hashCode() * 31) + this.f86638b.hashCode()) * 31) + this.f86639c.hashCode();
    }

    public String toString() {
        return "OTPChangeDataEntity(target=" + this.f86637a + ", channel=" + this.f86638b + ", nextAttemptTime=" + this.f86639c + ")";
    }
}
