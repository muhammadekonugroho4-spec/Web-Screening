package com.stockbit.userauthcontract.result;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b implements com.stockbit.userauthcontract.base.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f165705a;

    /* renamed from: b, reason: collision with root package name */
    public final String f165706b;

    /* renamed from: c, reason: collision with root package name */
    public final String f165707c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f165708e;

    /* renamed from: f, reason: collision with root package name */
    public final OTPSmsRegistFailState f165709f;

    static {
    }

    public b(String r2, String r3, String r4, String r5, String r6, OTPSmsRegistFailState r7) {
        p.l(r2, "phoneCode");
        p.l(r3, "phoneNumber");
        p.l(r5, "userEmail");
        p.l(r6, "token");
        this.f165705a = r2;
        this.f165706b = r3;
        this.f165707c = r4;
        this.d = r5;
        this.f165708e = r6;
        this.f165709f = r7;
    }

    public final OTPSmsRegistFailState a() {
        return this.f165709f;
    }

    public final String b() {
        return this.f165708e;
    }

    public final String c() {
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
        if (p.g(this.f165705a, r52.f165705a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f165706b, r52.f165706b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f165707c, r52.f165707c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f165708e, r52.f165708e) == true) goto L24;
        return false;
    L24:
        if (this.f165709f == r52.f165709f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f165705a.hashCode() * 31) + this.f165706b.hashCode()) * 31;
        String r1 = this.f165707c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((((r02 + r12) * 31) + this.d.hashCode()) * 31) + this.f165708e.hashCode()) * 31;
        OTPSmsRegistFailState r13 = this.f165709f;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "OTPSmsResult(phoneCode=" + this.f165705a + ", phoneNumber=" + this.f165706b + ", countrySelection=" + this.f165707c + ", userEmail=" + this.d + ", token=" + this.f165708e + ", otpSmsRegistFailState=" + this.f165709f + ')';
    }

    public /* synthetic */ b(String r3, String r4, String r5, String r6, String r7, OTPSmsRegistFailState r8, int r9, i r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = null;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        OTPSmsRegistFailState r92 = null;
    L20:
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r82, r92);
        return;
    L21:
        r92 = r8;
        goto L20
    }
}
