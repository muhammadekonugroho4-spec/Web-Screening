package com.stockbit.usecase.personalamend.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f159090a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159091b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159092c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159093e;

    public m(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "errorMessage");
        this.f159090a = r2;
        this.f159091b = r3;
        this.f159092c = r4;
        this.d = r5;
        this.f159093e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f159092c;
    }

    public final String c() {
        return this.f159091b;
    }

    public final String d() {
        return this.f159090a;
    }

    public final String e() {
        return this.f159093e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f159090a, r52.f159090a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159091b, r52.f159091b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159092c, r52.f159092c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159093e, r52.f159093e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = this.f159090a.hashCode() * 31;
        String r1 = this.f159091b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f159092c;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.d;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f159093e;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "VerifyChangeDataIdentityErrorUIState(errorMessage=" + this.f159090a + ", eKtpPassportErrorMessage=" + this.f159091b + ", dateOfBirthErrorMessage=" + this.f159092c + ", bankAccountErrorMessage=" + this.d + ", mothersNameErrorMessage=" + this.f159093e + ")";
    }
}
