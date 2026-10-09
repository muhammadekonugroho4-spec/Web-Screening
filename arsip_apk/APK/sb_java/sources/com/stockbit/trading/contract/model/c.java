package com.stockbit.trading.contract.model;

import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f146248a = null;

        static {
            f146248a = new a();
        }

        public a() {
        }

        public boolean equals(Object r2) {
            if (this != r2) goto L6;
            return true;
        L6:
            if ((r2 instanceof a) == true) goto L9;
            return false;
        L9:
            return true;
        }

        public int hashCode() {
            return 755665160;
        }

        public String toString() {
            return "OpenOrderTab";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final int f146249a;

        public b(int r1) {
            this.f146249a = r1;
        }

        public final int a() {
            return this.f146249a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (this.f146249a == ((b) r4).f146249a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f146249a);
        }

        public String toString() {
            return "OpenTradingSection(section=" + this.f146249a + ')';
        }
    }

    /* renamed from: com.stockbit.trading.contract.model.c$c, reason: collision with other inner class name */
    public static final class C1328c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final com.stockbit.trading.contract.model.a f146250a;

        /* renamed from: b, reason: collision with root package name */
        public final com.stockbit.trading.contract.model.a f146251b;

        /* renamed from: c, reason: collision with root package name */
        public final com.stockbit.trading.contract.model.a f146252c;

        public C1328c(com.stockbit.trading.contract.model.a r2, com.stockbit.trading.contract.model.a r3, com.stockbit.trading.contract.model.a r4) {
            p.l(r2, "stocks");
            p.l(r3, "bonds");
            p.l(r4, "portfolio");
            this.f146250a = r2;
            this.f146251b = r3;
            this.f146252c = r4;
        }

        public final com.stockbit.trading.contract.model.a a() {
            return this.f146251b;
        }

        public final com.stockbit.trading.contract.model.a b() {
            return this.f146252c;
        }

        public final com.stockbit.trading.contract.model.a c() {
            return this.f146250a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1328c) == true) goto L8;
            return false;
        L8:
            C1328c r52 = (C1328c) r5;
            if (p.g(this.f146250a, r52.f146250a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f146251b, r52.f146251b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f146252c, r52.f146252c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f146250a.hashCode() * 31) + this.f146251b.hashCode()) * 31) + this.f146252c.hashCode();
        }

        public String toString() {
            return "SetPortfolioFilterValue(stocks=" + this.f146250a + ", bonds=" + this.f146251b + ", portfolio=" + this.f146252c + ')';
        }
    }
}
