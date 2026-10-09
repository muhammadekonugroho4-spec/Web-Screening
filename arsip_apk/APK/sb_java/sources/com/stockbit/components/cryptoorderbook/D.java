package com.stockbit.components.cryptoorderbook;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.collections.AbstractC11777v;

/* loaded from: classes8.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f78314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f78315b;

    /* renamed from: c, reason: collision with root package name */
    public final String f78316c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f78317e;

    /* renamed from: f, reason: collision with root package name */
    public final String f78318f;

    /* renamed from: g, reason: collision with root package name */
    public final String f78319g;

    /* renamed from: h, reason: collision with root package name */
    public final PriceTone f78320h;

    /* renamed from: i, reason: collision with root package name */
    public final PriceTone f78321i;

    /* renamed from: j, reason: collision with root package name */
    public final PriceTone f78322j;

    /* renamed from: k, reason: collision with root package name */
    public final PriceTone f78323k;

    /* renamed from: l, reason: collision with root package name */
    public final String f78324l;

    /* renamed from: m, reason: collision with root package name */
    public final List f78325m;

    /* renamed from: n, reason: collision with root package name */
    public final List f78326n;

    static {
    }

    public D(String r2, String r3, String r4, String r5, String r6, String r7, String r8, PriceTone r9, PriceTone r10, PriceTone r11, PriceTone r12, String r13, List r14, List r15) {
        kotlin.jvm.internal.p.l(r2, "open");
        kotlin.jvm.internal.p.l(r3, Constants.PRIORITY_HIGH);
        kotlin.jvm.internal.p.l(r4, "low");
        kotlin.jvm.internal.p.l(r5, "prev");
        kotlin.jvm.internal.p.l(r6, "vol");
        kotlin.jvm.internal.p.l(r7, "value");
        kotlin.jvm.internal.p.l(r8, "avg");
        kotlin.jvm.internal.p.l(r9, "highTone");
        kotlin.jvm.internal.p.l(r10, "lowTone");
        kotlin.jvm.internal.p.l(r11, "valueTone");
        kotlin.jvm.internal.p.l(r12, "avgTone");
        kotlin.jvm.internal.p.l(r13, "coinSymbol");
        kotlin.jvm.internal.p.l(r14, "bidEntries");
        kotlin.jvm.internal.p.l(r15, "askEntries");
        this.f78314a = r2;
        this.f78315b = r3;
        this.f78316c = r4;
        this.d = r5;
        this.f78317e = r6;
        this.f78318f = r7;
        this.f78319g = r8;
        this.f78320h = r9;
        this.f78321i = r10;
        this.f78322j = r11;
        this.f78323k = r12;
        this.f78324l = r13;
        this.f78325m = r14;
        this.f78326n = r15;
    }

    public final List a() {
        return this.f78326n;
    }

    public final String b() {
        return this.f78319g;
    }

    public final PriceTone c() {
        return this.f78323k;
    }

    public final List d() {
        return this.f78325m;
    }

    public final String e() {
        return this.f78324l;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof D) == true) goto L8;
        return false;
    L8:
        D r52 = (D) r5;
        if (kotlin.jvm.internal.p.g(this.f78314a, r52.f78314a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f78315b, r52.f78315b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f78316c, r52.f78316c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f78317e, r52.f78317e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f78318f, r52.f78318f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f78319g, r52.f78319g) == true) goto L30;
        return false;
    L30:
        if (this.f78320h == r52.f78320h) goto L33;
        return false;
    L33:
        if (this.f78321i == r52.f78321i) goto L36;
        return false;
    L36:
        if (this.f78322j == r52.f78322j) goto L39;
        return false;
    L39:
        if (this.f78323k == r52.f78323k) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f78324l, r52.f78324l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f78325m, r52.f78325m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f78326n, r52.f78326n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f78315b;
    }

    public final PriceTone g() {
        return this.f78320h;
    }

    public final String h() {
        return this.f78316c;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f78314a.hashCode() * 31) + this.f78315b.hashCode()) * 31) + this.f78316c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f78317e.hashCode()) * 31) + this.f78318f.hashCode()) * 31) + this.f78319g.hashCode()) * 31) + this.f78320h.hashCode()) * 31) + this.f78321i.hashCode()) * 31) + this.f78322j.hashCode()) * 31) + this.f78323k.hashCode()) * 31) + this.f78324l.hashCode()) * 31) + this.f78325m.hashCode()) * 31) + this.f78326n.hashCode();
    }

    public final PriceTone i() {
        return this.f78321i;
    }

    public final String j() {
        return this.f78314a;
    }

    public final String k() {
        return this.f78318f;
    }

    public final PriceTone l() {
        return this.f78322j;
    }

    public final String m() {
        return this.f78317e;
    }

    public String toString() {
        return "CryptoOrderBookUIData(open=" + this.f78314a + ", high=" + this.f78315b + ", low=" + this.f78316c + ", prev=" + this.d + ", vol=" + this.f78317e + ", value=" + this.f78318f + ", avg=" + this.f78319g + ", highTone=" + this.f78320h + ", lowTone=" + this.f78321i + ", valueTone=" + this.f78322j + ", avgTone=" + this.f78323k + ", coinSymbol=" + this.f78324l + ", bidEntries=" + this.f78325m + ", askEntries=" + this.f78326n + ')';
    }

    public /* synthetic */ D(String r14, String r15, String r16, String r17, String r18, String r19, String r20, PriceTone r21, PriceTone r22, PriceTone r23, PriceTone r24, String r25, List r26, List r27, int r28, kotlin.jvm.internal.i r29) {
        String r2 = "";
        if ((r28 & 1) == 0) goto L6;
        r14 = "";
    L6:
        if ((r28 & 2) == 0) goto L8;
        String r1 = "";
    L10:
        if ((r28 & 4) == 0) goto L12;
        String r3 = "";
    L14:
        if ((r28 & 8) == 0) goto L16;
        String r4 = "";
    L18:
        if ((r28 & 16) == 0) goto L20;
        String r5 = "";
    L22:
        if ((r28 & 32) == 0) goto L24;
        String r6 = "";
    L26:
        if ((r28 & 64) == 0) goto L28;
        String r7 = "";
    L30:
        if ((r28 & 128) == 0) goto L32;
        PriceTone r8 = PriceTone.NEUTRAL;
    L34:
        if ((r28 & 256) == 0) goto L36;
        PriceTone r9 = PriceTone.NEUTRAL;
    L38:
        if ((r28 & 512) == 0) goto L40;
        PriceTone r10 = PriceTone.NEUTRAL;
    L42:
        if ((r28 & 1024) == 0) goto L44;
        PriceTone r11 = PriceTone.NEUTRAL;
    L46:
        if ((r28 & 2048) != 0) goto L50;
        r2 = r25;
    L50:
        if ((r28 & 4096) == 0) goto L52;
        List r12 = AbstractC11777v.o();
    L54:
        if ((r28 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        List r282 = AbstractC11777v.o();
    L58:
        this(r14, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r2, r12, r282);
        return;
    L57:
        r282 = r27;
        goto L58
    L52:
        r12 = r26;
        goto L54
    L44:
        r11 = r24;
        goto L46
    L40:
        r10 = r23;
        goto L42
    L36:
        r9 = r22;
        goto L38
    L32:
        r8 = r21;
        goto L34
    L28:
        r7 = r20;
        goto L30
    L24:
        r6 = r19;
        goto L26
    L20:
        r5 = r18;
        goto L22
    L16:
        r4 = r17;
        goto L18
    L12:
        r3 = r16;
        goto L14
    L8:
        r1 = r15;
        goto L10
    }
}
