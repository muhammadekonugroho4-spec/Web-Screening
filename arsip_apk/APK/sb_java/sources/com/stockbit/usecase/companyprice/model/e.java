package com.stockbit.usecase.companyprice.model;

import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f156986a;

    /* renamed from: b, reason: collision with root package name */
    public final double f156987b;

    /* renamed from: c, reason: collision with root package name */
    public final double f156988c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f156989e;

    /* renamed from: f, reason: collision with root package name */
    public final double f156990f;

    /* renamed from: g, reason: collision with root package name */
    public final double f156991g;

    /* renamed from: h, reason: collision with root package name */
    public final double f156992h;

    /* renamed from: i, reason: collision with root package name */
    public final double f156993i;

    /* renamed from: j, reason: collision with root package name */
    public final double f156994j;

    /* renamed from: k, reason: collision with root package name */
    public final double f156995k;

    /* renamed from: l, reason: collision with root package name */
    public final double f156996l;

    public e(double r1, double r3, double r5, double r7, double r9, double r11, double r13, double r15, double r17, double r19, double r21, double r23) {
        this.f156986a = r1;
        this.f156987b = r3;
        this.f156988c = r5;
        this.d = r7;
        this.f156989e = r9;
        this.f156990f = r11;
        this.f156991g = r13;
        this.f156992h = r15;
        this.f156993i = r17;
        this.f156994j = r19;
        this.f156995k = r21;
        this.f156996l = r23;
    }

    public final double a() {
        return this.f156993i;
    }

    public final double b() {
        return this.d;
    }

    public final double c() {
        return this.f156989e;
    }

    public final double d() {
        return this.f156990f;
    }

    public final double e() {
        return this.f156995k;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f156986a, r82.f156986a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f156987b, r82.f156987b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f156988c, r82.f156988c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f156989e, r82.f156989e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f156990f, r82.f156990f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f156991g, r82.f156991g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f156992h, r82.f156992h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f156993i, r82.f156993i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f156994j, r82.f156994j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f156995k, r82.f156995k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f156996l, r82.f156996l) == 0) goto L44;
        return false;
    L44:
        return true;
    }

    public final double f() {
        return this.f156987b;
    }

    public final double g() {
        return this.f156996l;
    }

    public final double h() {
        return this.f156988c;
    }

    public int hashCode() {
        return (((((((((((((((((((((Double.hashCode(this.f156986a) * 31) + Double.hashCode(this.f156987b)) * 31) + Double.hashCode(this.f156988c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f156989e)) * 31) + Double.hashCode(this.f156990f)) * 31) + Double.hashCode(this.f156991g)) * 31) + Double.hashCode(this.f156992h)) * 31) + Double.hashCode(this.f156993i)) * 31) + Double.hashCode(this.f156994j)) * 31) + Double.hashCode(this.f156995k)) * 31) + Double.hashCode(this.f156996l);
    }

    public final double i() {
        return this.f156986a;
    }

    public final double j() {
        return this.f156994j;
    }

    public final double k() {
        return this.f156992h;
    }

    public final double l() {
        return this.f156991g;
    }

    public String toString() {
        return "LivePriceUiState(open=" + this.f156986a + ", high=" + this.f156987b + ", low=" + this.f156988c + ", change=" + this.d + ", foreignBuy=" + this.f156989e + ", foreignSell=" + this.f156990f + ", volume=" + this.f156991g + ", value=" + this.f156992h + ", averagePrice=" + this.f156993i + ", previous=" + this.f156994j + ", frequency=" + this.f156995k + ", lastPrice=" + this.f156996l + ")";
    }

    public /* synthetic */ e(double r27, double r29, double r31, double r33, double r35, double r37, double r39, double r41, double r43, double r45, double r47, double r49, int r51, i r52) {
        if ((r51 & 1) == 0) goto L5;
        double r4 = 0.0d;
    L7:
        if ((r51 & 2) == 0) goto L9;
        double r6 = 0.0d;
    L11:
        if ((r51 & 4) == 0) goto L13;
        double r8 = 0.0d;
    L15:
        if ((r51 & 8) == 0) goto L17;
        double r10 = 0.0d;
    L19:
        if ((r51 & 16) == 0) goto L21;
        double r12 = 0.0d;
    L23:
        if ((r51 & 32) == 0) goto L25;
        double r14 = 0.0d;
    L27:
        if ((r51 & 64) == 0) goto L29;
        double r16 = 0.0d;
    L31:
        if ((r51 & 128) == 0) goto L33;
        double r18 = 0.0d;
    L35:
        if ((r51 & 256) == 0) goto L37;
        double r20 = 0.0d;
    L39:
        if ((r51 & 512) == 0) goto L41;
        double r22 = 0.0d;
    L43:
        if ((r51 & 1024) == 0) goto L45;
        double r24 = 0.0d;
    L47:
        if ((r51 & 2048) == 0) goto L50;
        double r50 = 0.0d;
    L51:
        this(r4, r6, r8, r10, r12, r14, r16, r18, r20, r22, r24, r50);
        return;
    L50:
        r50 = r49;
        goto L51
    L45:
        r24 = r47;
        goto L47
    L41:
        r22 = r45;
        goto L43
    L37:
        r20 = r43;
        goto L39
    L33:
        r18 = r41;
        goto L35
    L29:
        r16 = r39;
        goto L31
    L25:
        r14 = r37;
        goto L27
    L21:
        r12 = r35;
        goto L23
    L17:
        r10 = r33;
        goto L19
    L13:
        r8 = r31;
        goto L15
    L9:
        r6 = r29;
        goto L11
    L5:
        r4 = r27;
        goto L7
    }
}
