package com.stockbit.domain.model.screener;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f84871a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84872b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84873c;

    public c(int r2, String r3, int r4) {
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f84871a = r2;
        this.f84872b = r3;
        this.f84873c = r4;
    }

    public final int a() {
        return this.f84871a;
    }

    public final String b() {
        return this.f84872b;
    }

    public final int c() {
        return this.f84873c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f84871a == r52.f84871a) goto L12;
        return false;
    L12:
        if (p.g(this.f84872b, r52.f84872b) == true) goto L15;
        return false;
    L15:
        if (this.f84873c == r52.f84873c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f84871a) * 31) + this.f84872b.hashCode()) * 31) + Integer.hashCode(this.f84873c);
    }

    public String toString() {
        return "ScreenerColumnsBeanEntity(id=" + this.f84871a + ", name=" + this.f84872b + ", removable=" + this.f84873c + ")";
    }
}
