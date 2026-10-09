package com.stockbit.onboarding.ui.forgotpassword.inputemail;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f123548a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f123549b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f123550c;

    static {
    }

    public a(String r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "email");
        this.f123548a = r2;
        this.f123549b = r3;
        this.f123550c = r4;
    }

    public static /* synthetic */ a b(a r02, String r1, boolean r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f123548a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f123549b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f123550c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final a a(String r2, boolean r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "email");
        return new a(r2, r3, r4);
    }

    public final String c() {
        return this.f123548a;
    }

    public final boolean d() {
        return this.f123550c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (kotlin.jvm.internal.p.g(this.f123548a, r52.f123548a) == true) goto L12;
        return false;
    L12:
        if (this.f123549b == r52.f123549b) goto L15;
        return false;
    L15:
        if (this.f123550c == r52.f123550c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f123548a.hashCode() * 31) + Boolean.hashCode(this.f123549b)) * 31) + Boolean.hashCode(this.f123550c);
    }

    public String toString() {
        return "ForgotPasswordInputEmailEventState(email=" + this.f123548a + ", showLostPhoneButton=" + this.f123549b + ", isButtonEnabled=" + this.f123550c + ')';
    }

    public /* synthetic */ a(String r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.i r6) {
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
