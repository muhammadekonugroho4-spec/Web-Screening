package com.stockbit.usecase.company.model.profile;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f156477a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156478b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156479c;

    public c(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        this.f156477a = r2;
        this.f156478b = r3;
        this.f156479c = r4;
    }

    public final String a() {
        return this.f156477a;
    }

    public final String b() {
        return this.f156478b;
    }

    public final String c() {
        return this.f156479c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f156477a, r52.f156477a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156478b, r52.f156478b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156479c, r52.f156479c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156477a.hashCode() * 31) + this.f156478b.hashCode()) * 31) + this.f156479c.hashCode();
    }

    public String toString() {
        return "CompanyProfileClassificationNodeUIState(id=" + this.f156477a + ", name=" + this.f156478b + ", symbol=" + this.f156479c + ")";
    }
}
