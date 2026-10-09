package com.stockbit.domains.usecase.networkdiagnostic.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f88323a;

    /* renamed from: b, reason: collision with root package name */
    public final List f88324b;

    public a(String r2, List r3) {
        p.l(r2, "host");
        p.l(r3, "times");
        this.f88323a = r2;
        this.f88324b = r3;
    }

    public final List a() {
        return this.f88324b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f88323a, r52.f88323a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88324b, r52.f88324b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f88323a.hashCode() * 31) + this.f88324b.hashCode();
    }

    public String toString() {
        return "PingUIState(host=" + this.f88323a + ", times=" + this.f88324b + ")";
    }
}
