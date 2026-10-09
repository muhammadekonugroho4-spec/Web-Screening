package com.stockbit.usecase.trading.community.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f163280a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163281b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163282c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f163283e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163284f;

    /* renamed from: g, reason: collision with root package name */
    public final String f163285g;

    /* renamed from: h, reason: collision with root package name */
    public final double f163286h;

    /* renamed from: i, reason: collision with root package name */
    public final Pair f163287i;

    /* renamed from: j, reason: collision with root package name */
    public final String f163288j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f163289k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f163290l;

    /* renamed from: m, reason: collision with root package name */
    public final String f163291m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f163292n;

    public g(String r3, String r4, String r5, String r6, String r7, String r8, String r9, double r10, Pair r12, String r13, boolean r14, Integer r15, String r16, boolean r17) {
        p.l(r3, "communityCode");
        p.l(r4, "communityName");
        p.l(r5, "leaveDate");
        p.l(r6, "newTotalBuy");
        p.l(r7, "newTotalSell");
        p.l(r8, "oldTotalBuy");
        p.l(r9, "oldTotalSell");
        p.l(r13, "minimumBalanceFormatted");
        p.l(r16, "leaderFullName");
        this.f163280a = r3;
        this.f163281b = r4;
        this.f163282c = r5;
        this.d = r6;
        this.f163283e = r7;
        this.f163284f = r8;
        this.f163285g = r9;
        this.f163286h = r10;
        this.f163287i = r12;
        this.f163288j = r13;
        this.f163289k = r14;
        this.f163290l = r15;
        this.f163291m = r16;
        this.f163292n = r17;
    }

    public static /* synthetic */ g b(g r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, double r24, Pair r26, String r27, boolean r28, Integer r29, String r30, boolean r31, int r32, Object r33) {
        if ((r32 & 1) == 0) goto L5;
        String r2 = r16.f163280a;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = r16.f163281b;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = r16.f163282c;
    L15:
        if ((r32 & 8) == 0) goto L17;
        String r5 = r16.d;
    L19:
        if ((r32 & 16) == 0) goto L21;
        String r6 = r16.f163283e;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r7 = r16.f163284f;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r8 = r16.f163285g;
    L31:
        if ((r32 & 128) == 0) goto L33;
        double r9 = r16.f163286h;
    L35:
        if ((r32 & 256) == 0) goto L37;
        Pair r11 = r16.f163287i;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r12 = r16.f163288j;
    L43:
        if ((r32 & 1024) == 0) goto L45;
        boolean r13 = r16.f163289k;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        Integer r14 = r16.f163290l;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        String r15 = r16.f163291m;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        boolean r322 = r16.f163292n;
    L60:
        return r16.a(r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r322);
    L58:
        r322 = r31;
        goto L60
    L53:
        r15 = r30;
        goto L55
    L49:
        r14 = r29;
        goto L51
    L45:
        r13 = r28;
        goto L47
    L41:
        r12 = r27;
        goto L43
    L37:
        r11 = r26;
        goto L39
    L33:
        r9 = r24;
        goto L35
    L29:
        r8 = r23;
        goto L31
    L25:
        r7 = r22;
        goto L27
    L21:
        r6 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L15
    L9:
        r3 = r18;
        goto L11
    L5:
        r2 = r17;
        goto L7
    }

    public final g a(String r18, String r19, String r20, String r21, String r22, String r23, String r24, double r25, Pair r27, String r28, boolean r29, Integer r30, String r31, boolean r32) {
        p.l(r18, "communityCode");
        p.l(r19, "communityName");
        p.l(r20, "leaveDate");
        p.l(r21, "newTotalBuy");
        p.l(r22, "newTotalSell");
        p.l(r23, "oldTotalBuy");
        p.l(r24, "oldTotalSell");
        p.l(r28, "minimumBalanceFormatted");
        p.l(r31, "leaderFullName");
        return new g(r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32);
    }

    public final String c() {
        return this.f163280a;
    }

    public final String d() {
        return this.f163281b;
    }

    public final String e() {
        return this.f163291m;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (p.g(this.f163280a, r82.f163280a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163281b, r82.f163281b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163282c, r82.f163282c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f163283e, r82.f163283e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f163284f, r82.f163284f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f163285g, r82.f163285g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f163286h, r82.f163286h) == 0) goto L33;
        return false;
    L33:
        if (p.g(this.f163287i, r82.f163287i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f163288j, r82.f163288j) == true) goto L39;
        return false;
    L39:
        if (this.f163289k == r82.f163289k) goto L42;
        return false;
    L42:
        if (p.g(this.f163290l, r82.f163290l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f163291m, r82.f163291m) == true) goto L48;
        return false;
    L48:
        if (this.f163292n == r82.f163292n) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f163282c;
    }

    public final double g() {
        return this.f163286h;
    }

    public final String h() {
        return this.f163288j;
    }

    public int hashCode() {
        int r02 = ((((((((((((((this.f163280a.hashCode() * 31) + this.f163281b.hashCode()) * 31) + this.f163282c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f163283e.hashCode()) * 31) + this.f163284f.hashCode()) * 31) + this.f163285g.hashCode()) * 31) + Double.hashCode(this.f163286h)) * 31;
        Pair r1 = this.f163287i;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((((r02 + r12) * 31) + this.f163288j.hashCode()) * 31) + Boolean.hashCode(this.f163289k)) * 31;
        Integer r13 = this.f163290l;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return ((((r03 + r2) * 31) + this.f163291m.hashCode()) * 31) + Boolean.hashCode(this.f163292n);
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f163283e;
    }

    public final String k() {
        return this.f163284f;
    }

    public final String l() {
        return this.f163285g;
    }

    public final Pair m() {
        return this.f163287i;
    }

    public final boolean n() {
        return this.f163292n;
    }

    public final boolean o() {
        return this.f163289k;
    }

    public String toString() {
        return "TradingCommunityUIState(communityCode=" + this.f163280a + ", communityName=" + this.f163281b + ", leaveDate=" + this.f163282c + ", newTotalBuy=" + this.d + ", newTotalSell=" + this.f163283e + ", oldTotalBuy=" + this.f163284f + ", oldTotalSell=" + this.f163285g + ", minimumBalance=" + this.f163286h + ", tradingBalanceFormatted=" + this.f163287i + ", minimumBalanceFormatted=" + this.f163288j + ", isLowBalance=" + this.f163289k + ", roomId=" + this.f163290l + ", leaderFullName=" + this.f163291m + ", isLeaderHasPILicense=" + this.f163292n + ")";
    }

    public /* synthetic */ g(String r19, String r20, String r21, String r22, String r23, String r24, String r25, double r26, Pair r28, String r29, boolean r30, Integer r31, String r32, boolean r33, int r34, i r35) {
        if ((r34 & 256) == 0) goto L5;
        Pair r12 = null;
    L7:
        if ((r34 & 512) == 0) goto L9;
        String r13 = "";
    L11:
        if ((r34 & 1024) == 0) goto L14;
        boolean r14 = false;
    L15:
        this(r19, r20, r21, r22, r23, r24, r25, r26, r12, r13, r14, r31, r32, r33);
        return;
    L14:
        r14 = r30;
        goto L15
    L9:
        r13 = r29;
        goto L11
    L5:
        r12 = r28;
        goto L7
    }
}
