package com.stockbit.domain.model.search;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.company.CompanyEntryPoint;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84944a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84945b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84946c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f84947e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f84948f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84949g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84950h;

    /* renamed from: i, reason: collision with root package name */
    public final String f84951i;

    /* renamed from: j, reason: collision with root package name */
    public final String f84952j;

    /* renamed from: k, reason: collision with root package name */
    public final String f84953k;

    /* renamed from: l, reason: collision with root package name */
    public final String f84954l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84955m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84956n;

    /* renamed from: o, reason: collision with root package name */
    public final String f84957o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84958p;

    /* renamed from: q, reason: collision with root package name */
    public final String f84959q;

    /* renamed from: r, reason: collision with root package name */
    public final List f84960r;

    /* renamed from: s, reason: collision with root package name */
    public final long f84961s;

    public f(String r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, List r31, long r32) {
        p.l(r14, Constants.KEY_ID);
        p.l(r20, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r21, "symbol");
        p.l(r22, CompanyEntryPoint.EXTRA_DESC);
        p.l(r23, "iconUrl");
        p.l(r24, "type");
        p.l(r25, "other");
        p.l(r26, "country");
        p.l(r27, "exchange");
        p.l(r28, NotificationCompat.CATEGORY_STATUS);
        p.l(r29, "url");
        p.l(r30, "totalFollower");
        p.l(r31, "board");
        this.f84944a = r14;
        this.f84945b = r15;
        this.f84946c = r16;
        this.d = r17;
        this.f84947e = r18;
        this.f84948f = r19;
        this.f84949g = r20;
        this.f84950h = r21;
        this.f84951i = r22;
        this.f84952j = r23;
        this.f84953k = r24;
        this.f84954l = r25;
        this.f84955m = r26;
        this.f84956n = r27;
        this.f84957o = r28;
        this.f84958p = r29;
        this.f84959q = r30;
        this.f84960r = r31;
        this.f84961s = r32;
    }

    public final long a() {
        return this.f84961s;
    }

    public final String b() {
        return this.f84955m;
    }

    public final String c() {
        return this.f84951i;
    }

    public final String d() {
        return this.f84956n;
    }

    public final String e() {
        return this.f84952j;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f84944a, r82.f84944a) == true) goto L12;
        return false;
    L12:
        if (this.f84945b == r82.f84945b) goto L15;
        return false;
    L15:
        if (this.f84946c == r82.f84946c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (this.f84947e == r82.f84947e) goto L24;
        return false;
    L24:
        if (this.f84948f == r82.f84948f) goto L27;
        return false;
    L27:
        if (p.g(this.f84949g, r82.f84949g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84950h, r82.f84950h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f84951i, r82.f84951i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f84952j, r82.f84952j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f84953k, r82.f84953k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f84954l, r82.f84954l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f84955m, r82.f84955m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84956n, r82.f84956n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f84957o, r82.f84957o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84958p, r82.f84958p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f84959q, r82.f84959q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f84960r, r82.f84960r) == true) goto L63;
        return false;
    L63:
        if (this.f84961s == r82.f84961s) goto L65;
        return false;
    L65:
        return true;
    }

    public final String f() {
        return this.f84944a;
    }

    public final String g() {
        return this.f84949g;
    }

    public final String h() {
        return this.f84954l;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.f84944a.hashCode() * 31) + Boolean.hashCode(this.f84945b)) * 31) + Boolean.hashCode(this.f84946c)) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.f84947e)) * 31) + Boolean.hashCode(this.f84948f)) * 31) + this.f84949g.hashCode()) * 31) + this.f84950h.hashCode()) * 31) + this.f84951i.hashCode()) * 31) + this.f84952j.hashCode()) * 31) + this.f84953k.hashCode()) * 31) + this.f84954l.hashCode()) * 31) + this.f84955m.hashCode()) * 31) + this.f84956n.hashCode()) * 31) + this.f84957o.hashCode()) * 31) + this.f84958p.hashCode()) * 31) + this.f84959q.hashCode()) * 31) + this.f84960r.hashCode()) * 31) + Long.hashCode(this.f84961s);
    }

    public final String i() {
        return this.f84957o;
    }

    public final String j() {
        return this.f84950h;
    }

    public final String k() {
        return this.f84953k;
    }

    public final String l() {
        return this.f84958p;
    }

    public final boolean m() {
        return this.f84947e;
    }

    public final boolean n() {
        return this.f84948f;
    }

    public final boolean o() {
        return this.d;
    }

    public final boolean p() {
        return this.f84945b;
    }

    public final boolean q() {
        return this.f84946c;
    }

    public String toString() {
        return "SearchCompanyEntity(id=" + this.f84944a + ", isTradeAble=" + this.f84945b + ", isTradeableNow=" + this.f84946c + ", isShariaTradeAble=" + this.d + ", isFollowed=" + this.f84947e + ", isOfficial=" + this.f84948f + ", name=" + this.f84949g + ", symbol=" + this.f84950h + ", desc=" + this.f84951i + ", iconUrl=" + this.f84952j + ", type=" + this.f84953k + ", other=" + this.f84954l + ", country=" + this.f84955m + ", exchange=" + this.f84956n + ", status=" + this.f84957o + ", url=" + this.f84958p + ", totalFollower=" + this.f84959q + ", board=" + this.f84960r + ", companyId=" + this.f84961s + ")";
    }
}
