package com.stockbit.domain.model.profile.v2;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f84839a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84840b;

    public e(int r1, boolean r2) {
        this.f84839a = r1;
        this.f84840b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f84839a == r52.f84839a) goto L12;
        return false;
    L12:
        if (this.f84840b == r52.f84840b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f84839a) * 31) + Boolean.hashCode(this.f84840b);
    }

    public String toString() {
        return "MyProfileOnboardingEntity(currentStep=" + this.f84839a + ", isDone=" + this.f84840b + ")";
    }

    public /* synthetic */ e(int r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
