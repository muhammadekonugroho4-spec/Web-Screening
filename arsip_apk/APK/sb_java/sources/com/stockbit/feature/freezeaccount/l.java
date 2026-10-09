package com.stockbit.feature.freezeaccount;

/* loaded from: classes9.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96588a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96589b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96590c;

    static {
    }

    public l(boolean r1, String r2, String r3) {
        this.f96588a = r1;
        this.f96589b = r2;
        this.f96590c = r3;
    }

    public static /* synthetic */ l b(l r02, boolean r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f96588a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f96589b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f96590c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final l a(boolean r2, String r3, String r4) {
        return new l(r2, r3, r4);
    }

    public final String c() {
        return this.f96589b;
    }

    public final String d() {
        return this.f96590c;
    }

    public final boolean e() {
        return this.f96588a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (this.f96588a == r52.f96588a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f96589b, r52.f96589b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f96590c, r52.f96590c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f96588a) * 31;
        String r1 = this.f96589b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f96590c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "FreezeAccountState(isLoading=" + this.f96588a + ", errorLimitExceeded=" + this.f96589b + ", errorMaintenance=" + this.f96590c + ')';
    }

    public /* synthetic */ l(boolean r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
