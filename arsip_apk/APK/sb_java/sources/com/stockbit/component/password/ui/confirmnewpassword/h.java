package com.stockbit.component.password.ui.confirmnewpassword;

import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f73714a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73715b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73716c;
    public final String d;

    static {
    }

    public h(String r2, boolean r3, boolean r4, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r5, "typedPassword");
        this.f73714a = r2;
        this.f73715b = r3;
        this.f73716c = r4;
        this.d = r5;
    }

    public static /* synthetic */ h b(h r02, String r1, boolean r2, boolean r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f73714a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f73715b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f73716c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final h a(String r2, boolean r3, boolean r4, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r5, "typedPassword");
        return new h(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f73714a;
    }

    public final String d() {
        return this.d;
    }

    public final boolean e() {
        return this.f73715b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f73714a, r52.f73714a) == true) goto L12;
        return false;
    L12:
        if (this.f73715b == r52.f73715b) goto L15;
        return false;
    L15:
        if (this.f73716c == r52.f73716c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f73714a.hashCode() * 31) + Boolean.hashCode(this.f73715b)) * 31) + Boolean.hashCode(this.f73716c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ConfirmNewPasswordEventState(error=" + this.f73714a + ", isLoading=" + this.f73715b + ", isButtonActive=" + this.f73716c + ", typedPassword=" + this.d + ')';
    }

    public /* synthetic */ h(String r3, boolean r4, boolean r5, String r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = false;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = "";
    L14:
        this(r3, r4, r5, r6);
    }
}
