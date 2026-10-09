package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes7.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f70033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70035c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final List f70036e;

    static {
    }

    public x(String r2, String r3, String r4, double r5, List r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "ticker");
        kotlin.jvm.internal.p.l(r4, "logoUrl");
        kotlin.jvm.internal.p.l(r7, "allRelatedInvestors");
        this.f70033a = r2;
        this.f70034b = r3;
        this.f70035c = r4;
        this.d = r5;
        this.f70036e = r7;
    }

    public final List a() {
        return this.f70036e;
    }

    public final String b() {
        return this.f70033a;
    }

    public final String c() {
        return this.f70035c;
    }

    public final double d() {
        return this.d;
    }

    public final String e() {
        return this.f70034b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof x) == true) goto L8;
        return false;
    L8:
        x r82 = (x) r8;
        if (kotlin.jvm.internal.p.g(this.f70033a, r82.f70033a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f70034b, r82.f70034b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f70035c, r82.f70035c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f70036e, r82.f70036e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f70033a.hashCode() * 31) + this.f70034b.hashCode()) * 31) + this.f70035c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f70036e.hashCode();
    }

    public String toString() {
        return "OtherEmittenNode(id=" + this.f70033a + ", ticker=" + this.f70034b + ", logoUrl=" + this.f70035c + ", ownershipPercentage=" + this.d + ", allRelatedInvestors=" + this.f70036e + ')';
    }
}
