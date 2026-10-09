package com.stockbit.domain.model.profile;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f84676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84677b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84678c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84679e;

    /* renamed from: f, reason: collision with root package name */
    public final b f84680f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84681g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84682h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84683i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84684j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84685k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84686l;

    /* renamed from: m, reason: collision with root package name */
    public final f f84687m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84688n;

    /* renamed from: o, reason: collision with root package name */
    public final int f84689o;

    public i(int r15, String r16, String r17, String r18, String r19, b r20, String r21, String r22, String r23, String r24, String r25, String r26, f r27, String r28, int r29) {
        kotlin.jvm.internal.p.l(r16, "username");
        kotlin.jvm.internal.p.l(r17, "fullname");
        kotlin.jvm.internal.p.l(r18, "about");
        kotlin.jvm.internal.p.l(r19, "website");
        kotlin.jvm.internal.p.l(r20, "avatar");
        kotlin.jvm.internal.p.l(r21, "country");
        kotlin.jvm.internal.p.l(r22, "language");
        kotlin.jvm.internal.p.l(r23, "gender");
        kotlin.jvm.internal.p.l(r24, FirebaseAnalytics.Param.LOCATION);
        kotlin.jvm.internal.p.l(r25, "address");
        kotlin.jvm.internal.p.l(r26, "birthday");
        kotlin.jvm.internal.p.l(r27, "phone");
        kotlin.jvm.internal.p.l(r28, "occupation");
        this.f84676a = r15;
        this.f84677b = r16;
        this.f84678c = r17;
        this.d = r18;
        this.f84679e = r19;
        this.f84680f = r20;
        this.f84681g = r21;
        this.f84682h = r22;
        this.f84683i = r23;
        this.f84684j = r24;
        this.f84685k = r25;
        this.f84686l = r26;
        this.f84687m = r27;
        this.f84688n = r28;
        this.f84689o = r29;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f84685k;
    }

    public final b c() {
        return this.f84680f;
    }

    public final String d() {
        return this.f84686l;
    }

    public final String e() {
        return this.f84681g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f84676a == r52.f84676a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84677b, r52.f84677b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84678c, r52.f84678c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84679e, r52.f84679e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84680f, r52.f84680f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f84681g, r52.f84681g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f84682h, r52.f84682h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f84683i, r52.f84683i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f84684j, r52.f84684j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f84685k, r52.f84685k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f84686l, r52.f84686l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f84687m, r52.f84687m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f84688n, r52.f84688n) == true) goto L51;
        return false;
    L51:
        if (this.f84689o == r52.f84689o) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f84678c;
    }

    public final String g() {
        return this.f84683i;
    }

    public final String h() {
        return this.f84684j;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((Integer.hashCode(this.f84676a) * 31) + this.f84677b.hashCode()) * 31) + this.f84678c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84679e.hashCode()) * 31) + this.f84680f.hashCode()) * 31) + this.f84681g.hashCode()) * 31) + this.f84682h.hashCode()) * 31) + this.f84683i.hashCode()) * 31) + this.f84684j.hashCode()) * 31) + this.f84685k.hashCode()) * 31) + this.f84686l.hashCode()) * 31) + this.f84687m.hashCode()) * 31) + this.f84688n.hashCode()) * 31) + Integer.hashCode(this.f84689o);
    }

    public final String i() {
        return this.f84688n;
    }

    public final f j() {
        return this.f84687m;
    }

    public final String k() {
        return this.f84677b;
    }

    public final String l() {
        return this.f84679e;
    }

    public String toString() {
        return "ProfileExodusEntity(userId=" + this.f84676a + ", username=" + this.f84677b + ", fullname=" + this.f84678c + ", about=" + this.d + ", website=" + this.f84679e + ", avatar=" + this.f84680f + ", country=" + this.f84681g + ", language=" + this.f84682h + ", gender=" + this.f84683i + ", location=" + this.f84684j + ", address=" + this.f84685k + ", birthday=" + this.f84686l + ", phone=" + this.f84687m + ", occupation=" + this.f84688n + ", watchlistId=" + this.f84689o + ")";
    }

    public /* synthetic */ i(int r22, String r23, String r24, String r25, String r26, b r27, String r28, String r29, String r30, String r31, String r32, String r33, f r34, String r35, int r36, int r37, kotlin.jvm.internal.i r38) {
        if ((r37 & 1) == 0) goto L5;
        int r1 = 0;
    L6:
        String r4 = "";
        if ((r37 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r37 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r37 & 8) == 0) goto L17;
        String r6 = "";
    L19:
        if ((r37 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r37 & 32) == 0) goto L25;
        b r8 = new b(null, null, null, 7, null);
    L27:
        if ((r37 & 64) == 0) goto L29;
        String r9 = "";
    L31:
        if ((r37 & 128) == 0) goto L33;
        String r10 = "";
    L35:
        if ((r37 & 256) == 0) goto L37;
        String r11 = "";
    L39:
        if ((r37 & 512) == 0) goto L41;
        String r12 = "";
    L43:
        if ((r37 & 1024) == 0) goto L45;
        String r13 = "";
    L47:
        if ((r37 & 2048) == 0) goto L49;
        String r14 = "";
    L51:
        if ((r37 & 4096) == 0) goto L53;
        f r15 = new f(null, null, null, 7, null);
    L55:
        if ((r37 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) goto L59;
        r4 = r35;
    L59:
        if ((r37 & 16384) == 0) goto L62;
        int r372 = 0;
    L63:
        this(r1, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r372);
        return;
    L62:
        r372 = r36;
        goto L63
    L53:
        r15 = r34;
        goto L55
    L49:
        r14 = r33;
        goto L51
    L45:
        r13 = r32;
        goto L47
    L41:
        r12 = r31;
        goto L43
    L37:
        r11 = r30;
        goto L39
    L33:
        r10 = r29;
        goto L35
    L29:
        r9 = r28;
        goto L31
    L25:
        r8 = r27;
        goto L27
    L21:
        r7 = r26;
        goto L23
    L17:
        r6 = r25;
        goto L19
    L13:
        r5 = r24;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L6
    }
}
