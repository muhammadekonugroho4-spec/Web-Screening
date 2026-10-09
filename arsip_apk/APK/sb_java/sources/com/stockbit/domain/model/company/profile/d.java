package com.stockbit.domain.model.company.profile;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f81792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81793b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81794c;

    public d(String r2, String r3, String r4) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "symbol");
        this.f81792a = r2;
        this.f81793b = r3;
        this.f81794c = r4;
    }

    public final String a() {
        return this.f81792a;
    }

    public final String b() {
        return this.f81793b;
    }

    public final String c() {
        return this.f81794c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81792a, r52.f81792a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81793b, r52.f81793b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81794c, r52.f81794c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81792a.hashCode() * 31) + this.f81793b.hashCode()) * 31) + this.f81794c.hashCode();
    }

    public String toString() {
        return "CompanyProfileClassificationNodeEntity(id=" + this.f81792a + ", name=" + this.f81793b + ", symbol=" + this.f81794c + ")";
    }

    public /* synthetic */ d(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
