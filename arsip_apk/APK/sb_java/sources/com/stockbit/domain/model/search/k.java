package com.stockbit.domain.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final String f84980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84981b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84982c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84983e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84984f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84985g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84986h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84987i;

    /* renamed from: j, reason: collision with root package name */
    public final int f84988j;

    public k(String r2, String r3, boolean r4, boolean r5, String r6, String r7, String r8, String r9, String r10, int r11) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "img");
        p.l(r6, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r7, CompanyEntryPoint.EXTRA_DESC);
        p.l(r8, "url");
        p.l(r9, "type");
        p.l(r10, "other");
        this.f84980a = r2;
        this.f84981b = r3;
        this.f84982c = r4;
        this.d = r5;
        this.f84983e = r6;
        this.f84984f = r7;
        this.f84985g = r8;
        this.f84986h = r9;
        this.f84987i = r10;
        this.f84988j = r11;
    }

    public final String a() {
        return this.f84984f;
    }

    public final String b() {
        return this.f84980a;
    }

    public final String c() {
        return this.f84981b;
    }

    public final String d() {
        return this.f84983e;
    }

    public final String e() {
        return this.f84985g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof k) == true) goto L8;
        return false;
    L8:
        k r52 = (k) r5;
        if (p.g(this.f84980a, r52.f84980a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84981b, r52.f84981b) == true) goto L15;
        return false;
    L15:
        if (this.f84982c == r52.f84982c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f84983e, r52.f84983e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84984f, r52.f84984f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84985g, r52.f84985g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84986h, r52.f84986h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84987i, r52.f84987i) == true) goto L36;
        return false;
    L36:
        if (this.f84988j == r52.f84988j) goto L38;
        return false;
    L38:
        return true;
    }

    public final boolean f() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((this.f84980a.hashCode() * 31) + this.f84981b.hashCode()) * 31) + Boolean.hashCode(this.f84982c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f84983e.hashCode()) * 31) + this.f84984f.hashCode()) * 31) + this.f84985g.hashCode()) * 31) + this.f84986h.hashCode()) * 31) + this.f84987i.hashCode()) * 31) + Integer.hashCode(this.f84988j);
    }

    public String toString() {
        return "SearchPeopleEntity(id=" + this.f84980a + ", img=" + this.f84981b + ", isFollowing=" + this.f84982c + ", isVerified=" + this.d + ", name=" + this.f84983e + ", desc=" + this.f84984f + ", url=" + this.f84985g + ", type=" + this.f84986h + ", other=" + this.f84987i + ", totalFollower=" + this.f84988j + ")";
    }
}
