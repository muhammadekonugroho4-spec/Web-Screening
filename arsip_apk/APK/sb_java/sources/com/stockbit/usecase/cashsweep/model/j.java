package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f155046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f155047b;

    /* renamed from: c, reason: collision with root package name */
    public final int f155048c;

    public j(int r1, int r2, int r3) {
        this.f155046a = r1;
        this.f155047b = r2;
        this.f155048c = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f155046a == r52.f155046a) goto L12;
        return false;
    L12:
        if (this.f155047b == r52.f155047b) goto L15;
        return false;
    L15:
        if (this.f155048c == r52.f155048c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f155046a) * 31) + Integer.hashCode(this.f155047b)) * 31) + Integer.hashCode(this.f155048c);
    }

    public String toString() {
        return "DateUIState(year=" + this.f155046a + ", month=" + this.f155047b + ", day=" + this.f155048c + ")";
    }
}
