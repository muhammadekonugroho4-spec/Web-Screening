package com.stockbit.component.chart.view.networkgraph;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f69942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69944c;
    public final List d;

    static {
    }

    public g(String r2, String r3, String r4, List r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "ticker");
        kotlin.jvm.internal.p.l(r4, "logoUrl");
        kotlin.jvm.internal.p.l(r5, "investors");
        this.f69942a = r2;
        this.f69943b = r3;
        this.f69944c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f69942a;
    }

    public final List b() {
        return this.d;
    }

    public final String c() {
        return this.f69944c;
    }

    public final String d() {
        return this.f69943b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f69942a, r52.f69942a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f69943b, r52.f69943b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f69944c, r52.f69944c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f69942a.hashCode() * 31) + this.f69943b.hashCode()) * 31) + this.f69944c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MainEmittenNode(id=" + this.f69942a + ", ticker=" + this.f69943b + ", logoUrl=" + this.f69944c + ", investors=" + this.d + ')';
    }
}
