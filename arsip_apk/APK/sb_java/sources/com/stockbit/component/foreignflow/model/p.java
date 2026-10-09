package com.stockbit.component.foreignflow.model;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f71997a;

    /* renamed from: b, reason: collision with root package name */
    public final ForeignFlowTrend f71998b;

    static {
    }

    public p(String r2, ForeignFlowTrend r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TEXT);
        kotlin.jvm.internal.p.l(r3, "trend");
        this.f71997a = r2;
        this.f71998b = r3;
    }

    public final String a() {
        return this.f71997a;
    }

    public final ForeignFlowTrend b() {
        return this.f71998b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f71997a, r52.f71997a) == true) goto L12;
        return false;
    L12:
        if (this.f71998b == r52.f71998b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f71997a.hashCode() * 31) + this.f71998b.hashCode();
    }

    public String toString() {
        return "ForeignFlowValueUIState(text=" + this.f71997a + ", trend=" + this.f71998b + ')';
    }

    public /* synthetic */ p(String r1, ForeignFlowTrend r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "-";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = ForeignFlowTrend.NEUTRAL;
    L8:
        this(r1, r2);
    }
}
