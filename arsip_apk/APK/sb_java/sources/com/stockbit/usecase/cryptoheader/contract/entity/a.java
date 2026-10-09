package com.stockbit.usecase.cryptoheader.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157114a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157115b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157116c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final b f157117e;

    /* renamed from: f, reason: collision with root package name */
    public final b f157118f;

    /* renamed from: g, reason: collision with root package name */
    public final b f157119g;

    /* renamed from: h, reason: collision with root package name */
    public final b f157120h;

    /* renamed from: i, reason: collision with root package name */
    public final b f157121i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f157122j;

    /* renamed from: k, reason: collision with root package name */
    public final String f157123k;

    /* renamed from: l, reason: collision with root package name */
    public final List f157124l;

    /* renamed from: m, reason: collision with root package name */
    public final List f157125m;

    public a(String r2, String r3, String r4, String r5, b r6, b r7, b r8, b r9, b r10, boolean r11, String r12, List r13, List r14) {
        p.l(r2, "companyId");
        p.l(r3, "coinSymbol");
        p.l(r4, "coinName");
        p.l(r5, "coinLogo");
        p.l(r6, "idrPrice");
        p.l(r7, "idrChange");
        p.l(r8, "idrChangePct");
        p.l(r9, "idrOpen");
        p.l(r10, "usdPrice");
        p.l(r12, "usdSymbol");
        p.l(r13, "relatedSymbols");
        p.l(r14, "catalogNames");
        this.f157114a = r2;
        this.f157115b = r3;
        this.f157116c = r4;
        this.d = r5;
        this.f157117e = r6;
        this.f157118f = r7;
        this.f157119g = r8;
        this.f157120h = r9;
        this.f157121i = r10;
        this.f157122j = r11;
        this.f157123k = r12;
        this.f157124l = r13;
        this.f157125m = r14;
    }

    public static /* synthetic */ a b(a r12, String r13, String r14, String r15, String r16, b r17, b r18, b r19, b r20, b r21, boolean r22, String r23, List r24, List r25, int r26, Object r27) {
        if ((r26 & 1) == 0) goto L6;
        r13 = r12.f157114a;
    L6:
        if ((r26 & 2) == 0) goto L8;
        String r1 = r12.f157115b;
    L10:
        if ((r26 & 4) == 0) goto L12;
        String r2 = r12.f157116c;
    L14:
        if ((r26 & 8) == 0) goto L16;
        String r3 = r12.d;
    L18:
        if ((r26 & 16) == 0) goto L20;
        b r4 = r12.f157117e;
    L22:
        if ((r26 & 32) == 0) goto L24;
        b r5 = r12.f157118f;
    L26:
        if ((r26 & 64) == 0) goto L28;
        b r6 = r12.f157119g;
    L30:
        if ((r26 & 128) == 0) goto L32;
        b r7 = r12.f157120h;
    L34:
        if ((r26 & 256) == 0) goto L36;
        b r8 = r12.f157121i;
    L38:
        if ((r26 & 512) == 0) goto L40;
        boolean r9 = r12.f157122j;
    L42:
        if ((r26 & 1024) == 0) goto L44;
        String r10 = r12.f157123k;
    L46:
        if ((r26 & 2048) == 0) goto L48;
        List r11 = r12.f157124l;
    L50:
        if ((r26 & 4096) == 0) goto L53;
        List r272 = r12.f157125m;
    L55:
        return r12.a(r13, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r272);
    L53:
        r272 = r25;
        goto L55
    L48:
        r11 = r24;
        goto L50
    L44:
        r10 = r23;
        goto L46
    L40:
        r9 = r22;
        goto L42
    L36:
        r8 = r21;
        goto L38
    L32:
        r7 = r20;
        goto L34
    L28:
        r6 = r19;
        goto L30
    L24:
        r5 = r18;
        goto L26
    L20:
        r4 = r17;
        goto L22
    L16:
        r3 = r16;
        goto L18
    L12:
        r2 = r15;
        goto L14
    L8:
        r1 = r14;
        goto L10
    }

    public final a a(String r16, String r17, String r18, String r19, b r20, b r21, b r22, b r23, b r24, boolean r25, String r26, List r27, List r28) {
        p.l(r16, "companyId");
        p.l(r17, "coinSymbol");
        p.l(r18, "coinName");
        p.l(r19, "coinLogo");
        p.l(r20, "idrPrice");
        p.l(r21, "idrChange");
        p.l(r22, "idrChangePct");
        p.l(r23, "idrOpen");
        p.l(r24, "usdPrice");
        p.l(r26, "usdSymbol");
        p.l(r27, "relatedSymbols");
        p.l(r28, "catalogNames");
        return new a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28);
    }

    public final List c() {
        return this.f157125m;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f157116c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157114a, r52.f157114a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157115b, r52.f157115b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157116c, r52.f157116c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157117e, r52.f157117e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157118f, r52.f157118f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157119g, r52.f157119g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157120h, r52.f157120h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157121i, r52.f157121i) == true) goto L36;
        return false;
    L36:
        if (this.f157122j == r52.f157122j) goto L39;
        return false;
    L39:
        if (p.g(this.f157123k, r52.f157123k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f157124l, r52.f157124l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f157125m, r52.f157125m) == true) goto L47;
        return false;
    L47:
        return true;
    }

    public final String f() {
        return this.f157115b;
    }

    public final String g() {
        return this.f157114a;
    }

    public final b h() {
        return this.f157118f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f157114a.hashCode() * 31) + this.f157115b.hashCode()) * 31) + this.f157116c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157117e.hashCode()) * 31) + this.f157118f.hashCode()) * 31) + this.f157119g.hashCode()) * 31) + this.f157120h.hashCode()) * 31) + this.f157121i.hashCode()) * 31) + Boolean.hashCode(this.f157122j)) * 31) + this.f157123k.hashCode()) * 31) + this.f157124l.hashCode()) * 31) + this.f157125m.hashCode();
    }

    public final b i() {
        return this.f157119g;
    }

    public final b j() {
        return this.f157120h;
    }

    public final b k() {
        return this.f157117e;
    }

    public final List l() {
        return this.f157124l;
    }

    public final b m() {
        return this.f157121i;
    }

    public final String n() {
        return this.f157123k;
    }

    public final boolean o() {
        return this.f157122j;
    }

    public String toString() {
        return "CryptoPriceEntity(companyId=" + this.f157114a + ", coinSymbol=" + this.f157115b + ", coinName=" + this.f157116c + ", coinLogo=" + this.d + ", idrPrice=" + this.f157117e + ", idrChange=" + this.f157118f + ", idrChangePct=" + this.f157119g + ", idrOpen=" + this.f157120h + ", usdPrice=" + this.f157121i + ", isPositive=" + this.f157122j + ", usdSymbol=" + this.f157123k + ", relatedSymbols=" + this.f157124l + ", catalogNames=" + this.f157125m + ")";
    }
}
