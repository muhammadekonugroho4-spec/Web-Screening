package com.stockbit.company.ui.orderbook.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67596a;

    /* renamed from: b, reason: collision with root package name */
    public final C0689a f67597b;

    /* renamed from: c, reason: collision with root package name */
    public final C0689a f67598c;

    /* renamed from: com.stockbit.company.ui.orderbook.model.a$a, reason: collision with other inner class name */
    public static final class C0689a {

        /* renamed from: a, reason: collision with root package name */
        public final List f67599a;

        /* renamed from: b, reason: collision with root package name */
        public final List f67600b;

        /* renamed from: c, reason: collision with root package name */
        public final List f67601c;
        public final List d;

        /* renamed from: e, reason: collision with root package name */
        public final double f67602e;

        static {
        }

        public C0689a(List r2, List r3, List r4, List r5, double r6) {
            p.l(r2, "freq");
            p.l(r3, "volume");
            p.l(r4, FirebaseAnalytics.Param.PRICE);
            p.l(r5, "lot");
            this.f67599a = r2;
            this.f67600b = r3;
            this.f67601c = r4;
            this.d = r5;
            this.f67602e = r6;
        }

        public final List a() {
            return this.f67599a;
        }

        public final List b() {
            return this.d;
        }

        public final double c() {
            return this.f67602e;
        }

        public final List d() {
            return this.f67601c;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C0689a) == true) goto L8;
            return false;
        L8:
            C0689a r82 = (C0689a) r8;
            if (p.g(this.f67599a, r82.f67599a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f67600b, r82.f67600b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f67601c, r82.f67601c) == true) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (Double.compare(this.f67602e, r82.f67602e) == 0) goto L23;
            return false;
        L23:
            return true;
        }

        public int hashCode() {
            return (((((((this.f67599a.hashCode() * 31) + this.f67600b.hashCode()) * 31) + this.f67601c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f67602e);
        }

        public String toString() {
            return "OrderBookCalculationBidAsk(freq=" + this.f67599a + ", volume=" + this.f67600b + ", price=" + this.f67601c + ", lot=" + this.d + ", maxLot=" + this.f67602e + ')';
        }
    }

    static {
    }

    public a(boolean r2, C0689a r3, C0689a r4) {
        p.l(r3, "bid");
        p.l(r4, "ask");
        this.f67596a = r2;
        this.f67597b = r3;
        this.f67598c = r4;
    }

    public final C0689a a() {
        return this.f67598c;
    }

    public final C0689a b() {
        return this.f67597b;
    }

    public final boolean c() {
        return this.f67596a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f67596a == r52.f67596a) goto L12;
        return false;
    L12:
        if (p.g(this.f67597b, r52.f67597b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f67598c, r52.f67598c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f67596a) * 31) + this.f67597b.hashCode()) * 31) + this.f67598c.hashCode();
    }

    public String toString() {
        return "OrderBookCalculationParam(isDataExist=" + this.f67596a + ", bid=" + this.f67597b + ", ask=" + this.f67598c + ')';
    }
}
