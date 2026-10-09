package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f85328a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85329b;

    public j(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "header");
        kotlin.jvm.internal.p.l(r3, "description");
        this.f85328a = r2;
        this.f85329b = r3;
    }

    public final String a() {
        return this.f85329b;
    }

    public final String b() {
        return this.f85328a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f85328a, r52.f85328a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85329b, r52.f85329b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85328a.hashCode() * 31) + this.f85329b.hashCode();
    }

    public String toString() {
        return "HistoryTooltipEntity(header=" + this.f85328a + ", description=" + this.f85329b + ")";
    }
}
