package com.stockbit.feature.trusteddevice.ui.login.approval;

import com.stockbit.feature.trusteddevice.contract.PromptType;

/* loaded from: classes9.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final PromptType f118268a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118269b;

    /* renamed from: c, reason: collision with root package name */
    public final String f118270c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f118271e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f118272f;

    static {
    }

    public U(PromptType r2, String r3, String r4, String r5, String r6, boolean r7) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r3, "device");
        kotlin.jvm.internal.p.l(r4, "city");
        kotlin.jvm.internal.p.l(r5, "country");
        kotlin.jvm.internal.p.l(r6, "dateTime");
        this.f118268a = r2;
        this.f118269b = r3;
        this.f118270c = r4;
        this.d = r5;
        this.f118271e = r6;
        this.f118272f = r7;
    }

    public static /* synthetic */ U b(U r02, PromptType r1, String r2, String r3, String r4, String r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f118268a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f118269b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r02.f118270c;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r02.f118271e;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r02.f118272f;
    L20:
        String r72 = r5;
        boolean r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82);
    }

    public final U a(PromptType r9, String r10, String r11, String r12, String r13, boolean r14) {
        kotlin.jvm.internal.p.l(r9, "type");
        kotlin.jvm.internal.p.l(r10, "device");
        kotlin.jvm.internal.p.l(r11, "city");
        kotlin.jvm.internal.p.l(r12, "country");
        kotlin.jvm.internal.p.l(r13, "dateTime");
        return new U(r9, r10, r11, r12, r13, r14);
    }

    public final String c() {
        return this.f118270c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f118271e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof U) == true) goto L8;
        return false;
    L8:
        U r52 = (U) r5;
        if (this.f118268a == r52.f118268a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118269b, r52.f118269b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f118270c, r52.f118270c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f118271e, r52.f118271e) == true) goto L24;
        return false;
    L24:
        if (this.f118272f == r52.f118272f) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f118269b;
    }

    public final PromptType g() {
        return this.f118268a;
    }

    public final boolean h() {
        return this.f118272f;
    }

    public int hashCode() {
        return (((((((((this.f118268a.hashCode() * 31) + this.f118269b.hashCode()) * 31) + this.f118270c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f118271e.hashCode()) * 31) + Boolean.hashCode(this.f118272f);
    }

    public String toString() {
        return "LoginApprovalState(type=" + this.f118268a + ", device=" + this.f118269b + ", city=" + this.f118270c + ", country=" + this.d + ", dateTime=" + this.f118271e + ", isLoading=" + this.f118272f + ')';
    }

    public /* synthetic */ U(PromptType r2, String r3, String r4, String r5, String r6, boolean r7, int r8, kotlin.jvm.internal.i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = PromptType.NEW_LOGIN;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = false;
    L20:
        String r82 = r6;
        boolean r92 = r7;
        String r62 = r4;
        String r72 = r5;
        this(r2, r3, r62, r72, r82, r92);
    }
}
