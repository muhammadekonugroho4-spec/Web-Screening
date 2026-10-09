package com.stockbit.feature.transaction.ui.fasttrade;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;

/* renamed from: com.stockbit.feature.transaction.ui.fasttrade.d1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC8707d1 {

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.d1$a */
    public static final class a extends AbstractC8707d1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f113933a = null;

        static {
            f113933a = new a();
        }

        public a() {
            super(null);
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.d1$b */
    public static final class b extends AbstractC8707d1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f113934a;

        static {
        }

        public b(String r2) {
            kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
            super(null);
            this.f113934a = r2;
        }

        public final String a() {
            return this.f113934a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof b) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f113934a, ((b) r4).f113934a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f113934a.hashCode();
        }

        public String toString() {
            return "ReOrderBuyMethod(price=" + this.f113934a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.d1$c */
    public static final class c extends AbstractC8707d1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f113935a;

        static {
        }

        public c(String r2) {
            kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
            super(null);
            this.f113935a = r2;
        }

        public final String a() {
            return this.f113935a;
        }

        public boolean equals(Object r4) {
            if (this != r4) goto L6;
            return true;
        L6:
            if ((r4 instanceof c) == true) goto L9;
            return false;
        L9:
            if (kotlin.jvm.internal.p.g(this.f113935a, ((c) r4).f113935a) == true) goto L11;
            return false;
        L11:
            return true;
        }

        public int hashCode() {
            return this.f113935a.hashCode();
        }

        public String toString() {
            return "ReOrderSellMethod(price=" + this.f113935a + ')';
        }
    }

    /* renamed from: com.stockbit.feature.transaction.ui.fasttrade.d1$d */
    public static final class d extends AbstractC8707d1 {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f113936a;

        /* renamed from: b, reason: collision with root package name */
        public final List f113937b;

        static {
        }

        public d(boolean r2, List r3) {
            kotlin.jvm.internal.p.l(r3, "orderList");
            super(null);
            this.f113936a = r2;
            this.f113937b = r3;
        }

        public final List a() {
            return this.f113937b;
        }

        public final boolean b() {
            return this.f113936a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof d) == true) goto L8;
            return false;
        L8:
            d r52 = (d) r5;
            if (this.f113936a == r52.f113936a) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f113937b, r52.f113937b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f113936a) * 31) + this.f113937b.hashCode();
        }

        public String toString() {
            return "WithdrawAll(isBuy=" + this.f113936a + ", orderList=" + this.f113937b + ')';
        }
    }

    static {
    }

    public /* synthetic */ AbstractC8707d1(kotlin.jvm.internal.i r1) {
        this();
    }

    public AbstractC8707d1() {
    }
}
