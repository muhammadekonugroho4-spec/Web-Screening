package com.stockbit.component.password.ui.createnewpassword;

import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f73760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73761b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73762c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f73763e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f73764f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f73765g;

    static {
    }

    public h(String r2, String r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r3, "typedPassword");
        this.f73760a = r2;
        this.f73761b = r3;
        this.f73762c = r4;
        this.d = r5;
        this.f73763e = r6;
        this.f73764f = r7;
        this.f73765g = r8;
    }

    public static /* synthetic */ h b(h r02, String r1, String r2, boolean r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f73760a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f73761b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f73762c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f73763e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f73764f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f73765g;
    L23:
        boolean r82 = r6;
        boolean r92 = r7;
        boolean r62 = r4;
        boolean r72 = r5;
        boolean r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final h a(String r10, String r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16) {
        kotlin.jvm.internal.p.l(r10, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r11, "typedPassword");
        return new h(r10, r11, r12, r13, r14, r15, r16);
    }

    public final String c() {
        return this.f73760a;
    }

    public final String d() {
        return this.f73761b;
    }

    public final boolean e() {
        return this.f73762c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f73760a, r52.f73760a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f73761b, r52.f73761b) == true) goto L15;
        return false;
    L15:
        if (this.f73762c == r52.f73762c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f73763e == r52.f73763e) goto L24;
        return false;
    L24:
        if (this.f73764f == r52.f73764f) goto L27;
        return false;
    L27:
        if (this.f73765g == r52.f73765g) goto L29;
        return false;
    L29:
        return true;
    }

    public final boolean f() {
        return this.f73763e;
    }

    public final boolean g() {
        return this.f73765g;
    }

    public final boolean h() {
        return this.f73764f;
    }

    public int hashCode() {
        return (((((((((((this.f73760a.hashCode() * 31) + this.f73761b.hashCode()) * 31) + Boolean.hashCode(this.f73762c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f73763e)) * 31) + Boolean.hashCode(this.f73764f)) * 31) + Boolean.hashCode(this.f73765g);
    }

    public final boolean i() {
        return this.d;
    }

    public String toString() {
        return "CreateNewPasswordEventState(error=" + this.f73760a + ", typedPassword=" + this.f73761b + ", isLoading=" + this.f73762c + ", isValidationUppercasePassed=" + this.d + ", isValidationLowercasePassed=" + this.f73763e + ", isValidationNumberPassed=" + this.f73764f + ", isValidationMinLengthPassed=" + this.f73765g + ')';
    }

    public /* synthetic */ h(String r2, String r3, boolean r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.i r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = false;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = false;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = false;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = false;
    L21:
        if ((r9 & 64) == 0) goto L24;
        boolean r92 = false;
    L23:
        boolean r82 = r7;
        boolean r72 = r6;
        boolean r62 = r5;
        boolean r52 = r4;
        this(r2, r3, r52, r62, r72, r82, r92);
        return;
    L24:
        r92 = r8;
        goto L23
    }
}
