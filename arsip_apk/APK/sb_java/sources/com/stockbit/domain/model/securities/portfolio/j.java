package com.stockbit.domain.model.securities.portfolio;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final k f85703a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85704b;

    public j(k r2, List r3) {
        p.l(r2, "aggregatedPortfolioSummary");
        p.l(r3, "summaryPerPortfolios");
        this.f85703a = r2;
        this.f85704b = r3;
    }

    public final k a() {
        return this.f85703a;
    }

    public final List b() {
        return this.f85704b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f85703a, r52.f85703a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85704b, r52.f85704b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85703a.hashCode() * 31) + this.f85704b.hashCode();
    }

    public String toString() {
        return "PortfolioSummaryEntity(aggregatedPortfolioSummary=" + this.f85703a + ", summaryPerPortfolios=" + this.f85704b + ")";
    }
}
