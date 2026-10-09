package com.stockbit.domain.model.company.market;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81701a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81702b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81703c;

    public b(String r2, boolean r3, List r4) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r4, "markets");
        this.f81701a = r2;
        this.f81702b = r3;
        this.f81703c = r4;
    }

    public final String a() {
        return this.f81701a;
    }

    public final List b() {
        return this.f81703c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81701a, r52.f81701a) == true) goto L12;
        return false;
    L12:
        if (this.f81702b == r52.f81702b) goto L15;
        return false;
    L15:
        if (p.g(this.f81703c, r52.f81703c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81701a.hashCode() * 31) + Boolean.hashCode(this.f81702b)) * 31) + this.f81703c.hashCode();
    }

    public String toString() {
        return "CompanyMarketEntity(date=" + this.f81701a + ", isOpenMarket=" + this.f81702b + ", markets=" + this.f81703c + ")";
    }
}
