package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f85345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85346b;

    public m(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "lightMode");
        kotlin.jvm.internal.p.l(r3, "darkMode");
        this.f85345a = r2;
        this.f85346b = r3;
    }

    public final String a() {
        return this.f85346b;
    }

    public final String b() {
        return this.f85345a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f85345a, r52.f85345a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85346b, r52.f85346b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85345a.hashCode() * 31) + this.f85346b.hashCode();
    }

    public String toString() {
        return "RealizedColorEntity(lightMode=" + this.f85345a + ", darkMode=" + this.f85346b + ")";
    }
}
