package com.stockbit.usecase.trusteddevice.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f164187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164188b;

    /* renamed from: c, reason: collision with root package name */
    public final long f164189c;

    public b(String r2, String r3, long r4) {
        p.l(r2, "target");
        p.l(r3, "promptToken");
        this.f164187a = r2;
        this.f164188b = r3;
        this.f164189c = r4;
    }

    public final String a() {
        return this.f164188b;
    }

    public final long b() {
        return this.f164189c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f164187a, r82.f164187a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164188b, r82.f164188b) == true) goto L15;
        return false;
    L15:
        if (this.f164189c == r82.f164189c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f164187a.hashCode() * 31) + this.f164188b.hashCode()) * 31) + Long.hashCode(this.f164189c);
    }

    public String toString() {
        return "SendLoginPromptUIState(target=" + this.f164187a + ", promptToken=" + this.f164188b + ", resendTimeLeft=" + this.f164189c + ')';
    }
}
