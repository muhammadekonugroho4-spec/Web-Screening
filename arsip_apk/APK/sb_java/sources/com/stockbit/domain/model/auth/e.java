package com.stockbit.domain.model.auth;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f80644a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80645b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80646c;
    public final String d;

    public e(String r2, int r3, String r4, String r5) {
        p.l(r2, "token");
        p.l(r4, "target");
        p.l(r5, "channel");
        this.f80644a = r2;
        this.f80645b = r3;
        this.f80646c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.f80645b;
    }

    public final String b() {
        return this.f80644a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f80644a, r52.f80644a) == true) goto L12;
        return false;
    L12:
        if (this.f80645b == r52.f80645b) goto L15;
        return false;
    L15:
        if (p.g(this.f80646c, r52.f80646c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f80644a.hashCode() * 31) + Integer.hashCode(this.f80645b)) * 31) + this.f80646c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ForgotPinOTPEntity(token=" + this.f80644a + ", nextAttemptIn=" + this.f80645b + ", target=" + this.f80646c + ", channel=" + this.d + ")";
    }
}
