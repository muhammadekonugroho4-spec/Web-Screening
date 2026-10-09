package com.stockbit.domain.model.eipo;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f82167a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82168b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82169c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82170e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82171f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82172g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82173h;

    public h(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, "stage");
        p.l(r3, "stageDisplay");
        p.l(r4, "stageProgress");
        p.l(r5, "stageProgressDisplay");
        p.l(r6, FirebaseAnalytics.Param.PRICE);
        p.l(r7, Constants.KEY_DATE);
        p.l(r8, "orderStatus");
        p.l(r9, "orderStatusDisplay");
        this.f82167a = r2;
        this.f82168b = r3;
        this.f82169c = r4;
        this.d = r5;
        this.f82170e = r6;
        this.f82171f = r7;
        this.f82172g = r8;
        this.f82173h = r9;
    }

    public final String a() {
        return this.f82171f;
    }

    public final String b() {
        return this.f82172g;
    }

    public final String c() {
        return this.f82173h;
    }

    public final String d() {
        return this.f82170e;
    }

    public final String e() {
        return this.f82167a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f82167a, r52.f82167a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82168b, r52.f82168b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82169c, r52.f82169c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82170e, r52.f82170e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82171f, r52.f82171f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82172g, r52.f82172g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82173h, r52.f82173h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f82168b;
    }

    public final String g() {
        return this.f82169c;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((this.f82167a.hashCode() * 31) + this.f82168b.hashCode()) * 31) + this.f82169c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82170e.hashCode()) * 31) + this.f82171f.hashCode()) * 31) + this.f82172g.hashCode()) * 31) + this.f82173h.hashCode();
    }

    public String toString() {
        return "EIpoStatusDetailItemEntity(stage=" + this.f82167a + ", stageDisplay=" + this.f82168b + ", stageProgress=" + this.f82169c + ", stageProgressDisplay=" + this.d + ", price=" + this.f82170e + ", date=" + this.f82171f + ", orderStatus=" + this.f82172g + ", orderStatusDisplay=" + this.f82173h + ")";
    }
}
