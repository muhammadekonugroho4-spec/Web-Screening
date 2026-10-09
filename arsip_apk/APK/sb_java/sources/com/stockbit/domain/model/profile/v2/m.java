package com.stockbit.domain.model.profile.v2;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f84860a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84861b;

    public m(String r2, boolean r3) {
        p.l(r2, "version");
        this.f84860a = r2;
        this.f84861b = r3;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f84860a, r52.f84860a) == true) goto L12;
        return false;
    L12:
        if (this.f84861b == r52.f84861b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84860a.hashCode() * 31) + Boolean.hashCode(this.f84861b);
    }

    public String toString() {
        return "MyProfileStreamPreferencesEntity(version=" + this.f84860a + ", hasVersion2Explained=" + this.f84861b + ")";
    }

    public /* synthetic */ m(String r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
