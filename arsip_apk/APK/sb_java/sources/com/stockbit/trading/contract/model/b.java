package com.stockbit.trading.contract.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f146243a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f146244b;

    /* renamed from: c, reason: collision with root package name */
    public String f146245c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f146246e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f146247f;

    public b(Boolean r1, Boolean r2, String r3, String r4, String r5, boolean r6) {
        this.f146243a = r1;
        this.f146244b = r2;
        this.f146245c = r3;
        this.d = r4;
        this.f146246e = r5;
        this.f146247f = r6;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f146243a, r52.f146243a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f146244b, r52.f146244b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f146245c, r52.f146245c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f146246e, r52.f146246e) == true) goto L24;
        return false;
    L24:
        if (this.f146247f == r52.f146247f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        Boolean r02 = this.f146243a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Boolean r2 = this.f146244b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f146245c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f146246e;
        if (r27 == null) goto L23;
        r1 = r27.hashCode();
    L23:
        return ((r07 + r1) * 31) + Boolean.hashCode(this.f146247f);
    L17:
        r26 = r25.hashCode();
        goto L18
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
        return "SecuritiesRegistrationValidationData(status=" + this.f146243a + ", password=" + this.f146244b + ", email=" + this.f146245c + ", phone=" + this.d + ", phoneCode=" + this.f146246e + ", isEmailVerified=" + this.f146247f + ')';
    }

    public /* synthetic */ b(Boolean r2, Boolean r3, String r4, String r5, String r6, boolean r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = false;
    L20:
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
    }
}
