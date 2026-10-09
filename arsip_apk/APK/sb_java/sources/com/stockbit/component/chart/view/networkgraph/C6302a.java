package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* renamed from: com.stockbit.component.chart.view.networkgraph.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6302a {

    /* renamed from: a, reason: collision with root package name */
    public final String f69919a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69920b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69921c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final List f69922e;

    /* renamed from: f, reason: collision with root package name */
    public final List f69923f;

    static {
    }

    public C6302a(String r2, String r3, String r4, double r5, List r7, List r8) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "ticker");
        kotlin.jvm.internal.p.l(r4, "logoUrl");
        kotlin.jvm.internal.p.l(r7, "relatedInvestors");
        kotlin.jvm.internal.p.l(r8, "allRelatedInvestors");
        this.f69919a = r2;
        this.f69920b = r3;
        this.f69921c = r4;
        this.d = r5;
        this.f69922e = r7;
        this.f69923f = r8;
    }

    public final List a() {
        return this.f69923f;
    }

    public final String b() {
        return this.f69919a;
    }

    public final String c() {
        return this.f69921c;
    }

    public final double d() {
        return this.d;
    }

    public final List e() {
        return this.f69922e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C6302a) == true) goto L8;
        return false;
    L8:
        C6302a r82 = (C6302a) r8;
        if (kotlin.jvm.internal.p.g(this.f69919a, r82.f69919a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69920b, r82.f69920b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f69921c, r82.f69921c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f69922e, r82.f69922e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f69923f, r82.f69923f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f69920b;
    }

    public int hashCode() {
        return (((((((((this.f69919a.hashCode() * 31) + this.f69920b.hashCode()) * 31) + this.f69921c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f69922e.hashCode()) * 31) + this.f69923f.hashCode();
    }

    public String toString() {
        return "EmittenNode(id=" + this.f69919a + ", ticker=" + this.f69920b + ", logoUrl=" + this.f69921c + ", ownershipPercentage=" + this.d + ", relatedInvestors=" + this.f69922e + ", allRelatedInvestors=" + this.f69923f + ')';
    }
}
