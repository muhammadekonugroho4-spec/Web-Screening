package com.stockbit.personalamend.ui.forgotpasswordv3.inputemail;

/* renamed from: com.stockbit.personalamend.ui.forgotpasswordv3.inputemail.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9298a {

    /* renamed from: a, reason: collision with root package name */
    public final String f125946a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125947b;

    static {
    }

    public C9298a(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "email");
        this.f125946a = r2;
        this.f125947b = r3;
    }

    public final C9298a a(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "email");
        return new C9298a(r2, r3);
    }

    public final String b() {
        return this.f125946a;
    }

    public final boolean c() {
        return this.f125947b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C9298a) == true) goto L8;
        return false;
    L8:
        C9298a r52 = (C9298a) r5;
        if (kotlin.jvm.internal.p.g(this.f125946a, r52.f125946a) == true) goto L12;
        return false;
    L12:
        if (this.f125947b == r52.f125947b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f125946a.hashCode() * 31) + Boolean.hashCode(this.f125947b);
    }

    public String toString() {
        return "ForgotPasswordInputEmailEventState(email=" + this.f125946a + ", isButtonEnabled=" + this.f125947b + ')';
    }

    public /* synthetic */ C9298a(String r1, boolean r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = false;
    L8:
        this(r1, r2);
    }
}
