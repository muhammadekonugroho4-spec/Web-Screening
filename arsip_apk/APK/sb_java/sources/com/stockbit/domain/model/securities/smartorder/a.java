package com.stockbit.domain.model.securities.smartorder;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f85735a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85736b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f85737c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85738e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f85739f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f85740g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f85741h;

    public a(int r2, String r3, BigDecimal r4, int r5, int r6, BigDecimal r7, BigDecimal r8, boolean r9) {
        p.l(r3, "type");
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        p.l(r7, "realizedAmount");
        p.l(r8, "realizedPercentage");
        this.f85735a = r2;
        this.f85736b = r3;
        this.f85737c = r4;
        this.d = r5;
        this.f85738e = r6;
        this.f85739f = r7;
        this.f85740g = r8;
        this.f85741h = r9;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f85735a == r52.f85735a) goto L12;
        return false;
    L12:
        if (p.g(this.f85736b, r52.f85736b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85737c, r52.f85737c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f85738e == r52.f85738e) goto L24;
        return false;
    L24:
        if (p.g(this.f85739f, r52.f85739f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85740g, r52.f85740g) == true) goto L30;
        return false;
    L30:
        if (this.f85741h == r52.f85741h) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.f85735a) * 31) + this.f85736b.hashCode()) * 31) + this.f85737c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.f85738e)) * 31) + this.f85739f.hashCode()) * 31) + this.f85740g.hashCode()) * 31) + Boolean.hashCode(this.f85741h);
    }

    public String toString() {
        return "SmartOrderEntity(id=" + this.f85735a + ", type=" + this.f85736b + ", price=" + this.f85737c + ", shares=" + this.d + ", source=" + this.f85738e + ", realizedAmount=" + this.f85739f + ", realizedPercentage=" + this.f85740g + ", isRealizedGainHidden=" + this.f85741h + ")";
    }
}
