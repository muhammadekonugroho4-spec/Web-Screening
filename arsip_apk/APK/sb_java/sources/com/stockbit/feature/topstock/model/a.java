package com.stockbit.feature.topstock.model;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f106934a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106935b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106936c;

    static {
    }

    public a(int r1, int r2, boolean r3) {
        this.f106934a = r1;
        this.f106935b = r2;
        this.f106936c = r3;
    }

    public final int a() {
        return this.f106934a;
    }

    public final int b() {
        return this.f106935b;
    }

    public final boolean c() {
        return this.f106936c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f106934a == r52.f106934a) goto L12;
        return false;
    L12:
        if (this.f106935b == r52.f106935b) goto L15;
        return false;
    L15:
        if (this.f106936c == r52.f106936c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f106934a) * 31) + Integer.hashCode(this.f106935b)) * 31) + Boolean.hashCode(this.f106936c);
    }

    public String toString() {
        return "RequestPageType(firstVisibleItemIndex=" + this.f106934a + ", lastVisibleItemIndex=" + this.f106935b + ", isScrollDown=" + this.f106936c + ')';
    }
}
