package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* loaded from: classes7.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f69893a;

    /* renamed from: b, reason: collision with root package name */
    public final List f69894b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69895c;

    static {
    }

    public /* synthetic */ B(String r1, List r2, long r3, kotlin.jvm.internal.i r5) {
        this(r1, r2, r3);
    }

    public final long a() {
        return this.f69895c;
    }

    public final List b() {
        return this.f69894b;
    }

    public final String c() {
        return this.f69893a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof B) == true) goto L8;
        return false;
    L8:
        B r82 = (B) r8;
        if (kotlin.jvm.internal.p.g(this.f69893a, r82.f69893a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69894b, r82.f69894b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.geometry.e.j(this.f69895c, r82.f69895c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f69893a.hashCode() * 31) + this.f69894b.hashCode()) * 31) + androidx.compose.ui.geometry.e.o(this.f69895c);
    }

    public String toString() {
        return "TooltipContent(title=" + this.f69893a + ", items=" + this.f69894b + ", anchorPosition=" + androidx.compose.ui.geometry.e.s(this.f69895c) + ')';
    }

    public B(String r2, List r3, long r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f69893a = r2;
        this.f69894b = r3;
        this.f69895c = r4;
    }
}
