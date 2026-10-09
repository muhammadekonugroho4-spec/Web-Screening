package com.stockbit.feature.transaction.ui.fasttrade.model;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public abstract class d {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final BigDecimal f114055a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f114056b;

        /* renamed from: c, reason: collision with root package name */
        public final BigDecimal f114057c;

        static {
        }

        public a(BigDecimal r2, BigDecimal r3, BigDecimal r4) {
            p.l(r2, "balance");
            p.l(r3, "orderPrice");
            p.l(r4, "orderLot");
            super(null);
            this.f114055a = r2;
            this.f114056b = r3;
            this.f114057c = r4;
        }

        public final BigDecimal a() {
            return this.f114055a;
        }

        public final BigDecimal b() {
            return this.f114057c;
        }

        public final BigDecimal c() {
            return this.f114056b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f114055a, r52.f114055a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f114056b, r52.f114056b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f114057c, r52.f114057c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f114055a.hashCode() * 31) + this.f114056b.hashCode()) * 31) + this.f114057c.hashCode();
        }

        public String toString() {
            return "AmendBuy(balance=" + this.f114055a + ", orderPrice=" + this.f114056b + ", orderLot=" + this.f114057c + ')';
        }
    }

    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final b f114058a = null;

        static {
            f114058a = new b();
        }

        public b() {
            super(null);
        }
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final BigDecimal f114059a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f114060b;

        /* renamed from: c, reason: collision with root package name */
        public final BigDecimal f114061c;

        static {
        }

        public c(BigDecimal r2, BigDecimal r3, BigDecimal r4) {
            p.l(r2, "balance");
            p.l(r3, "orderPrice");
            p.l(r4, "orderLot");
            super(null);
            this.f114059a = r2;
            this.f114060b = r3;
            this.f114061c = r4;
        }

        public final BigDecimal a() {
            return this.f114059a;
        }

        public final BigDecimal b() {
            return this.f114061c;
        }

        public final BigDecimal c() {
            return this.f114060b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof c) == true) goto L8;
            return false;
        L8:
            c r52 = (c) r5;
            if (p.g(this.f114059a, r52.f114059a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f114060b, r52.f114060b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f114061c, r52.f114061c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f114059a.hashCode() * 31) + this.f114060b.hashCode()) * 31) + this.f114061c.hashCode();
        }

        public String toString() {
            return "Buy(balance=" + this.f114059a + ", orderPrice=" + this.f114060b + ", orderLot=" + this.f114061c + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.model.d$d, reason: collision with other inner class name */
    public static final class C0998d extends d {

        /* renamed from: a, reason: collision with root package name */
        public final BigDecimal f114062a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f114063b;

        static {
        }

        public C0998d(BigDecimal r2, BigDecimal r3) {
            p.l(r2, "ownedLot");
            p.l(r3, "orderLot");
            super(null);
            this.f114062a = r2;
            this.f114063b = r3;
        }

        public final BigDecimal a() {
            return this.f114063b;
        }

        public final BigDecimal b() {
            return this.f114062a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0998d) == true) goto L8;
            return false;
        L8:
            C0998d r52 = (C0998d) r5;
            if (p.g(this.f114062a, r52.f114062a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f114063b, r52.f114063b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f114062a.hashCode() * 31) + this.f114063b.hashCode();
        }

        public String toString() {
            return "Sell(ownedLot=" + this.f114062a + ", orderLot=" + this.f114063b + ')';
        }
    }

    static {
    }

    public /* synthetic */ d(kotlin.jvm.internal.i r1) {
        this();
    }

    public d() {
    }
}
