package com.stockbit.personalamend.ui.forgotphone.inputphone.submitnew;

/* loaded from: classes10.dex */
public final class b {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.stockbit.component.inputphone.uistate.a f126099a;

    /* renamed from: b, reason: collision with root package name */
    public final String f126100b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f126101c;

    static {
        d = com.stockbit.component.inputphone.uistate.a.f72288e;
    }

    public b(com.stockbit.component.inputphone.uistate.a r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "countryPhoneCodeUIState");
        this.f126099a = r2;
        this.f126100b = r3;
        this.f126101c = r4;
    }

    public static /* synthetic */ b b(b r02, com.stockbit.component.inputphone.uistate.a r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f126099a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f126100b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f126101c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final b a(com.stockbit.component.inputphone.uistate.a r2, String r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, "countryPhoneCodeUIState");
        return new b(r2, r3, r4);
    }

    public final com.stockbit.component.inputphone.uistate.a c() {
        return this.f126099a;
    }

    public final String d() {
        return this.f126100b;
    }

    public final boolean e() {
        return this.f126101c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f126099a, r52.f126099a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f126100b, r52.f126100b) == true) goto L15;
        return false;
    L15:
        if (this.f126101c == r52.f126101c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f126099a.hashCode() * 31;
        String r1 = this.f126100b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f126101c);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "InputNewPhoneNumberEventState(countryPhoneCodeUIState=" + this.f126099a + ", errorInputPhone=" + this.f126100b + ", isLoading=" + this.f126101c + ')';
    }

    public /* synthetic */ b(com.stockbit.component.inputphone.uistate.a r8, String r9, boolean r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r8 = new com.stockbit.component.inputphone.uistate.a(null, null, null, null, 15, null);
    L6:
        if ((r11 & 2) == 0) goto L9;
        r9 = null;
    L9:
        if ((r11 & 4) == 0) goto L11;
        r10 = false;
    L11:
        this(r8, r9, r10);
    }
}
