package com.stockbit.usecase.screener.model.param;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f159763a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159764b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159765c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159766e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159767f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159768g;

    public a(int r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r3, "screenerId");
        p.l(r4, "universe");
        p.l(r5, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r6, "filters");
        p.l(r7, "orderType");
        p.l(r8, "type");
        this.f159763a = r2;
        this.f159764b = r3;
        this.f159765c = r4;
        this.d = r5;
        this.f159766e = r6;
        this.f159767f = r7;
        this.f159768g = r8;
    }

    public final String a() {
        return this.f159766e;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.f159763a;
    }

    public final String d() {
        return this.f159767f;
    }

    public final String e() {
        return this.f159764b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f159763a == r52.f159763a) goto L12;
        return false;
    L12:
        if (p.g(this.f159764b, r52.f159764b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f159765c, r52.f159765c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f159766e, r52.f159766e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f159767f, r52.f159767f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f159768g, r52.f159768g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f159768g;
    }

    public final String g() {
        return this.f159765c;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f159763a) * 31) + this.f159764b.hashCode()) * 31) + this.f159765c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159766e.hashCode()) * 31) + this.f159767f.hashCode()) * 31) + this.f159768g.hashCode();
    }

    public String toString() {
        return "ScreenerTemplateUIParam(orderCol=" + this.f159763a + ", screenerId=" + this.f159764b + ", universe=" + this.f159765c + ", name=" + this.d + ", filters=" + this.f159766e + ", orderType=" + this.f159767f + ", type=" + this.f159768g + ")";
    }
}
