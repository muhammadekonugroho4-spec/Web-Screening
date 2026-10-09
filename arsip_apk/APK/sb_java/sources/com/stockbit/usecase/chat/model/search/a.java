package com.stockbit.usecase.chat.model.search;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f155607a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f155608b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f155609c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final String f155610e;

    /* renamed from: f, reason: collision with root package name */
    public final String f155611f;

    /* renamed from: g, reason: collision with root package name */
    public final String f155612g;

    /* renamed from: h, reason: collision with root package name */
    public final String f155613h;

    /* renamed from: i, reason: collision with root package name */
    public final String f155614i;

    /* renamed from: j, reason: collision with root package name */
    public final String f155615j;

    /* renamed from: k, reason: collision with root package name */
    public final String f155616k;

    /* renamed from: l, reason: collision with root package name */
    public final String f155617l;

    /* renamed from: m, reason: collision with root package name */
    public final String f155618m;

    /* renamed from: n, reason: collision with root package name */
    public final String f155619n;

    /* renamed from: o, reason: collision with root package name */
    public final String f155620o;

    public a(String r13, boolean r14, boolean r15, boolean r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27) {
        p.l(r13, Constants.KEY_ID);
        p.l(r17, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r18, "symbol2");
        p.l(r19, "symbol3");
        p.l(r20, CompanyEntryPoint.EXTRA_DESC);
        p.l(r21, "iconUrl");
        p.l(r22, "type");
        p.l(r23, "other");
        p.l(r24, "country");
        p.l(r25, "exchange");
        p.l(r26, NotificationCompat.CATEGORY_STATUS);
        p.l(r27, "url");
        this.f155607a = r13;
        this.f155608b = r14;
        this.f155609c = r15;
        this.d = r16;
        this.f155610e = r17;
        this.f155611f = r18;
        this.f155612g = r19;
        this.f155613h = r20;
        this.f155614i = r21;
        this.f155615j = r22;
        this.f155616k = r23;
        this.f155617l = r24;
        this.f155618m = r25;
        this.f155619n = r26;
        this.f155620o = r27;
    }

    public final String a() {
        return this.f155617l;
    }

    public final String b() {
        return this.f155613h;
    }

    public final String c() {
        return this.f155618m;
    }

    public final String d() {
        return this.f155614i;
    }

    public final String e() {
        return this.f155607a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f155607a, r52.f155607a) == true) goto L12;
        return false;
    L12:
        if (this.f155608b == r52.f155608b) goto L15;
        return false;
    L15:
        if (this.f155609c == r52.f155609c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f155610e, r52.f155610e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f155611f, r52.f155611f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f155612g, r52.f155612g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f155613h, r52.f155613h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f155614i, r52.f155614i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f155615j, r52.f155615j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f155616k, r52.f155616k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f155617l, r52.f155617l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f155618m, r52.f155618m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f155619n, r52.f155619n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f155620o, r52.f155620o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final String f() {
        return this.f155610e;
    }

    public final String g() {
        return this.f155616k;
    }

    public final String h() {
        return this.f155619n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f155607a.hashCode() * 31) + Boolean.hashCode(this.f155608b)) * 31) + Boolean.hashCode(this.f155609c)) * 31) + Boolean.hashCode(this.d)) * 31) + this.f155610e.hashCode()) * 31) + this.f155611f.hashCode()) * 31) + this.f155612g.hashCode()) * 31) + this.f155613h.hashCode()) * 31) + this.f155614i.hashCode()) * 31) + this.f155615j.hashCode()) * 31) + this.f155616k.hashCode()) * 31) + this.f155617l.hashCode()) * 31) + this.f155618m.hashCode()) * 31) + this.f155619n.hashCode()) * 31) + this.f155620o.hashCode();
    }

    public final String i() {
        return this.f155611f;
    }

    public final String j() {
        return this.f155612g;
    }

    public final String k() {
        return this.f155615j;
    }

    public final String l() {
        return this.f155620o;
    }

    public final boolean m() {
        return this.f155609c;
    }

    public final boolean n() {
        return this.d;
    }

    public final boolean o() {
        return this.f155608b;
    }

    public String toString() {
        return "SearchCompanyUIState(id=" + this.f155607a + ", isTradeable=" + this.f155608b + ", isFollowed=" + this.f155609c + ", isOfficial=" + this.d + ", name=" + this.f155610e + ", symbol2=" + this.f155611f + ", symbol3=" + this.f155612g + ", desc=" + this.f155613h + ", iconUrl=" + this.f155614i + ", type=" + this.f155615j + ", other=" + this.f155616k + ", country=" + this.f155617l + ", exchange=" + this.f155618m + ", status=" + this.f155619n + ", url=" + this.f155620o + ")";
    }
}
