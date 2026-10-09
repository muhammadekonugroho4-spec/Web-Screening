package com.stockbit.domain.model.securities.order;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f85394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85395b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85396c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f85397e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f85398f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85399g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85400h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85401i;

    /* renamed from: j, reason: collision with root package name */
    public final double f85402j;

    /* renamed from: k, reason: collision with root package name */
    public final double f85403k;

    /* renamed from: l, reason: collision with root package name */
    public final double f85404l;

    /* renamed from: m, reason: collision with root package name */
    public final String f85405m;

    /* renamed from: n, reason: collision with root package name */
    public final String f85406n;

    public b(String r4, String r5, double r6, String r8, double r9, boolean r11, String r12, String r13, double r14, double r16, double r18, double r20, String r22, String r23) {
        p.l(r4, Constants.KEY_ID);
        p.l(r5, "symbol");
        p.l(r8, "side");
        p.l(r12, "statusText");
        p.l(r13, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r22, "platformOrderType");
        p.l(r23, "orderType");
        this.f85394a = r4;
        this.f85395b = r5;
        this.f85396c = r6;
        this.d = r8;
        this.f85397e = r9;
        this.f85398f = r11;
        this.f85399g = r12;
        this.f85400h = r13;
        this.f85401i = r14;
        this.f85402j = r16;
        this.f85403k = r18;
        this.f85404l = r20;
        this.f85405m = r22;
        this.f85406n = r23;
    }

    public final double a() {
        return this.f85396c;
    }

    public final String b() {
        return this.f85394a;
    }

    public final String c() {
        return this.f85400h;
    }

    public final double d() {
        return this.f85404l;
    }

    public final String e() {
        return this.f85406n;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f85394a, r82.f85394a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85395b, r82.f85395b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85396c, r82.f85396c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f85397e, r82.f85397e) == 0) goto L24;
        return false;
    L24:
        if (this.f85398f == r82.f85398f) goto L27;
        return false;
    L27:
        if (p.g(this.f85399g, r82.f85399g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85400h, r82.f85400h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85401i, r82.f85401i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f85402j, r82.f85402j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f85403k, r82.f85403k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f85404l, r82.f85404l) == 0) goto L45;
        return false;
    L45:
        if (p.g(this.f85405m, r82.f85405m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f85406n, r82.f85406n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f85405m;
    }

    public final double g() {
        return this.f85397e;
    }

    public final double h() {
        return this.f85401i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f85394a.hashCode() * 31) + this.f85395b.hashCode()) * 31) + Double.hashCode(this.f85396c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f85397e)) * 31) + Boolean.hashCode(this.f85398f)) * 31) + this.f85399g.hashCode()) * 31) + this.f85400h.hashCode()) * 31) + Double.hashCode(this.f85401i)) * 31) + Double.hashCode(this.f85402j)) * 31) + Double.hashCode(this.f85403k)) * 31) + Double.hashCode(this.f85404l)) * 31) + this.f85405m.hashCode()) * 31) + this.f85406n.hashCode();
    }

    public final double i() {
        return this.f85403k;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f85399g;
    }

    public final String l() {
        return this.f85395b;
    }

    public final boolean m() {
        return this.f85398f;
    }

    public String toString() {
        return "BracketOrderChildrenEntity(id=" + this.f85394a + ", symbol=" + this.f85395b + ", amount=" + this.f85396c + ", side=" + this.d + ", price=" + this.f85397e + ", isGtc=" + this.f85398f + ", statusText=" + this.f85399g + ", label=" + this.f85400h + ", pricePercentage=" + this.f85401i + ", buyPrice=" + this.f85402j + ", proceedFee=" + this.f85403k + ", lotOrdered=" + this.f85404l + ", platformOrderType=" + this.f85405m + ", orderType=" + this.f85406n + ")";
    }

    public /* synthetic */ b(String r25, String r26, double r27, String r29, double r30, boolean r32, String r33, String r34, double r35, double r37, double r39, double r41, String r43, String r44, int r45, kotlin.jvm.internal.i r46) {
        if ((r45 & 4096) == 0) goto L5;
        String r22 = "";
    L7:
        if ((r45 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L10;
        String r23 = "";
    L11:
        this(r25, r26, r27, r29, r30, r32, r33, r34, r35, r37, r39, r41, r22, r23);
        return;
    L10:
        r23 = r44;
        goto L11
    L5:
        r22 = r43;
        goto L7
    }
}
