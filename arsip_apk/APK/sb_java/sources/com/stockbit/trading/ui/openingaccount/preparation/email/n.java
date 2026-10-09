package com.stockbit.trading.ui.openingaccount.preparation.email;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f148314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f148315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f148316c;

    static {
    }

    public n(String r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "email");
        this.f148314a = r2;
        this.f148315b = r3;
        this.f148316c = r4;
    }

    public static /* synthetic */ n b(n r02, String r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f148314a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f148315b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f148316c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final n a(String r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "email");
        return new n(r2, r3, r4);
    }

    public final String c() {
        return this.f148314a;
    }

    public final boolean d() {
        return this.f148316c;
    }

    public final boolean e() {
        return this.f148315b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f148314a, r52.f148314a) == true) goto L12;
        return false;
    L12:
        if (this.f148315b == r52.f148315b) goto L15;
        return false;
    L15:
        if (this.f148316c == r52.f148316c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f148314a.hashCode() * 31) + Boolean.hashCode(this.f148315b)) * 31) + Boolean.hashCode(this.f148316c);
    }

    public String toString() {
        return "RegistrationPreparationEmailState(email=" + this.f148314a + ", isVerified=" + this.f148315b + ", isVaasLoading=" + this.f148316c + ')';
    }

    public /* synthetic */ n(String r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = false;
    L11:
        this(r2, r3, r4);
    }
}
