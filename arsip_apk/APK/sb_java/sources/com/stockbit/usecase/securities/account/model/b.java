package com.stockbit.usecase.securities.account.model;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f160187a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160188b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f160189c;

    public b(boolean r1, boolean r2, boolean r3) {
        this.f160187a = r1;
        this.f160188b = r2;
        this.f160189c = r3;
    }

    public final boolean a() {
        return this.f160187a;
    }

    public final boolean b() {
        return this.f160188b;
    }

    public final boolean c() {
        return this.f160189c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f160187a == r52.f160187a) goto L12;
        return false;
    L12:
        if (this.f160188b == r52.f160188b) goto L15;
        return false;
    L15:
        if (this.f160189c == r52.f160189c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f160187a) * 31) + Boolean.hashCode(this.f160188b)) * 31) + Boolean.hashCode(this.f160189c);
    }

    public String toString() {
        return "OcrResultUIState(isEligible=" + this.f160187a + ", isTriggered=" + this.f160188b + ", isUsed=" + this.f160189c + ")";
    }
}
