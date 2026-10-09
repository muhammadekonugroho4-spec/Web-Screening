package com.stockbit.onboarding.ui.register.whatsapp;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f124211a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124212b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124213c;
    public final Integer d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f124214e;

    static {
    }

    public n(String r2, boolean r3, int r4, Integer r5, boolean r6) {
        kotlin.jvm.internal.p.l(r2, "phoneNumber");
        this.f124211a = r2;
        this.f124212b = r3;
        this.f124213c = r4;
        this.d = r5;
        this.f124214e = r6;
    }

    public static /* synthetic */ n b(n r02, String r1, boolean r2, int r3, Integer r4, boolean r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f124211a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f124212b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f124213c;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r02.f124214e;
    L17:
        Integer r62 = r4;
        boolean r72 = r5;
        int r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72);
    }

    public final n a(String r8, boolean r9, int r10, Integer r11, boolean r12) {
        kotlin.jvm.internal.p.l(r8, "phoneNumber");
        return new n(r8, r9, r10, r11, r12);
    }

    public final int c() {
        return this.f124213c;
    }

    public final boolean d() {
        if (this.d == null) goto L6;
        return true;
    L6:
        return false;
    }

    public final String e() {
        return this.f124211a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f124211a, r52.f124211a) == true) goto L12;
        return false;
    L12:
        if (this.f124212b == r52.f124212b) goto L15;
        return false;
    L15:
        if (this.f124213c == r52.f124213c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f124214e == r52.f124214e) goto L23;
        return false;
    L23:
        return true;
    }

    public final boolean f() {
        return this.f124212b;
    }

    public final boolean g() {
        if (this.f124213c != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean h() {
        return this.f124214e;
    }

    public int hashCode() {
        int r02 = ((((this.f124211a.hashCode() * 31) + Boolean.hashCode(this.f124212b)) * 31) + Integer.hashCode(this.f124213c)) * 31;
        Integer r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f124214e);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "RegisterWhatsAppAuthUIState(phoneNumber=" + this.f124211a + ", isLoading=" + this.f124212b + ", countdownSeconds=" + this.f124213c + ", remainingAttempt=" + this.d + ", isTryAnotherWayAvailable=" + this.f124214e + ')';
    }

    public /* synthetic */ n(String r2, boolean r3, int r4, Integer r5, boolean r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = true;
    L17:
        boolean r82 = r6;
        int r62 = r4;
        String r42 = r2;
        this(r42, r3, r62, r5, r82);
    }
}
