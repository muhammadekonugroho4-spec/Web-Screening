package com.stockbit.domain.model.changephone;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f81171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81172b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81173c;

    public e(String r2, String r3, int r4) {
        p.l(r2, "token");
        p.l(r3, "target");
        this.f81171a = r2;
        this.f81172b = r3;
        this.f81173c = r4;
    }

    public final int a() {
        return this.f81173c;
    }

    public final String b() {
        return this.f81171a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f81171a, r52.f81171a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81172b, r52.f81172b) == true) goto L15;
        return false;
    L15:
        if (this.f81173c == r52.f81173c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81171a.hashCode() * 31) + this.f81172b.hashCode()) * 31) + Integer.hashCode(this.f81173c);
    }

    public String toString() {
        return "ChangePhoneOtpEntity(token=" + this.f81171a + ", target=" + this.f81172b + ", nextAttemptIn=" + this.f81173c + ")";
    }
}
