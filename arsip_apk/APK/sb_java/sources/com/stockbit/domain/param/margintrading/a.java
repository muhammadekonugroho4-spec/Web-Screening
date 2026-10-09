package com.stockbit.domain.param.margintrading;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f87413a;

    /* renamed from: com.stockbit.domain.param.margintrading.a$a, reason: collision with other inner class name */
    public static final class C0821a {

        /* renamed from: a, reason: collision with root package name */
        public final long f87414a;

        public C0821a(long r1) {
            this.f87414a = r1;
        }

        public final long a() {
            return this.f87414a;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0821a) == true) goto L9;
            return false;
        L9:
            if (this.f87414a == ((C0821a) r8).f87414a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Long.hashCode(this.f87414a);
        }

        public String toString() {
            return "CollateralCashRequest(amount=" + this.f87414a + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f87415a;

        /* renamed from: b, reason: collision with root package name */
        public final C0821a f87416b;

        /* renamed from: c, reason: collision with root package name */
        public final List f87417c;

        public b(String r2, C0821a r3, List r4) {
            p.l(r2, "accountNumber");
            p.l(r3, "cash");
            p.l(r4, "stocks");
            this.f87415a = r2;
            this.f87416b = r3;
            this.f87417c = r4;
        }

        public final String a() {
            return this.f87415a;
        }

        public final C0821a b() {
            return this.f87416b;
        }

        public final List c() {
            return this.f87417c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f87415a, r52.f87415a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f87416b, r52.f87416b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f87417c, r52.f87417c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f87415a.hashCode() * 31) + this.f87416b.hashCode()) * 31) + this.f87417c.hashCode();
        }

        public String toString() {
            return "CollateralRequestData(accountNumber=" + this.f87415a + ", cash=" + this.f87416b + ", stocks=" + this.f87417c + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f87418a;

        /* renamed from: b, reason: collision with root package name */
        public final int f87419b;

        public c(String r2, int r3) {
            p.l(r2, "stockCode");
            this.f87418a = r2;
            this.f87419b = r3;
        }

        public final int a() {
            return this.f87419b;
        }

        public final String b() {
            return this.f87418a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f87418a, r52.f87418a) == true) goto L12;
            return false;
        L12:
            if (this.f87419b == r52.f87419b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f87418a.hashCode() * 31) + Integer.hashCode(this.f87419b);
        }

        public String toString() {
            return "CollateralStockRequest(stockCode=" + this.f87418a + ", shares=" + this.f87419b + ")";
        }
    }

    public a(List r2) {
        p.l(r2, "collaterals");
        this.f87413a = r2;
    }

    public final List a() {
        return this.f87413a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof a) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f87413a, ((a) r4).f87413a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f87413a.hashCode();
    }

    public String toString() {
        return "CollateralRequestDomainParam(collaterals=" + this.f87413a + ")";
    }
}
