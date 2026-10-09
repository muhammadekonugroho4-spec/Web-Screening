package com.stockbit.usecase.paywall.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f158966a;

    /* renamed from: b, reason: collision with root package name */
    public final List f158967b;

    /* renamed from: c, reason: collision with root package name */
    public final a f158968c;

    public d(c r2, List r3, a r4) {
        p.l(r2, "lastSubscription");
        p.l(r3, "features");
        p.l(r4, "company");
        this.f158966a = r2;
        this.f158967b = r3;
        this.f158968c = r4;
    }

    public final a a() {
        return this.f158968c;
    }

    public final List b() {
        return this.f158967b;
    }

    public final c c() {
        return this.f158966a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f158966a, r52.f158966a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158967b, r52.f158967b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f158968c, r52.f158968c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158966a.hashCode() * 31) + this.f158967b.hashCode()) * 31) + this.f158968c.hashCode();
    }

    public String toString() {
        return "PaywallUIState(lastSubscription=" + this.f158966a + ", features=" + this.f158967b + ", company=" + this.f158968c + ")";
    }
}
