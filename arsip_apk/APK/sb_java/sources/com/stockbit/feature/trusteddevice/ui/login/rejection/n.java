package com.stockbit.feature.trusteddevice.ui.login.rejection;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f118399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118401c;
    public final int d;

    static {
    }

    public n(String r2, String r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r2, "username");
        kotlin.jvm.internal.p.l(r3, "avatarUrl");
        this.f118399a = r2;
        this.f118400b = r3;
        this.f118401c = r4;
        this.d = r5;
    }

    public static /* synthetic */ n b(n r02, String r1, String r2, int r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f118399a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f118400b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f118401c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final n a(String r2, String r3, int r4, int r5) {
        kotlin.jvm.internal.p.l(r2, "username");
        kotlin.jvm.internal.p.l(r3, "avatarUrl");
        return new n(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f118400b;
    }

    public final int d() {
        return this.f118401c;
    }

    public final String e() {
        return this.f118399a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f118399a, r52.f118399a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f118400b, r52.f118400b) == true) goto L15;
        return false;
    L15:
        if (this.f118401c == r52.f118401c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f118399a.hashCode() * 31) + this.f118400b.hashCode()) * 31) + Integer.hashCode(this.f118401c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "LoginRejectionState(username=" + this.f118399a + ", avatarUrl=" + this.f118400b + ", pageTitle=" + this.f118401c + ", pageMessage=" + this.d + ')';
    }

    public /* synthetic */ n(String r2, String r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = com.stockbit.feature.trusteddevice.e.a1;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = com.stockbit.feature.trusteddevice.e.f117889l0;
    L14:
        this(r2, r3, r4, r5);
    }
}
