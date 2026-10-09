package com.stockbit.virtual.ui.orderlist;

import com.stockbit.domain.model.entity.virtual.TradingOrderList;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final TradingOrderList f167040a;

        /* renamed from: b, reason: collision with root package name */
        public final int f167041b;

        public a(TradingOrderList r2, int r3) {
            p.l(r2, "tradingOrderlist");
            super(null);
            this.f167040a = r2;
            this.f167041b = r3;
        }

        public final int a() {
            return this.f167041b;
        }

        public final TradingOrderList b() {
            return this.f167040a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f167040a, r52.f167040a) == true) goto L12;
            return false;
        L12:
            if (this.f167041b == r52.f167041b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f167040a.hashCode() * 31) + Integer.hashCode(this.f167041b);
        }

        public String toString() {
            return "CancelOrder(tradingOrderlist=" + this.f167040a + ", position=" + this.f167041b + ')';
        }
    }

    public static final class b extends c {

        /* renamed from: a, reason: collision with root package name */
        public final TradingOrderList f167042a;

        /* renamed from: b, reason: collision with root package name */
        public final int f167043b;

        public b(TradingOrderList r2, int r3) {
            p.l(r2, "tradingOrderlist");
            super(null);
            this.f167042a = r2;
            this.f167043b = r3;
        }

        public final TradingOrderList a() {
            return this.f167042a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof b) == true) goto L8;
            return false;
        L8:
            b r52 = (b) r5;
            if (p.g(this.f167042a, r52.f167042a) == true) goto L12;
            return false;
        L12:
            if (this.f167043b == r52.f167043b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f167042a.hashCode() * 31) + Integer.hashCode(this.f167043b);
        }

        public String toString() {
            return "OpenOrder(tradingOrderlist=" + this.f167042a + ", position=" + this.f167043b + ')';
        }
    }

    public /* synthetic */ c(kotlin.jvm.internal.i r1) {
        this();
    }

    public c() {
    }
}
