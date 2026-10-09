package com.stockbit.domain.model.alert;

import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f80614a;

    /* renamed from: b, reason: collision with root package name */
    public final List f80615b;

    /* renamed from: c, reason: collision with root package name */
    public final List f80616c;
    public final Map d;

    public k(List r2, List r3, List r4, Map r5) {
        kotlin.jvm.internal.p.l(r2, "conditions");
        kotlin.jvm.internal.p.l(r3, "expirations");
        kotlin.jvm.internal.p.l(r4, "maLengths");
        kotlin.jvm.internal.p.l(r5, "categories");
        this.f80614a = r2;
        this.f80615b = r3;
        this.f80616c = r4;
        this.d = r5;
    }

    public final Map a() {
        return this.d;
    }

    public final List b() {
        return this.f80615b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (kotlin.jvm.internal.p.g(this.f80614a, r52.f80614a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80615b, r52.f80615b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80616c, r52.f80616c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f80614a.hashCode() * 31) + this.f80615b.hashCode()) * 31) + this.f80616c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AlertInitializationEntity(conditions=" + this.f80614a + ", expirations=" + this.f80615b + ", maLengths=" + this.f80616c + ", categories=" + this.d + ")";
    }
}
