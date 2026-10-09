package com.stockbit.personalamend.ui.forgotphone.inputphone.verifycurrent;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final int f126154e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f126155a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.component.inputphone.uistate.a f126156b;

    /* renamed from: c, reason: collision with root package name */
    public final String f126157c;
    public final boolean d;

    static {
        f126154e = com.stockbit.component.inputphone.uistate.a.f72288e;
    }

    public b(String r2, com.stockbit.component.inputphone.uistate.a r3, String r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "maskedCurrentPhoneNumber");
        kotlin.jvm.internal.p.l(r3, "countryPhoneCodeUIState");
        this.f126155a = r2;
        this.f126156b = r3;
        this.f126157c = r4;
        this.d = r5;
    }

    public static /* synthetic */ b b(b r02, String r1, com.stockbit.component.inputphone.uistate.a r2, String r3, boolean r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f126155a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f126156b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f126157c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final b a(String r2, com.stockbit.component.inputphone.uistate.a r3, String r4, boolean r5) {
        kotlin.jvm.internal.p.l(r2, "maskedCurrentPhoneNumber");
        kotlin.jvm.internal.p.l(r3, "countryPhoneCodeUIState");
        return new b(r2, r3, r4, r5);
    }

    public final com.stockbit.component.inputphone.uistate.a c() {
        return this.f126156b;
    }

    public final String d() {
        return this.f126157c;
    }

    public final String e() {
        return this.f126155a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f126155a, r52.f126155a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f126156b, r52.f126156b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f126157c, r52.f126157c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((this.f126155a.hashCode() * 31) + this.f126156b.hashCode()) * 31;
        String r1 = this.f126157c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.d);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "InputLostPhoneNumberEventState(maskedCurrentPhoneNumber=" + this.f126155a + ", countryPhoneCodeUIState=" + this.f126156b + ", errorInputPhone=" + this.f126157c + ", isLoading=" + this.d + ')';
    }

    public /* synthetic */ b(String r8, com.stockbit.component.inputphone.uistate.a r9, String r10, boolean r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r8 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r9 = new com.stockbit.component.inputphone.uistate.a(null, null, null, null, 15, null);
    L9:
        if ((r12 & 4) == 0) goto L12;
        r10 = null;
    L12:
        if ((r12 & 8) == 0) goto L14;
        r11 = false;
    L14:
        this(r8, r9, r10, r11);
    }
}
