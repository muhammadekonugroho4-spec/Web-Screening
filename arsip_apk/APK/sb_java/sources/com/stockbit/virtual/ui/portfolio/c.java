package com.stockbit.virtual.ui.portfolio;

import com.stockbit.domain.model.entity.virtual.TradingPortfolioResult;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final TradingPortfolioResult f167117a;

        /* renamed from: b, reason: collision with root package name */
        public final int f167118b;

        public a(TradingPortfolioResult r2, int r3) {
            p.l(r2, "tradingPortfolioResult");
            super(null);
            this.f167117a = r2;
            this.f167118b = r3;
        }

        public final int a() {
            return this.f167118b;
        }

        public final TradingPortfolioResult b() {
            return this.f167117a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f167117a, r52.f167117a) == true) goto L12;
            return false;
        L12:
            if (this.f167118b == r52.f167118b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f167117a.hashCode() * 31) + Integer.hashCode(this.f167118b);
        }

        public String toString() {
            return "OpenBuy(tradingPortfolioResult=" + this.f167117a + ", position=" + this.f167118b + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final TradingPortfolioResult f167119a;

        /* renamed from: b, reason: collision with root package name */
        public final int f167120b;

        public b(TradingPortfolioResult r2, int r3) {
            p.l(r2, "tradingPortfolioResult");
            super(null);
            this.f167119a = r2;
            this.f167120b = r3;
        }

        public final int a() {
            return this.f167120b;
        }

        public final TradingPortfolioResult b() {
            return this.f167119a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f167119a, r52.f167119a) == true) goto L12;
            return false;
        L12:
            if (this.f167120b == r52.f167120b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f167119a.hashCode() * 31) + Integer.hashCode(this.f167120b);
        }

        public String toString() {
            return "OpenDetailVirtualPortfolio(tradingPortfolioResult=" + this.f167119a + ", position=" + this.f167120b + ')';
        }
    }

    /* renamed from: com.stockbit.virtual.ui.portfolio.c$c, reason: collision with other inner class name */
    public static final class C1757c extends c {

        /* renamed from: a, reason: collision with root package name */
        public final int f167121a;

        public C1757c(int r2) {
            super(null);
            this.f167121a = r2;
        }

        public final int a() {
            return this.f167121a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof C1757c) == true) goto L9;
            return false;
        L9:
            if (this.f167121a == ((C1757c) r4).f167121a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f167121a);
        }

        public String toString() {
            return "OpenLoginRealSecurities(position=" + this.f167121a + ')';
        }
    }

    public static final class d extends c {

        /* renamed from: a, reason: collision with root package name */
        public final TradingPortfolioResult f167122a;

        /* renamed from: b, reason: collision with root package name */
        public final int f167123b;

        public d(TradingPortfolioResult r2, int r3) {
            p.l(r2, "tradingPortfolioResult");
            super(null);
            this.f167122a = r2;
            this.f167123b = r3;
        }

        public final int a() {
            return this.f167123b;
        }

        public final TradingPortfolioResult b() {
            return this.f167122a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (p.g(this.f167122a, r52.f167122a) == true) goto L12;
            return false;
        L12:
            if (this.f167123b == r52.f167123b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f167122a.hashCode() * 31) + Integer.hashCode(this.f167123b);
        }

        public String toString() {
            return "OpenSell(tradingPortfolioResult=" + this.f167122a + ", position=" + this.f167123b + ')';
        }
    }

    public static final class e extends c {

        /* renamed from: a, reason: collision with root package name */
        public final int f167124a;

        public e(int r2) {
            super(null);
            this.f167124a = r2;
        }

        public final int a() {
            return this.f167124a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof e) == true) goto L9;
            return false;
        L9:
            if (this.f167124a == ((e) r4).f167124a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f167124a);
        }

        public String toString() {
            return "RefreshVirtualPortfolioData(position=" + this.f167124a + ')';
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
