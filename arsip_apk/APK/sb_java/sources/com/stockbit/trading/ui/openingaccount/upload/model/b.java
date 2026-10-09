package com.stockbit.trading.ui.openingaccount.upload.model;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f148572a;

    /* renamed from: b, reason: collision with root package name */
    public final int f148573b;

    static {
    }

    public b(int r1, int r2) {
        this.f148572a = r1;
        this.f148573b = r2;
    }

    public final int a() {
        return this.f148572a;
    }

    public final int b() {
        return this.f148573b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f148572a == r52.f148572a) goto L12;
        return false;
    L12:
        if (this.f148573b == r52.f148573b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f148572a) * 31) + Integer.hashCode(this.f148573b);
    }

    public String toString() {
        return "PhotoHint(iconRes=" + this.f148572a + ", textRes=" + this.f148573b + ')';
    }
}
