package com.stockbit.domain.model.company.brokerdistribution;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81408a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81409b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81410c;
    public final List d;

    public c(String r2, String r3, double r4, List r6) {
        p.l(r2, "code");
        p.l(r3, "type");
        p.l(r6, "brokers");
        this.f81408a = r2;
        this.f81409b = r3;
        this.f81410c = r4;
        this.d = r6;
    }

    public final double a() {
        return this.f81410c;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.f81408a;
    }

    public final String d() {
        return this.f81409b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f81408a, r82.f81408a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81409b, r82.f81409b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81410c, r82.f81410c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81408a.hashCode() * 31) + this.f81409b.hashCode()) * 31) + Double.hashCode(this.f81410c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerTransactionEntity(code=" + this.f81408a + ", type=" + this.f81409b + ", amount=" + this.f81410c + ", brokers=" + this.d + ")";
    }
}
