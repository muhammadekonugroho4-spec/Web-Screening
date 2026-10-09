package com.stockbit.usecase.screener.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f159718a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159720c;
    public int d;

    public c(int r2, String r3, int r4, int r5) {
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f159718a = r2;
        this.f159719b = r3;
        this.f159720c = r4;
        this.d = r5;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.f159718a;
    }

    public final String c() {
        return this.f159719b;
    }

    public final int d() {
        return this.f159720c;
    }

    public final void e(int r1) {
        this.d = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f159718a == r52.f159718a) goto L12;
        return false;
    L12:
        if (p.g(this.f159719b, r52.f159719b) == true) goto L15;
        return false;
    L15:
        if (this.f159720c == r52.f159720c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f159718a) * 31) + this.f159719b.hashCode()) * 31) + Integer.hashCode(this.f159720c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ScreenerColumnsBeanUIState(id=" + this.f159718a + ", name=" + this.f159719b + ", removable=" + this.f159720c + ", columnSortingMode=" + this.d + ")";
    }

    public /* synthetic */ c(int r2, String r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
