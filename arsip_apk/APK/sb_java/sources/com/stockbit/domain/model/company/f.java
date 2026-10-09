package com.stockbit.domain.model.company;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.messaging.Constants;
import java.util.List;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81486a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81487b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81488c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final List f81489e;

    /* renamed from: f, reason: collision with root package name */
    public final List f81490f;

    public f(String r2, String r3, String r4, String r5, List r6, List r7) {
        kotlin.jvm.internal.p.l(r2, "legend");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_COLOR);
        kotlin.jvm.internal.p.l(r4, "currencyScale");
        kotlin.jvm.internal.p.l(r5, "chartType");
        kotlin.jvm.internal.p.l(r6, Constants.ScionAnalytics.PARAM_LABEL);
        kotlin.jvm.internal.p.l(r7, "yAxis");
        this.f81486a = r2;
        this.f81487b = r3;
        this.f81488c = r4;
        this.d = r5;
        this.f81489e = r6;
        this.f81490f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f81487b;
    }

    public final String c() {
        return this.f81488c;
    }

    public final List d() {
        return this.f81489e;
    }

    public final String e() {
        return this.f81486a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f81486a, r52.f81486a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f81487b, r52.f81487b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f81488c, r52.f81488c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f81489e, r52.f81489e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f81490f, r52.f81490f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.f81490f;
    }

    public int hashCode() {
        return (((((((((this.f81486a.hashCode() * 31) + this.f81487b.hashCode()) * 31) + this.f81488c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81489e.hashCode()) * 31) + this.f81490f.hashCode();
    }

    public String toString() {
        return "CompanyFinancialChartDataBeanEntity(legend=" + this.f81486a + ", color=" + this.f81487b + ", currencyScale=" + this.f81488c + ", chartType=" + this.d + ", label=" + this.f81489e + ", yAxis=" + this.f81490f + ")";
    }
}
