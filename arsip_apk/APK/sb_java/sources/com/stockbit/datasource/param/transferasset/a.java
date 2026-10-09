package com.stockbit.datasource.param.transferasset;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f80105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80106b;

    /* renamed from: c, reason: collision with root package name */
    public final List f80107c;

    /* renamed from: com.stockbit.datasource.param.transferasset.a$a, reason: collision with other inner class name */
    public static final class C0763a {

        /* renamed from: a, reason: collision with root package name */
        public final String f80108a;

        /* renamed from: b, reason: collision with root package name */
        public final int f80109b;

        public C0763a(String r2, int r3) {
            p.l(r2, "stockCode");
            this.f80108a = r2;
            this.f80109b = r3;
        }

        public final int a() {
            return this.f80109b;
        }

        public final String b() {
            return this.f80108a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0763a) == true) goto L8;
            return false;
        L8:
            C0763a r52 = (C0763a) r5;
            if (p.g(this.f80108a, r52.f80108a) == true) goto L12;
            return false;
        L12:
            if (this.f80109b == r52.f80109b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f80108a.hashCode() * 31) + Integer.hashCode(this.f80109b);
        }

        public String toString() {
            return "StockData(stockCode=" + this.f80108a + ", shares=" + this.f80109b + ")";
        }
    }

    public a(String r2, String r3, List r4) {
        p.l(r2, "fromAccNo");
        p.l(r3, "toAccNo");
        p.l(r4, "stockData");
        this.f80105a = r2;
        this.f80106b = r3;
        this.f80107c = r4;
    }

    public final String a() {
        return this.f80105a;
    }

    public final List b() {
        return this.f80107c;
    }

    public final String c() {
        return this.f80106b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f80105a, r52.f80105a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80106b, r52.f80106b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80107c, r52.f80107c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f80105a.hashCode() * 31) + this.f80106b.hashCode()) * 31) + this.f80107c.hashCode();
    }

    public String toString() {
        return "PostTransferStockDataParam(fromAccNo=" + this.f80105a + ", toAccNo=" + this.f80106b + ", stockData=" + this.f80107c + ")";
    }
}
