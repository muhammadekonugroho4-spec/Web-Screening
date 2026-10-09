package com.stockbit.trading.ui.openingaccount.upload.model;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f148569a;

    /* renamed from: b, reason: collision with root package name */
    public final int f148570b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f148571c;

    static {
    }

    public a(int r1, int r2, boolean r3) {
        this.f148569a = r1;
        this.f148570b = r2;
        this.f148571c = r3;
    }

    public final int a() {
        return this.f148570b;
    }

    public final int b() {
        return this.f148569a;
    }

    public final boolean c() {
        return this.f148571c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f148569a == r52.f148569a) goto L12;
        return false;
    L12:
        if (this.f148570b == r52.f148570b) goto L15;
        return false;
    L15:
        if (this.f148571c == r52.f148571c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f148569a) * 31) + Integer.hashCode(this.f148570b)) * 31) + Boolean.hashCode(this.f148571c);
    }

    public String toString() {
        return "PhotoExample(imageRes=" + this.f148569a + ", captionRes=" + this.f148570b + ", isCorrect=" + this.f148571c + ')';
    }
}
