package com.stockbit.domain.utils;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f88131a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f88132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f88133c;

    public b(int r1, boolean r2, boolean r3) {
        this.f88131a = r1;
        this.f88132b = r2;
        this.f88133c = r3;
    }

    public final boolean a() {
        return this.f88132b;
    }

    public final boolean b() {
        return this.f88133c;
    }

    public final int c() {
        return this.f88131a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f88131a == r52.f88131a) goto L12;
        return false;
    L12:
        if (this.f88132b == r52.f88132b) goto L15;
        return false;
    L15:
        if (this.f88133c == r52.f88133c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f88131a) * 31) + Boolean.hashCode(this.f88132b)) * 31) + Boolean.hashCode(this.f88133c);
    }

    public String toString() {
        return "BulkCancelSelectionState(totalSelectable=" + this.f88131a + ", allSelected=" + this.f88132b + ", anySelected=" + this.f88133c + ')';
    }
}
