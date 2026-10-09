package com.stockbit.domain.model.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f81816a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81817b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81818c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81819e;

    /* renamed from: f, reason: collision with root package name */
    public final List f81820f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81821g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81822h;

    public g(String r2, String r3, String r4, String r5, String r6, List r7, String r8, String r9) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        p.l(r4, "shares");
        p.l(r5, "amount");
        p.l(r6, "board");
        p.l(r7, "underwriters");
        p.l(r8, "administrativeBureau");
        p.l(r9, "freeFloat");
        this.f81816a = r2;
        this.f81817b = r3;
        this.f81818c = r4;
        this.d = r5;
        this.f81819e = r6;
        this.f81820f = r7;
        this.f81821g = r8;
        this.f81822h = r9;
    }

    public final String a() {
        return this.f81821g;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f81819e;
    }

    public final String d() {
        return this.f81816a;
    }

    public final String e() {
        return this.f81822h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f81816a, r52.f81816a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81817b, r52.f81817b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81818c, r52.f81818c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81819e, r52.f81819e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81820f, r52.f81820f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81821g, r52.f81821g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81822h, r52.f81822h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f81817b;
    }

    public final String g() {
        return this.f81818c;
    }

    public final List h() {
        return this.f81820f;
    }

    public int hashCode() {
        return (((((((((((((this.f81816a.hashCode() * 31) + this.f81817b.hashCode()) * 31) + this.f81818c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81819e.hashCode()) * 31) + this.f81820f.hashCode()) * 31) + this.f81821g.hashCode()) * 31) + this.f81822h.hashCode();
    }

    public String toString() {
        return "CompanyProfileHistoryEntity(date=" + this.f81816a + ", price=" + this.f81817b + ", shares=" + this.f81818c + ", amount=" + this.d + ", board=" + this.f81819e + ", underwriters=" + this.f81820f + ", administrativeBureau=" + this.f81821g + ", freeFloat=" + this.f81822h + ")";
    }
}
