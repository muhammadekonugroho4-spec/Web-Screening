package com.stockbit.feature.trusteddevice.base.waitingapproval;

import androidx.core.app.NotificationCompat;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f117732a;

    /* renamed from: b, reason: collision with root package name */
    public final long f117733b;

    /* renamed from: c, reason: collision with root package name */
    public final String f117734c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f117735e;

    /* renamed from: f, reason: collision with root package name */
    public final String f117736f;

    /* renamed from: g, reason: collision with root package name */
    public final ApprovalStatus f117737g;

    static {
    }

    public p(boolean r2, long r3, String r5, String r6, String r7, String r8, ApprovalStatus r9) {
        kotlin.jvm.internal.p.l(r5, "deviceName");
        kotlin.jvm.internal.p.l(r6, "pageTitle");
        kotlin.jvm.internal.p.l(r7, "pageSubtitle");
        kotlin.jvm.internal.p.l(r8, "pageMessage");
        kotlin.jvm.internal.p.l(r9, NotificationCompat.CATEGORY_STATUS);
        this.f117732a = r2;
        this.f117733b = r3;
        this.f117734c = r5;
        this.d = r6;
        this.f117735e = r7;
        this.f117736f = r8;
        this.f117737g = r9;
    }

    public static /* synthetic */ p b(p r02, boolean r1, long r2, String r4, String r5, String r6, String r7, ApprovalStatus r8, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f117732a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f117733b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = r02.f117734c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = r02.f117735e;
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = r02.f117736f;
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = r02.f117737g;
    L23:
        String r92 = r7;
        ApprovalStatus r102 = r8;
        String r82 = r6;
        String r62 = r4;
        long r42 = r2;
        boolean r3 = r1;
        return r02.a(r3, r42, r62, r5, r82, r92, r102);
    }

    public final p a(boolean r11, long r12, String r14, String r15, String r16, String r17, ApprovalStatus r18) {
        kotlin.jvm.internal.p.l(r14, "deviceName");
        kotlin.jvm.internal.p.l(r15, "pageTitle");
        kotlin.jvm.internal.p.l(r16, "pageSubtitle");
        kotlin.jvm.internal.p.l(r17, "pageMessage");
        kotlin.jvm.internal.p.l(r18, NotificationCompat.CATEGORY_STATUS);
        return new p(r11, r12, r14, r15, r16, r17, r18);
    }

    public final String c() {
        return this.f117734c;
    }

    public final String d() {
        return this.f117736f;
    }

    public final String e() {
        return this.f117735e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof p) == true) goto L8;
        return false;
    L8:
        p r82 = (p) r8;
        if (this.f117732a == r82.f117732a) goto L12;
        return false;
    L12:
        if (this.f117733b == r82.f117733b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f117734c, r82.f117734c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f117735e, r82.f117735e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f117736f, r82.f117736f) == true) goto L27;
        return false;
    L27:
        if (this.f117737g == r82.f117737g) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final long g() {
        return this.f117733b;
    }

    public final ApprovalStatus h() {
        return this.f117737g;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f117732a) * 31) + Long.hashCode(this.f117733b)) * 31) + this.f117734c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f117735e.hashCode()) * 31) + this.f117736f.hashCode()) * 31) + this.f117737g.hashCode();
    }

    public final boolean i() {
        return this.f117732a;
    }

    public String toString() {
        return "BaseWaitingApprovalState(isLoading=" + this.f117732a + ", resendTimeLeft=" + this.f117733b + ", deviceName=" + this.f117734c + ", pageTitle=" + this.d + ", pageSubtitle=" + this.f117735e + ", pageMessage=" + this.f117736f + ", status=" + this.f117737g + ')';
    }

    public /* synthetic */ p(boolean r2, long r3, String r5, String r6, String r7, String r8, ApprovalStatus r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = "";
    L21:
        if ((r10 & 64) == 0) goto L23;
        r9 = ApprovalStatus.WAITING;
    L23:
        String r102 = r8;
        ApprovalStatus r112 = r9;
        String r92 = r7;
        String r72 = r5;
        long r52 = r3;
        boolean r4 = r2;
        this(r4, r52, r72, r6, r92, r102, r112);
    }
}
