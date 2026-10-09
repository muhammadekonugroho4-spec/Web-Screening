package com.stockbit.feature.trusteddevice.ui.setup.onboarding;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f118697a;

    /* renamed from: b, reason: collision with root package name */
    public final b f118698b;

    static {
    }

    public c(boolean r1, b r2) {
        this.f118697a = r1;
        this.f118698b = r2;
    }

    public static /* synthetic */ c b(c r02, boolean r1, b r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f118697a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f118698b;
    L9:
        return r02.a(r1, r2);
    }

    public final c a(boolean r2, b r3) {
        return new c(r2, r3);
    }

    public final b c() {
        return this.f118698b;
    }

    public final boolean d() {
        return this.f118697a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f118697a == r52.f118697a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118698b, r52.f118698b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Boolean.hashCode(this.f118697a) * 31;
        b r1 = this.f118698b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "SetupOnboardingEvent(isLoading=" + this.f118697a + ", setupBlockedUIState=" + this.f118698b + ')';
    }

    public /* synthetic */ c(boolean r1, b r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = null;
    L8:
        this(r1, r2);
    }
}
