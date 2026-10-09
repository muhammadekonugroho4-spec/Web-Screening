package com.stockbit.feature.transaction.ui.amend.model;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public interface a {

    /* renamed from: com.stockbit.feature.transaction.ui.amend.model.a$a, reason: collision with other inner class name */
    public interface InterfaceC0979a extends a {

        /* renamed from: com.stockbit.feature.transaction.ui.amend.model.a$a$a, reason: collision with other inner class name */
        public static final class C0980a implements InterfaceC0979a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0980a f109515a = null;

            static {
                f109515a = new C0980a();
            }

            public C0980a() {
            }

            public boolean equals(Object r2) {
                if (this != r2) goto L6;
                return true;
            L6:
                if ((r2 instanceof C0980a) == true) goto L9;
                return false;
            L9:
                return true;
            }

            public int hashCode() {
                return -808468299;
            }

            public String toString() {
                return "PriceOrQuantityNotChanged";
            }
        }
    }

    public interface b extends a {

        /* renamed from: com.stockbit.feature.transaction.ui.amend.model.a$b$a, reason: collision with other inner class name */
        public static final class C0981a implements b {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f109516a;

            static {
            }

            public C0981a(BigDecimal r2) {
                p.l(r2, "matchQuantity");
                this.f109516a = r2;
            }

            public final BigDecimal a() {
                return this.f109516a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0981a) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f109516a, ((C0981a) r4).f109516a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f109516a.hashCode();
            }

            public String toString() {
                return "QuantityLowerThanMatchQuantity(matchQuantity=" + this.f109516a + ')';
            }
        }
    }

    public interface c extends a {

        /* renamed from: com.stockbit.feature.transaction.ui.amend.model.a$c$a, reason: collision with other inner class name */
        public static final class C0982a implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0982a f109517a = null;

            static {
                f109517a = new C0982a();
            }

            public C0982a() {
            }

            public boolean equals(Object r2) {
                if (this != r2) goto L6;
                return true;
            L6:
                if ((r2 instanceof C0982a) == true) goto L9;
                return false;
            L9:
                return true;
            }

            public int hashCode() {
                return -1299302552;
            }

            public String toString() {
                return "QuantityExceededMaxLot";
            }
        }
    }

    public interface d extends a {

        /* renamed from: com.stockbit.feature.transaction.ui.amend.model.a$d$a, reason: collision with other inner class name */
        public static final class C0983a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final int f109518a;

            static {
            }

            public C0983a(int r1) {
                this.f109518a = r1;
            }

            public final int a() {
                return this.f109518a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0983a) == true) goto L9;
                return false;
            L9:
                if (this.f109518a == ((C0983a) r4).f109518a) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return Integer.hashCode(this.f109518a);
            }

            public String toString() {
                return "InvalidPriceFraction(fraction=" + this.f109518a + ')';
            }
        }

        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            public static final b f109519a = null;

            static {
                f109519a = new b();
            }

            public b() {
            }

            public boolean equals(Object r2) {
                if (this != r2) goto L6;
                return true;
            L6:
                if ((r2 instanceof b) == true) goto L9;
                return false;
            L9:
                return true;
            }

            public int hashCode() {
                return -1318110665;
            }

            public String toString() {
                return "OnlyIncreaseQuantity";
            }
        }

        public static final class c implements d {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f109520a;

            static {
            }

            public c(BigDecimal r2) {
                p.l(r2, "postClosingPrice");
                this.f109520a = r2;
            }

            public final BigDecimal a() {
                return this.f109520a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof c) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f109520a, ((c) r4).f109520a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f109520a.hashCode();
            }

            public String toString() {
                return "PostClosing(postClosingPrice=" + this.f109520a + ')';
            }
        }

        /* renamed from: com.stockbit.feature.transaction.ui.amend.model.a$d$d, reason: collision with other inner class name */
        public static final class C0984d implements d {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f109521a;

            static {
            }

            public C0984d(BigDecimal r2) {
                p.l(r2, "ara");
                this.f109521a = r2;
            }

            public final BigDecimal a() {
                return this.f109521a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof C0984d) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f109521a, ((C0984d) r4).f109521a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f109521a.hashCode();
            }

            public String toString() {
                return "PriceHigherThanARA(ara=" + this.f109521a + ')';
            }
        }

        public static final class e implements d {

            /* renamed from: a, reason: collision with root package name */
            public static final e f109522a = null;

            static {
                f109522a = new e();
            }

            public e() {
            }

            public boolean equals(Object r2) {
                if (this != r2) goto L6;
                return true;
            L6:
                if ((r2 instanceof e) == true) goto L9;
                return false;
            L9:
                return true;
            }

            public int hashCode() {
                return 1107701387;
            }

            public String toString() {
                return "PriceHigherThanBuy";
            }
        }

        public static final class f implements d {

            /* renamed from: a, reason: collision with root package name */
            public final BigDecimal f109523a;

            static {
            }

            public f(BigDecimal r2) {
                p.l(r2, "arb");
                this.f109523a = r2;
            }

            public final BigDecimal a() {
                return this.f109523a;
            }

            public boolean equals(Object r4) {
                if (this != r4) goto L6;
                return true;
            L6:
                if ((r4 instanceof f) == true) goto L9;
                return false;
            L9:
                if (p.g(this.f109523a, ((f) r4).f109523a) == true) goto L11;
                return false;
            L11:
                return true;
            }

            public int hashCode() {
                return this.f109523a.hashCode();
            }

            public String toString() {
                return "PriceLowerThanARB(arb=" + this.f109523a + ')';
            }
        }

        public static final class g implements d {

            /* renamed from: a, reason: collision with root package name */
            public static final g f109524a = null;

            static {
                f109524a = new g();
            }

            public g() {
            }

            public boolean equals(Object r2) {
                if (this != r2) goto L6;
                return true;
            L6:
                if ((r2 instanceof g) == true) goto L9;
                return false;
            L9:
                return true;
            }

            public int hashCode() {
                return 561461775;
            }

            public String toString() {
                return "PriceLowerThanBuy";
            }
        }
    }
}
