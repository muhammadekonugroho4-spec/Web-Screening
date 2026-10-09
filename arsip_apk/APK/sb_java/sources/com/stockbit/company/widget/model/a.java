package com.stockbit.company.widget.model;

import android.graphics.Bitmap;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f69003a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69004b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69005c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f69006e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f69007f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f69008g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f69009h;

    /* renamed from: i, reason: collision with root package name */
    public final String f69010i;

    /* renamed from: j, reason: collision with root package name */
    public final Bitmap f69011j;

    static {
    }

    public a(String r2, String r3, String r4, String r5, double r6, boolean r8, boolean r9, boolean r10, String r11, Bitmap r12) {
        p.l(r2, "symbol");
        p.l(r3, "formattedPrice");
        p.l(r4, "priceChange");
        p.l(r5, "formattedPercent");
        this.f69003a = r2;
        this.f69004b = r3;
        this.f69005c = r4;
        this.d = r5;
        this.f69006e = r6;
        this.f69007f = r8;
        this.f69008g = r9;
        this.f69009h = r10;
        this.f69010i = r11;
        this.f69011j = r12;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f69004b;
    }

    public final boolean c() {
        return this.f69008g;
    }

    public final boolean d() {
        return this.f69009h;
    }

    public final double e() {
        return this.f69006e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f69003a, r82.f69003a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f69004b, r82.f69004b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f69005c, r82.f69005c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f69006e, r82.f69006e) == 0) goto L24;
        return false;
    L24:
        if (this.f69007f == r82.f69007f) goto L27;
        return false;
    L27:
        if (this.f69008g == r82.f69008g) goto L30;
        return false;
    L30:
        if (this.f69009h == r82.f69009h) goto L33;
        return false;
    L33:
        if (p.g(this.f69010i, r82.f69010i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f69011j, r82.f69011j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f69005c;
    }

    public final Bitmap g() {
        return this.f69011j;
    }

    public final String h() {
        return this.f69010i;
    }

    public int hashCode() {
        int r02 = ((((((((((((((this.f69003a.hashCode() * 31) + this.f69004b.hashCode()) * 31) + this.f69005c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f69006e)) * 31) + Boolean.hashCode(this.f69007f)) * 31) + Boolean.hashCode(this.f69008g)) * 31) + Boolean.hashCode(this.f69009h)) * 31;
        String r1 = this.f69010i;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Bitmap r13 = this.f69011j;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f69003a;
    }

    public final boolean j() {
        return this.f69007f;
    }

    public String toString() {
        return "SingleStockWidgetItemState(symbol=" + this.f69003a + ", formattedPrice=" + this.f69004b + ", priceChange=" + this.f69005c + ", formattedPercent=" + this.d + ", percentDouble=" + this.f69006e + ", isCrypto=" + this.f69007f + ", hasCorporateAction=" + this.f69008g + ", hasUma=" + this.f69009h + ", statusLabel=" + this.f69010i + ", sparklineBitmap=" + this.f69011j + ')';
    }
}
