package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f84734a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84735b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84736c;

    public q(int r1, boolean r2, boolean r3) {
        this.f84734a = r1;
        this.f84735b = r2;
        this.f84736c = r3;
    }

    public final boolean a() {
        return this.f84736c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (this.f84734a == r52.f84734a) goto L12;
        return false;
    L12:
        if (this.f84735b == r52.f84735b) goto L15;
        return false;
    L15:
        if (this.f84736c == r52.f84736c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f84734a) * 31) + Boolean.hashCode(this.f84735b)) * 31) + Boolean.hashCode(this.f84736c);
    }

    public String toString() {
        return "ProfileTradingEntity(accountId=" + this.f84734a + ", isPro=" + this.f84735b + ", hasRealtradingAccess=" + this.f84736c + ")";
    }

    public /* synthetic */ q(int r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
