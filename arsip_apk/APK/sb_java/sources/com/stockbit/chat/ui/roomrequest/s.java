package com.stockbit.chat.ui.roomrequest;

/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59156a;

    /* renamed from: b, reason: collision with root package name */
    public final int f59157b;

    static {
    }

    public s(boolean r1, int r2) {
        this.f59156a = r1;
        this.f59157b = r2;
    }

    public static /* synthetic */ s b(s r02, boolean r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f59156a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f59157b;
    L9:
        return r02.a(r1, r2);
    }

    public final s a(boolean r2, int r3) {
        return new s(r2, r3);
    }

    public final int c() {
        return this.f59157b;
    }

    public final boolean d() {
        return this.f59156a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (this.f59156a == r52.f59156a) goto L12;
        return false;
    L12:
        if (this.f59157b == r52.f59157b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f59156a) * 31) + Integer.hashCode(this.f59157b);
    }

    public String toString() {
        return "EmptyUIEventState(show=" + this.f59156a + ", descriptionTextRes=" + this.f59157b + ')';
    }

    public /* synthetic */ s(boolean r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = com.stockbit.chat.k.f55507c0;
    L8:
        this(r1, r2);
    }
}
