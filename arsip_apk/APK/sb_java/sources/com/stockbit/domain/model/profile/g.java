package com.stockbit.domain.model.profile;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84671a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84672b;

    public g(boolean r1, boolean r2) {
        this.f84671a = r1;
        this.f84672b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f84671a == r52.f84671a) goto L12;
        return false;
    L12:
        if (this.f84672b == r52.f84672b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f84671a) * 31) + Boolean.hashCode(this.f84672b);
    }

    public String toString() {
        return "PrivacyEntity(isHideFacebook=" + this.f84671a + ", isHideEmail=" + this.f84672b + ")";
    }

    public /* synthetic */ g(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
