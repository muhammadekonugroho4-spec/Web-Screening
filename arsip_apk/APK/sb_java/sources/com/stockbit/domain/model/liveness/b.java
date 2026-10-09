package com.stockbit.domain.model.liveness;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f84237a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84238b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84239c;

    public b(long r2, boolean r4, String r5) {
        p.l(r5, "reason");
        this.f84237a = r2;
        this.f84238b = r4;
        this.f84239c = r5;
    }

    public final String a() {
        return this.f84239c;
    }

    public final long b() {
        return this.f84237a;
    }

    public final boolean c() {
        return this.f84238b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f84237a == r82.f84237a) goto L12;
        return false;
    L12:
        if (this.f84238b == r82.f84238b) goto L15;
        return false;
    L15:
        if (p.g(this.f84239c, r82.f84239c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f84237a) * 31) + Boolean.hashCode(this.f84238b)) * 31) + this.f84239c.hashCode();
    }

    public String toString() {
        return "LivenessSubmitEntity(threshold=" + this.f84237a + ", isPassed=" + this.f84238b + ", reason=" + this.f84239c + ")";
    }
}
