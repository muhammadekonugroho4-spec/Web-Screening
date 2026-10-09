package com.stockbit.domain.param.transferasset;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87617a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87618b;

    /* renamed from: c, reason: collision with root package name */
    public final List f87619c;

    /* renamed from: com.stockbit.domain.param.transferasset.a$a, reason: collision with other inner class name */
    public static final class C0823a {

        /* renamed from: a, reason: collision with root package name */
        public final String f87620a;

        /* renamed from: b, reason: collision with root package name */
        public final int f87621b;

        public C0823a(String r2, int r3) {
            p.l(r2, "stockCode");
            this.f87620a = r2;
            this.f87621b = r3;
        }

        public final int a() {
            return this.f87621b;
        }

        public final String b() {
            return this.f87620a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0823a) == true) goto L8;
            return false;
        L8:
            C0823a r52 = (C0823a) r5;
            if (p.g(this.f87620a, r52.f87620a) == true) goto L12;
            return false;
        L12:
            if (this.f87621b == r52.f87621b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87620a.hashCode() * 31) + Integer.hashCode(this.f87621b);
        }

        public String toString() {
            return "StockData(stockCode=" + this.f87620a + ", shares=" + this.f87621b + ")";
        }
    }

    public a(String r2, String r3, List r4) {
        p.l(r2, "fromAccNo");
        p.l(r3, "toAccNo");
        p.l(r4, "stockData");
        this.f87617a = r2;
        this.f87618b = r3;
        this.f87619c = r4;
    }

    public final String a() {
        return this.f87617a;
    }

    public final List b() {
        return this.f87619c;
    }

    public final String c() {
        return this.f87618b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87617a, r52.f87617a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87618b, r52.f87618b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87619c, r52.f87619c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87617a.hashCode() * 31) + this.f87618b.hashCode()) * 31) + this.f87619c.hashCode();
    }

    public String toString() {
        return "PostTransferStockDomainParam(fromAccNo=" + this.f87617a + ", toAccNo=" + this.f87618b + ", stockData=" + this.f87619c + ")";
    }
}
