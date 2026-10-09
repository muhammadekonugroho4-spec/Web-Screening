package com.stockbit.model.params.stream;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f122148a;

    /* renamed from: b, reason: collision with root package name */
    public final List f122149b;

    public d(String r2, List r3) {
        p.l(r2, "poolingEnd");
        p.l(r3, "poolingOptions");
        this.f122148a = r2;
        this.f122149b = r3;
    }

    public final String a() {
        return this.f122148a;
    }

    public final List b() {
        return this.f122149b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f122148a, r52.f122148a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122149b, r52.f122149b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f122148a.hashCode() * 31) + this.f122149b.hashCode();
    }

    public String toString() {
        return "PollingOptionRequest(poolingEnd=" + this.f122148a + ", poolingOptions=" + this.f122149b + ')';
    }
}
