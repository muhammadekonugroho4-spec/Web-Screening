package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f84690a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84691b;

    public j(int r1, boolean r2) {
        this.f84690a = r1;
        this.f84691b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f84690a == r52.f84690a) goto L12;
        return false;
    L12:
        if (this.f84691b == r52.f84691b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f84690a) * 31) + Boolean.hashCode(this.f84691b);
    }

    public String toString() {
        return "ProfileOnBoardingEntity(currentStep=" + this.f84690a + ", isDone=" + this.f84691b + ")";
    }

    public /* synthetic */ j(int r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
