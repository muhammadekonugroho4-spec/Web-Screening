package com.stockbit.domain.model.profile;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f84647a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84649c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84650e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84651f;

    /* renamed from: g, reason: collision with root package name */
    public final int f84652g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84653h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84654i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84655j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84656k;

    /* renamed from: l, reason: collision with root package name */
    public final int f84657l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84658m;

    /* renamed from: n, reason: collision with root package name */
    public final com.stockbit.domain.model.profile.settingprofile.a f84659n;

    /* renamed from: o, reason: collision with root package name */
    public final com.stockbit.domain.model.profile.settingprofile.d f84660o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84661p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84662q;

    /* renamed from: r, reason: collision with root package name */
    public final String f84663r;

    /* renamed from: s, reason: collision with root package name */
    public final int f84664s;

    /* renamed from: t, reason: collision with root package name */
    public final String f84665t;

    /* renamed from: u, reason: collision with root package name */
    public final String f84666u;

    /* renamed from: v, reason: collision with root package name */
    public final String f84667v;

    public e(String r17, String r18, String r19, String r20, String r21, boolean r22, int r23, String r24, String r25, String r26, String r27, int r28, String r29, com.stockbit.domain.model.profile.settingprofile.a r30, com.stockbit.domain.model.profile.settingprofile.d r31, String r32, String r33, String r34, int r35, String r36, String r37, String r38) {
        kotlin.jvm.internal.p.l(r17, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r18, "email");
        kotlin.jvm.internal.p.l(r19, "username");
        kotlin.jvm.internal.p.l(r20, "fullName");
        kotlin.jvm.internal.p.l(r21, "avatar");
        kotlin.jvm.internal.p.l(r24, "proExpireAt");
        kotlin.jvm.internal.p.l(r25, "proActiveSince");
        kotlin.jvm.internal.p.l(r26, "phone");
        kotlin.jvm.internal.p.l(r27, "created");
        kotlin.jvm.internal.p.l(r29, "country");
        kotlin.jvm.internal.p.l(r30, "additional");
        kotlin.jvm.internal.p.l(r31, "supportData");
        kotlin.jvm.internal.p.l(r32, "lastLogin");
        kotlin.jvm.internal.p.l(r34, "googleId");
        kotlin.jvm.internal.p.l(r36, "banned");
        kotlin.jvm.internal.p.l(r37, "facebookAccount");
        kotlin.jvm.internal.p.l(r38, "googleAccount");
        this.f84647a = r17;
        this.f84648b = r18;
        this.f84649c = r19;
        this.d = r20;
        this.f84650e = r21;
        this.f84651f = r22;
        this.f84652g = r23;
        this.f84653h = r24;
        this.f84654i = r25;
        this.f84655j = r26;
        this.f84656k = r27;
        this.f84657l = r28;
        this.f84658m = r29;
        this.f84659n = r30;
        this.f84660o = r31;
        this.f84661p = r32;
        this.f84662q = r33;
        this.f84663r = r34;
        this.f84664s = r35;
        this.f84665t = r36;
        this.f84666u = r37;
        this.f84667v = r38;
    }

    public final com.stockbit.domain.model.profile.settingprofile.a a() {
        return this.f84659n;
    }

    public final String b() {
        return this.f84650e;
    }

    public final String c() {
        return this.f84665t;
    }

    public final String d() {
        return this.f84658m;
    }

    public final String e() {
        return this.f84656k;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f84647a, r52.f84647a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84648b, r52.f84648b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84649c, r52.f84649c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84650e, r52.f84650e) == true) goto L24;
        return false;
    L24:
        if (this.f84651f == r52.f84651f) goto L27;
        return false;
    L27:
        if (this.f84652g == r52.f84652g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f84653h, r52.f84653h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f84654i, r52.f84654i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f84655j, r52.f84655j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f84656k, r52.f84656k) == true) goto L42;
        return false;
    L42:
        if (this.f84657l == r52.f84657l) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f84658m, r52.f84658m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f84659n, r52.f84659n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f84660o, r52.f84660o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f84661p, r52.f84661p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f84662q, r52.f84662q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f84663r, r52.f84663r) == true) goto L63;
        return false;
    L63:
        if (this.f84664s == r52.f84664s) goto L66;
        return false;
    L66:
        if (kotlin.jvm.internal.p.g(this.f84665t, r52.f84665t) == true) goto L69;
        return false;
    L69:
        if (kotlin.jvm.internal.p.g(this.f84666u, r52.f84666u) == true) goto L72;
        return false;
    L72:
        if (kotlin.jvm.internal.p.g(this.f84667v, r52.f84667v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final String f() {
        return this.f84648b;
    }

    public final String g() {
        return this.f84666u;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((this.f84647a.hashCode() * 31) + this.f84648b.hashCode()) * 31) + this.f84649c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84650e.hashCode()) * 31) + Boolean.hashCode(this.f84651f)) * 31) + Integer.hashCode(this.f84652g)) * 31) + this.f84653h.hashCode()) * 31) + this.f84654i.hashCode()) * 31) + this.f84655j.hashCode()) * 31) + this.f84656k.hashCode()) * 31) + Integer.hashCode(this.f84657l)) * 31) + this.f84658m.hashCode()) * 31) + this.f84659n.hashCode()) * 31) + this.f84660o.hashCode()) * 31) + this.f84661p.hashCode()) * 31;
        String r1 = this.f84662q;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((((r02 + r12) * 31) + this.f84663r.hashCode()) * 31) + Integer.hashCode(this.f84664s)) * 31) + this.f84665t.hashCode()) * 31) + this.f84666u.hashCode()) * 31) + this.f84667v.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f84667v;
    }

    public final String j() {
        return this.f84663r;
    }

    public final String k() {
        return this.f84647a;
    }

    public final String l() {
        return this.f84661p;
    }

    public final boolean m() {
        return this.f84651f;
    }

    public final int n() {
        return this.f84664s;
    }

    public final String o() {
        return this.f84655j;
    }

    public final String p() {
        return this.f84654i;
    }

    public final String q() {
        return this.f84653h;
    }

    public final com.stockbit.domain.model.profile.settingprofile.d r() {
        return this.f84660o;
    }

    public final int s() {
        return this.f84657l;
    }

    public final String t() {
        return this.f84649c;
    }

    public String toString() {
        return "MyProfileBasicDataUIState(id=" + this.f84647a + ", email=" + this.f84648b + ", username=" + this.f84649c + ", fullName=" + this.d + ", avatar=" + this.f84650e + ", official=" + this.f84651f + ", isPro=" + this.f84652g + ", proExpireAt=" + this.f84653h + ", proActiveSince=" + this.f84654i + ", phone=" + this.f84655j + ", created=" + this.f84656k + ", trending=" + this.f84657l + ", country=" + this.f84658m + ", additional=" + this.f84659n + ", supportData=" + this.f84660o + ", lastLogin=" + this.f84661p + ", exchange=" + this.f84662q + ", googleId=" + this.f84663r + ", password=" + this.f84664s + ", banned=" + this.f84665t + ", facebookAccount=" + this.f84666u + ", googleAccount=" + this.f84667v + ")";
    }

    public final int u() {
        return this.f84652g;
    }

    public /* synthetic */ e(String r25, String r26, String r27, String r28, String r29, boolean r30, int r31, String r32, String r33, String r34, String r35, int r36, String r37, com.stockbit.domain.model.profile.settingprofile.a r38, com.stockbit.domain.model.profile.settingprofile.d r39, String r40, String r41, String r42, int r43, String r44, String r45, String r46, int r47, kotlin.jvm.internal.i r48) {
        if ((r47 & 524288) == 0) goto L5;
        String r21 = "";
    L7:
        if ((r47 & 1048576) == 0) goto L9;
        String r22 = "Facebook";
    L11:
        if ((r47 & 2097152) == 0) goto L14;
        String r23 = "Google";
    L15:
        this(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r21, r22, r23);
        return;
    L14:
        r23 = r46;
        goto L15
    L9:
        r22 = r45;
        goto L11
    L5:
        r21 = r44;
        goto L7
    }
}
