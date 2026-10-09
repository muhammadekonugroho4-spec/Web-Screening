package com.stockbit.feature.portfolio.ui;

import com.stockbit.domain.model.entity.securities.TradingPortfolioResult;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: com.stockbit.feature.portfolio.ui.a$a, reason: collision with other inner class name */
    public static final class C0956a extends a {
        public abstract List a();
    }

    public static final class b extends a {
        public abstract TradingPortfolioResult a();
    }

    public static final class c extends a {
        public abstract TradingPortfolioResult a();
    }

    public static final class d extends a {
        public abstract TradingPortfolioResult a();
    }

    public static final class e extends a {
        public abstract TradingPortfolioResult a();

        public abstract boolean b();
    }

    public static final class f extends a {
        public abstract TradingPortfolioResult a();
    }

    public static final class g extends a {
        public abstract TradingPortfolioResult a();
    }

    public static final class h extends a {

        /* renamed from: a, reason: collision with root package name */
        public final int f106077a;

        static {
        }

        public h(int r2) {
            super(null);
            this.f106077a = r2;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof h) == true) goto L9;
            return false;
        L9:
            if (this.f106077a == ((h) r4).f106077a) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return Integer.hashCode(this.f106077a);
        }

        public String toString() {
            return "RefreshPortfolioData(position=" + this.f106077a + ')';
        }
    }

    public static final class i extends a {

        /* renamed from: a, reason: collision with root package name */
        public final String f106078a;

        static {
        }

        public i(String r2) {
            p.l(r2, "percent");
            super(null);
            this.f106078a = r2;
        }

        public final String a() {
            return this.f106078a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof i) == true) goto L9;
            return false;
        L9:
            if (p.g(this.f106078a, ((i) r4).f106078a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f106078a.hashCode();
        }

        public String toString() {
            return "SharePortfolio(percent=" + this.f106078a + ')';
        }
    }

    static {
    }

    public /* synthetic */ a(kotlin.jvm.internal.i r1) {
        this();
    }

    public a() {
    }
}
