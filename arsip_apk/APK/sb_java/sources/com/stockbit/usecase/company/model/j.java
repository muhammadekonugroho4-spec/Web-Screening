package com.stockbit.usecase.company.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f156261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156262b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156263c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f156264e;

    /* renamed from: f, reason: collision with root package name */
    public final List f156265f;

    public j(String r2, String r3, String r4, String r5, List r6, List r7) {
        kotlin.jvm.internal.p.l(r2, "legend");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_COLOR);
        kotlin.jvm.internal.p.l(r4, "currencyScale");
        kotlin.jvm.internal.p.l(r5, "chartType");
        kotlin.jvm.internal.p.l(r6, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r7, "yAxis");
        this.f156261a = r2;
        this.f156262b = r3;
        this.f156263c = r4;
        this.d = r5;
        this.f156264e = r6;
        this.f156265f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f156262b;
    }

    public final String c() {
        return this.f156263c;
    }

    public final List d() {
        return this.f156264e;
    }

    public final String e() {
        return this.f156261a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f156261a, r52.f156261a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f156262b, r52.f156262b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156263c, r52.f156263c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f156264e, r52.f156264e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f156265f, r52.f156265f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.f156265f;
    }

    public int hashCode() {
        return (((((((((this.f156261a.hashCode() * 31) + this.f156262b.hashCode()) * 31) + this.f156263c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156264e.hashCode()) * 31) + this.f156265f.hashCode();
    }

    public String toString() {
        return "CompanyFinancialChartDataBeanUIState(legend=" + this.f156261a + ", color=" + this.f156262b + ", currencyScale=" + this.f156263c + ", chartType=" + this.d + ", label=" + this.f156264e + ", yAxis=" + this.f156265f + ")";
    }
}
