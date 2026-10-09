package com.stockbit.domain.model.entity.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f82963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82964b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82965c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82966e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82967f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82968g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82969h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82970i;

    public f(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "type");
        p.l(r3, Constants.KEY_ID);
        p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "alias1");
        p.l(r6, "alias2");
        p.l(r7, "parent");
        p.l(r8, "parentName");
        p.l(r9, "parentAlias1");
        p.l(r10, "parentAlias2");
        this.f82963a = r2;
        this.f82964b = r3;
        this.f82965c = r4;
        this.d = r5;
        this.f82966e = r6;
        this.f82967f = r7;
        this.f82968g = r8;
        this.f82969h = r9;
        this.f82970i = r10;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f82964b;
    }

    public final String c() {
        return this.f82965c;
    }

    public final String d() {
        return this.f82967f;
    }

    public final String e() {
        return this.f82963a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f82963a, r52.f82963a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82964b, r52.f82964b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82965c, r52.f82965c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82966e, r52.f82966e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82967f, r52.f82967f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82968g, r52.f82968g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82969h, r52.f82969h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82970i, r52.f82970i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.f82963a.hashCode() * 31) + this.f82964b.hashCode()) * 31) + this.f82965c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82966e.hashCode()) * 31) + this.f82967f.hashCode()) * 31) + this.f82968g.hashCode()) * 31) + this.f82969h.hashCode()) * 31) + this.f82970i.hashCode();
    }

    public String toString() {
        return "SearchItemSector(type=" + this.f82963a + ", id=" + this.f82964b + ", name=" + this.f82965c + ", alias1=" + this.d + ", alias2=" + this.f82966e + ", parent=" + this.f82967f + ", parentName=" + this.f82968g + ", parentAlias1=" + this.f82969h + ", parentAlias2=" + this.f82970i + ')';
    }

    public /* synthetic */ f(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = "";
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
