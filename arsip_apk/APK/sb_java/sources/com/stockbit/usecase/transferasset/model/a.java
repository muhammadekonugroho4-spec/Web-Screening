package com.stockbit.usecase.transferasset.model;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f164029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164030b;

    /* renamed from: c, reason: collision with root package name */
    public final List f164031c;

    /* renamed from: com.stockbit.usecase.transferasset.model.a$a, reason: collision with other inner class name */
    public static final class C1700a {

        /* renamed from: a, reason: collision with root package name */
        public final String f164032a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f164033b;

        public C1700a(String r2, BigDecimal r3) {
            p.l(r2, "stockCode");
            p.l(r3, "lot");
            this.f164032a = r2;
            this.f164033b = r3;
        }

        public final BigDecimal a() {
            return this.f164033b;
        }

        public final String b() {
            return this.f164032a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1700a) == true) goto L8;
            return false;
        L8:
            C1700a r52 = (C1700a) r5;
            if (p.g(this.f164032a, r52.f164032a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f164033b, r52.f164033b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f164032a.hashCode() * 31) + this.f164033b.hashCode();
        }

        public String toString() {
            return "StockData(stockCode=" + this.f164032a + ", lot=" + this.f164033b + ")";
        }
    }

    public a(String r2, String r3, List r4) {
        p.l(r2, "fromAccNo");
        p.l(r3, "toAccNo");
        p.l(r4, "stockData");
        this.f164029a = r2;
        this.f164030b = r3;
        this.f164031c = r4;
    }

    public final String a() {
        return this.f164029a;
    }

    public final List b() {
        return this.f164031c;
    }

    public final String c() {
        return this.f164030b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f164029a, r52.f164029a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164030b, r52.f164030b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f164031c, r52.f164031c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f164029a.hashCode() * 31) + this.f164030b.hashCode()) * 31) + this.f164031c.hashCode();
    }

    public String toString() {
        return "PostTransferStockUIParam(fromAccNo=" + this.f164029a + ", toAccNo=" + this.f164030b + ", stockData=" + this.f164031c + ")";
    }
}
