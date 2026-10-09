package com.stockbit.company.ui.detail;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;

/* renamed from: com.stockbit.company.ui.detail.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6035f0 implements InterfaceC4094y {

    /* renamed from: u, reason: collision with root package name */
    public static final a f65611u = null;

    /* renamed from: v, reason: collision with root package name */
    public static final int f65612v = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f65613a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65614b;

    /* renamed from: c, reason: collision with root package name */
    public final String f65615c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f65616e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f65617f;

    /* renamed from: g, reason: collision with root package name */
    public final String f65618g;

    /* renamed from: h, reason: collision with root package name */
    public final String f65619h;

    /* renamed from: i, reason: collision with root package name */
    public final String f65620i;

    /* renamed from: j, reason: collision with root package name */
    public final String f65621j;

    /* renamed from: k, reason: collision with root package name */
    public final String f65622k;

    /* renamed from: l, reason: collision with root package name */
    public final String f65623l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f65624m;

    /* renamed from: n, reason: collision with root package name */
    public final String f65625n;

    /* renamed from: o, reason: collision with root package name */
    public final String f65626o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f65627p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f65628q;

    /* renamed from: r, reason: collision with root package name */
    public final String f65629r;

    /* renamed from: s, reason: collision with root package name */
    public final String f65630s;

    /* renamed from: t, reason: collision with root package name */
    public final String f65631t;

    /* renamed from: com.stockbit.company.ui.detail.f0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final C6035f0 a(Bundle r26) {
            kotlin.jvm.internal.p.l(r26, "bundle");
            r26.setClassLoader(C6035f0.class.getClassLoader());
            String r3 = null;
            if (r26.containsKey("companyDestination") == false) goto L5;
            String r5 = r26.getString("companyDestination");
        L7:
            if (r26.containsKey("companySymbol") == false) goto L9;
            String r6 = r26.getString("companySymbol");
        L11:
            if (r26.containsKey("companyName") == false) goto L13;
            String r7 = r26.getString("companyName");
        L15:
            if (r26.containsKey("companyLogo") == false) goto L17;
            String r8 = r26.getString("companyLogo");
        L19:
            if (r26.containsKey("companyStatus") == false) goto L21;
            String r9 = r26.getString("companyStatus");
        L23:
            if (r26.containsKey("companyNotations") == false) goto L25;
            String[] r10 = r26.getStringArray("companyNotations");
        L27:
            if (r26.containsKey("defaultTab") == false) goto L29;
            String r11 = r26.getString("defaultTab");
        L31:
            if (r26.containsKey("defaultCorpAction") == false) goto L33;
            String r12 = r26.getString("defaultCorpAction");
        L35:
            if (r26.containsKey("lastFormattedPrice") == false) goto L37;
            String r13 = r26.getString("lastFormattedPrice");
        L39:
            if (r26.containsKey("changes") == false) goto L41;
            String r14 = r26.getString("changes");
        L43:
            if (r26.containsKey("previous") == false) goto L45;
            String r15 = r26.getString("previous");
        L47:
            if (r26.containsKey("percentage") == false) goto L49;
            String r16 = r26.getString("percentage");
        L50:
            boolean r4 = false;
            if (r26.containsKey("isTradeAble") == false) goto L53;
            boolean r17 = r26.getBoolean("isTradeAble");
        L55:
            if (r26.containsKey("companyType") == false) goto L57;
            String r18 = r26.getString("companyType");
        L59:
            if (r26.containsKey("country") == false) goto L61;
            String r19 = r26.getString("country");
        L63:
            if (r26.containsKey("isUma") == false) goto L65;
            boolean r20 = r26.getBoolean("isUma");
        L67:
            if (r26.containsKey("isCorpActionActive") == false) goto L69;
            r4 = r26.getBoolean("isCorpActionActive");
        L69:
            boolean r21 = r4;
            if (r26.containsKey("corpActionText") == false) goto L72;
            String r22 = r26.getString("corpActionText");
        L74:
            if (r26.containsKey("corpActionLogo") == false) goto L76;
            String r23 = r26.getString("corpActionLogo");
        L78:
            if (r26.containsKey("filterTimeType") == false) goto L81;
            r3 = r26.getString("filterTimeType");
        L81:
            return new C6035f0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r3);
        L76:
            r23 = null;
            goto L78
        L72:
            r22 = null;
            goto L74
        L65:
            r20 = false;
            goto L67
        L61:
            r19 = null;
            goto L63
        L57:
            r18 = null;
            goto L59
        L53:
            r17 = false;
            goto L55
        L49:
            r16 = null;
            goto L50
        L45:
            r15 = null;
            goto L47
        L41:
            r14 = null;
            goto L43
        L37:
            r13 = null;
            goto L39
        L33:
            r12 = null;
            goto L35
        L29:
            r11 = null;
            goto L31
        L25:
            r10 = null;
            goto L27
        L21:
            r9 = null;
            goto L23
        L17:
            r8 = null;
            goto L19
        L13:
            r7 = null;
            goto L15
        L9:
            r6 = null;
            goto L11
        L5:
            r5 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f65611u = new a(null);
        f65612v = 8;
    }

    public C6035f0(String r1, String r2, String r3, String r4, String r5, String[] r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, String r14, String r15, boolean r16, boolean r17, String r18, String r19, String r20) {
        this.f65613a = r1;
        this.f65614b = r2;
        this.f65615c = r3;
        this.d = r4;
        this.f65616e = r5;
        this.f65617f = r6;
        this.f65618g = r7;
        this.f65619h = r8;
        this.f65620i = r9;
        this.f65621j = r10;
        this.f65622k = r11;
        this.f65623l = r12;
        this.f65624m = r13;
        this.f65625n = r14;
        this.f65626o = r15;
        this.f65627p = r16;
        this.f65628q = r17;
        this.f65629r = r18;
        this.f65630s = r19;
        this.f65631t = r20;
    }

    public static final C6035f0 fromBundle(Bundle r1) {
        return f65611u.a(r1);
    }

    public final String a() {
        return this.f65621j;
    }

    public final String b() {
        return this.f65613a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f65615c;
    }

    public final String[] e() {
        return this.f65617f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C6035f0) == true) goto L8;
        return false;
    L8:
        C6035f0 r52 = (C6035f0) r5;
        if (kotlin.jvm.internal.p.g(this.f65613a, r52.f65613a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f65614b, r52.f65614b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f65615c, r52.f65615c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f65616e, r52.f65616e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f65617f, r52.f65617f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f65618g, r52.f65618g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f65619h, r52.f65619h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f65620i, r52.f65620i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f65621j, r52.f65621j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f65622k, r52.f65622k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f65623l, r52.f65623l) == true) goto L45;
        return false;
    L45:
        if (this.f65624m == r52.f65624m) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f65625n, r52.f65625n) == true) goto L51;
        return false;
    L51:
        if (kotlin.jvm.internal.p.g(this.f65626o, r52.f65626o) == true) goto L54;
        return false;
    L54:
        if (this.f65627p == r52.f65627p) goto L57;
        return false;
    L57:
        if (this.f65628q == r52.f65628q) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f65629r, r52.f65629r) == true) goto L63;
        return false;
    L63:
        if (kotlin.jvm.internal.p.g(this.f65630s, r52.f65630s) == true) goto L66;
        return false;
    L66:
        if (kotlin.jvm.internal.p.g(this.f65631t, r52.f65631t) == true) goto L68;
        return false;
    L68:
        return true;
    }

    public final String f() {
        return this.f65616e;
    }

    public final String g() {
        return this.f65614b;
    }

    public final String h() {
        return this.f65625n;
    }

    public int hashCode() {
        String r02 = this.f65613a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f65614b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f65615c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        String r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.f65616e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String[] r29 = this.f65617f;
        if (r29 != null) goto L25;
        int r210 = 0;
    L26:
        int r09 = (r08 + r210) * 31;
        String r211 = this.f65618g;
        if (r211 != null) goto L29;
        int r212 = 0;
    L30:
        int r010 = (r09 + r212) * 31;
        String r213 = this.f65619h;
        if (r213 != null) goto L33;
        int r214 = 0;
    L34:
        int r011 = (r010 + r214) * 31;
        String r215 = this.f65620i;
        if (r215 != null) goto L37;
        int r216 = 0;
    L38:
        int r012 = (r011 + r216) * 31;
        String r217 = this.f65621j;
        if (r217 != null) goto L41;
        int r218 = 0;
    L42:
        int r013 = (r012 + r218) * 31;
        String r219 = this.f65622k;
        if (r219 != null) goto L45;
        int r220 = 0;
    L46:
        int r014 = (r013 + r220) * 31;
        String r221 = this.f65623l;
        if (r221 != null) goto L49;
        int r222 = 0;
    L50:
        int r015 = (((r014 + r222) * 31) + Boolean.hashCode(this.f65624m)) * 31;
        String r223 = this.f65625n;
        if (r223 != null) goto L53;
        int r224 = 0;
    L54:
        int r016 = (r015 + r224) * 31;
        String r225 = this.f65626o;
        if (r225 != null) goto L57;
        int r226 = 0;
    L58:
        int r017 = (((((r016 + r226) * 31) + Boolean.hashCode(this.f65627p)) * 31) + Boolean.hashCode(this.f65628q)) * 31;
        String r227 = this.f65629r;
        if (r227 != null) goto L61;
        int r228 = 0;
    L62:
        int r018 = (r017 + r228) * 31;
        String r229 = this.f65630s;
        if (r229 != null) goto L65;
        int r230 = 0;
    L66:
        int r019 = (r018 + r230) * 31;
        String r231 = this.f65631t;
        if (r231 == null) goto L71;
        r1 = r231.hashCode();
    L71:
        return r019 + r1;
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
        r210 = Arrays.hashCode(r29);
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
        return this.f65630s;
    }

    public final String j() {
        return this.f65629r;
    }

    public final String k() {
        return this.f65626o;
    }

    public final String l() {
        return this.f65619h;
    }

    public final String m() {
        return this.f65618g;
    }

    public final String n() {
        return this.f65631t;
    }

    public final String o() {
        return this.f65620i;
    }

    public final String p() {
        return this.f65623l;
    }

    public final String q() {
        return this.f65622k;
    }

    public final boolean r() {
        return this.f65628q;
    }

    public final boolean s() {
        return this.f65624m;
    }

    public final boolean t() {
        return this.f65627p;
    }

    public String toString() {
        return "CompanyDetailFragmentArgs(companyDestination=" + this.f65613a + ", companySymbol=" + this.f65614b + ", companyName=" + this.f65615c + ", companyLogo=" + this.d + ", companyStatus=" + this.f65616e + ", companyNotations=" + Arrays.toString(this.f65617f) + ", defaultTab=" + this.f65618g + ", defaultCorpAction=" + this.f65619h + ", lastFormattedPrice=" + this.f65620i + ", changes=" + this.f65621j + ", previous=" + this.f65622k + ", percentage=" + this.f65623l + ", isTradeAble=" + this.f65624m + ", companyType=" + this.f65625n + ", country=" + this.f65626o + ", isUma=" + this.f65627p + ", isCorpActionActive=" + this.f65628q + ", corpActionText=" + this.f65629r + ", corpActionLogo=" + this.f65630s + ", filterTimeType=" + this.f65631t + ')';
    }

    public final Bundle u() {
        Bundle r02 = new Bundle();
        r02.putString("companyDestination", this.f65613a);
        r02.putString("companySymbol", this.f65614b);
        r02.putString("companyName", this.f65615c);
        r02.putString("companyLogo", this.d);
        r02.putString("companyStatus", this.f65616e);
        r02.putStringArray("companyNotations", this.f65617f);
        r02.putString("defaultTab", this.f65618g);
        r02.putString("defaultCorpAction", this.f65619h);
        r02.putString("lastFormattedPrice", this.f65620i);
        r02.putString("changes", this.f65621j);
        r02.putString("previous", this.f65622k);
        r02.putString("percentage", this.f65623l);
        r02.putBoolean("isTradeAble", this.f65624m);
        r02.putString("companyType", this.f65625n);
        r02.putString("country", this.f65626o);
        r02.putBoolean("isUma", this.f65627p);
        r02.putBoolean("isCorpActionActive", this.f65628q);
        r02.putString("corpActionText", this.f65629r);
        r02.putString("corpActionLogo", this.f65630s);
        r02.putString("filterTimeType", this.f65631t);
        return r02;
    }

    public /* synthetic */ C6035f0(String r22, String r23, String r24, String r25, String r26, String[] r27, String r28, String r29, String r30, String r31, String r32, String r33, boolean r34, String r35, String r36, boolean r37, boolean r38, String r39, String r40, String r41, int r42, kotlin.jvm.internal.i r43) {
        if ((r42 & 1) == 0) goto L5;
        String r1 = null;
    L7:
        if ((r42 & 2) == 0) goto L9;
        String r3 = null;
    L11:
        if ((r42 & 4) == 0) goto L13;
        String r4 = null;
    L15:
        if ((r42 & 8) == 0) goto L17;
        String r5 = null;
    L19:
        if ((r42 & 16) == 0) goto L21;
        String r6 = null;
    L23:
        if ((r42 & 32) == 0) goto L25;
        String[] r7 = null;
    L27:
        if ((r42 & 64) == 0) goto L29;
        String r8 = null;
    L31:
        if ((r42 & 128) == 0) goto L33;
        String r9 = null;
    L35:
        if ((r42 & 256) == 0) goto L37;
        String r10 = null;
    L39:
        if ((r42 & 512) == 0) goto L41;
        String r11 = null;
    L43:
        if ((r42 & 1024) == 0) goto L45;
        String r12 = null;
    L47:
        if ((r42 & 2048) == 0) goto L49;
        String r13 = null;
    L51:
        if ((r42 & 4096) == 0) goto L53;
        boolean r14 = false;
    L55:
        if ((r42 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r2 = null;
    L59:
        if ((r42 & 16384) == 0) goto L61;
        String r15 = null;
    L63:
        if ((r42 & 32768) == 0) goto L65;
        boolean r16 = false;
    L67:
        if ((r42 & 65536) == 0) goto L69;
        boolean r17 = false;
    L71:
        if ((r42 & 131072) == 0) goto L73;
        String r18 = null;
    L75:
        if ((r42 & 262144) == 0) goto L77;
        String r19 = null;
    L79:
        if ((r42 & 524288) == 0) goto L82;
        String r422 = null;
    L83:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r2, r15, r16, r17, r18, r19, r422);
        return;
    L82:
        r422 = r41;
        goto L83
    L77:
        r19 = r40;
        goto L79
    L73:
        r18 = r39;
        goto L75
    L69:
        r17 = r38;
        goto L71
    L65:
        r16 = r37;
        goto L67
    L61:
        r15 = r36;
        goto L63
    L57:
        r2 = r35;
        goto L59
    L53:
        r14 = r34;
        goto L55
    L49:
        r13 = r33;
        goto L51
    L45:
        r12 = r32;
        goto L47
    L41:
        r11 = r31;
        goto L43
    L37:
        r10 = r30;
        goto L39
    L33:
        r9 = r29;
        goto L35
    L29:
        r8 = r28;
        goto L31
    L25:
        r7 = r27;
        goto L27
    L21:
        r6 = r26;
        goto L23
    L17:
        r5 = r25;
        goto L19
    L13:
        r4 = r24;
        goto L15
    L9:
        r3 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L7
    }
}
