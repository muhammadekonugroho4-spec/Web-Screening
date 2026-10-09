package com.stockbit.domain.model.profile.settingprofile;

import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f84740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84741b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84742c;
    public final int d;

    public a(int r1, int r2, int r3, int r4) {
        this.f84740a = r1;
        this.f84741b = r2;
        this.f84742c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.f84741b;
    }

    public final int b() {
        return this.d;
    }

    public final int c() {
        return this.f84742c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f84740a == r52.f84740a) goto L12;
        return false;
    L12:
        if (this.f84741b == r52.f84741b) goto L15;
        return false;
    L15:
        if (this.f84742c == r52.f84742c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f84740a) * 31) + Integer.hashCode(this.f84741b)) * 31) + Integer.hashCode(this.f84742c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ProfileAdditionalData(reputations=" + this.f84740a + ", followers=" + this.f84741b + ", ideas=" + this.f84742c + ", following=" + this.d + ")";
    }

    public /* synthetic */ a(int r2, int r3, int r4, int r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
