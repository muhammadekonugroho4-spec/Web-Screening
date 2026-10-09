package com.stockbit.usecase.securities.model.history;

import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f160784a;

    /* renamed from: b, reason: collision with root package name */
    public final List f160785b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f160786c;

    public h(String r2, List r3, BigDecimal r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "historyDataList");
        kotlin.jvm.internal.p.l(r4, "monthlyGain");
        this.f160784a = r2;
        this.f160785b = r3;
        this.f160786c = r4;
    }

    public final String a() {
        return this.f160784a;
    }

    public final List b() {
        return this.f160785b;
    }

    public final BigDecimal c() {
        return this.f160786c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f160784a, r52.f160784a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160785b, r52.f160785b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160786c, r52.f160786c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f160784a.hashCode() * 31) + this.f160785b.hashCode()) * 31) + this.f160786c.hashCode();
    }

    public String toString() {
        return "HistoryRealizedUIState(date=" + this.f160784a + ", historyDataList=" + this.f160785b + ", monthlyGain=" + this.f160786c + ")";
    }
}
