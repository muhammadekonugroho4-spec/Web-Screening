package com.stockbit.domain.param.screener;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f87444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87446c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87447e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87448f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87449g;

    /* renamed from: h, reason: collision with root package name */
    public final int f87450h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87451i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87452j;

    public a(int r2, String r3, String r4, String r5, String r6, String r7, String r8, int r9, String r10, String r11) {
        p.l(r3, "sequence");
        p.l(r4, "screenerId");
        p.l(r5, "universe");
        p.l(r6, "save");
        p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r8, "filters");
        p.l(r10, "orderType");
        p.l(r11, "type");
        this.f87444a = r2;
        this.f87445b = r3;
        this.f87446c = r4;
        this.d = r5;
        this.f87447e = r6;
        this.f87448f = r7;
        this.f87449g = r8;
        this.f87450h = r9;
        this.f87451i = r10;
        this.f87452j = r11;
    }

    public final String a() {
        return this.f87449g;
    }

    public final String b() {
        return this.f87448f;
    }

    public final int c() {
        return this.f87444a;
    }

    public final String d() {
        return this.f87451i;
    }

    public final int e() {
        return this.f87450h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f87444a == r52.f87444a) goto L12;
        return false;
    L12:
        if (p.g(this.f87445b, r52.f87445b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87446c, r52.f87446c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87447e, r52.f87447e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87448f, r52.f87448f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87449g, r52.f87449g) == true) goto L30;
        return false;
    L30:
        if (this.f87450h == r52.f87450h) goto L33;
        return false;
    L33:
        if (p.g(this.f87451i, r52.f87451i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f87452j, r52.f87452j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f87447e;
    }

    public final String g() {
        return this.f87446c;
    }

    public final String h() {
        return this.f87445b;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.f87444a) * 31) + this.f87445b.hashCode()) * 31) + this.f87446c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87447e.hashCode()) * 31) + this.f87448f.hashCode()) * 31) + this.f87449g.hashCode()) * 31) + Integer.hashCode(this.f87450h)) * 31) + this.f87451i.hashCode()) * 31) + this.f87452j.hashCode();
    }

    public final String i() {
        return this.f87452j;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "ScreenerTemplateDomainParam(orderCol=" + this.f87444a + ", sequence=" + this.f87445b + ", screenerId=" + this.f87446c + ", universe=" + this.d + ", save=" + this.f87447e + ", name=" + this.f87448f + ", filters=" + this.f87449g + ", page=" + this.f87450h + ", orderType=" + this.f87451i + ", type=" + this.f87452j + ")";
    }
}
