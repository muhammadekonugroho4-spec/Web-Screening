package com.stockbit.domain.model.securities.history.detail;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f85273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85274b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85275c;

    public c(int r1, int r2, int r3) {
        this.f85273a = r1;
        this.f85274b = r2;
        this.f85275c = r3;
    }

    public final int a() {
        return this.f85275c;
    }

    public final int b() {
        return this.f85274b;
    }

    public final int c() {
        return this.f85273a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f85273a == r52.f85273a) goto L12;
        return false;
    L12:
        if (this.f85274b == r52.f85274b) goto L15;
        return false;
    L15:
        if (this.f85275c == r52.f85275c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f85273a) * 31) + Integer.hashCode(this.f85274b)) * 31) + Integer.hashCode(this.f85275c);
    }

    public String toString() {
        return "HistoryDetailDateEntity(year=" + this.f85273a + ", month=" + this.f85274b + ", day=" + this.f85275c + ")";
    }

    public /* synthetic */ c(int r2, int r3, int r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
