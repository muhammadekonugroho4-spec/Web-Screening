package com.stockbit.feature.trusteddevice.base.setuperror;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117628a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f117629b;

    /* renamed from: c, reason: collision with root package name */
    public final String f117630c;

    static {
    }

    public a(boolean r1, boolean r2, String r3) {
        this.f117628a = r1;
        this.f117629b = r2;
        this.f117630c = r3;
    }

    public final a a(boolean r2, boolean r3, String r4) {
        return new a(r2, r3, r4);
    }

    public final boolean b() {
        return this.f117629b;
    }

    public final String c() {
        return this.f117630c;
    }

    public final boolean d() {
        return this.f117628a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f117628a == r52.f117628a) goto L12;
        return false;
    L12:
        if (this.f117629b == r52.f117629b) goto L15;
        return false;
    L15:
        if (p.g(this.f117630c, r52.f117630c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((Boolean.hashCode(this.f117628a) * 31) + Boolean.hashCode(this.f117629b)) * 31;
        String r1 = this.f117630c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "BaseSetupErrorEvent(isLoading=" + this.f117628a + ", buttonEnable=" + this.f117629b + ", timeLeft=" + this.f117630c + ')';
    }

    public /* synthetic */ a(boolean r1, boolean r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = true;
    L9:
        if ((r4 & 4) == 0) goto L11;
        r3 = null;
    L11:
        this(r1, r2, r3);
    }
}
