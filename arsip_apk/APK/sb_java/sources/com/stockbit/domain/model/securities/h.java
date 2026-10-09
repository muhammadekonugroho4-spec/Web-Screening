package com.stockbit.domain.model.securities;

import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f85267a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85268b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f85269c;

    public h(String r2, List r3, BigDecimal r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "historyDataList");
        kotlin.jvm.internal.p.l(r4, "monthlyGain");
        this.f85267a = r2;
        this.f85268b = r3;
        this.f85269c = r4;
    }

    public final String a() {
        return this.f85267a;
    }

    public final List b() {
        return this.f85268b;
    }

    public final BigDecimal c() {
        return this.f85269c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f85267a, r52.f85267a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85268b, r52.f85268b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85269c, r52.f85269c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85267a.hashCode() * 31) + this.f85268b.hashCode()) * 31) + this.f85269c.hashCode();
    }

    public String toString() {
        return "HistoryRealizedLegacyEntity(date=" + this.f85267a + ", historyDataList=" + this.f85268b + ", monthlyGain=" + this.f85269c + ")";
    }
}
