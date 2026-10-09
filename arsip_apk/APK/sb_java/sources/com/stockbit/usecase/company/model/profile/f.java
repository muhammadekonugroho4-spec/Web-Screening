package com.stockbit.usecase.company.model.profile;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156485a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156486b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156487c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156488e;

    /* renamed from: f, reason: collision with root package name */
    public final List f156489f;

    /* renamed from: g, reason: collision with root package name */
    public final String f156490g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156491h;

    public f(String r2, String r3, String r4, String r5, String r6, List r7, String r8, String r9) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, FirebaseAnalytics.Param.PRICE);
        p.l(r4, "shares");
        p.l(r5, "amount");
        p.l(r6, "board");
        p.l(r7, "underwriters");
        p.l(r8, "administrativeBureau");
        p.l(r9, "freeFloat");
        this.f156485a = r2;
        this.f156486b = r3;
        this.f156487c = r4;
        this.d = r5;
        this.f156488e = r6;
        this.f156489f = r7;
        this.f156490g = r8;
        this.f156491h = r9;
    }

    public final String a() {
        return this.f156490g;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f156488e;
    }

    public final String d() {
        return this.f156485a;
    }

    public final String e() {
        return this.f156491h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f156485a, r52.f156485a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156486b, r52.f156486b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156487c, r52.f156487c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156488e, r52.f156488e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156489f, r52.f156489f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f156490g, r52.f156490g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f156491h, r52.f156491h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f156486b;
    }

    public final String g() {
        return this.f156487c;
    }

    public final List h() {
        return this.f156489f;
    }

    public int hashCode() {
        return (((((((((((((this.f156485a.hashCode() * 31) + this.f156486b.hashCode()) * 31) + this.f156487c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156488e.hashCode()) * 31) + this.f156489f.hashCode()) * 31) + this.f156490g.hashCode()) * 31) + this.f156491h.hashCode();
    }

    public String toString() {
        return "CompanyProfileHistoryUIState(date=" + this.f156485a + ", price=" + this.f156486b + ", shares=" + this.f156487c + ", amount=" + this.d + ", board=" + this.f156488e + ", underwriters=" + this.f156489f + ", administrativeBureau=" + this.f156490g + ", freeFloat=" + this.f156491h + ")";
    }
}
