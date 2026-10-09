package com.stockbit.component.pin;

/* loaded from: classes7.dex */
public final class H {

    /* renamed from: c, reason: collision with root package name */
    public static final int f74044c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f74045a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74046b;

    static {
    }

    public H(boolean r1, String r2) {
        this.f74045a = r1;
        this.f74046b = r2;
    }

    public final String a() {
        return this.f74046b;
    }

    public final boolean b() {
        return this.f74045a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof H) == true) goto L8;
        return false;
    L8:
        H r52 = (H) r5;
        if (this.f74045a == r52.f74045a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f74046b, r52.f74046b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f74045a) * 31;
        String r1 = this.f74046b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "PinValidationState(isLoading=" + this.f74045a + ", error=" + this.f74046b + ')';
    }

    public /* synthetic */ H(boolean r1, String r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
