package com.stockbit.usecase.securities.account.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f160190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160192c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f160193e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f160194f;

    public c(boolean r2, String r3, String r4, String r5, boolean r6, boolean r7) {
        p.l(r3, "phoneCode");
        p.l(r4, "phoneNumber");
        p.l(r5, "email");
        this.f160190a = r2;
        this.f160191b = r3;
        this.f160192c = r4;
        this.d = r5;
        this.f160193e = r6;
        this.f160194f = r7;
    }

    public static /* synthetic */ c b(c r02, boolean r1, String r2, String r3, String r4, boolean r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f160190a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f160191b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f160192c;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.f160193e;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.f160194f;
    L20:
        boolean r72 = r5;
        boolean r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82);
    }

    public final c a(boolean r9, String r10, String r11, String r12, boolean r13, boolean r14) {
        p.l(r10, "phoneCode");
        p.l(r11, "phoneNumber");
        p.l(r12, "email");
        return new c(r9, r10, r11, r12, r13, r14);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f160191b;
    }

    public final String e() {
        return this.f160192c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f160190a == r52.f160190a) goto L12;
        return false;
    L12:
        if (p.g(this.f160191b, r52.f160191b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160192c, r52.f160192c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f160193e == r52.f160193e) goto L24;
        return false;
    L24:
        if (this.f160194f == r52.f160194f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f160190a;
    }

    public final boolean g() {
        return this.f160193e;
    }

    public final boolean h() {
        return this.f160194f;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f160190a) * 31) + this.f160191b.hashCode()) * 31) + this.f160192c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f160193e)) * 31) + Boolean.hashCode(this.f160194f);
    }

    public String toString() {
        return "RegistrationPreparationUIState(isAddPhoneAction=" + this.f160190a + ", phoneCode=" + this.f160191b + ", phoneNumber=" + this.f160192c + ", email=" + this.d + ", isEmailVerified=" + this.f160193e + ", isPasswordVerified=" + this.f160194f + ")";
    }

    public /* synthetic */ c(boolean r3, String r4, String r5, String r6, boolean r7, boolean r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r9 & 32) == 0) goto L21;
        boolean r92 = false;
    L20:
        boolean r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92);
        return;
    L21:
        r92 = r8;
        goto L20
    }
}
