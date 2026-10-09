package com.stockbit.domain.model.profile.v2;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84803a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84804b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84805c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84806e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84807f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84808g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84809h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84810i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84811j;

    /* renamed from: k, reason: collision with root package name */
    public final a f84812k;

    /* renamed from: l, reason: collision with root package name */
    public final f f84813l;

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, a r12, f r13) {
        p.l(r2, "username");
        p.l(r3, "fullName");
        p.l(r4, "about");
        p.l(r5, "website");
        p.l(r6, "gender");
        p.l(r7, "country");
        p.l(r8, FirebaseAnalytics.Param.LOCATION);
        p.l(r9, "occupation");
        p.l(r10, "birthday");
        p.l(r11, "address");
        p.l(r12, "avatar");
        p.l(r13, "phone");
        this.f84803a = r2;
        this.f84804b = r3;
        this.f84805c = r4;
        this.d = r5;
        this.f84806e = r6;
        this.f84807f = r7;
        this.f84808g = r8;
        this.f84809h = r9;
        this.f84810i = r10;
        this.f84811j = r11;
        this.f84812k = r12;
        this.f84813l = r13;
    }

    public final String a() {
        return this.f84805c;
    }

    public final String b() {
        return this.f84811j;
    }

    public final a c() {
        return this.f84812k;
    }

    public final String d() {
        return this.f84810i;
    }

    public final String e() {
        return this.f84807f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84803a, r52.f84803a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84804b, r52.f84804b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84805c, r52.f84805c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84806e, r52.f84806e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84807f, r52.f84807f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84808g, r52.f84808g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84809h, r52.f84809h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84810i, r52.f84810i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84811j, r52.f84811j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84812k, r52.f84812k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84813l, r52.f84813l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f84804b;
    }

    public final String g() {
        return this.f84806e;
    }

    public final String h() {
        return this.f84808g;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f84803a.hashCode() * 31) + this.f84804b.hashCode()) * 31) + this.f84805c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84806e.hashCode()) * 31) + this.f84807f.hashCode()) * 31) + this.f84808g.hashCode()) * 31) + this.f84809h.hashCode()) * 31) + this.f84810i.hashCode()) * 31) + this.f84811j.hashCode()) * 31) + this.f84812k.hashCode()) * 31) + this.f84813l.hashCode();
    }

    public final String i() {
        return this.f84809h;
    }

    public final f j() {
        return this.f84813l;
    }

    public final String k() {
        return this.f84803a;
    }

    public final String l() {
        return this.d;
    }

    public String toString() {
        return "MyProfileDetailEntity(username=" + this.f84803a + ", fullName=" + this.f84804b + ", about=" + this.f84805c + ", website=" + this.d + ", gender=" + this.f84806e + ", country=" + this.f84807f + ", location=" + this.f84808g + ", occupation=" + this.f84809h + ", birthday=" + this.f84810i + ", address=" + this.f84811j + ", avatar=" + this.f84812k + ", phone=" + this.f84813l + ")";
    }

    public /* synthetic */ c(String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, a r28, f r29, int r30, kotlin.jvm.internal.i r31) {
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
        a r11 = new a(null, null, null, 7, null);
    L47:
        if ((r30 & 2048) == 0) goto L50;
        f r302 = new f(null, null, null, 7, null);
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
