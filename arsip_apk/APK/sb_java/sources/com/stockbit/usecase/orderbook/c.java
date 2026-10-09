package com.stockbit.usecase.orderbook;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158786a;

        /* renamed from: b, reason: collision with root package name */
        public final com.stockbit.usecase.orderbook.model.orderqueue.b f158787b;

        public a(String r2, com.stockbit.usecase.orderbook.model.orderqueue.b r3) {
            p.l(r2, "orderNumber");
            p.l(r3, "uiState");
            this.f158786a = r2;
            this.f158787b = r3;
        }

        public final com.stockbit.usecase.orderbook.model.orderqueue.b a() {
            return this.f158787b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f158786a, r52.f158786a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f158787b, r52.f158787b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        @Override // com.stockbit.usecase.orderbook.c
        public String getOrderNumber() {
            return this.f158786a;
        }

        public int hashCode() {
            return (this.f158786a.hashCode() * 31) + this.f158787b.hashCode();
        }

        public String toString() {
            return "Add(orderNumber=" + this.f158786a + ", uiState=" + this.f158787b + ")";
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158788a;

        /* renamed from: b, reason: collision with root package name */
        public final double f158789b;

        public b(String r2, double r3) {
            p.l(r2, "orderNumber");
            this.f158788a = r2;
            this.f158789b = r3;
        }

        public final double a() {
            return this.f158789b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof b) == true) goto L8;
            return false;
        L8:
            b r82 = (b) r8;
            if (p.g(this.f158788a, r82.f158788a) == true) goto L12;
            return false;
        L12:
            if (Double.compare(this.f158789b, r82.f158789b) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        @Override // com.stockbit.usecase.orderbook.c
        public String getOrderNumber() {
            return this.f158788a;
        }

        public int hashCode() {
            return (this.f158788a.hashCode() * 31) + Double.hashCode(this.f158789b);
        }

        public String toString() {
            return "DecreaseLot(orderNumber=" + this.f158788a + ", newLot=" + this.f158789b + ")";
        }
    }

    /* renamed from: com.stockbit.usecase.orderbook.c$c, reason: collision with other inner class name */
    public static final class C1537c implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158790a;

        /* renamed from: b, reason: collision with root package name */
        public final double f158791b;

        /* renamed from: c, reason: collision with root package name */
        public final double f158792c;

        public C1537c(String r2, double r3, double r5) {
            p.l(r2, "orderNumber");
            this.f158790a = r2;
            this.f158791b = r3;
            this.f158792c = r5;
        }

        public final double a() {
            return this.f158792c;
        }

        public final double b() {
            return this.f158791b;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof C1537c) == true) goto L8;
            return false;
        L8:
            C1537c r82 = (C1537c) r8;
            if (p.g(this.f158790a, r82.f158790a) == true) goto L12;
            return false;
        L12:
            if (Double.compare(this.f158791b, r82.f158791b) == 0) goto L15;
            return false;
        L15:
            if (Double.compare(this.f158792c, r82.f158792c) == 0) goto L17;
            return false;
        L17:
            return true;
        }

        @Override // com.stockbit.usecase.orderbook.c
        public String getOrderNumber() {
            return this.f158790a;
        }

        public int hashCode() {
            return (((this.f158790a.hashCode() * 31) + Double.hashCode(this.f158791b)) * 31) + Double.hashCode(this.f158792c);
        }

        public String toString() {
            return "DecreaseOpen(orderNumber=" + this.f158790a + ", openRaw=" + this.f158791b + ", openChangeQuantityRaw=" + this.f158792c + ")";
        }
    }

    public static final class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158793a;

        /* renamed from: b, reason: collision with root package name */
        public final double f158794b;

        public d(String r2, double r3) {
            p.l(r2, "orderNumber");
            this.f158793a = r2;
            this.f158794b = r3;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof d) == true) goto L8;
            return false;
        L8:
            d r82 = (d) r8;
            if (p.g(this.f158793a, r82.f158793a) == true) goto L12;
            return false;
        L12:
            if (Double.compare(this.f158794b, r82.f158794b) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        @Override // com.stockbit.usecase.orderbook.c
        public String getOrderNumber() {
            return this.f158793a;
        }

        public int hashCode() {
            return (this.f158793a.hashCode() * 31) + Double.hashCode(this.f158794b);
        }

        public String toString() {
            return "Delete(orderNumber=" + this.f158793a + ", openRaw=" + this.f158794b + ")";
        }
    }

    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final String f158795a;

        /* renamed from: b, reason: collision with root package name */
        public final double f158796b;

        public e(String r2, double r3) {
            p.l(r2, "orderNumber");
            this.f158795a = r2;
            this.f158796b = r3;
        }

        public boolean equals(Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof e) == true) goto L8;
            return false;
        L8:
            e r82 = (e) r8;
            if (p.g(this.f158795a, r82.f158795a) == true) goto L12;
            return false;
        L12:
            if (Double.compare(this.f158796b, r82.f158796b) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        @Override // com.stockbit.usecase.orderbook.c
        public String getOrderNumber() {
            return this.f158795a;
        }

        public int hashCode() {
            return (this.f158795a.hashCode() * 31) + Double.hashCode(this.f158796b);
        }

        public String toString() {
            return "DeleteAndAbove(orderNumber=" + this.f158795a + ", openRaw=" + this.f158796b + ")";
        }
    }

    String getOrderNumber();
}
