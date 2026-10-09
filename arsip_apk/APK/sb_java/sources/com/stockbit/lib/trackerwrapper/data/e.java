package com.stockbit.lib.trackerwrapper.data;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f120548a;

    /* renamed from: b, reason: collision with root package name */
    public final double f120549b;

    public e(String r2, double r3) {
        p.l(r2, "eventMessage");
        this.f120548a = r2;
        this.f120549b = r3;
    }

    public final String a() {
        return this.f120548a;
    }

    public final double b() {
        return this.f120549b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f120548a, r82.f120548a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f120549b, r82.f120549b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f120548a.hashCode() * 31) + Double.hashCode(this.f120549b);
    }

    public String toString() {
        return "SentryEventMessage(eventMessage=" + this.f120548a + ", sampleRate=" + this.f120549b + ')';
    }
}
