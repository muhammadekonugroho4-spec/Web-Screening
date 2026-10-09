package com.stockbit.domain.model.profile.v2;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84847a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84848b;

    public h(boolean r1, boolean r2) {
        this.f84847a = r1;
        this.f84848b = r2;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (this.f84847a == r52.f84847a) goto L12;
        return false;
    L12:
        if (this.f84848b == r52.f84848b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f84847a) * 31) + Boolean.hashCode(this.f84848b);
    }

    public String toString() {
        return "MyProfilePreferencesPrivacyEntity(isHideFacebook=" + this.f84847a + ", isHideEmail=" + this.f84848b + ")";
    }

    public /* synthetic */ h(boolean r2, boolean r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = false;
    L8:
        this(r2, r3);
    }
}
