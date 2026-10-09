package com.stockbit.usecase.company.model.tradebook;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156629b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156630c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156631e;

    /* renamed from: f, reason: collision with root package name */
    public final float f156632f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156633g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156634h;

    /* renamed from: i, reason: collision with root package name */
    public final String f156635i;

    /* renamed from: j, reason: collision with root package name */
    public final String f156636j;

    /* renamed from: k, reason: collision with root package name */
    public final String f156637k;

    /* renamed from: l, reason: collision with root package name */
    public final String f156638l;

    /* renamed from: m, reason: collision with root package name */
    public final String f156639m;

    /* renamed from: n, reason: collision with root package name */
    public final String f156640n;

    /* renamed from: o, reason: collision with root package name */
    public final String f156641o;

    /* renamed from: p, reason: collision with root package name */
    public final CellChartType f156642p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f156643q;

    public f(String r17, String r18, String r19, float r20, String r21, float r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, CellChartType r32, boolean r33) {
        p.l(r17, CrashHianalyticsData.TIME);
        p.l(r18, "buyLot");
        p.l(r19, "buyValue");
        p.l(r21, "buyPercentageText");
        p.l(r23, "sellPercentageText");
        p.l(r24, "sellLot");
        p.l(r25, "sellValue");
        p.l(r26, "preLot");
        p.l(r27, "preFreq");
        p.l(r28, "postLot");
        p.l(r29, "postFreq");
        p.l(r30, "totalLot");
        p.l(r31, "totalFreq");
        p.l(r32, "cellChartType");
        this.f156628a = r17;
        this.f156629b = r18;
        this.f156630c = r19;
        this.d = r20;
        this.f156631e = r21;
        this.f156632f = r22;
        this.f156633g = r23;
        this.f156634h = r24;
        this.f156635i = r25;
        this.f156636j = r26;
        this.f156637k = r27;
        this.f156638l = r28;
        this.f156639m = r29;
        this.f156640n = r30;
        this.f156641o = r31;
        this.f156642p = r32;
        this.f156643q = r33;
    }

    public final String a() {
        return this.f156629b;
    }

    public final float b() {
        return this.d;
    }

    public final String c() {
        return this.f156631e;
    }

    public final String d() {
        return this.f156630c;
    }

    public final CellChartType e() {
        return this.f156642p;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f156628a, r52.f156628a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156629b, r52.f156629b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156630c, r52.f156630c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r52.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f156631e, r52.f156631e) == true) goto L24;
        return false;
    L24:
        if (Float.compare(this.f156632f, r52.f156632f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f156633g, r52.f156633g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f156634h, r52.f156634h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f156635i, r52.f156635i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f156636j, r52.f156636j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f156637k, r52.f156637k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f156638l, r52.f156638l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f156639m, r52.f156639m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f156640n, r52.f156640n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f156641o, r52.f156641o) == true) goto L54;
        return false;
    L54:
        if (this.f156642p == r52.f156642p) goto L57;
        return false;
    L57:
        if (this.f156643q == r52.f156643q) goto L59;
        return false;
    L59:
        return true;
    }

    public final String f() {
        return this.f156639m;
    }

    public final String g() {
        return this.f156638l;
    }

    public final String h() {
        return this.f156637k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f156628a.hashCode() * 31) + this.f156629b.hashCode()) * 31) + this.f156630c.hashCode()) * 31) + Float.hashCode(this.d)) * 31) + this.f156631e.hashCode()) * 31) + Float.hashCode(this.f156632f)) * 31) + this.f156633g.hashCode()) * 31) + this.f156634h.hashCode()) * 31) + this.f156635i.hashCode()) * 31) + this.f156636j.hashCode()) * 31) + this.f156637k.hashCode()) * 31) + this.f156638l.hashCode()) * 31) + this.f156639m.hashCode()) * 31) + this.f156640n.hashCode()) * 31) + this.f156641o.hashCode()) * 31) + this.f156642p.hashCode()) * 31) + Boolean.hashCode(this.f156643q);
    }

    public final String i() {
        return this.f156636j;
    }

    public final String j() {
        return this.f156634h;
    }

    public final float k() {
        return this.f156632f;
    }

    public final String l() {
        return this.f156633g;
    }

    public final String m() {
        return this.f156635i;
    }

    public final String n() {
        return this.f156628a;
    }

    public final String o() {
        return this.f156641o;
    }

    public final String p() {
        return this.f156640n;
    }

    public final boolean q() {
        return this.f156643q;
    }

    public String toString() {
        return "TradeBookTimeColumnUIState(time=" + this.f156628a + ", buyLot=" + this.f156629b + ", buyValue=" + this.f156630c + ", buyPercentage=" + this.d + ", buyPercentageText=" + this.f156631e + ", sellPercentage=" + this.f156632f + ", sellPercentageText=" + this.f156633g + ", sellLot=" + this.f156634h + ", sellValue=" + this.f156635i + ", preLot=" + this.f156636j + ", preFreq=" + this.f156637k + ", postLot=" + this.f156638l + ", postFreq=" + this.f156639m + ", totalLot=" + this.f156640n + ", totalFreq=" + this.f156641o + ", cellChartType=" + this.f156642p + ", isFutureTime=" + this.f156643q + ")";
    }

    public /* synthetic */ f(String r18, String r19, String r20, float r21, String r22, float r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, CellChartType r33, boolean r34, int r35, i r36) {
        String r2 = "";
        if ((r35 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r35 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r35 & 4) == 0) goto L13;
        String r4 = "";
    L14:
        float r6 = 0.0f;
        if ((r35 & 8) == 0) goto L17;
        float r5 = 0.0f;
    L19:
        if ((r35 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r35 & 32) != 0) goto L27;
        r6 = r23;
    L27:
        if ((r35 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r35 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r35 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r35 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r35 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r35 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r35 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r35 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = "";
    L58:
        String r182 = r1;
        if ((r35 & 16384) != 0) goto L63;
        r2 = r32;
    L63:
        if ((32768 & r35) == 0) goto L65;
        CellChartType r16 = CellChartType.NEUTRAL;
    L67:
        if ((r35 & 65536) == 0) goto L70;
        boolean r352 = false;
    L71:
        this(r182, r3, r4, r5, r7, r6, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r352);
        return;
    L70:
        r352 = r34;
        goto L71
    L65:
        r16 = r33;
        goto L67
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
    L21:
        r7 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L14
    L9:
        r3 = r19;
        goto L11
    L5:
        r1 = r18;
        goto L7
    }
}
