package com.stockbit.usecase.tradingperformance.model;

import com.clevertap.android.sdk.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f163456a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163457b;

    /* renamed from: c, reason: collision with root package name */
    public final List f163458c;

    public b(String r2, String r3, List r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "subTitle");
        kotlin.jvm.internal.p.l(r4, "chartItems");
        this.f163456a = r2;
        this.f163457b = r3;
        this.f163458c = r4;
    }

    public final List a() {
        return this.f163458c;
    }

    public final String b() {
        return this.f163457b;
    }

    public final String c() {
        return this.f163456a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f163456a, r52.f163456a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163457b, r52.f163457b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163458c, r52.f163458c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f163456a.hashCode() * 31) + this.f163457b.hashCode()) * 31) + this.f163458c.hashCode();
    }

    public String toString() {
        return "AllocationChartUIState(title=" + this.f163456a + ", subTitle=" + this.f163457b + ", chartItems=" + this.f163458c + ")";
    }
}
