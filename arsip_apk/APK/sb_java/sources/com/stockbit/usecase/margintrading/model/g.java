package com.stockbit.usecase.margintrading.model;

import com.clevertap.android.sdk.Constants;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f158439a;

    /* renamed from: b, reason: collision with root package name */
    public final List f158440b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f158441a;

        /* renamed from: b, reason: collision with root package name */
        public final String f158442b;

        /* renamed from: c, reason: collision with root package name */
        public final double f158443c;
        public final BigDecimal d;

        /* renamed from: e, reason: collision with root package name */
        public final BigDecimal f158444e;

        /* renamed from: f, reason: collision with root package name */
        public final BigDecimal f158445f;

        /* renamed from: g, reason: collision with root package name */
        public final BigDecimal f158446g;

        /* renamed from: h, reason: collision with root package name */
        public final BigDecimal f158447h;

        /* renamed from: i, reason: collision with root package name */
        public final BigDecimal f158448i;

        /* renamed from: j, reason: collision with root package name */
        public final BigDecimal f158449j;

        public a(String r2, String r3, double r4, BigDecimal r6, BigDecimal r7, BigDecimal r8, BigDecimal r9, BigDecimal r10, BigDecimal r11, BigDecimal r12) {
            p.l(r2, Constants.KEY_ID);
            p.l(r3, "code");
            p.l(r6, "haircut");
            p.l(r7, "invested");
            p.l(r8, "avgPrice");
            p.l(r9, "market");
            p.l(r10, "currentPrice");
            p.l(r11, "profitLoss");
            p.l(r12, "gain");
            this.f158441a = r2;
            this.f158442b = r3;
            this.f158443c = r4;
            this.d = r6;
            this.f158444e = r7;
            this.f158445f = r8;
            this.f158446g = r9;
            this.f158447h = r10;
            this.f158448i = r11;
            this.f158449j = r12;
        }

        public final BigDecimal a() {
            return this.f158445f;
        }

        public final String b() {
            return this.f158442b;
        }

        public final BigDecimal c() {
            return this.f158447h;
        }

        public final BigDecimal d() {
            return this.f158449j;
        }

        public final BigDecimal e() {
            return this.d;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof a) == true) goto L8;
            return false;
        L8:
            a r82 = (a) r8;
            if (p.g(this.f158441a, r82.f158441a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f158442b, r82.f158442b) == true) goto L15;
            return false;
        L15:
            if (Double.compare(this.f158443c, r82.f158443c) == 0) goto L18;
            return false;
        L18:
            if (p.g(this.d, r82.d) == true) goto L21;
            return false;
        L21:
            if (p.g(this.f158444e, r82.f158444e) == true) goto L24;
            return false;
        L24:
            if (p.g(this.f158445f, r82.f158445f) == true) goto L27;
            return false;
        L27:
            if (p.g(this.f158446g, r82.f158446g) == true) goto L30;
            return false;
        L30:
            if (p.g(this.f158447h, r82.f158447h) == true) goto L33;
            return false;
        L33:
            if (p.g(this.f158448i, r82.f158448i) == true) goto L36;
            return false;
        L36:
            if (p.g(this.f158449j, r82.f158449j) == true) goto L38;
            return false;
        L38:
            return true;
        }

        public final String f() {
            return this.f158441a;
        }

        public final BigDecimal g() {
            return this.f158444e;
        }

        public final BigDecimal h() {
            return this.f158446g;
        }

        public int hashCode() {
            return (((((((((((((((((this.f158441a.hashCode() * 31) + this.f158442b.hashCode()) * 31) + Double.hashCode(this.f158443c)) * 31) + this.d.hashCode()) * 31) + this.f158444e.hashCode()) * 31) + this.f158445f.hashCode()) * 31) + this.f158446g.hashCode()) * 31) + this.f158447h.hashCode()) * 31) + this.f158448i.hashCode()) * 31) + this.f158449j.hashCode();
        }

        public final BigDecimal i() {
            return this.f158448i;
        }

        public final double j() {
            return this.f158443c;
        }

        public String toString() {
            return "Stock(id=" + this.f158441a + ", code=" + this.f158442b + ", totalLot=" + this.f158443c + ", haircut=" + this.d + ", invested=" + this.f158444e + ", avgPrice=" + this.f158445f + ", market=" + this.f158446g + ", currentPrice=" + this.f158447h + ", profitLoss=" + this.f158448i + ", gain=" + this.f158449j + ")";
        }
    }

    public g(List r2, List r3) {
        p.l(r2, "stocks");
        p.l(r3, "frBonds");
        this.f158439a = r2;
        this.f158440b = r3;
    }

    public final List a() {
        return this.f158440b;
    }

    public final List b() {
        return this.f158439a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f158439a, r52.f158439a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158440b, r52.f158440b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f158439a.hashCode() * 31) + this.f158440b.hashCode();
    }

    public String toString() {
        return "StockAndFrBondUIState(stocks=" + this.f158439a + ", frBonds=" + this.f158440b + ")";
    }
}
