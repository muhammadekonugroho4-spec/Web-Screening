package com.stockbit.component.password.ui.confirmation;

import com.google.firebase.messaging.Constants;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f73675a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73677c;

    static {
    }

    public k(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r4, "typedPassword");
        this.f73675a = r2;
        this.f73676b = r3;
        this.f73677c = r4;
    }

    public static /* synthetic */ k b(k r02, boolean r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f73675a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f73676b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f73677c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final k a(boolean r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r3, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        kotlin.jvm.internal.p.l(r4, "typedPassword");
        return new k(r2, r3, r4);
    }

    public final String c() {
        return this.f73676b;
    }

    public final String d() {
        return this.f73677c;
    }

    public final boolean e() {
        return this.f73675a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (this.f73675a == r52.f73675a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f73676b, r52.f73676b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f73677c, r52.f73677c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f73675a) * 31) + this.f73676b.hashCode()) * 31) + this.f73677c.hashCode();
    }

    public String toString() {
        return "PasswordConfirmationEventState(isLoading=" + this.f73675a + ", error=" + this.f73676b + ", typedPassword=" + this.f73677c + ')';
    }

    public /* synthetic */ k(boolean r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
