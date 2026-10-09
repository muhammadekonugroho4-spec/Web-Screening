package com.stockbit.domain.model.charts;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81180a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81181b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81182c;

    public a(String r2, String r3, List r4) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "formatedDate");
        p.l(r4, "values");
        this.f81180a = r2;
        this.f81181b = r3;
        this.f81182c = r4;
    }

    public final String a() {
        return this.f81180a;
    }

    public final String b() {
        return this.f81181b;
    }

    public final List c() {
        return this.f81182c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81180a, r52.f81180a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81181b, r52.f81181b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81182c, r52.f81182c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81180a.hashCode() * 31) + this.f81181b.hashCode()) * 31) + this.f81182c.hashCode();
    }

    public String toString() {
        return "ChartPointEntity(date=" + this.f81180a + ", formatedDate=" + this.f81181b + ", values=" + this.f81182c + ")";
    }
}
