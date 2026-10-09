package com.stockbit.feature.trusteddevice.ui.login.approvalexpired;

/* loaded from: classes9.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f118346a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118347b;

    static {
    }

    public m(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "username");
        kotlin.jvm.internal.p.l(r3, "avatarUrl");
        this.f118346a = r2;
        this.f118347b = r3;
    }

    public final m a(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, "username");
        kotlin.jvm.internal.p.l(r3, "avatarUrl");
        return new m(r2, r3);
    }

    public final String b() {
        return this.f118347b;
    }

    public final String c() {
        return this.f118346a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f118346a, r52.f118346a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118347b, r52.f118347b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f118346a.hashCode() * 31) + this.f118347b.hashCode();
    }

    public String toString() {
        return "LoginApprovalExpiredState(username=" + this.f118346a + ", avatarUrl=" + this.f118347b + ')';
    }

    public /* synthetic */ m(String r2, String r3, int r4, kotlin.jvm.internal.i r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
