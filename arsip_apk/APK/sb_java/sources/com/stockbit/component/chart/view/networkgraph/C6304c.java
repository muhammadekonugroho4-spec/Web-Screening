package com.stockbit.component.chart.view.networkgraph;

/* renamed from: com.stockbit.component.chart.view.networkgraph.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6304c {

    /* renamed from: a, reason: collision with root package name */
    public final String f69927a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69928b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69929c;

    static {
    }

    public C6304c(String r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "fromId");
        kotlin.jvm.internal.p.l(r3, "toId");
        this.f69927a = r2;
        this.f69928b = r3;
        this.f69929c = r4;
    }

    public final String a() {
        return this.f69927a;
    }

    public final String b() {
        return this.f69928b;
    }

    public final boolean c() {
        return this.f69929c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6304c) == true) goto L8;
        return false;
    L8:
        C6304c r52 = (C6304c) r5;
        if (kotlin.jvm.internal.p.g(this.f69927a, r52.f69927a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69928b, r52.f69928b) == true) goto L15;
        return false;
    L15:
        if (this.f69929c == r52.f69929c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f69927a.hashCode() * 31) + this.f69928b.hashCode()) * 31) + Boolean.hashCode(this.f69929c);
    }

    public String toString() {
        return "GraphEdge(fromId=" + this.f69927a + ", toId=" + this.f69928b + ", isSolid=" + this.f69929c + ')';
    }
}
