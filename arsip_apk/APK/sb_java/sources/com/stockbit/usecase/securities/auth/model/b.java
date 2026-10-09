package com.stockbit.usecase.securities.auth.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f160220a;

    /* renamed from: b, reason: collision with root package name */
    public String f160221b;

    /* renamed from: c, reason: collision with root package name */
    public String f160222c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f160223e;

    public b(Boolean r1, String r2, String r3, String r4, boolean r5) {
        this.f160220a = r1;
        this.f160221b = r2;
        this.f160222c = r3;
        this.d = r4;
        this.f160223e = r5;
    }

    public final String a() {
        return this.f160221b;
    }

    public final boolean b() {
        return this.f160223e;
    }

    public final Boolean c() {
        return this.f160220a;
    }

    public final String d() {
        return this.f160222c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f160220a, r52.f160220a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160221b, r52.f160221b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160222c, r52.f160222c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f160223e == r52.f160223e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f160220a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f160221b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f160222c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return ((r06 + r1) * 31) + Boolean.hashCode(this.f160223e);
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "VerificationData(passwordVerified=" + this.f160220a + ", email=" + this.f160221b + ", phone=" + this.f160222c + ", phoneCode=" + this.d + ", emailVerified=" + this.f160223e + ")";
    }
}
