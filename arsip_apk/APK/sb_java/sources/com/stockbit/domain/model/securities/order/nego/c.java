package com.stockbit.domain.model.securities.order.nego;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f85562a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.domain.model.securities.order.nego.a f85563b;

    /* renamed from: c, reason: collision with root package name */
    public final double f85564c;
    public final double d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f85565a;

        /* renamed from: b, reason: collision with root package name */
        public final b f85566b;

        /* renamed from: c, reason: collision with root package name */
        public final b f85567c;

        public a(String r2, b r3, b r4) {
            p.l(r2, "assetCode");
            p.l(r3, "bid");
            p.l(r4, "ask");
            this.f85565a = r2;
            this.f85566b = r3;
            this.f85567c = r4;
        }

        public final b a() {
            return this.f85567c;
        }

        public final b b() {
            return this.f85566b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f85565a, r52.f85565a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f85566b, r52.f85566b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f85567c, r52.f85567c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f85565a.hashCode() * 31) + this.f85566b.hashCode()) * 31) + this.f85567c.hashCode();
        }

        public String toString() {
            return "OrderBookEntity(assetCode=" + this.f85565a + ", bid=" + this.f85566b + ", ask=" + this.f85567c + ")";
        }
    }

    public c(a r2, com.stockbit.domain.model.securities.order.nego.a r3, double r4, double r6) {
        p.l(r2, "orderBook");
        p.l(r3, "araArb");
        this.f85562a = r2;
        this.f85563b = r3;
        this.f85564c = r4;
        this.d = r6;
    }

    public final com.stockbit.domain.model.securities.order.nego.a a() {
        return this.f85563b;
    }

    public final double b() {
        return this.f85564c;
    }

    public final double c() {
        return this.d;
    }

    public final a d() {
        return this.f85562a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f85562a, r82.f85562a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85563b, r82.f85563b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f85564c, r82.f85564c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85562a.hashCode() * 31) + this.f85563b.hashCode()) * 31) + Double.hashCode(this.f85564c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "OrderBookNegoEntity(orderBook=" + this.f85562a + ", araArb=" + this.f85563b + ", maxRequestableAbove=" + this.f85564c + ", maxRequestableBelow=" + this.d + ")";
    }

    public /* synthetic */ c(a r3, com.stockbit.domain.model.securities.order.nego.a r4, double r5, double r7, int r9, i r10) {
        if ((r9 & 4) == 0) goto L6;
        r5 = 0.0d;
    L6:
        if ((r9 & 8) == 0) goto L9;
        double r8 = 0.0d;
    L10:
        this(r3, r4, r5, r8);
        return;
    L9:
        r8 = r7;
        goto L10
    }
}
