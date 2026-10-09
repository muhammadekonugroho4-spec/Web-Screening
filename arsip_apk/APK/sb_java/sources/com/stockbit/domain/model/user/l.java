package com.stockbit.domain.model.user;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f86651a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86652b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86653c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86654e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86655f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86656g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86657h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86658i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86659j;

    /* renamed from: k, reason: collision with root package name */
    public final k f86660k;

    /* renamed from: l, reason: collision with root package name */
    public final m f86661l;

    public l(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, k r12, m r13) {
        kotlin.jvm.internal.p.l(r2, "username");
        kotlin.jvm.internal.p.l(r3, "fullName");
        kotlin.jvm.internal.p.l(r4, "about");
        kotlin.jvm.internal.p.l(r5, "website");
        kotlin.jvm.internal.p.l(r6, "gender");
        kotlin.jvm.internal.p.l(r7, "country");
        kotlin.jvm.internal.p.l(r8, FirebaseAnalytics.Param.LOCATION);
        kotlin.jvm.internal.p.l(r9, "occupation");
        kotlin.jvm.internal.p.l(r10, "birthday");
        kotlin.jvm.internal.p.l(r11, "address");
        kotlin.jvm.internal.p.l(r12, "avatar");
        kotlin.jvm.internal.p.l(r13, "phone");
        this.f86651a = r2;
        this.f86652b = r3;
        this.f86653c = r4;
        this.d = r5;
        this.f86654e = r6;
        this.f86655f = r7;
        this.f86656g = r8;
        this.f86657h = r9;
        this.f86658i = r10;
        this.f86659j = r11;
        this.f86660k = r12;
        this.f86661l = r13;
    }

    public final String a() {
        return this.f86653c;
    }

    public final k b() {
        return this.f86660k;
    }

    public final String c() {
        return this.f86652b;
    }

    public final m d() {
        return this.f86661l;
    }

    public final String e() {
        return this.f86651a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f86651a, r52.f86651a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86652b, r52.f86652b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86653c, r52.f86653c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f86654e, r52.f86654e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f86655f, r52.f86655f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f86656g, r52.f86656g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f86657h, r52.f86657h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f86658i, r52.f86658i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f86659j, r52.f86659j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f86660k, r52.f86660k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f86661l, r52.f86661l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f86651a.hashCode() * 31) + this.f86652b.hashCode()) * 31) + this.f86653c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86654e.hashCode()) * 31) + this.f86655f.hashCode()) * 31) + this.f86656g.hashCode()) * 31) + this.f86657h.hashCode()) * 31) + this.f86658i.hashCode()) * 31) + this.f86659j.hashCode()) * 31) + this.f86660k.hashCode()) * 31) + this.f86661l.hashCode();
    }

    public String toString() {
        return "ProfileSocialEntity(username=" + this.f86651a + ", fullName=" + this.f86652b + ", about=" + this.f86653c + ", website=" + this.d + ", gender=" + this.f86654e + ", country=" + this.f86655f + ", location=" + this.f86656g + ", occupation=" + this.f86657h + ", birthday=" + this.f86658i + ", address=" + this.f86659j + ", avatar=" + this.f86660k + ", phone=" + this.f86661l + ")";
    }

    public /* synthetic */ l(String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, k r28, m r29, int r30, kotlin.jvm.internal.i r31) {
        String r2 = "";
        if ((r30 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r30 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r30 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r30 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r30 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r30 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r30 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r30 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r30 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r30 & 512) != 0) goto L43;
        r2 = r27;
    L43:
        if ((r30 & 1024) == 0) goto L45;
        k r11 = new k(null, null, null, 7, null);
    L47:
        if ((r30 & 2048) == 0) goto L50;
        m r302 = new m(null, null, null, 7, null);
    L51:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r2, r11, r302);
        return;
    L50:
        r302 = r29;
        goto L51
    L45:
        r11 = r28;
        goto L47
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
