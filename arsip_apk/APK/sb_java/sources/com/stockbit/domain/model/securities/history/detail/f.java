package com.stockbit.domain.model.securities.history.detail;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.common.primitives.Ints;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: A, reason: collision with root package name */
    public final String f85284A;

    /* renamed from: B, reason: collision with root package name */
    public final String f85285B;

    /* renamed from: C, reason: collision with root package name */
    public final String f85286C;

    /* renamed from: D, reason: collision with root package name */
    public final String f85287D;

    /* renamed from: E, reason: collision with root package name */
    public final String f85288E;

    /* renamed from: F, reason: collision with root package name */
    public final String f85289F;

    /* renamed from: G, reason: collision with root package name */
    public final String f85290G;

    /* renamed from: a, reason: collision with root package name */
    public final String f85291a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85292b;

    /* renamed from: c, reason: collision with root package name */
    public final g f85293c;
    public final g d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85294e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85295f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85296g;

    /* renamed from: h, reason: collision with root package name */
    public final double f85297h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85298i;

    /* renamed from: j, reason: collision with root package name */
    public final String f85299j;

    /* renamed from: k, reason: collision with root package name */
    public final String f85300k;

    /* renamed from: l, reason: collision with root package name */
    public final String f85301l;

    /* renamed from: m, reason: collision with root package name */
    public final String f85302m;

    /* renamed from: n, reason: collision with root package name */
    public final String f85303n;

    /* renamed from: o, reason: collision with root package name */
    public final String f85304o;

    /* renamed from: p, reason: collision with root package name */
    public final String f85305p;

    /* renamed from: q, reason: collision with root package name */
    public final double f85306q;

    /* renamed from: r, reason: collision with root package name */
    public final double f85307r;

    /* renamed from: s, reason: collision with root package name */
    public final String f85308s;

    /* renamed from: t, reason: collision with root package name */
    public final String f85309t;

    /* renamed from: u, reason: collision with root package name */
    public final String f85310u;

    /* renamed from: v, reason: collision with root package name */
    public final String f85311v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f85312w;

    /* renamed from: x, reason: collision with root package name */
    public final c f85313x;

    /* renamed from: y, reason: collision with root package name */
    public final c f85314y;

    /* renamed from: z, reason: collision with root package name */
    public final String f85315z;

    public f(String r17, String r18, g r19, g r20, String r21, String r22, String r23, double r24, double r26, String r28, String r29, String r30, String r31, String r32, String r33, String r34, double r35, double r37, String r39, String r40, String r41, String r42, boolean r43, c r44, c r45, String r46, String r47, String r48, String r49, String r50, String r51, String r52, String r53) {
        p.l(r17, Constants.KEY_ID);
        p.l(r18, "referenceId");
        p.l(r19, "userId");
        p.l(r20, "counterpartyUserId");
        p.l(r21, "orderSide");
        p.l(r22, "assetCode");
        p.l(r23, "assetType");
        p.l(r28, NotificationCompat.CATEGORY_STATUS);
        p.l(r29, "counterpartyOrderId");
        p.l(r30, "counterpartyBrokerCode");
        p.l(r31, "carinaOrderId");
        p.l(r32, "matchingMethodSource");
        p.l(r33, "settlementSchedule");
        p.l(r34, "orderVisibility");
        p.l(r39, "purpose");
        p.l(r40, "reason");
        p.l(r41, "displayMessage");
        p.l(r42, "cancellationState");
        p.l(r44, "transactionDate");
        p.l(r45, "settlementDate");
        p.l(r46, "createdAt");
        p.l(r47, "updatedAt");
        p.l(r48, "activatedAt");
        p.l(r49, "matchingAt");
        p.l(r50, "expiredAt");
        p.l(r51, "matchingState");
        p.l(r52, "clientIpAddress");
        p.l(r53, "settlementMethod");
        this.f85291a = r17;
        this.f85292b = r18;
        this.f85293c = r19;
        this.d = r20;
        this.f85294e = r21;
        this.f85295f = r22;
        this.f85296g = r23;
        this.f85297h = r24;
        this.f85298i = r26;
        this.f85299j = r28;
        this.f85300k = r29;
        this.f85301l = r30;
        this.f85302m = r31;
        this.f85303n = r32;
        this.f85304o = r33;
        this.f85305p = r34;
        this.f85306q = r35;
        this.f85307r = r37;
        this.f85308s = r39;
        this.f85309t = r40;
        this.f85310u = r41;
        this.f85311v = r42;
        this.f85312w = r43;
        this.f85313x = r44;
        this.f85314y = r45;
        this.f85315z = r46;
        this.f85284A = r47;
        this.f85285B = r48;
        this.f85286C = r49;
        this.f85287D = r50;
        this.f85288E = r51;
        this.f85289F = r52;
        this.f85290G = r53;
    }

    public final String a() {
        return this.f85301l;
    }

    public final g b() {
        return this.d;
    }

    public final double c() {
        return this.f85307r;
    }

    public final double d() {
        return this.f85306q;
    }

    public final double e() {
        return this.f85297h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f85291a, r82.f85291a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85292b, r82.f85292b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85293c, r82.f85293c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85294e, r82.f85294e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85295f, r82.f85295f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85296g, r82.f85296g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f85297h, r82.f85297h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85298i, r82.f85298i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f85299j, r82.f85299j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f85300k, r82.f85300k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f85301l, r82.f85301l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f85302m, r82.f85302m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f85303n, r82.f85303n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f85304o, r82.f85304o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f85305p, r82.f85305p) == true) goto L57;
        return false;
    L57:
        if (Double.compare(this.f85306q, r82.f85306q) == 0) goto L60;
        return false;
    L60:
        if (Double.compare(this.f85307r, r82.f85307r) == 0) goto L63;
        return false;
    L63:
        if (p.g(this.f85308s, r82.f85308s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f85309t, r82.f85309t) == true) goto L69;
        return false;
    L69:
        if (p.g(this.f85310u, r82.f85310u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f85311v, r82.f85311v) == true) goto L75;
        return false;
    L75:
        if (this.f85312w == r82.f85312w) goto L78;
        return false;
    L78:
        if (p.g(this.f85313x, r82.f85313x) == true) goto L81;
        return false;
    L81:
        if (p.g(this.f85314y, r82.f85314y) == true) goto L84;
        return false;
    L84:
        if (p.g(this.f85315z, r82.f85315z) == true) goto L87;
        return false;
    L87:
        if (p.g(this.f85284A, r82.f85284A) == true) goto L90;
        return false;
    L90:
        if (p.g(this.f85285B, r82.f85285B) == true) goto L93;
        return false;
    L93:
        if (p.g(this.f85286C, r82.f85286C) == true) goto L96;
        return false;
    L96:
        if (p.g(this.f85287D, r82.f85287D) == true) goto L99;
        return false;
    L99:
        if (p.g(this.f85288E, r82.f85288E) == true) goto L102;
        return false;
    L102:
        if (p.g(this.f85289F, r82.f85289F) == true) goto L105;
        return false;
    L105:
        if (p.g(this.f85290G, r82.f85290G) == true) goto L107;
        return false;
    L107:
        return true;
    }

    public final String f() {
        return this.f85305p;
    }

    public final String g() {
        return this.f85308s;
    }

    public final String h() {
        return this.f85309t;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f85291a.hashCode() * 31) + this.f85292b.hashCode()) * 31) + this.f85293c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85294e.hashCode()) * 31) + this.f85295f.hashCode()) * 31) + this.f85296g.hashCode()) * 31) + Double.hashCode(this.f85297h)) * 31) + Double.hashCode(this.f85298i)) * 31) + this.f85299j.hashCode()) * 31) + this.f85300k.hashCode()) * 31) + this.f85301l.hashCode()) * 31) + this.f85302m.hashCode()) * 31) + this.f85303n.hashCode()) * 31) + this.f85304o.hashCode()) * 31) + this.f85305p.hashCode()) * 31) + Double.hashCode(this.f85306q)) * 31) + Double.hashCode(this.f85307r)) * 31) + this.f85308s.hashCode()) * 31) + this.f85309t.hashCode()) * 31) + this.f85310u.hashCode()) * 31) + this.f85311v.hashCode()) * 31) + Boolean.hashCode(this.f85312w)) * 31) + this.f85313x.hashCode()) * 31) + this.f85314y.hashCode()) * 31) + this.f85315z.hashCode()) * 31) + this.f85284A.hashCode()) * 31) + this.f85285B.hashCode()) * 31) + this.f85286C.hashCode()) * 31) + this.f85287D.hashCode()) * 31) + this.f85288E.hashCode()) * 31) + this.f85289F.hashCode()) * 31) + this.f85290G.hashCode();
    }

    public final String i() {
        return this.f85292b;
    }

    public final c j() {
        return this.f85314y;
    }

    public final String k() {
        return this.f85290G;
    }

    public final String l() {
        return this.f85304o;
    }

    public final double m() {
        return this.f85298i;
    }

    public final c n() {
        return this.f85313x;
    }

    public String toString() {
        return "HistoryDetailNegoOrderEntity(id=" + this.f85291a + ", referenceId=" + this.f85292b + ", userId=" + this.f85293c + ", counterpartyUserId=" + this.d + ", orderSide=" + this.f85294e + ", assetCode=" + this.f85295f + ", assetType=" + this.f85296g + ", orderPrice=" + this.f85297h + ", shares=" + this.f85298i + ", status=" + this.f85299j + ", counterpartyOrderId=" + this.f85300k + ", counterpartyBrokerCode=" + this.f85301l + ", carinaOrderId=" + this.f85302m + ", matchingMethodSource=" + this.f85303n + ", settlementSchedule=" + this.f85304o + ", orderVisibility=" + this.f85305p + ", feeOverTheCounter=" + this.f85306q + ", feeExchangeWithBroker=" + this.f85307r + ", purpose=" + this.f85308s + ", reason=" + this.f85309t + ", displayMessage=" + this.f85310u + ", cancellationState=" + this.f85311v + ", isPriceOutsideAutoRejectRange=" + this.f85312w + ", transactionDate=" + this.f85313x + ", settlementDate=" + this.f85314y + ", createdAt=" + this.f85315z + ", updatedAt=" + this.f85284A + ", activatedAt=" + this.f85285B + ", matchingAt=" + this.f85286C + ", expiredAt=" + this.f85287D + ", matchingState=" + this.f85288E + ", clientIpAddress=" + this.f85289F + ", settlementMethod=" + this.f85290G + ")";
    }

    public /* synthetic */ f(String r36, String r37, g r38, g r39, String r40, String r41, String r42, double r43, double r45, String r47, String r48, String r49, String r50, String r51, String r52, String r53, double r54, double r56, String r58, String r59, String r60, String r61, boolean r62, c r63, c r64, String r65, String r66, String r67, String r68, String r69, String r70, String r71, String r72, int r73, int r74, kotlin.jvm.internal.i r75) {
        if ((r73 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r73 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r73 & 4) == 0) goto L13;
        g r5 = new g(null, null, null, null, 15, null);
    L15:
        if ((r73 & 8) == 0) goto L17;
        g r6 = new g(null, null, null, null, 15, null);
    L19:
        if ((r73 & 16) == 0) goto L21;
        String r4 = "";
    L23:
        if ((r73 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r73 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r73 & 128) == 0) goto L33;
        double r12 = 0.0d;
    L35:
        if ((r73 & 256) == 0) goto L37;
        double r14 = 0.0d;
    L39:
        if ((r73 & 512) == 0) goto L41;
        String r9 = "";
    L43:
        if ((r73 & 1024) == 0) goto L45;
        String r10 = "";
    L47:
        if ((r73 & 2048) == 0) goto L49;
        String r11 = "";
    L50:
        String r752 = r1;
        if ((r73 & 4096) == 0) goto L53;
        String r13 = "";
    L54:
        String r382 = r13;
        if ((r73 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L58:
        String r392 = r15;
        if ((r73 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r73 & 32768) == 0) goto L65;
        String r162 = "";
    L67:
        if ((r73 & 65536) == 0) goto L69;
        double r17 = 0.0d;
    L71:
        if ((r73 & 131072) == 0) goto L73;
        double r19 = 0.0d;
    L75:
        if ((r73 & 262144) == 0) goto L77;
        String r21 = "";
    L79:
        if ((r73 & 524288) == 0) goto L81;
        String r22 = "";
    L83:
        if ((r73 & 1048576) == 0) goto L85;
        String r23 = "";
    L87:
        if ((r73 & 2097152) == 0) goto L89;
        String r24 = "";
    L91:
        if ((r73 & 4194304) == 0) goto L93;
        boolean r25 = false;
    L95:
        if ((r73 & 8388608) == 0) goto L97;
        c r26 = new c(0, 0, 0, 7, null);
    L99:
        if ((r73 & 16777216) == 0) goto L101;
        c r27 = new c(0, 0, 0, 7, null);
    L103:
        if ((r73 & 33554432) == 0) goto L105;
        String r28 = "";
    L107:
        if ((r73 & 67108864) == 0) goto L109;
        String r29 = "";
    L111:
        if ((r73 & 134217728) == 0) goto L113;
        String r30 = "";
    L115:
        if ((r73 & 268435456) == 0) goto L117;
        String r31 = "";
    L119:
        if ((r73 & 536870912) == 0) goto L121;
        String r32 = "";
    L123:
        if ((r73 & Ints.MAX_POWER_OF_TWO) == 0) goto L125;
        String r33 = "";
    L127:
        if ((r73 & Integer.MIN_VALUE) == 0) goto L129;
        String r02 = "";
    L131:
        if ((r74 & 1) == 0) goto L134;
        String r732 = "";
    L135:
        this(r752, r3, r5, r6, r4, r7, r8, r12, r14, r9, r10, r11, r382, r392, r16, r162, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r02, r732);
        return;
    L134:
        r732 = r72;
        goto L135
    L129:
        r02 = r71;
        goto L131
    L125:
        r33 = r70;
        goto L127
    L121:
        r32 = r69;
        goto L123
    L117:
        r31 = r68;
        goto L119
    L113:
        r30 = r67;
        goto L115
    L109:
        r29 = r66;
        goto L111
    L105:
        r28 = r65;
        goto L107
    L101:
        r27 = r64;
        goto L103
    L97:
        r26 = r63;
        goto L99
    L93:
        r25 = r62;
        goto L95
    L89:
        r24 = r61;
        goto L91
    L85:
        r23 = r60;
        goto L87
    L81:
        r22 = r59;
        goto L83
    L77:
        r21 = r58;
        goto L79
    L73:
        r19 = r56;
        goto L75
    L69:
        r17 = r54;
        goto L71
    L65:
        r162 = r53;
        goto L67
    L61:
        r16 = r52;
        goto L63
    L57:
        r15 = r51;
        goto L58
    L53:
        r13 = r50;
        goto L54
    L49:
        r11 = r49;
        goto L50
    L45:
        r10 = r48;
        goto L47
    L41:
        r9 = r47;
        goto L43
    L37:
        r14 = r45;
        goto L39
    L33:
        r12 = r43;
        goto L35
    L29:
        r8 = r42;
        goto L31
    L25:
        r7 = r41;
        goto L27
    L21:
        r4 = r40;
        goto L23
    L17:
        r6 = r39;
        goto L19
    L13:
        r5 = r38;
        goto L15
    L9:
        r3 = r37;
        goto L11
    L5:
        r1 = r36;
        goto L7
    }
}
