package com.stockbit.eipo.ui.compose.order.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f90492a;

    /* renamed from: b, reason: collision with root package name */
    public final long f90493b;

    /* renamed from: c, reason: collision with root package name */
    public final long f90494c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f90495e;

    /* renamed from: f, reason: collision with root package name */
    public final long f90496f;

    /* renamed from: g, reason: collision with root package name */
    public final long f90497g;

    /* renamed from: h, reason: collision with root package name */
    public final int f90498h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90499i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f90500j;

    /* renamed from: k, reason: collision with root package name */
    public final int f90501k;

    /* renamed from: l, reason: collision with root package name */
    public final int f90502l;

    /* renamed from: m, reason: collision with root package name */
    public final double f90503m;

    /* renamed from: n, reason: collision with root package name */
    public final double f90504n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f90505o;

    /* renamed from: p, reason: collision with root package name */
    public final double f90506p;

    /* renamed from: q, reason: collision with root package name */
    public final double f90507q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f90508r;

    /* renamed from: s, reason: collision with root package name */
    public final double f90509s;

    static {
    }

    public a(long r1, long r3, long r5, boolean r7, boolean r8, long r9, long r11, int r13, boolean r14, boolean r15, int r16, int r17, double r18, double r20, boolean r22, double r23, double r25, boolean r27, double r28) {
        this.f90492a = r1;
        this.f90493b = r3;
        this.f90494c = r5;
        this.d = r7;
        this.f90495e = r8;
        this.f90496f = r9;
        this.f90497g = r11;
        this.f90498h = r13;
        this.f90499i = r14;
        this.f90500j = r15;
        this.f90501k = r16;
        this.f90502l = r17;
        this.f90503m = r18;
        this.f90504n = r20;
        this.f90505o = r22;
        this.f90506p = r23;
        this.f90507q = r25;
        this.f90508r = r27;
        this.f90509s = r28;
    }

    public static /* synthetic */ a b(a r19, long r20, long r22, long r24, boolean r26, boolean r27, long r28, long r30, int r32, boolean r33, boolean r34, int r35, int r36, double r37, double r39, boolean r41, double r42, double r44, boolean r46, double r47, int r49, Object r50) {
        if ((r49 & 1) == 0) goto L5;
        long r2 = r19.f90492a;
    L7:
        if ((r49 & 2) == 0) goto L9;
        long r4 = r19.f90493b;
    L11:
        if ((r49 & 4) == 0) goto L13;
        long r6 = r19.f90494c;
    L15:
        if ((r49 & 8) == 0) goto L17;
        boolean r8 = r19.d;
    L19:
        if ((r49 & 16) == 0) goto L21;
        boolean r9 = r19.f90495e;
    L23:
        if ((r49 & 32) == 0) goto L25;
        long r10 = r19.f90496f;
    L27:
        if ((r49 & 64) == 0) goto L29;
        long r12 = r19.f90497g;
    L31:
        if ((r49 & 128) == 0) goto L33;
        int r14 = r19.f90498h;
    L35:
        if ((r49 & 256) == 0) goto L37;
        boolean r15 = r19.f90499i;
    L38:
        long r16 = r2;
        if ((r49 & 512) == 0) goto L41;
        boolean r23 = r19.f90500j;
    L43:
        if ((r49 & 1024) == 0) goto L45;
        int r3 = r19.f90501k;
    L46:
        boolean r202 = r23;
        if ((r49 & 2048) == 0) goto L49;
        int r25 = r19.f90502l;
    L50:
        int r21 = r25;
        int r222 = r3;
        if ((r49 & 4096) == 0) goto L53;
        double r29 = r19.f90503m;
    L54:
        double r232 = r29;
        if ((r49 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        double r210 = r19.f90504n;
    L58:
        double r252 = r210;
        if ((r49 & 16384) == 0) goto L61;
        boolean r211 = r19.f90505o;
    L62:
        boolean r272 = r211;
        if ((32768 & r49) == 0) goto L65;
        double r1 = r19.f90506p;
    L66:
        double r282 = r1;
        if ((r49 & 65536) == 0) goto L69;
        double r13 = r19.f90507q;
    L71:
        if ((r49 & 131072) == 0) goto L73;
        boolean r38 = r19.f90508r;
    L75:
        if ((r49 & 262144) == 0) goto L78;
        double r302 = r13;
        double r45 = r302;
        double r48 = r19.f90509s;
    L80:
        return r19.a(r16, r4, r6, r8, r9, r10, r12, r14, r15, r202, r222, r21, r232, r252, r272, r282, r45, r38, r48);
    L78:
        r48 = r47;
        r45 = r13;
        goto L80
    L73:
        r38 = r46;
        goto L75
    L69:
        r13 = r44;
        goto L71
    L65:
        r1 = r42;
        goto L66
    L61:
        r211 = r41;
        goto L62
    L57:
        r210 = r39;
        goto L58
    L53:
        r29 = r37;
        goto L54
    L49:
        r25 = r36;
        goto L50
    L45:
        r3 = r35;
        goto L46
    L41:
        r23 = r34;
        goto L43
    L37:
        r15 = r33;
        goto L38
    L33:
        r14 = r32;
        goto L35
    L29:
        r12 = r30;
        goto L31
    L25:
        r10 = r28;
        goto L27
    L21:
        r9 = r27;
        goto L23
    L17:
        r8 = r26;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    public final a a(long r31, long r33, long r35, boolean r37, boolean r38, long r39, long r41, int r43, boolean r44, boolean r45, int r46, int r47, double r48, double r50, boolean r52, double r53, double r55, boolean r57, double r58) {
        return new a(r31, r33, r35, r37, r38, r39, r41, r43, r44, r45, r46, r47, r48, r50, r52, r53, r55, r57, r58);
    }

    public final int c() {
        return this.f90501k;
    }

    public final int d() {
        return this.f90502l;
    }

    public final long e() {
        return this.f90494c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f90492a == r82.f90492a) goto L12;
        return false;
    L12:
        if (this.f90493b == r82.f90493b) goto L15;
        return false;
    L15:
        if (this.f90494c == r82.f90494c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f90495e == r82.f90495e) goto L24;
        return false;
    L24:
        if (this.f90496f == r82.f90496f) goto L27;
        return false;
    L27:
        if (this.f90497g == r82.f90497g) goto L30;
        return false;
    L30:
        if (this.f90498h == r82.f90498h) goto L33;
        return false;
    L33:
        if (this.f90499i == r82.f90499i) goto L36;
        return false;
    L36:
        if (this.f90500j == r82.f90500j) goto L39;
        return false;
    L39:
        if (this.f90501k == r82.f90501k) goto L42;
        return false;
    L42:
        if (this.f90502l == r82.f90502l) goto L45;
        return false;
    L45:
        if (Double.compare(this.f90503m, r82.f90503m) == 0) goto L48;
        return false;
    L48:
        if (Double.compare(this.f90504n, r82.f90504n) == 0) goto L51;
        return false;
    L51:
        if (this.f90505o == r82.f90505o) goto L54;
        return false;
    L54:
        if (Double.compare(this.f90506p, r82.f90506p) == 0) goto L57;
        return false;
    L57:
        if (Double.compare(this.f90507q, r82.f90507q) == 0) goto L60;
        return false;
    L60:
        if (this.f90508r == r82.f90508r) goto L63;
        return false;
    L63:
        if (Double.compare(this.f90509s, r82.f90509s) == 0) goto L65;
        return false;
    L65:
        return true;
    }

    public final double f() {
        return this.f90503m;
    }

    public final long g() {
        return this.f90496f;
    }

    public final int h() {
        return this.f90498h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Long.hashCode(this.f90492a) * 31) + Long.hashCode(this.f90493b)) * 31) + Long.hashCode(this.f90494c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f90495e)) * 31) + Long.hashCode(this.f90496f)) * 31) + Long.hashCode(this.f90497g)) * 31) + Integer.hashCode(this.f90498h)) * 31) + Boolean.hashCode(this.f90499i)) * 31) + Boolean.hashCode(this.f90500j)) * 31) + Integer.hashCode(this.f90501k)) * 31) + Integer.hashCode(this.f90502l)) * 31) + Double.hashCode(this.f90503m)) * 31) + Double.hashCode(this.f90504n)) * 31) + Boolean.hashCode(this.f90505o)) * 31) + Double.hashCode(this.f90506p)) * 31) + Double.hashCode(this.f90507q)) * 31) + Boolean.hashCode(this.f90508r)) * 31) + Double.hashCode(this.f90509s);
    }

    public final long i() {
        return this.f90492a;
    }

    public final long j() {
        return this.f90497g;
    }

    public final double k() {
        return this.f90506p;
    }

    public final double l() {
        return this.f90509s;
    }

    public final double m() {
        return this.f90504n;
    }

    public final long n() {
        return this.f90493b;
    }

    public final boolean o() {
        return this.f90499i;
    }

    public final boolean p() {
        return this.f90505o;
    }

    public final boolean q() {
        return this.f90508r;
    }

    public final boolean r() {
        return this.f90495e;
    }

    public final boolean s() {
        return this.d;
    }

    public String toString() {
        return "EIpoOrderFormUIState(lowerPrice=" + this.f90492a + ", upperPrice=" + this.f90493b + ", currentPrice=" + this.f90494c + ", isPriceMin=" + this.d + ", isPriceMax=" + this.f90495e + ", lot=" + this.f90496f + ", maxLot=" + this.f90497g + ", lotPercentage=" + this.f90498h + ", isLotMin=" + this.f90499i + ", isLotMax=" + this.f90500j + ", bonusRatioFrom=" + this.f90501k + ", bonusRatioTo=" + this.f90502l + ", estBonus=" + this.f90503m + ", total=" + this.f90504n + ", isOverLimit=" + this.f90505o + ", overLimitAmount=" + this.f90506p + ", offeredShares=" + this.f90507q + ", isOverTenPercentOfferedLot=" + this.f90508r + ", tenPercentOfferedLotLimit=" + this.f90509s + ')';
    }

    public /* synthetic */ a(long r29, long r31, long r33, boolean r35, boolean r36, long r37, long r39, int r41, boolean r42, boolean r43, int r44, int r45, double r46, double r48, boolean r50, double r51, double r53, boolean r55, double r56, int r58, i r59) {
        long r2 = 0;
        if ((r58 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r58 & 2) == 0) goto L9;
        long r6 = 0;
    L11:
        if ((r58 & 4) == 0) goto L13;
        long r8 = 0;
    L15:
        if ((r58 & 8) == 0) goto L17;
        boolean r1 = false;
    L19:
        if ((r58 & 16) == 0) goto L21;
        boolean r11 = false;
    L23:
        if ((r58 & 32) == 0) goto L25;
        long r12 = 0;
    L27:
        if ((r58 & 64) != 0) goto L31;
        r2 = r39;
    L31:
        if ((r58 & 128) == 0) goto L33;
        int r14 = 0;
    L35:
        if ((r58 & 256) == 0) goto L37;
        boolean r15 = false;
    L39:
        if ((r58 & 512) == 0) goto L41;
        boolean r10 = false;
    L42:
        boolean r30 = r1;
        if ((r58 & 1024) == 0) goto L45;
        int r13 = 0;
    L46:
        int r312 = r13;
        if ((r58 & 2048) == 0) goto L49;
        int r16 = 0;
    L50:
        int r32 = r16;
        if ((r58 & 4096) == 0) goto L53;
        double r18 = 0.0d;
    L55:
        if ((r58 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        double r20 = 0.0d;
    L59:
        if ((r58 & 16384) == 0) goto L61;
        boolean r17 = false;
    L63:
        if ((r58 & 32768) == 0) goto L65;
        double r22 = 0.0d;
    L67:
        if ((r58 & 65536) == 0) goto L69;
        double r24 = 0.0d;
    L71:
        if ((r58 & 131072) == 0) goto L73;
        boolean r26 = false;
    L75:
        if ((r58 & 262144) == 0) goto L78;
        double r57 = 0.0d;
    L79:
        this(r4, r6, r8, r30, r11, r12, r2, r14, r15, r10, r312, r32, r18, r20, r17, r22, r24, r26, r57);
        return;
    L78:
        r57 = r56;
        goto L79
    L73:
        r26 = r55;
        goto L75
    L69:
        r24 = r53;
        goto L71
    L65:
        r22 = r51;
        goto L67
    L61:
        r17 = r50;
        goto L63
    L57:
        r20 = r48;
        goto L59
    L53:
        r18 = r46;
        goto L55
    L49:
        r16 = r45;
        goto L50
    L45:
        r13 = r44;
        goto L46
    L41:
        r10 = r43;
        goto L42
    L37:
        r15 = r42;
        goto L39
    L33:
        r14 = r41;
        goto L35
    L25:
        r12 = r37;
        goto L27
    L21:
        r11 = r36;
        goto L23
    L17:
        r1 = r35;
        goto L19
    L13:
        r8 = r33;
        goto L15
    L9:
        r6 = r31;
        goto L11
    L5:
        r4 = r29;
        goto L7
    }
}
