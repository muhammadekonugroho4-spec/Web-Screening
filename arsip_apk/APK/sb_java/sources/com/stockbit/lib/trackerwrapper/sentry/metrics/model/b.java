package com.stockbit.lib.trackerwrapper.sentry.metrics.model;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f120671a;

    /* renamed from: b, reason: collision with root package name */
    public final a f120672b;

    public b(String r2, a r3) {
        p.l(r2, "host");
        this.f120671a = r2;
        this.f120672b = r3;
    }

    public final String a() {
        return this.f120671a;
    }

    public final a b() {
        return this.f120672b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f120671a, r52.f120671a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f120672b, r52.f120672b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f120671a.hashCode() * 31;
        a r1 = this.f120672b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "HostTrace(host=" + this.f120671a + ", trace=" + this.f120672b + ')';
    }
}
