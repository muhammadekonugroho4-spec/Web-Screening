package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f83717a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83718b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83719c;

    public u(int r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, "imageName");
        kotlin.jvm.internal.p.l(r4, "imageLink");
        this.f83717a = r2;
        this.f83718b = r3;
        this.f83719c = r4;
    }

    public final String a() {
        return this.f83719c;
    }

    public final String b() {
        return this.f83718b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof u) == true) goto L8;
        return false;
    L8:
        u r52 = (u) r5;
        if (this.f83717a == r52.f83717a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f83718b, r52.f83718b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f83719c, r52.f83719c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f83717a) * 31) + this.f83718b.hashCode()) * 31) + this.f83719c.hashCode();
    }

    public String toString() {
        return "StockDocument(id=" + this.f83717a + ", imageName=" + this.f83718b + ", imageLink=" + this.f83719c + ')';
    }

    public /* synthetic */ u(int r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
