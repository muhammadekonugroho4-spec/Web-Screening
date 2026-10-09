package com.stockbit.domain.model.brokeractivity;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f80898a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80899b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80900c;
    public final boolean d;

    public j(int r1, int r2, boolean r3, boolean r4) {
        this.f80898a = r1;
        this.f80899b = r2;
        this.f80900c = r3;
        this.d = r4;
    }

    public final boolean a() {
        return this.f80900c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f80898a == r52.f80898a) goto L12;
        return false;
    L12:
        if (this.f80899b == r52.f80899b) goto L15;
        return false;
    L15:
        if (this.f80900c == r52.f80900c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f80898a) * 31) + Integer.hashCode(this.f80899b)) * 31) + Boolean.hashCode(this.f80900c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "BrokerActivityDailyPaginationEntity(page=" + this.f80898a + ", limit=" + this.f80899b + ", hasNext=" + this.f80900c + ", hasPrev=" + this.d + ")";
    }
}
