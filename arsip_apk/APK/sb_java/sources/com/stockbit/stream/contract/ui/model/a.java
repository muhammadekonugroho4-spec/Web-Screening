package com.stockbit.stream.contract.ui.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f139582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139583b;

    /* renamed from: c, reason: collision with root package name */
    public final String f139584c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f139585e;

    /* renamed from: f, reason: collision with root package name */
    public final String f139586f;

    /* renamed from: g, reason: collision with root package name */
    public final String f139587g;

    /* renamed from: h, reason: collision with root package name */
    public final String f139588h;

    /* renamed from: i, reason: collision with root package name */
    public final String f139589i;

    /* renamed from: j, reason: collision with root package name */
    public final String f139590j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f139591k;

    /* renamed from: l, reason: collision with root package name */
    public final String f139592l;

    /* renamed from: m, reason: collision with root package name */
    public final String f139593m;

    /* renamed from: n, reason: collision with root package name */
    public final String f139594n;

    /* renamed from: o, reason: collision with root package name */
    public final String f139595o;

    public a(String r1, String r2, String r3, int r4, boolean r5, String r6, String r7, String r8, String r9, String r10, boolean r11, String r12, String r13, String r14, String r15) {
        this.f139582a = r1;
        this.f139583b = r2;
        this.f139584c = r3;
        this.d = r4;
        this.f139585e = r5;
        this.f139586f = r6;
        this.f139587g = r7;
        this.f139588h = r8;
        this.f139589i = r9;
        this.f139590j = r10;
        this.f139591k = r11;
        this.f139592l = r12;
        this.f139593m = r13;
        this.f139594n = r14;
        this.f139595o = r15;
    }

    public final String a() {
        return this.f139582a;
    }

    public final String b() {
        return this.f139586f;
    }

    public final String c() {
        return this.f139587g;
    }

    public final boolean d() {
        return this.f139591k;
    }

    public final String e() {
        return this.f139592l;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f139582a, r52.f139582a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f139583b, r52.f139583b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f139584c, r52.f139584c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f139585e == r52.f139585e) goto L24;
        return false;
    L24:
        if (p.g(this.f139586f, r52.f139586f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f139587g, r52.f139587g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f139588h, r52.f139588h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f139589i, r52.f139589i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f139590j, r52.f139590j) == true) goto L39;
        return false;
    L39:
        if (this.f139591k == r52.f139591k) goto L42;
        return false;
    L42:
        if (p.g(this.f139592l, r52.f139592l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f139593m, r52.f139593m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f139594n, r52.f139594n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f139595o, r52.f139595o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f139590j;
    }

    public final String g() {
        return this.f139588h;
    }

    public final String h() {
        return this.f139589i;
    }

    public int hashCode() {
        String r02 = this.f139582a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f139583b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f139584c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (((((r05 + r24) * 31) + Integer.hashCode(this.d)) * 31) + Boolean.hashCode(this.f139585e)) * 31;
        String r25 = this.f139586f;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f139587g;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.f139588h;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f139589i;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f139590j;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (((r010 + r214) * 31) + Boolean.hashCode(this.f139591k)) * 31;
        String r215 = this.f139592l;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f139593m;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f139594n;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f139595o;
        if (r221 == null) goto L51;
        r1 = r221.hashCode();
    L51:
        return r014 + r1;
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
        return this.f139583b;
    }

    public final String j() {
        return this.f139584c;
    }

    public final boolean k() {
        return this.f139585e;
    }

    public final String l() {
        return this.f139593m;
    }

    public String toString() {
        return "CreatePostNavParamModel(composeStringData=" + this.f139582a + ", streamAttachedSymbol=" + this.f139583b + ", streamAttachedUser=" + this.f139584c + ", streamItemPosition=" + this.d + ", streamIsWantRepost=" + this.f139585e + ", imagePath=" + this.f139586f + ", imagePathFromShareIntent=" + this.f139587g + ", parcelLiveStreamId=" + this.f139588h + ", parcelLiveStreamTitle=" + this.f139589i + ", parcelLiveStreamCode=" + this.f139590j + ", liveStreamIsWantRepost=" + this.f139591k + ", pageContext=" + this.f139592l + ", streamType=" + this.f139593m + ", limitationType=" + this.f139594n + ", postId=" + this.f139595o + ')';
    }

    public /* synthetic */ a(String r17, String r18, String r19, int r20, boolean r21, String r22, String r23, String r24, String r25, String r26, boolean r27, String r28, String r29, String r30, String r31, int r32, i r33) {
        if ((r32 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r32 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r32 & 4) == 0) goto L13;
        String r4 = null;
    L14:
        boolean r6 = false;
        if ((r32 & 8) == 0) goto L17;
        int r5 = 0;
    L19:
        if ((r32 & 16) == 0) goto L21;
        boolean r7 = false;
    L23:
        if ((r32 & 32) == 0) goto L25;
        String r8 = null;
    L27:
        if ((r32 & 64) == 0) goto L29;
        String r9 = null;
    L31:
        if ((r32 & 128) == 0) goto L33;
        String r10 = null;
    L35:
        if ((r32 & 256) == 0) goto L37;
        String r11 = null;
    L39:
        if ((r32 & 512) == 0) goto L41;
        String r12 = null;
    L43:
        if ((r32 & 1024) != 0) goto L47;
        r6 = r27;
    L47:
        if ((r32 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r32 & 4096) == 0) goto L53;
        String r14 = null;
    L55:
        if ((r32 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = null;
    L59:
        if ((r32 & 16384) == 0) goto L62;
        String r322 = null;
    L63:
        this(r1, r3, r4, r5, r7, r8, r9, r10, r11, r12, r6, r13, r14, r15, r322);
        return;
    L62:
        r322 = r31;
        goto L63
    L57:
        r15 = r30;
        goto L59
    L53:
        r14 = r29;
        goto L55
    L49:
        r13 = r28;
        goto L51
    L41:
        r12 = r26;
        goto L43
    L37:
        r11 = r25;
        goto L39
    L33:
        r10 = r24;
        goto L35
    L29:
        r9 = r23;
        goto L31
    L25:
        r8 = r22;
        goto L27
    L21:
        r7 = r21;
        goto L23
    L17:
        r5 = r20;
        goto L19
    L13:
        r4 = r19;
        goto L14
    L9:
        r3 = r18;
        goto L11
    L5:
        r1 = r17;
        goto L7
    }
}
