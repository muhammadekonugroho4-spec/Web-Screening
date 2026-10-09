package com.stockbit.domain.model.eipo;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.eipo.EipoEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f82186a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82187b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82188c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82189e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82190f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82191g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82192h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82193i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f82194j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f82195k;

    /* renamed from: l, reason: collision with root package name */
    public final String f82196l;

    /* renamed from: m, reason: collision with root package name */
    public final String f82197m;

    /* renamed from: n, reason: collision with root package name */
    public final String f82198n;

    public j(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, boolean r11, boolean r12, String r13, String r14, String r15) {
        p.l(r2, "companyName");
        p.l(r3, EipoEntryPoint.EXTRA_EMITEN_CODE);
        p.l(r4, "companyLogo");
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        p.l(r6, "stage");
        p.l(r7, "stageDisplay");
        p.l(r8, "stageDateDisplay");
        p.l(r9, NotificationCompat.CATEGORY_STATUS);
        p.l(r10, "statusDisplay");
        p.l(r13, "ipoStartDate");
        p.l(r14, "ipoEndDate");
        p.l(r15, "ipoDateDisplay");
        this.f82186a = r2;
        this.f82187b = r3;
        this.f82188c = r4;
        this.d = r5;
        this.f82189e = r6;
        this.f82190f = r7;
        this.f82191g = r8;
        this.f82192h = r9;
        this.f82193i = r10;
        this.f82194j = r11;
        this.f82195k = r12;
        this.f82196l = r13;
        this.f82197m = r14;
        this.f82198n = r15;
    }

    public final String a() {
        return this.f82188c;
    }

    public final String b() {
        return this.f82186a;
    }

    public final String c() {
        return this.f82187b;
    }

    public final String d() {
        return this.f82198n;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f82186a, r52.f82186a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82187b, r52.f82187b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82188c, r52.f82188c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82189e, r52.f82189e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82190f, r52.f82190f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82191g, r52.f82191g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82192h, r52.f82192h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82193i, r52.f82193i) == true) goto L36;
        return false;
    L36:
        if (this.f82194j == r52.f82194j) goto L39;
        return false;
    L39:
        if (this.f82195k == r52.f82195k) goto L42;
        return false;
    L42:
        if (p.g(this.f82196l, r52.f82196l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f82197m, r52.f82197m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82198n, r52.f82198n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f82189e;
    }

    public final String g() {
        return this.f82191g;
    }

    public final String h() {
        return this.f82190f;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f82186a.hashCode() * 31) + this.f82187b.hashCode()) * 31) + this.f82188c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82189e.hashCode()) * 31) + this.f82190f.hashCode()) * 31) + this.f82191g.hashCode()) * 31) + this.f82192h.hashCode()) * 31) + this.f82193i.hashCode()) * 31) + Boolean.hashCode(this.f82194j)) * 31) + Boolean.hashCode(this.f82195k)) * 31) + this.f82196l.hashCode()) * 31) + this.f82197m.hashCode()) * 31) + this.f82198n.hashCode();
    }

    public final String i() {
        return this.f82192h;
    }

    public final String j() {
        return this.f82193i;
    }

    public final boolean k() {
        return this.f82195k;
    }

    public final boolean l() {
        return this.f82194j;
    }

    public String toString() {
        return "EIpoUiState(companyName=" + this.f82186a + ", emitenCode=" + this.f82187b + ", companyLogo=" + this.f82188c + ", price=" + this.d + ", stage=" + this.f82189e + ", stageDisplay=" + this.f82190f + ", stageDateDisplay=" + this.f82191g + ", status=" + this.f82192h + ", statusDisplay=" + this.f82193i + ", isWarrant=" + this.f82194j + ", isSharia=" + this.f82195k + ", ipoStartDate=" + this.f82196l + ", ipoEndDate=" + this.f82197m + ", ipoDateDisplay=" + this.f82198n + ")";
    }
}
