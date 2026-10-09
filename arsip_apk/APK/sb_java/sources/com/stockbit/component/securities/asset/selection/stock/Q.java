package com.stockbit.component.securities.asset.selection.stock;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: s, reason: collision with root package name */
    public static final int f75298s = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f75299a;

    /* renamed from: b, reason: collision with root package name */
    public final String f75300b;

    /* renamed from: c, reason: collision with root package name */
    public final String f75301c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f75302e;

    /* renamed from: f, reason: collision with root package name */
    public final String f75303f;

    /* renamed from: g, reason: collision with root package name */
    public final String f75304g;

    /* renamed from: h, reason: collision with root package name */
    public final String f75305h;

    /* renamed from: i, reason: collision with root package name */
    public final String f75306i;

    /* renamed from: j, reason: collision with root package name */
    public final String f75307j;

    /* renamed from: k, reason: collision with root package name */
    public final String f75308k;

    /* renamed from: l, reason: collision with root package name */
    public final String f75309l;

    /* renamed from: m, reason: collision with root package name */
    public final String f75310m;

    /* renamed from: n, reason: collision with root package name */
    public final String f75311n;

    /* renamed from: o, reason: collision with root package name */
    public final String f75312o;

    /* renamed from: p, reason: collision with root package name */
    public final String f75313p;

    /* renamed from: q, reason: collision with root package name */
    public final String f75314q;

    /* renamed from: r, reason: collision with root package name */
    public final String f75315r;

    static {
    }

    public Q(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16, String r17, String r18) {
        this.f75299a = r1;
        this.f75300b = r2;
        this.f75301c = r3;
        this.d = r4;
        this.f75302e = r5;
        this.f75303f = r6;
        this.f75304g = r7;
        this.f75305h = r8;
        this.f75306i = r9;
        this.f75307j = r10;
        this.f75308k = r11;
        this.f75309l = r12;
        this.f75310m = r13;
        this.f75311n = r14;
        this.f75312o = r15;
        this.f75313p = r16;
        this.f75314q = r17;
        this.f75315r = r18;
    }

    public final String a() {
        return this.f75315r;
    }

    public final String b() {
        return this.f75311n;
    }

    public final String c() {
        return this.f75312o;
    }

    public final String d() {
        return this.f75313p;
    }

    public final String e() {
        return this.f75314q;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Q) == true) goto L8;
        return false;
    L8:
        Q r52 = (Q) r5;
        if (kotlin.jvm.internal.p.g(this.f75299a, r52.f75299a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f75300b, r52.f75300b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f75301c, r52.f75301c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f75302e, r52.f75302e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f75303f, r52.f75303f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f75304g, r52.f75304g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f75305h, r52.f75305h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f75306i, r52.f75306i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f75307j, r52.f75307j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f75308k, r52.f75308k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f75309l, r52.f75309l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f75310m, r52.f75310m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f75311n, r52.f75311n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f75312o, r52.f75312o) == true) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f75313p, r52.f75313p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f75314q, r52.f75314q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f75315r, r52.f75315r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.f75307j;
    }

    public final String g() {
        return this.f75308k;
    }

    public final String h() {
        return this.f75309l;
    }

    public int hashCode() {
        String r02 = this.f75299a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f75300b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f75301c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f75302e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f75303f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f75304g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f75305h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f75306i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f75307j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f75308k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f75309l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.f75310m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.f75311n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.f75312o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.f75313p;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.f75314q;
        if (r231 != null) goto L69;
        int r232 = 0;
    L70:
        int r020 = (r019 + r232) * 31;
        String r233 = this.f75315r;
        if (r233 == null) goto L75;
        r1 = r233.hashCode();
    L75:
        return r020 + r1;
    L69:
        r232 = r231.hashCode();
        goto L70
    L65:
        r230 = r229.hashCode();
        goto L66
    L61:
        r228 = r227.hashCode();
        goto L62
    L57:
        r226 = r225.hashCode();
        goto L58
    L53:
        r224 = r223.hashCode();
        goto L54
    L49:
        r222 = r221.hashCode();
        goto L50
    L45:
        r220 = r219.hashCode();
        goto L46
    L41:
        r218 = r217.hashCode();
        goto L42
    L37:
        r216 = r215.hashCode();
        goto L38
    L33:
        r214 = r213.hashCode();
        goto L34
    L29:
        r212 = r211.hashCode();
        goto L30
    L25:
        r210 = r29.hashCode();
        goto L26
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public final String i() {
        return this.f75310m;
    }

    public final String j() {
        return this.f75303f;
    }

    public final String k() {
        return this.f75304g;
    }

    public final String l() {
        return this.f75305h;
    }

    public final String m() {
        return this.f75306i;
    }

    public final String n() {
        return this.f75300b;
    }

    public final String o() {
        return this.f75301c;
    }

    public final String p() {
        return this.d;
    }

    public final String q() {
        return this.f75302e;
    }

    public final String r() {
        return this.f75299a;
    }

    public String toString() {
        return "StockSelectionSortTagIds(title=" + this.f75299a + ", pnlAscLabel=" + this.f75300b + ", pnlAscRadio=" + this.f75301c + ", pnlDescLabel=" + this.d + ", pnlDescRadio=" + this.f75302e + ", investedAscLabel=" + this.f75303f + ", investedAscRadio=" + this.f75304g + ", investedDescLabel=" + this.f75305h + ", investedDescRadio=" + this.f75306i + ", gainAscLabel=" + this.f75307j + ", gainAscRadio=" + this.f75308k + ", gainDescLabel=" + this.f75309l + ", gainDescRadio=" + this.f75310m + ", codeAscLabel=" + this.f75311n + ", codeAscRadio=" + this.f75312o + ", codeDescLabel=" + this.f75313p + ", codeDescRadio=" + this.f75314q + ", applyButton=" + this.f75315r + ')';
    }

    public /* synthetic */ Q(String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, int r38, kotlin.jvm.internal.i r39) {
        if ((r38 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r38 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r38 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r38 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r38 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r38 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r38 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r38 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r38 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r38 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r38 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r38 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r38 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r38 & 32768) == 0) goto L65;
        String r16 = null;
    L67:
        if ((r38 & 65536) == 0) goto L69;
        String r17 = null;
    L71:
        if ((r38 & 131072) == 0) goto L74;
        String r382 = null;
    L75:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r382);
        return;
    L74:
        r382 = r37;
        goto L75
    L69:
        r17 = r36;
        goto L71
    L65:
        r16 = r35;
        goto L67
    L61:
        r2 = r34;
        goto L63
    L57:
        r15 = r33;
        goto L59
    L53:
        r14 = r32;
        goto L55
    L49:
        r13 = r31;
        goto L51
    L45:
        r12 = r30;
        goto L47
    L41:
        r11 = r29;
        goto L43
    L37:
        r10 = r28;
        goto L39
    L33:
        r9 = r27;
        goto L35
    L29:
        r8 = r26;
        goto L31
    L25:
        r7 = r25;
        goto L27
    L21:
        r6 = r24;
        goto L23
    L17:
        r5 = r23;
        goto L19
    L13:
        r4 = r22;
        goto L15
    L9:
        r3 = r21;
        goto L11
    L5:
        r1 = r20;
        goto L7
    }
}
