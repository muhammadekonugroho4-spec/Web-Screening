package com.stockbit.usecase.screener.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f159747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159749c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159750e;

    /* renamed from: f, reason: collision with root package name */
    public final int f159751f;

    /* renamed from: g, reason: collision with root package name */
    public final int f159752g;

    /* renamed from: h, reason: collision with root package name */
    public final String f159753h;

    /* renamed from: i, reason: collision with root package name */
    public final String f159754i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f159755j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f159756k;

    /* renamed from: l, reason: collision with root package name */
    public final List f159757l;

    /* renamed from: m, reason: collision with root package name */
    public final List f159758m;

    /* renamed from: n, reason: collision with root package name */
    public final List f159759n;

    /* renamed from: o, reason: collision with root package name */
    public final List f159760o;

    /* renamed from: p, reason: collision with root package name */
    public final a f159761p;

    /* renamed from: q, reason: collision with root package name */
    public final String f159762q;

    public i(int r10, String r11, int r12, int r13, String r14, int r15, int r16, String r17, String r18, boolean r19, boolean r20, List r21, List r22, List r23, List r24, a r25, String r26) {
        p.l(r11, "universe");
        p.l(r14, "sort");
        p.l(r17, "screenName");
        p.l(r18, "screenDesc");
        p.l(r21, "calcs");
        p.l(r22, "rules");
        p.l(r23, "columns");
        p.l(r24, "sequence");
        p.l(r25, "badges");
        p.l(r26, "type");
        this.f159747a = r10;
        this.f159748b = r11;
        this.f159749c = r12;
        this.d = r13;
        this.f159750e = r14;
        this.f159751f = r15;
        this.f159752g = r16;
        this.f159753h = r17;
        this.f159754i = r18;
        this.f159755j = r19;
        this.f159756k = r20;
        this.f159757l = r21;
        this.f159758m = r22;
        this.f159759n = r23;
        this.f159760o = r24;
        this.f159761p = r25;
        this.f159762q = r26;
    }

    public static /* synthetic */ i b(i r17, int r18, String r19, int r20, int r21, String r22, int r23, int r24, String r25, String r26, boolean r27, boolean r28, List r29, List r30, List r31, List r32, a r33, String r34, int r35, Object r36) {
        if ((r35 & 1) == 0) goto L5;
        int r2 = r17.f159747a;
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = r17.f159748b;
    L11:
        if ((r35 & 4) == 0) goto L13;
        int r4 = r17.f159749c;
    L15:
        if ((r35 & 8) == 0) goto L17;
        int r5 = r17.d;
    L19:
        if ((r35 & 16) == 0) goto L21;
        String r6 = r17.f159750e;
    L23:
        if ((r35 & 32) == 0) goto L25;
        int r7 = r17.f159751f;
    L27:
        if ((r35 & 64) == 0) goto L29;
        int r8 = r17.f159752g;
    L31:
        if ((r35 & 128) == 0) goto L33;
        String r9 = r17.f159753h;
    L35:
        if ((r35 & 256) == 0) goto L37;
        String r10 = r17.f159754i;
    L39:
        if ((r35 & 512) == 0) goto L41;
        boolean r11 = r17.f159755j;
    L43:
        if ((r35 & 1024) == 0) goto L45;
        boolean r12 = r17.f159756k;
    L47:
        if ((r35 & 2048) == 0) goto L49;
        List r13 = r17.f159757l;
    L51:
        if ((r35 & 4096) == 0) goto L53;
        List r14 = r17.f159758m;
    L55:
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        List r15 = r17.f159759n;
    L58:
        int r182 = r2;
        if ((r35 & 16384) == 0) goto L61;
        List r210 = r17.f159760o;
    L63:
        if ((r35 & 32768) == 0) goto L65;
        a r1 = r17.f159761p;
    L67:
        if ((r35 & 65536) == 0) goto L69;
        a r192 = r1;
        a r342 = r192;
        String r352 = r17.f159762q;
        List r332 = r210;
        String r202 = r3;
        int r212 = r4;
        int r222 = r5;
        String r232 = r6;
        int r242 = r7;
        int r252 = r8;
        String r262 = r9;
        String r272 = r10;
        boolean r282 = r11;
        boolean r292 = r12;
        List r302 = r13;
        List r312 = r14;
        List r322 = r15;
        int r193 = r182;
        i r183 = r17;
    L71:
        return r183.a(r193, r202, r212, r222, r232, r242, r252, r262, r272, r282, r292, r302, r312, r322, r332, r342, r352);
    L69:
        r352 = r34;
        r342 = r1;
        r193 = r182;
        r183 = r17;
        r332 = r210;
        r202 = r3;
        r212 = r4;
        r222 = r5;
        r232 = r6;
        r242 = r7;
        r252 = r8;
        r262 = r9;
        r272 = r10;
        r282 = r11;
        r292 = r12;
        r302 = r13;
        r312 = r14;
        r322 = r15;
        goto L71
    L65:
        r1 = r33;
        goto L67
    L61:
        r210 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
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
        r2 = r18;
        goto L7
    }

    public final i a(int r20, String r21, int r22, int r23, String r24, int r25, int r26, String r27, String r28, boolean r29, boolean r30, List r31, List r32, List r33, List r34, a r35, String r36) {
        p.l(r21, "universe");
        p.l(r24, "sort");
        p.l(r27, "screenName");
        p.l(r28, "screenDesc");
        p.l(r31, "calcs");
        p.l(r32, "rules");
        p.l(r33, "columns");
        p.l(r34, "sequence");
        p.l(r35, "badges");
        p.l(r36, "type");
        return new i(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36);
    }

    public final a c() {
        return this.f159761p;
    }

    public final List d() {
        return this.f159757l;
    }

    public final List e() {
        return this.f159759n;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (this.f159747a == r52.f159747a) goto L12;
        return false;
    L12:
        if (p.g(this.f159748b, r52.f159748b) == true) goto L15;
        return false;
    L15:
        if (this.f159749c == r52.f159749c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f159750e, r52.f159750e) == true) goto L24;
        return false;
    L24:
        if (this.f159751f == r52.f159751f) goto L27;
        return false;
    L27:
        if (this.f159752g == r52.f159752g) goto L30;
        return false;
    L30:
        if (p.g(this.f159753h, r52.f159753h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f159754i, r52.f159754i) == true) goto L36;
        return false;
    L36:
        if (this.f159755j == r52.f159755j) goto L39;
        return false;
    L39:
        if (this.f159756k == r52.f159756k) goto L42;
        return false;
    L42:
        if (p.g(this.f159757l, r52.f159757l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f159758m, r52.f159758m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f159759n, r52.f159759n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f159760o, r52.f159760o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f159761p, r52.f159761p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f159762q, r52.f159762q) == true) goto L59;
        return false;
    L59:
        return true;
    }

    public final int f() {
        return this.f159752g;
    }

    public final boolean g() {
        return this.f159755j;
    }

    public final int h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Integer.hashCode(this.f159747a) * 31) + this.f159748b.hashCode()) * 31) + Integer.hashCode(this.f159749c)) * 31) + Integer.hashCode(this.d)) * 31) + this.f159750e.hashCode()) * 31) + Integer.hashCode(this.f159751f)) * 31) + Integer.hashCode(this.f159752g)) * 31) + this.f159753h.hashCode()) * 31) + this.f159754i.hashCode()) * 31) + Boolean.hashCode(this.f159755j)) * 31) + Boolean.hashCode(this.f159756k)) * 31) + this.f159757l.hashCode()) * 31) + this.f159758m.hashCode()) * 31) + this.f159759n.hashCode()) * 31) + this.f159760o.hashCode()) * 31) + this.f159761p.hashCode()) * 31) + this.f159762q.hashCode();
    }

    public final int i() {
        return this.f159751f;
    }

    public final List j() {
        return this.f159758m;
    }

    public final String k() {
        return this.f159754i;
    }

    public final String l() {
        return this.f159753h;
    }

    public final int m() {
        return this.f159747a;
    }

    public final List n() {
        return this.f159760o;
    }

    public final String o() {
        return this.f159750e;
    }

    public final int p() {
        return this.f159749c;
    }

    public final String q() {
        return this.f159762q;
    }

    public final String r() {
        return this.f159748b;
    }

    public final boolean s() {
        return this.f159756k;
    }

    public String toString() {
        return "ScreenerScreenUIState(screenerId=" + this.f159747a + ", universe=" + this.f159748b + ", totalRows=" + this.f159749c + ", order=" + this.d + ", sort=" + this.f159750e + ", perPage=" + this.f159751f + ", currentPage=" + this.f159752g + ", screenName=" + this.f159753h + ", screenDesc=" + this.f159754i + ", favorite=" + this.f159755j + ", isGuru=" + this.f159756k + ", calcs=" + this.f159757l + ", rules=" + this.f159758m + ", columns=" + this.f159759n + ", sequence=" + this.f159760o + ", badges=" + this.f159761p + ", type=" + this.f159762q + ")";
    }
}
