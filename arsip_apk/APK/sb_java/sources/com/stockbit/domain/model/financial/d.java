package com.stockbit.domain.model.financial;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f84039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84040b;

    /* renamed from: c, reason: collision with root package name */
    public final List f84041c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f84042e;

    /* renamed from: f, reason: collision with root package name */
    public final double f84043f;

    /* renamed from: g, reason: collision with root package name */
    public final double f84044g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f84045h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f84046i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84047j;

    public d(String r2, String r3, List r4, double r5, double r7, double r9, double r11, boolean r13, boolean r14, String r15) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "notationCodes");
        p.l(r15, "iconUrl");
        this.f84039a = r2;
        this.f84040b = r3;
        this.f84041c = r4;
        this.d = r5;
        this.f84042e = r7;
        this.f84043f = r9;
        this.f84044g = r11;
        this.f84045h = r13;
        this.f84046i = r14;
        this.f84047j = r15;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f84039a, r82.f84039a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84040b, r82.f84040b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84041c, r82.f84041c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f84042e, r82.f84042e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f84043f, r82.f84043f) == 0) goto L27;
        return false;
    L27:
        if (Double.compare(this.f84044g, r82.f84044g) == 0) goto L30;
        return false;
    L30:
        if (this.f84045h == r82.f84045h) goto L33;
        return false;
    L33:
        if (this.f84046i == r82.f84046i) goto L36;
        return false;
    L36:
        if (p.g(this.f84047j, r82.f84047j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((((this.f84039a.hashCode() * 31) + this.f84040b.hashCode()) * 31) + this.f84041c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f84042e)) * 31) + Double.hashCode(this.f84043f)) * 31) + Double.hashCode(this.f84044g)) * 31) + Boolean.hashCode(this.f84045h)) * 31) + Boolean.hashCode(this.f84046i)) * 31) + this.f84047j.hashCode();
    }

    public String toString() {
        return "Top20DataEntity(symbol=" + this.f84039a + ", name=" + this.f84040b + ", notationCodes=" + this.f84041c + ", lastPrice=" + this.d + ", priceChange=" + this.f84042e + ", percentChange=" + this.f84043f + ", percentage=" + this.f84044g + ", isUma=" + this.f84045h + ", isHaveCorpAction=" + this.f84046i + ", iconUrl=" + this.f84047j + ")";
    }
}
