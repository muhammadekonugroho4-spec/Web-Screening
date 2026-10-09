package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f86697a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86698b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86699c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86700e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86701f;

    public x(boolean r1, boolean r2, boolean r3, String r4, String r5, String r6) {
        this.f86697a = r1;
        this.f86698b = r2;
        this.f86699c = r3;
        this.d = r4;
        this.f86700e = r5;
        this.f86701f = r6;
    }

    public final String a() {
        return this.f86701f;
    }

    public final boolean b() {
        return this.f86698b;
    }

    public final boolean c() {
        return this.f86699c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f86700e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof x) == true) goto L8;
        return false;
    L8:
        x r52 = (x) r5;
        if (this.f86697a == r52.f86697a) goto L12;
        return false;
    L12:
        if (this.f86698b == r52.f86698b) goto L15;
        return false;
    L15:
        if (this.f86699c == r52.f86699c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86700e, r52.f86700e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f86701f, r52.f86701f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Boolean.hashCode(this.f86697a) * 31) + Boolean.hashCode(this.f86698b)) * 31) + Boolean.hashCode(this.f86699c)) * 31;
        String r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f86700e;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f86701f;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "VerificationStatusEntity(phoneVerified=" + this.f86697a + ", emailVerified=" + this.f86698b + ", passwordVerified=" + this.f86699c + ", phoneCode=" + this.d + ", phoneNumber=" + this.f86700e + ", email=" + this.f86701f + ")";
    }
}
