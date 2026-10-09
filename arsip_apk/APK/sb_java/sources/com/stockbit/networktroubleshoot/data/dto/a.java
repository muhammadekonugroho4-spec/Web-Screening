package com.stockbit.networktroubleshoot.data.dto;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f122580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122581b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122582c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f122583e;

    /* renamed from: f, reason: collision with root package name */
    public final String f122584f;

    /* renamed from: g, reason: collision with root package name */
    public final String f122585g;

    /* renamed from: h, reason: collision with root package name */
    public final String f122586h;

    /* renamed from: i, reason: collision with root package name */
    public final String f122587i;

    /* renamed from: j, reason: collision with root package name */
    public final String f122588j;

    /* renamed from: k, reason: collision with root package name */
    public final String f122589k;

    /* renamed from: l, reason: collision with root package name */
    public final String f122590l;

    /* renamed from: m, reason: collision with root package name */
    public final String f122591m;

    /* renamed from: n, reason: collision with root package name */
    public final String f122592n;

    /* renamed from: o, reason: collision with root package name */
    public final String f122593o;

    /* renamed from: p, reason: collision with root package name */
    public final String f122594p;

    public a(String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15, String r16) {
        this.f122580a = r1;
        this.f122581b = r2;
        this.f122582c = r3;
        this.d = r4;
        this.f122583e = r5;
        this.f122584f = r6;
        this.f122585g = r7;
        this.f122586h = r8;
        this.f122587i = r9;
        this.f122588j = r10;
        this.f122589k = r11;
        this.f122590l = r12;
        this.f122591m = r13;
        this.f122592n = r14;
        this.f122593o = r15;
        this.f122594p = r16;
    }

    public final String a() {
        return this.f122585g;
    }

    public final String b() {
        return this.f122580a;
    }

    public final String c() {
        return this.f122592n;
    }

    public final String d() {
        return this.f122581b;
    }

    public final String e() {
        return this.f122587i;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f122580a, r52.f122580a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f122581b, r52.f122581b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f122582c, r52.f122582c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f122583e, r52.f122583e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f122584f, r52.f122584f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f122585g, r52.f122585g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f122586h, r52.f122586h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f122587i, r52.f122587i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f122588j, r52.f122588j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f122589k, r52.f122589k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f122590l, r52.f122590l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f122591m, r52.f122591m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f122592n, r52.f122592n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f122593o, r52.f122593o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f122594p, r52.f122594p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f122582c;
    }

    public final String g() {
        return this.f122594p;
    }

    public final String h() {
        return this.f122588j;
    }

    public int hashCode() {
        String r02 = this.f122580a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f122581b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f122582c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f122583e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f122584f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f122585g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f122586h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f122587i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f122588j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f122589k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f122590l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (r014 + r222) * 31;
        String r223 = this.f122591m;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.f122592n;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (r016 + r226) * 31;
        String r227 = this.f122593o;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.f122594p;
        if (r229 == null) goto L67;
        r1 = r229.hashCode();
    L67:
        return r018 + r1;
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
        return this.f122593o;
    }

    public final String j() {
        return this.f122586h;
    }

    public final String k() {
        return this.f122590l;
    }

    public final String l() {
        return this.f122589k;
    }

    public final String m() {
        return this.d;
    }

    public final String n() {
        return this.f122584f;
    }

    public final String o() {
        return this.f122583e;
    }

    public final String p() {
        return this.f122591m;
    }

    public String toString() {
        return "CdnTraceBasicDTO(fl=" + this.f122580a + ", h=" + this.f122581b + ", ip=" + this.f122582c + ", ts=" + this.d + ", visitScheme=" + this.f122583e + ", userAgent=" + this.f122584f + ", colo=" + this.f122585g + ", sliver=" + this.f122586h + ", http=" + this.f122587i + ", loc=" + this.f122588j + ", tls=" + this.f122589k + ", sni=" + this.f122590l + ", warp=" + this.f122591m + ", gateway=" + this.f122592n + ", rbi=" + this.f122593o + ", kex=" + this.f122594p + ')';
    }

    public /* synthetic */ a(String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, int r34, i r35) {
        if ((r34 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r34 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r34 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r34 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r34 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r34 & 32) == 0) goto L25;
        String r7 = null;
    L27:
        if ((r34 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r34 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r34 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r34 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r34 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r34 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r34 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r34 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r34 & 16384) == 0) goto L61;
        String r2 = null;
    L63:
        if ((r34 & 32768) == 0) goto L66;
        String r342 = null;
    L67:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r342);
        return;
    L66:
        r342 = r33;
        goto L67
    L61:
        r2 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L59
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
        r1 = r18;
        goto L7
    }
}
