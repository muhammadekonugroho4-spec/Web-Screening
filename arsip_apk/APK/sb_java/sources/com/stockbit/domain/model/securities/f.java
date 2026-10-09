package com.stockbit.domain.model.securities;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final a f85118a;

    /* renamed from: b, reason: collision with root package name */
    public final b f85119b;

    /* renamed from: c, reason: collision with root package name */
    public final d f85120c;
    public final g d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C0786a f85121a;

        /* renamed from: com.stockbit.domain.model.securities.f$a$a, reason: collision with other inner class name */
        public static final class C0786a {

            /* renamed from: a, reason: collision with root package name */
            public final C0787a f85122a;

            /* renamed from: b, reason: collision with root package name */
            public final BigDecimal f85123b;

            /* renamed from: c, reason: collision with root package name */
            public final BigDecimal f85124c;
            public final BigDecimal d;

            /* renamed from: e, reason: collision with root package name */
            public final c f85125e;

            /* renamed from: f, reason: collision with root package name */
            public final String f85126f;

            /* renamed from: g, reason: collision with root package name */
            public final e f85127g;

            /* renamed from: h, reason: collision with root package name */
            public final e f85128h;

            /* renamed from: i, reason: collision with root package name */
            public final BigDecimal f85129i;

            /* renamed from: j, reason: collision with root package name */
            public final BigDecimal f85130j;

            /* renamed from: k, reason: collision with root package name */
            public final e f85131k;

            /* renamed from: l, reason: collision with root package name */
            public final String f85132l;

            /* renamed from: com.stockbit.domain.model.securities.f$a$a$a, reason: collision with other inner class name */
            public static final class C0787a {

                /* renamed from: a, reason: collision with root package name */
                public final BigDecimal f85133a;

                /* renamed from: b, reason: collision with root package name */
                public final BigDecimal f85134b;

                /* renamed from: c, reason: collision with root package name */
                public final BigDecimal f85135c;
                public final BigDecimal d;

                public C0787a(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5) {
                    kotlin.jvm.internal.p.l(r2, "amount");
                    kotlin.jvm.internal.p.l(r3, "amountExcludeTax");
                    kotlin.jvm.internal.p.l(r4, "amountNett");
                    kotlin.jvm.internal.p.l(r5, "dailyAmountNett");
                    this.f85133a = r2;
                    this.f85134b = r3;
                    this.f85135c = r4;
                    this.d = r5;
                }

                public final BigDecimal a() {
                    return this.f85133a;
                }

                public final BigDecimal b() {
                    return this.f85134b;
                }

                public final BigDecimal c() {
                    return this.f85135c;
                }

                public final BigDecimal d() {
                    return this.d;
                }

                public boolean equals(Object r5) {
                    if (this != r5) goto L6;
                    return true;
                L6:
                    if ((r5 instanceof C0787a) == true) goto L8;
                    return false;
                L8:
                    C0787a r52 = (C0787a) r5;
                    if (kotlin.jvm.internal.p.g(this.f85133a, r52.f85133a) == true) goto L12;
                    return false;
                L12:
                    if (kotlin.jvm.internal.p.g(this.f85134b, r52.f85134b) == true) goto L15;
                    return false;
                L15:
                    if (kotlin.jvm.internal.p.g(this.f85135c, r52.f85135c) == true) goto L18;
                    return false;
                L18:
                    if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
                    return false;
                L20:
                    return true;
                }

                public int hashCode() {
                    return (((((this.f85133a.hashCode() * 31) + this.f85134b.hashCode()) * 31) + this.f85135c.hashCode()) * 31) + this.d.hashCode();
                }

                public String toString() {
                    return "AccruedInterest(amount=" + this.f85133a + ", amountExcludeTax=" + this.f85134b + ", amountNett=" + this.f85135c + ", dailyAmountNett=" + this.d + ")";
                }
            }

            public C0786a(C0787a r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, c r6, String r7, e r8, e r9, BigDecimal r10, BigDecimal r11, e r12, String r13) {
                kotlin.jvm.internal.p.l(r2, "accruedInterest");
                kotlin.jvm.internal.p.l(r3, "amountNett");
                kotlin.jvm.internal.p.l(r4, "bondTax");
                kotlin.jvm.internal.p.l(r5, "capitalGainLossNett");
                kotlin.jvm.internal.p.l(r6, Constants.KEY_DATE);
                kotlin.jvm.internal.p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
                kotlin.jvm.internal.p.l(r8, "profitLossNett");
                kotlin.jvm.internal.p.l(r9, "sell");
                kotlin.jvm.internal.p.l(r10, "sellerCoupon");
                kotlin.jvm.internal.p.l(r11, "stampDuty");
                kotlin.jvm.internal.p.l(r12, "totalRealizedNett");
                kotlin.jvm.internal.p.l(r13, "units");
                this.f85122a = r2;
                this.f85123b = r3;
                this.f85124c = r4;
                this.d = r5;
                this.f85125e = r6;
                this.f85126f = r7;
                this.f85127g = r8;
                this.f85128h = r9;
                this.f85129i = r10;
                this.f85130j = r11;
                this.f85131k = r12;
                this.f85132l = r13;
            }

            public final C0787a a() {
                return this.f85122a;
            }

            public final BigDecimal b() {
                return this.f85123b;
            }

            public final BigDecimal c() {
                return this.f85124c;
            }

            public final BigDecimal d() {
                return this.d;
            }

            public final c e() {
                return this.f85125e;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof C0786a) == true) goto L8;
                return false;
            L8:
                C0786a r52 = (C0786a) r5;
                if (kotlin.jvm.internal.p.g(this.f85122a, r52.f85122a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85123b, r52.f85123b) == true) goto L15;
                return false;
            L15:
                if (kotlin.jvm.internal.p.g(this.f85124c, r52.f85124c) == true) goto L18;
                return false;
            L18:
                if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
                return false;
            L21:
                if (kotlin.jvm.internal.p.g(this.f85125e, r52.f85125e) == true) goto L24;
                return false;
            L24:
                if (kotlin.jvm.internal.p.g(this.f85126f, r52.f85126f) == true) goto L27;
                return false;
            L27:
                if (kotlin.jvm.internal.p.g(this.f85127g, r52.f85127g) == true) goto L30;
                return false;
            L30:
                if (kotlin.jvm.internal.p.g(this.f85128h, r52.f85128h) == true) goto L33;
                return false;
            L33:
                if (kotlin.jvm.internal.p.g(this.f85129i, r52.f85129i) == true) goto L36;
                return false;
            L36:
                if (kotlin.jvm.internal.p.g(this.f85130j, r52.f85130j) == true) goto L39;
                return false;
            L39:
                if (kotlin.jvm.internal.p.g(this.f85131k, r52.f85131k) == true) goto L42;
                return false;
            L42:
                if (kotlin.jvm.internal.p.g(this.f85132l, r52.f85132l) == true) goto L44;
                return false;
            L44:
                return true;
            }

            public final String f() {
                return this.f85126f;
            }

            public final e g() {
                return this.f85127g;
            }

            public final e h() {
                return this.f85128h;
            }

            public int hashCode() {
                return (((((((((((((((((((((this.f85122a.hashCode() * 31) + this.f85123b.hashCode()) * 31) + this.f85124c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85125e.hashCode()) * 31) + this.f85126f.hashCode()) * 31) + this.f85127g.hashCode()) * 31) + this.f85128h.hashCode()) * 31) + this.f85129i.hashCode()) * 31) + this.f85130j.hashCode()) * 31) + this.f85131k.hashCode()) * 31) + this.f85132l.hashCode();
            }

            public final BigDecimal i() {
                return this.f85129i;
            }

            public final BigDecimal j() {
                return this.f85130j;
            }

            public final e k() {
                return this.f85131k;
            }

            public final String l() {
                return this.f85132l;
            }

            public String toString() {
                return "Detail(accruedInterest=" + this.f85122a + ", amountNett=" + this.f85123b + ", bondTax=" + this.f85124c + ", capitalGainLossNett=" + this.d + ", date=" + this.f85125e + ", name=" + this.f85126f + ", profitLossNett=" + this.f85127g + ", sell=" + this.f85128h + ", sellerCoupon=" + this.f85129i + ", stampDuty=" + this.f85130j + ", totalRealizedNett=" + this.f85131k + ", units=" + this.f85132l + ")";
            }
        }

        public a(C0786a r2) {
            kotlin.jvm.internal.p.l(r2, "detail");
            this.f85121a = r2;
        }

        public final C0786a a() {
            return this.f85121a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof a) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f85121a, ((a) r4).f85121a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f85121a.hashCode();
        }

        public String toString() {
            return "BondRealized(detail=" + this.f85121a + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final a f85136a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f85137a;

            /* renamed from: b, reason: collision with root package name */
            public final BigDecimal f85138b;

            /* renamed from: c, reason: collision with root package name */
            public final String f85139c;
            public final BigDecimal d;

            /* renamed from: e, reason: collision with root package name */
            public final c f85140e;

            /* renamed from: f, reason: collision with root package name */
            public final String f85141f;

            /* renamed from: g, reason: collision with root package name */
            public final BigDecimal f85142g;

            public a(BigDecimal r2, BigDecimal r3, String r4, BigDecimal r5, c r6, String r7, BigDecimal r8) {
                kotlin.jvm.internal.p.l(r2, "amount");
                kotlin.jvm.internal.p.l(r3, "amountNett");
                kotlin.jvm.internal.p.l(r4, "couponRate");
                kotlin.jvm.internal.p.l(r5, "couponTax");
                kotlin.jvm.internal.p.l(r6, Constants.KEY_DATE);
                kotlin.jvm.internal.p.l(r7, AppMeasurementSdk.ConditionalUserProperty.NAME);
                kotlin.jvm.internal.p.l(r8, "shares");
                this.f85137a = r2;
                this.f85138b = r3;
                this.f85139c = r4;
                this.d = r5;
                this.f85140e = r6;
                this.f85141f = r7;
                this.f85142g = r8;
            }

            public final BigDecimal a() {
                return this.f85137a;
            }

            public final BigDecimal b() {
                return this.f85138b;
            }

            public final String c() {
                return this.f85139c;
            }

            public final BigDecimal d() {
                return this.d;
            }

            public final c e() {
                return this.f85140e;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof a) == true) goto L8;
                return false;
            L8:
                a r52 = (a) r5;
                if (kotlin.jvm.internal.p.g(this.f85137a, r52.f85137a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85138b, r52.f85138b) == true) goto L15;
                return false;
            L15:
                if (kotlin.jvm.internal.p.g(this.f85139c, r52.f85139c) == true) goto L18;
                return false;
            L18:
                if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
                return false;
            L21:
                if (kotlin.jvm.internal.p.g(this.f85140e, r52.f85140e) == true) goto L24;
                return false;
            L24:
                if (kotlin.jvm.internal.p.g(this.f85141f, r52.f85141f) == true) goto L27;
                return false;
            L27:
                if (kotlin.jvm.internal.p.g(this.f85142g, r52.f85142g) == true) goto L29;
                return false;
            L29:
                return true;
            }

            public final String f() {
                return this.f85141f;
            }

            public final BigDecimal g() {
                return this.f85142g;
            }

            public int hashCode() {
                return (((((((((((this.f85137a.hashCode() * 31) + this.f85138b.hashCode()) * 31) + this.f85139c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85140e.hashCode()) * 31) + this.f85141f.hashCode()) * 31) + this.f85142g.hashCode();
            }

            public String toString() {
                return "Detail(amount=" + this.f85137a + ", amountNett=" + this.f85138b + ", couponRate=" + this.f85139c + ", couponTax=" + this.d + ", date=" + this.f85140e + ", name=" + this.f85141f + ", shares=" + this.f85142g + ")";
            }
        }

        public b(a r2) {
            kotlin.jvm.internal.p.l(r2, "detail");
            this.f85136a = r2;
        }

        public final a a() {
            return this.f85136a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f85136a, ((b) r4).f85136a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f85136a.hashCode();
        }

        public String toString() {
            return "CouponRealized(detail=" + this.f85136a + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f85143a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85144b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85145c;

        public c(int r1, int r2, int r3) {
            this.f85143a = r1;
            this.f85144b = r2;
            this.f85145c = r3;
        }

        public final int a() {
            return this.f85143a;
        }

        public final int b() {
            return this.f85144b;
        }

        public final int c() {
            return this.f85145c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (this.f85143a == r52.f85143a) goto L12;
            return false;
        L12:
            if (this.f85144b == r52.f85144b) goto L15;
            return false;
        L15:
            if (this.f85145c == r52.f85145c) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f85143a) * 31) + Integer.hashCode(this.f85144b)) * 31) + Integer.hashCode(this.f85145c);
        }

        public String toString() {
            return "Date(day=" + this.f85143a + ", month=" + this.f85144b + ", year=" + this.f85145c + ")";
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final a f85146a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f85147a;

            /* renamed from: b, reason: collision with root package name */
            public final c f85148b;

            /* renamed from: c, reason: collision with root package name */
            public final BigDecimal f85149c;
            public final String d;

            /* renamed from: e, reason: collision with root package name */
            public final String f85150e;

            public a(BigDecimal r2, c r3, BigDecimal r4, String r5, String r6) {
                kotlin.jvm.internal.p.l(r2, "amount");
                kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
                kotlin.jvm.internal.p.l(r4, "dividendPerShares");
                kotlin.jvm.internal.p.l(r5, "shares");
                kotlin.jvm.internal.p.l(r6, "type");
                this.f85147a = r2;
                this.f85148b = r3;
                this.f85149c = r4;
                this.d = r5;
                this.f85150e = r6;
            }

            public final BigDecimal a() {
                return this.f85147a;
            }

            public final c b() {
                return this.f85148b;
            }

            public final BigDecimal c() {
                return this.f85149c;
            }

            public final String d() {
                return this.d;
            }

            public final String e() {
                return this.f85150e;
            }

            public boolean equals(Object r5) {
                if (this != r5) goto L6;
                return true;
            L6:
                if ((r5 instanceof a) == true) goto L8;
                return false;
            L8:
                a r52 = (a) r5;
                if (kotlin.jvm.internal.p.g(this.f85147a, r52.f85147a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85148b, r52.f85148b) == true) goto L15;
                return false;
            L15:
                if (kotlin.jvm.internal.p.g(this.f85149c, r52.f85149c) == true) goto L18;
                return false;
            L18:
                if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
                return false;
            L21:
                if (kotlin.jvm.internal.p.g(this.f85150e, r52.f85150e) == true) goto L23;
                return false;
            L23:
                return true;
            }

            public int hashCode() {
                return (((((((this.f85147a.hashCode() * 31) + this.f85148b.hashCode()) * 31) + this.f85149c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85150e.hashCode();
            }

            public String toString() {
                return "Detail(amount=" + this.f85147a + ", date=" + this.f85148b + ", dividendPerShares=" + this.f85149c + ", shares=" + this.d + ", type=" + this.f85150e + ")";
            }
        }

        public d(a r2) {
            kotlin.jvm.internal.p.l(r2, "detail");
            this.f85146a = r2;
        }

        public final a a() {
            return this.f85146a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof d) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f85146a, ((d) r4).f85146a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f85146a.hashCode();
        }

        public String toString() {
            return "DividendRealized(detail=" + this.f85146a + ")";
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final BigDecimal f85151a;

        /* renamed from: b, reason: collision with root package name */
        public final double f85152b;

        public e(BigDecimal r2, double r3) {
            kotlin.jvm.internal.p.l(r2, "amount");
            this.f85151a = r2;
            this.f85152b = r3;
        }

        public final BigDecimal a() {
            return this.f85151a;
        }

        public final double b() {
            return this.f85152b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof e) == true) goto L8;
            return false;
        L8:
            e r82 = (e) r8;
            if (kotlin.jvm.internal.p.g(this.f85151a, r82.f85151a) == true) goto L12;
            return false;
        L12:
            if (Double.compare(this.f85152b, r82.f85152b) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f85151a.hashCode() * 31) + Double.hashCode(this.f85152b);
        }

        public String toString() {
            return "Nett(amount=" + this.f85151a + ", percentage=" + this.f85152b + ")";
        }
    }

    /* renamed from: com.stockbit.domain.model.securities.f$f, reason: collision with other inner class name */
    public static final class C0788f {

        /* renamed from: a, reason: collision with root package name */
        public final BigDecimal f85153a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f85154b;

        public C0788f(BigDecimal r2, BigDecimal r3) {
            kotlin.jvm.internal.p.l(r2, "buy");
            kotlin.jvm.internal.p.l(r3, "sell");
            this.f85153a = r2;
            this.f85154b = r3;
        }

        public final BigDecimal a() {
            return this.f85153a;
        }

        public final BigDecimal b() {
            return this.f85154b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0788f) == true) goto L8;
            return false;
        L8:
            C0788f r52 = (C0788f) r5;
            if (kotlin.jvm.internal.p.g(this.f85153a, r52.f85153a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f85154b, r52.f85154b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f85153a.hashCode() * 31) + this.f85154b.hashCode();
        }

        public String toString() {
            return "Price(buy=" + this.f85153a + ", sell=" + this.f85154b + ")";
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final a f85155a;

        /* renamed from: b, reason: collision with root package name */
        public final List f85156b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final C0788f f85157a;

            /* renamed from: b, reason: collision with root package name */
            public final c f85158b;

            /* renamed from: c, reason: collision with root package name */
            public final double f85159c;
            public final BigDecimal d;

            /* renamed from: e, reason: collision with root package name */
            public final BigDecimal f85160e;

            /* renamed from: f, reason: collision with root package name */
            public final e f85161f;

            /* renamed from: g, reason: collision with root package name */
            public final BigDecimal f85162g;

            public a(C0788f r2, c r3, double r4, BigDecimal r6, BigDecimal r7, e r8, BigDecimal r9) {
                kotlin.jvm.internal.p.l(r2, "averagePrice");
                kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
                kotlin.jvm.internal.p.l(r6, "netAmount");
                kotlin.jvm.internal.p.l(r7, "realizedAmount");
                kotlin.jvm.internal.p.l(r8, "realizedGain");
                kotlin.jvm.internal.p.l(r9, "totalFee");
                this.f85157a = r2;
                this.f85158b = r3;
                this.f85159c = r4;
                this.d = r6;
                this.f85160e = r7;
                this.f85161f = r8;
                this.f85162g = r9;
            }

            public final C0788f a() {
                return this.f85157a;
            }

            public final c b() {
                return this.f85158b;
            }

            public final double c() {
                return this.f85159c;
            }

            public final BigDecimal d() {
                return this.d;
            }

            public final BigDecimal e() {
                return this.f85160e;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof a) == true) goto L8;
                return false;
            L8:
                a r82 = (a) r8;
                if (kotlin.jvm.internal.p.g(this.f85157a, r82.f85157a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85158b, r82.f85158b) == true) goto L15;
                return false;
            L15:
                if (Double.compare(this.f85159c, r82.f85159c) == 0) goto L18;
                return false;
            L18:
                if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
                return false;
            L21:
                if (kotlin.jvm.internal.p.g(this.f85160e, r82.f85160e) == true) goto L24;
                return false;
            L24:
                if (kotlin.jvm.internal.p.g(this.f85161f, r82.f85161f) == true) goto L27;
                return false;
            L27:
                if (kotlin.jvm.internal.p.g(this.f85162g, r82.f85162g) == true) goto L29;
                return false;
            L29:
                return true;
            }

            public final e f() {
                return this.f85161f;
            }

            public final BigDecimal g() {
                return this.f85162g;
            }

            public int hashCode() {
                return (((((((((((this.f85157a.hashCode() * 31) + this.f85158b.hashCode()) * 31) + Double.hashCode(this.f85159c)) * 31) + this.d.hashCode()) * 31) + this.f85160e.hashCode()) * 31) + this.f85161f.hashCode()) * 31) + this.f85162g.hashCode();
            }

            public String toString() {
                return "Detail(averagePrice=" + this.f85157a + ", date=" + this.f85158b + ", lot=" + this.f85159c + ", netAmount=" + this.d + ", realizedAmount=" + this.f85160e + ", realizedGain=" + this.f85161f + ", totalFee=" + this.f85162g + ")";
            }
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f85163a;

            /* renamed from: b, reason: collision with root package name */
            public final String f85164b;

            /* renamed from: c, reason: collision with root package name */
            public final double f85165c;
            public final double d;

            /* renamed from: e, reason: collision with root package name */
            public final C0788f f85166e;

            /* renamed from: f, reason: collision with root package name */
            public final e f85167f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f85168g;

            public b(BigDecimal r2, String r3, double r4, double r6, C0788f r8, e r9, boolean r10) {
                kotlin.jvm.internal.p.l(r2, "amountInvested");
                kotlin.jvm.internal.p.l(r3, "createdAt");
                kotlin.jvm.internal.p.l(r8, FirebaseAnalytics.Param.PRICE);
                kotlin.jvm.internal.p.l(r9, "profitLoss");
                this.f85163a = r2;
                this.f85164b = r3;
                this.f85165c = r4;
                this.d = r6;
                this.f85166e = r8;
                this.f85167f = r9;
                this.f85168g = r10;
            }

            public final BigDecimal a() {
                return this.f85163a;
            }

            public final String b() {
                return this.f85164b;
            }

            public final boolean c() {
                return this.f85168g;
            }

            public final double d() {
                return this.f85165c;
            }

            public final double e() {
                return this.d;
            }

            public boolean equals(Object r8) {
                if (this != r8) goto L6;
                return true;
            L6:
                if ((r8 instanceof b) == true) goto L8;
                return false;
            L8:
                b r82 = (b) r8;
                if (kotlin.jvm.internal.p.g(this.f85163a, r82.f85163a) == true) goto L12;
                return false;
            L12:
                if (kotlin.jvm.internal.p.g(this.f85164b, r82.f85164b) == true) goto L15;
                return false;
            L15:
                if (Double.compare(this.f85165c, r82.f85165c) == 0) goto L18;
                return false;
            L18:
                if (Double.compare(this.d, r82.d) == 0) goto L21;
                return false;
            L21:
                if (kotlin.jvm.internal.p.g(this.f85166e, r82.f85166e) == true) goto L24;
                return false;
            L24:
                if (kotlin.jvm.internal.p.g(this.f85167f, r82.f85167f) == true) goto L27;
                return false;
            L27:
                if (this.f85168g == r82.f85168g) goto L29;
                return false;
            L29:
                return true;
            }

            public final C0788f f() {
                return this.f85166e;
            }

            public final e g() {
                return this.f85167f;
            }

            public int hashCode() {
                return (((((((((((this.f85163a.hashCode() * 31) + this.f85164b.hashCode()) * 31) + Double.hashCode(this.f85165c)) * 31) + Double.hashCode(this.d)) * 31) + this.f85166e.hashCode()) * 31) + this.f85167f.hashCode()) * 31) + Boolean.hashCode(this.f85168g);
            }

            public String toString() {
                return "Trade(amountInvested=" + this.f85163a + ", createdAt=" + this.f85164b + ", lot=" + this.f85165c + ", market=" + this.d + ", price=" + this.f85166e + ", profitLoss=" + this.f85167f + ", forcedSell=" + this.f85168g + ")";
            }
        }

        public g(a r2, List r3) {
            kotlin.jvm.internal.p.l(r2, "detail");
            kotlin.jvm.internal.p.l(r3, "trades");
            this.f85155a = r2;
            this.f85156b = r3;
        }

        public final a a() {
            return this.f85155a;
        }

        public final List b() {
            return this.f85156b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof g) == true) goto L8;
            return false;
        L8:
            g r52 = (g) r5;
            if (kotlin.jvm.internal.p.g(this.f85155a, r52.f85155a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f85156b, r52.f85156b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f85155a.hashCode() * 31) + this.f85156b.hashCode();
        }

        public String toString() {
            return "StockRealized(detail=" + this.f85155a + ", trades=" + this.f85156b + ")";
        }
    }

    public f(a r1, b r2, d r3, g r4) {
        this.f85118a = r1;
        this.f85119b = r2;
        this.f85120c = r3;
        this.d = r4;
    }

    public final a a() {
        return this.f85118a;
    }

    public final b b() {
        return this.f85119b;
    }

    public final d c() {
        return this.f85120c;
    }

    public final g d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (kotlin.jvm.internal.p.g(this.f85118a, r52.f85118a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85119b, r52.f85119b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85120c, r52.f85120c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        a r02 = this.f85118a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        b r2 = this.f85119b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        d r23 = this.f85120c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        g r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return r06 + r1;
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "HistoryRealizedDetailEntity(bondRealized=" + this.f85118a + ", couponRealized=" + this.f85119b + ", dividendRealized=" + this.f85120c + ", stockRealized=" + this.d + ")";
    }
}
