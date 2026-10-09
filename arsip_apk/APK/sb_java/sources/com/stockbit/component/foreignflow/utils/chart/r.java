package com.stockbit.component.foreignflow.utils.chart;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.component.foreignflow.model.ForeignFlowChartStyleType;
import java.util.List;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f72159a;

    /* renamed from: b, reason: collision with root package name */
    public final ForeignFlowChartStyleType f72160b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f72161c;

    public r(List r2, ForeignFlowChartStyleType r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.ITEMS);
        kotlin.jvm.internal.p.l(r3, "chartType");
        this.f72159a = r2;
        this.f72160b = r3;
        this.f72161c = r4;
    }

    public static /* synthetic */ r b(r r02, List r1, ForeignFlowChartStyleType r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f72159a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f72160b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f72161c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final r a(List r2, ForeignFlowChartStyleType r3, boolean r4) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.ITEMS);
        kotlin.jvm.internal.p.l(r3, "chartType");
        return new r(r2, r3, r4);
    }

    public final boolean c() {
        return this.f72161c;
    }

    public final ForeignFlowChartStyleType d() {
        return this.f72160b;
    }

    public final List e() {
        return this.f72159a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f72159a, r52.f72159a) == true) goto L12;
        return false;
    L12:
        if (this.f72160b == r52.f72160b) goto L15;
        return false;
    L15:
        if (this.f72161c == r52.f72161c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f72159a.hashCode() * 31) + this.f72160b.hashCode()) * 31) + Boolean.hashCode(this.f72161c);
    }

    public String toString() {
        return "RenderState(items=" + this.f72159a + ", chartType=" + this.f72160b + ", animate=" + this.f72161c + ')';
    }
}
