package com.stockbit.domain.model.networkdiagnostic;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f84471a;

    /* renamed from: b, reason: collision with root package name */
    public final List f84472b;

    public e(String r2, List r3) {
        p.l(r2, "host");
        p.l(r3, "results");
        this.f84471a = r2;
        this.f84472b = r3;
    }

    public final String a() {
        return this.f84471a;
    }

    public final List b() {
        return this.f84472b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f84471a, r52.f84471a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84472b, r52.f84472b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84471a.hashCode() * 31) + this.f84472b.hashCode();
    }

    public String toString() {
        return "PingEntity(host=" + this.f84471a + ", results=" + this.f84472b + ")";
    }
}
